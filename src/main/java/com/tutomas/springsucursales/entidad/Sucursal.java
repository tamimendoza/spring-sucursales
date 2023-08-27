package com.tutomas.springsucursales.entidad;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("sucursal")
public record Sucursal(
        @Id
        String id,
        String descripcion,
        double latitud,
        double longitud
) {
}
