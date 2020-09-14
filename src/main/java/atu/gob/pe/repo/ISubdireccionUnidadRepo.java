package atu.gob.pe.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import atu.gob.pe.documents.SubdireccionUnidad;

public interface ISubdireccionUnidadRepo extends ReactiveMongoRepository<SubdireccionUnidad, String> {

}
