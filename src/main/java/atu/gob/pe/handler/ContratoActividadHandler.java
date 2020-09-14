package atu.gob.pe.handler;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import atu.gob.pe.documents.ContratoActividad;
import atu.gob.pe.services.IContratoActividadServices;
import reactor.core.publisher.Mono;

@Component
public class ContratoActividadHandler {

	private static final Logger log = LoggerFactory.getLogger(ContratoActividadHandler.class);
	
	@Autowired
	private IContratoActividadServices service;
	
	public Mono<ServerResponse> listar(ServerRequest request) {
		
		return this.service.listar()
				.collectList()
				.flatMap(lista -> ServerResponse.ok()
						.contentType(MediaType.APPLICATION_STREAM_JSON)
						.bodyValue(lista));
	}
	
	public Mono<ServerResponse> registrar(ServerRequest request) {
		Mono<ContratoActividad> mono = request.bodyToMono(ContratoActividad.class);
		
		return mono
				.doOnNext(entity -> log.info(" entidad ContratoActividad a registrar " + entity.toString()))
				.flatMap(entity -> this.service.registrar(entity))
				.flatMap(entity -> ServerResponse
				.created(URI.create("/direccion-oficina/" + entity.getId()))
						.contentType(MediaType.APPLICATION_STREAM_JSON)
						.bodyValue(entity));
	}
	
	public Mono<ServerResponse> modificar(ServerRequest request) {
		Mono<ContratoActividad> mono = request.bodyToMono(ContratoActividad.class);
		
		return mono.flatMap(entity -> this.service.listarPorId(entity.getId())
				.flatMap(entityDB -> {
					entityDB.setEstreg(entity.getEstreg());
					return this.service.modificar(entityDB);
				})).flatMap(entity -> ServerResponse
						.created(URI.create("/direccion-oficina/" + entity.getId()))
						.contentType(MediaType.APPLICATION_STREAM_JSON)
						.bodyValue(entity))
				.switchIfEmpty(ServerResponse.notFound().build());
	}
}
