# Manejo de Excepciones

## OBJETIVO

El objetivo de este taller es fortalecer los conceptos sobre el manejo de las excepciones que se generan en Java, mediante el desarrollo de ejercicios que permitan identificar algunas de las excepciones existentes, su captura y correspondiente manejo incluyendo el relanzamiento de la excepción y la generación de excepciones personalizadas.

## REQUERIMIENTOS:
-	IDE Java: IntelliJ IDEA, Eclipse,Spring, Jcreator, Netbeans u otro.
-	Versión Java: 8 o superior.
-	Cuenta creada GitHub, GitLab u otro.

# Ejercicios 
Todas las actividades se corren desde el main de la clase  ExcepcionesApplication 
Solo des comente el caso que vaya a ejecutar para realizar el ejercicio.


1.	
	a.	En el método caso1 de la clase ExcepcionesApplication   cree una instancia de la clase ProcesarDatos ;  haga uso del método division enviando los valores ("48", "0") para que se genere una excepción. En el método división capture e identifique la excepción especifica que se genera (no la excepción general de java Exception) e imprima en consola el StackTrace, Cause, Message del errror.
	
	b.	Repita el procedimiento, pero envié los valores ("15.8", "30") y agregue la nueva excepción que se genera.

2.	En el método caso2 de la clase ExcepcionesApplication   cree una instancia de la clase ProcesarDatos ; haga uso del método arreglo y envié un array de string de 3 posiciones  para que se genere una excepción. En el método arreglo capture e identifique la excepción especifica que se genera (no la excepción general de java Exception) e imprima en consola el StackTrace, Cause, Message del error.

3.	En el método caso3 de la clase ExcepcionesApplication   cree una instancia de la clase ProcesarDatos  y haga uso del  método fecha de la clase ProcesarDatos ; envié una fecha con el formato “yyyy/mm/dd” para que se genere una excepción. Re-lance la excepción generada y captúrela en el método caso3  e imprima en consola el StackTrace, Cause, Message del error.

4.	
	a.	En el paquete com.capacitacion.excepciones.personalizadas, cree una clase para el manejo personalizado de excepciones,esta clase debe heredar de la clase Exception de Java y tener dos atributos. String causa y String tipoFalla. 

	b.	En la clase ProcesarDatos cree un método que lea el archivo data.txt que está en el paquete com.capacitacion.excepciones.datos, el método debe recibir como parámetro la ruta del archivo. Capture y relance  la excepción que se genera en caso de no encontrar el archivo en la ruta indicada, haciendo uso la clase creada en el literal anterior . haga un llamado de este método desde el caso4 indicando un causa y tipo de falla de la clase ExcepcionesApplication  e imprima en consola  la casusa y el tipo de falla.

5.	En la clase ProcesarDatos cree un método que lea el archivo data.txt que está en el paquete com.capacitacion.excepciones.datos, de forma iterativa 	     obtenga el nombre y la profesión de cada uno de los registro y escríbalos en el archivo de nombre data2.txt. agregue las excepciones que se requerían y garantice que los objetos que se usaron para la lectura y escritura de los archivos sean correctamente cerrados (close) en el catch.





