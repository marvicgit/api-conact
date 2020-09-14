package atu.gob.pe.repo;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import atu.gob.pe.documents.ContratoActividad;
import atu.gob.pe.dto.ContratoActividadReporteDTO;
import reactor.core.publisher.Flux;

public interface IContratoActividadRepo extends ReactiveMongoRepository<ContratoActividad, String> {


}
