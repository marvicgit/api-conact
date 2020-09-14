package atu.gob.pe.handler;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import atu.gob.pe.documents.Contrato;
import atu.gob.pe.services.IContratoServices;
import reactor.core.publisher.Mono;

@Component
public class ContratoHandler {

	private static final Logger log = LoggerFactory.getLogger(ContratoHandler.class);
	
	@Autowired
	private IContratoServices service;
	
	public Mono<ServerResponse> listar(ServerRequest request) {
		
		return this.service.listar()
				.collectList()
				.flatMap(lista -> ServerResponse.ok()
						.contentType(MediaType.APPLICATION_STREAM_JSON)
						.bodyValue(lista));
	}
	
	public Mono<ServerResponse> registrar(ServerRequest request) {
		Mono<Contrato> mono = request.bodyToMono(Contrato.class);
		
		return mono
				.doOnNext(entity -> log.info(" entidad contrato a registrar " + entity.toString()))
				.flatMap(entity -> this.service.registrar(entity))
				.flatMap(entity -> ServerResponse
				.created(URI.create("/direccion-oficina/" + entity.getId()))
						.contentType(MediaType.APPLICATION_STREAM_JSON)
						.bodyValue(entity));
	}
	
	public Mono<ServerResponse> modificar(ServerRequest request) {
		Mono<Contrato> mono = request.bodyToMono(Contrato.class);
		
		return mono.flatMap(entity -> this.service.listarPorId(entity.getId())
				.flatMap(entityDB -> {
					entityDB.setCargo(entity.getCargo());
					return this.service.modificar(entityDB);
				})).flatMap(entity -> ServerResponse
						.created(URI.create("/direccion-oficina/" + entity.getId()))
						.contentType(MediaType.APPLICATION_STREAM_JSON)
						.bodyValue(entity))
				.switchIfEmpty(ServerResponse.notFound().build());
	}
}
