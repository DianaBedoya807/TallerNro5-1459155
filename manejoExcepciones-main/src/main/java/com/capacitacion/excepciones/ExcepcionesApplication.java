package com.capacitacion.excepciones;


import java.text.ParseException;
import java.util.Scanner;

import com.capacitacion.excepciones.excepciones.Excepciones;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.capacitacion.excepciones.procesos.ProcesarDatos;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

@SpringBootApplication
public class ExcepcionesApplication {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(ExcepcionesApplication.class, args);
		
		caso1();
		caso2();
		caso3();
		caso4();
		caso5();
	}
	
	public static void caso1() {
		// cree una instancia de la clase ProcesarDatos y use el metodo division.
		//envie   los valores ("48", "0") - division por cero
		//en el metodo division capture e identifique la excepcion que se genera (no la excepcion general de java Exception) e imprima en consola  desde  el catch StackTrace,Cause,Message; 
		// haga lo mismo para los valores ("15.8", "30")

		ProcesarDatos procesarDatos = new ProcesarDatos();

		System.out.println("Ingrese el primer número: ");
		String num1 = in.nextLine();
		System.out.println("Ingrese el segundo número: ");
		String num2 = in.nextLine();

		try{
			int resultado = procesarDatos.division(num1, num2);
			System.out.println("El resultado de la división es" + resultado);

		} catch (ProcesarDatos e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void caso2() {
		
		//cree una instancia de la clase ProcesarDatos y use el metodo division. y use metodo arreglo
		//envie al metodo arry de string  de 3 valores para que se genere una excepcion.
		//capture e identifique la excepcion que se genera (no la excepcion general de java Exception) e imprima en consola   StackTrace,Cause,Message del error; 
		ProcesarDatos procesarDatos = new ProcesarDatos();

		try	{
			String arr[] = {"3", "2", "1"};
			procesarDatos.arreglo(arr);

		} catch (ProcesarDatos e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void caso3() {
		
		//// cree una instancia de la clase ProcesarDatos y use el metodo fecha.
		//envie al metodo una fecha con el formato "yyyy/mm/dd".
		//capture e identifique la excepcion que se genera (no la excepcion general de java Exception) 
	    // Re-lance la excepcion y capturela aqui en el metodo case3 e imprima en consola StackTrace,Cause,Message del error; 

		ProcesarDatos procesarDatos = new ProcesarDatos();
		try {
			String date = "2020/12/04";
			procesarDatos.fecha(date);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void caso4() {
		//manejo de excepciones personalizadas
		ProcesarDatos procesarDatos = new ProcesarDatos();
		try {
			procesarDatos.muestraContenido("/src/main/datos/data.txt");
		} catch (Excepciones excepciones) {
			excepciones.printStackTrace();
		}
	}
	
	public static void caso5() {
		//manejo de cierre de  objetos en lectura y escritura de arhivos
		ProcesarDatos procesarDatos = new ProcesarDatos();
		try {
			procesarDatos.muestraContenido("src/main/resources/datos/data.txt");

		} catch (Excepciones excepciones) {
			excepciones.printStackTrace();
		}
	}
	

}
