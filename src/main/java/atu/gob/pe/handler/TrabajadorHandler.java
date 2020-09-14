package atu.gob.pe.handler;

import java.net.URI;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import atu.gob.pe.documents.Trabajador;
import atu.gob.pe.services.ITrabajadorServices;
import reactor.core.publisher.Mono;

@Component
public class TrabajadorHandler {

	private static final Logger log = LoggerFactory.getLogger(TrabajadorHandler.class);
	
	@Autowired
	private ITrabajadorServices service;
	
	public Mono<ServerResponse> listar(ServerRequest request) {
		
		return this.service.listar()
				.collectList()
				.flatMap(lista -> ServerResponse.ok()
						.contentType(MediaType.APPLICATION_STREAM_JSON)
						.bodyValue(lista));
	}
	
	public Mono<ServerResponse> registrar(ServerRequest request) {
		Mono<Trabajador> mono = request.bodyToMono(Trabajador.class);
		return mono
				.doOnNext(entity -> log.info(" entidad trabajador 2 a registrar " + entity.toString()))
				.flatMap(entity -> this.service.registrar(entity))
				.flatMap(entity -> ServerResponse
				.created(URI.create("/direccion-oficina/" + entity.getId()))
						.contentType(MediaType.APPLICATION_STREAM_JSON)
						.bodyValue(entity));
	}
	
	public Mono<ServerResponse> modificar(ServerRequest request) {
		Mono<Trabajador> mono = request.bodyToMono(Trabajador.class);
		
		return mono.flatMap(entity -> this.service.listarPorId(entity.getId())
				.flatMap(entityDB -> {
					entityDB.setApellidoMaterno(entity.getApellidoMaterno());
					entityDB.setApellidoPaterno(entity.getApellidoPaterno());
					entityDB.setEstreg(entity.getEstreg());
					entityDB.setFecmod(LocalDateTime.now());
					entityDB.setNombres(entity.getNombres());
					entityDB.setNumeroDocumento(entity.getNumeroDocumento());
					entityDB.setTipoDocumento(entity.getTipoDocumento());
					entityDB.setUsumod(entity.getUsumod());
					return this.service.modificar(entityDB);
				})).flatMap(entity -> ServerResponse
						.created(URI.create("/direccion-oficina/" + entity.getId()))
						.contentType(MediaType.APPLICATION_STREAM_JSON)
						.bodyValue(entity))
				.switchIfEmpty(ServerResponse.notFound().build());
	}
}
