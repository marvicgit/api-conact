package atu.gob.pe.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import atu.gob.pe.documents.Trabajador;

public interface ITrabajadorRepo extends ReactiveMongoRepository<Trabajador, String> {

}
