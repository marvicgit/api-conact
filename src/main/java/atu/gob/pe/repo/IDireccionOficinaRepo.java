package atu.gob.pe.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import atu.gob.pe.documents.DireccionOficina;

public interface IDireccionOficinaRepo extends ReactiveMongoRepository<DireccionOficina, String> {

}
