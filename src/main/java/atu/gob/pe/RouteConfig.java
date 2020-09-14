package atu.gob.pe;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import atu.gob.pe.handler.ContratoActividadHandler;
import atu.gob.pe.handler.ContratoHandler;
import atu.gob.pe.handler.DireccionOficinaHandler;
import atu.gob.pe.handler.SubdireccionUnidadHandler;
import atu.gob.pe.handler.TrabajadorHandler;


@Component
public class RouteConfig {

	@Bean
	public RouterFunction<ServerResponse> DireccionOficinaRutas(DireccionOficinaHandler handler) {
		return RouterFunctions.route(RequestPredicates.GET("/conact/direccion-oficina"), handler::listar)
				.andRoute(RequestPredicates.POST("/conact/direccion-oficina"), handler::registrar);
	}
	
	@Bean
	public RouterFunction<ServerResponse> SubdireccionUnidadRutas(SubdireccionUnidadHandler handler) {
		return RouterFunctions.route(RequestPredicates.GET("/conact/subdireccion-unidad"), handler::listar)
				.andRoute(RequestPredicates.POST("/conact/subdireccion-unidad"), handler::registrar);
	}
	
	@Bean
	public RouterFunction<ServerResponse> TrabajadorRutas(TrabajadorHandler handler) {
		return RouterFunctions.route(RequestPredicates.GET("/conact/trabajador"), handler::listar)
				.andRoute(RequestPredicates.POST("/conact/trabajador"), handler::registrar)
				.andRoute(RequestPredicates.PUT("/conact/trabajador"), handler::modificar);
	}
	
	@Bean
	public RouterFunction<ServerResponse> contratoRutas(ContratoHandler handler) {
		return RouterFunctions.route(RequestPredicates.GET("/conact/contrato"), handler::listar)
				.andRoute(RequestPredicates.POST("/conact/contrato"), handler::registrar)
				.andRoute(RequestPredicates.PUT("/conact/contrato"), handler::modificar);
	}
	
	@Bean
	public RouterFunction<ServerResponse> contratoActividadRutas(ContratoActividadHandler handler) {
		return RouterFunctions.route(RequestPredicates.GET("/conact/contrato-actividad"), handler::listar)
				.andRoute(RequestPredicates.POST("/conact/contrato-actividad"), handler::registrar)
				.andRoute(RequestPredicates.PUT("/conact/contrato-actividad"), handler::modificar);
	}
	
}
