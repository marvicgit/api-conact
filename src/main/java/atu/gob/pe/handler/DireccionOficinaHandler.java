package atu.gob.pe.handler;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import atu.gob.pe.documents.DireccionOficina;
import atu.gob.pe.services.IDireccionOficinaServices;
import reactor.core.publisher.Mono;

@Component
public class DireccionOficinaHandler {

	@Autowired
	private IDireccionOficinaServices service;
	
	public Mono<ServerResponse> listar(ServerRequest request) {
		
		return this.service.listar()
				.collectList()
				.flatMap(lista -> ServerResponse.ok()
						.contentType(MediaType.APPLICATION_STREAM_JSON)
						.bodyValue(lista));
	}
	
	public Mono<ServerResponse> registrar(ServerRequest request) {
		Mono<DireccionOficina> mono = request.bodyToMono(DireccionOficina.class);
		
		return mono.flatMap(entity -> this.service.registrar(entity))
				.flatMap(entity -> ServerResponse
				.created(URI.create("/direccion-oficina/" + entity.getId()))
						.contentType(MediaType.APPLICATION_STREAM_JSON)
						.bodyValue(entity));
	}
}
