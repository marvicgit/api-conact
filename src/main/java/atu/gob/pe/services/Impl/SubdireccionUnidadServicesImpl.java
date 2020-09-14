package atu.gob.pe.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atu.gob.pe.documents.SubdireccionUnidad;
import atu.gob.pe.repo.ISubdireccionUnidadRepo;
import atu.gob.pe.services.ISubdireccionUnidadServices;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SubdireccionUnidadServicesImpl implements ISubdireccionUnidadServices {

	@Autowired
	private ISubdireccionUnidadRepo repo;
	
	@Override
	public Mono<SubdireccionUnidad> registrar(SubdireccionUnidad entity) {
		return repo.save(entity);
	}

	@Override
	public Mono<SubdireccionUnidad> modificar(SubdireccionUnidad entity) {
		return repo.save(entity);
	}

	@Override
	public Flux<SubdireccionUnidad> listar() {
		return repo.findAll();
	}

	@Override
	public Mono<SubdireccionUnidad> listarPorId(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<Void> eliminar(String id) {
		return repo.deleteById(id);
	}

}
