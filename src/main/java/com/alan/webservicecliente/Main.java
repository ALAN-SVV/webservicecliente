package com.alan.webservicecliente;

import com.alan.servicioweb.servicios.Curso;
import com.alan.servicioweb.servicios.ServicioWs;
import com.alan.servicioweb.servicios.ServicioWsImplementService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creamos el objeto de servicio web
        ServicioWs service= new ServicioWsImplementService().getServicioWsImplementPort();
        //imprimimos en consola el saludo
        System.out.println("Saludo: "+ service.saludar("Alan Velasco"));
        //inicializamos el objeto curso
        Curso curso= new Curso();
        //añado el nuevo curso
        curso.setNombre("JavaScript");
        Curso respuesta= service.crear(curso);
        //imprimimos el nuevo objeto o el nuevo curso añadido

        System.out.println("Nuevo curso: "+ curso.getNombre());
        //listamos los cursos
        service.listar().forEach(c->System.out.println(c.getNombre()));
    }
}