package atu.gob.pe.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atu.gob.pe.documents.DireccionOficina;
import atu.gob.pe.repo.IDireccionOficinaRepo;
import atu.gob.pe.services.IDireccionOficinaServices;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DireccionOficinaServicesImpl implements IDireccionOficinaServices {

	@Autowired
	private IDireccionOficinaRepo repo;
	
	@Override
	public Mono<DireccionOficina> registrar(DireccionOficina entity) {
		return repo.save(entity);
	}

	@Override
	public Mono<DireccionOficina> modificar(DireccionOficina entity) {
		return repo.save(entity);
	}

	@Override
	public Flux<DireccionOficina> listar() {
		return repo.findAll();
	}

	@Override
	public Mono<DireccionOficina> listarPorId(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<Void> eliminar(String id) {
		return repo.deleteById(id);
	}

}
