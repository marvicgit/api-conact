package atu.gob.pe.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import atu.gob.pe.documents.Contrato;

public interface IContratoRepo extends ReactiveMongoRepository<Contrato, String> {

}
