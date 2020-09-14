package atu.gob.pe.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface Icrud<Entity, id> {

	Mono<Entity> registrar(Entity entity);
	Mono<Entity> modificar(Entity entity);
	Flux<Entity> listar();
	Mono<Entity> listarPorId(String id);
	Mono<Void> eliminar(String id);
}
