package com.tutomas.springsucursales.controlador;

import com.tutomas.springsucursales.entidad.Sucursal;
import com.tutomas.springsucursales.servicio.SucursalServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("sucursales")
@CrossOrigin(origins = "*")
public class SucursalControlador {

    @Autowired
    private SucursalServicio sucursalServicio;

    @PostMapping
    public Sucursal agregar(@RequestBody Sucursal sucursal) {
        return sucursalServicio.agregar(new Sucursal(
                UUID.randomUUID().toString(),
                sucursal.descripcion(),
                sucursal.latitud(),
                sucursal.longitud()
        ));
    }

    @GetMapping
    public List<Sucursal> obtenerTodo() {
        return sucursalServicio.obtenerTodo();
    }

}
