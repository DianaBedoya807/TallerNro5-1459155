package com.capacitacion.excepciones.procesos;

import com.capacitacion.excepciones.excepciones.Excepciones;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProcesarDatos extends Exception {

	static ArrayList<String> data = new ArrayList<>();

	public ProcesarDatos(){}

	public ProcesarDatos(String e) { super(e); }
	
	public static int division(String numero1,String numero2) throws ProcesarDatos {
		int resultado = 0;
		try {
			resultado = Integer.valueOf(numero1) / Integer.valueOf(numero2);
			if (resultado <= 0){
				throw new ProcesarDatos ("El número debe ser positivo.");
			}
		}  catch (ArithmeticException e) {
			throw new ProcesarDatos ("No se puede dividir por cero.");
		} catch (NumberFormatException e) {
			throw new ProcesarDatos ("No se puede ingresar decimales.");
		}
		return resultado;
	}

	public void arreglo(String[] lista) throws ProcesarDatos{

		try{
			for(int i=0;i<=5;i++) {
				System.out.println(lista[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ProcesarDatos("Error de índice en el arreglo.");
		}
	}
	
	public void fecha(String input)  {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date   date  = format.parse (input );
			date.toString();
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}

	public void muestraContenido(String archivo) throws Excepciones{
		String cadena;

		try {
			FileReader f1 = new FileReader(archivo);
			BufferedReader br = new BufferedReader(f1);
			while ((cadena = br.readLine()) != null){
				//System.out.println(cadena);
				data.add(cadena);
			}
			anadirContenido(data);
			br.close();
		} catch (FileNotFoundException e) {
			throw (new Excepciones(e,"La ruta del archivo no existe."));
		} catch (IOException e) {
			throw (new Excepciones(e,"El archivo no existe."));
		}
	}
	public void anadirContenido (ArrayList<String> cadena) throws Excepciones{
		try {
			FileWriter f2 = new FileWriter("src/main/resources/datos/data2.txt");
			BufferedWriter bw = new BufferedWriter(f2);
			for (String data: cadena) {
				bw.write(data +"\n");
			}
			bw.close();
			System.out.println("Archivo modificado satisfactoriamente.");
		} catch (FileNotFoundException e) {
			throw (new Excepciones(e,"La ruta del archivo no existe."));
		} catch (IOException e) {
			throw (new Excepciones(e,"El archivo no existe."));
		}
	}
}
