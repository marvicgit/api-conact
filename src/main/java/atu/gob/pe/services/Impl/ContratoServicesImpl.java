package atu.gob.pe.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import atu.gob.pe.documents.Contrato;
import atu.gob.pe.repo.IContratoRepo;
import atu.gob.pe.services.IContratoServices;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ContratoServicesImpl implements IContratoServices {
	
	@Autowired
	private IContratoRepo repo;
	
	@Override
	public Mono<Contrato> registrar(Contrato entity) {
		return repo.save(entity);
	}

	@Override
	public Mono<Contrato> modificar(Contrato entity) {
		return repo.save(entity);
	}

	@Override
	public Flux<Contrato> listar() {
		return repo.findAll();
	}

	@Override
	public Mono<Contrato> listarPorId(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<Void> eliminar(String id) {
		return repo.deleteById(id);
	}
}
