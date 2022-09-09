package com.SotoWeb.ProyectoCiclo3;

import com.SotoWeb.ProyectoCiclo3.entity.Empleado;
import com.SotoWeb.ProyectoCiclo3.entity.Empresa;
import com.SotoWeb.ProyectoCiclo3.entity.Mov_Dinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoCiclo3Application {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoCiclo3Application.class, args);

		Mov_Dinero movDinero = new Mov_Dinero();
		movDinero.setMonto("150000");
		movDinero.setConcepto("Libre Inversion");
		movDinero.setUsuario("User1");

		System.out.println("Dinero: "+ movDinero.getMonto());
		System.out.println("Concepto: "+ movDinero.getConcepto());
		System.out.println("Usuario: "+ movDinero.getUsuario());

		Empresa empresa = new Empresa();
		empresa.setNombre("Salamanca Alimentacion Industrial");
		empresa.setDireccion("Carrera 12 Nro. 52a - 119");
		empresa.setNit("890938952-2");
		empresa.setTelefono("604 288 88 88");

		System.out.println("El Nombre de la Empresa es: "+ empresa.getNombre());
		System.out.println("La Direccion de la Empresa es: "+ empresa.getDireccion());
		System.out.println("El Nit de la Empresa es: "+ empresa.getNit());
		System.out.println("El Telefono de la Empresa es: "+ empresa.getTelefono());

		Empleado empleado = new Empleado();
		empleado.setNombre("Jose Dario Soto Carrillo");
		empleado.setCorreo("sotomark2021@gmail.com");
		empleado.setEmpresa("Salamanca");
		empleado.setRol("Tecnico");

		System.out.println("El Nombre del Empleado es: "+ empleado.getNombre());
		System.out.println("El Correo del Empleado es: "+ empleado.getCorreo());
		System.out.println("La Empresa del Empleado es: "+ empleado.getEmpresa());
		System.out.println("El Rol del Empleado es: "+ empleado.getRol());

	}
}
