package com.tutomas.springsucursales.servicio;

import com.tutomas.springsucursales.entidad.Sucursal;
import com.tutomas.springsucursales.repositorio.SucursalRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalServicio {

    @Autowired
    private SucursalRepositorio sucursalRepositorio;

    public Sucursal agregar(Sucursal sucursal) {
        return sucursalRepositorio.save(sucursal);
    }

    public List<Sucursal> obtenerTodo() {
        return sucursalRepositorio.findAll();
    }

}
