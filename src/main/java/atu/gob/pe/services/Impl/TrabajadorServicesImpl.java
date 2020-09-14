package atu.gob.pe.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atu.gob.pe.documents.Trabajador;
import atu.gob.pe.repo.ITrabajadorRepo;
import atu.gob.pe.services.ITrabajadorServices;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TrabajadorServicesImpl implements ITrabajadorServices {

	@Autowired
	private ITrabajadorRepo repo;
	
	@Override
	public Mono<Trabajador> registrar(Trabajador entity) {
		return repo.save(entity);
	}

	@Override
	public Mono<Trabajador> modificar(Trabajador entity) {
		return repo.save(entity);
	}

	@Override
	public Flux<Trabajador> listar() {
		return repo.findAll();
	}

	@Override
	public Mono<Trabajador> listarPorId(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<Void> eliminar(String id) {
		return repo.deleteById(id);
	}

}
