package com.tutomas.springsucursales.repositorio;

import com.tutomas.springsucursales.entidad.Sucursal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SucursalRepositorio extends MongoRepository<Sucursal, String> {
}
