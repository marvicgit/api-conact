package atu.gob.pe.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import atu.gob.pe.documents.ContratoActividad;
import atu.gob.pe.dto.ContratoActividadReporteDTO;
import atu.gob.pe.repo.IContratoActividadRepo;
import atu.gob.pe.services.IContratoActividadServices;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ContratoActividadServicesImpl implements IContratoActividadServices {
	
	@Autowired
	private IContratoActividadRepo repo;
	
	@Override
	public Mono<ContratoActividad> registrar(ContratoActividad entity) {
		return repo.save(entity);
	}

	@Override
	public Mono<ContratoActividad> modificar(ContratoActividad entity) {
		return repo.save(entity);
	}

	@Override
	public Flux<ContratoActividad> listar() {
		return repo.findAll();
	}

	@Override
	public Mono<ContratoActividad> listarPorId(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<Void> eliminar(String id) {
		return repo.deleteById(id);
	}

	
}
