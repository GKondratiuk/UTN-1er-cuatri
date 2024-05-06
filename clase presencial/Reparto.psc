//3)Ejercitación lógica pseint
//Una empresa de reparto tiene x empleados y reparte en 5 zonas diferentes. 
//La empresa necesita un programa  que despligue un menú, que solamente salga al darle a la tercera opción.
//1) saber que empleado hizo más ventas y sobre que zona
//2) Ver las ventas de un representante ingresado por teclado
//3) salir	

SubProceso VentasPorZona(empleado Por Referencia)
	Escribir "*****************************";
	Escribir "En reparacion";
	Escribir "*****************************";
FinSubProceso

SubProceso VentasPorTeclado(representante Por Referencia)
	Escribir "*****************************";
	Escribir "En reparacion";
	Escribir "*****************************";
FinSubProceso


Proceso Reparto
	Definir num Como Entero;
	Definir bandera, empleado Como Logico;
	
	num <- 0;
	bandera <- Verdadero;
	
	Escribir "*****************************";
	Escribir "BIENVENIDO A LA EMPRESA";
	Escribir "*****************************";
	
	Escribir "Seleccione una opción:";
	
	Escribir "1. VENTAS DE EMPLEADOS";
	Escribir "2. VENTAS DE REPRESENTANTE";
	Escribir "3. SALIR";
	Leer num;
	
	Repetir
		Segun num Hacer
			1:
				VentasPorZona(empleado);
				Escribir "Seleccione una opción:";
				
				Escribir "1. VENTAS DE EMPLEADOS";
				Escribir "2. VENTAS DE REPRESENTANTE";
				Escribir "3. SALIR";
				Leer num;
			2:
				VentasPorTeclado(representante);
				Escribir "Seleccione una opción:";
				
				Escribir "1. VENTAS DE EMPLEADOS";
				Escribir "2. VENTAS DE REPRESENTANTE";
				Escribir "3. SALIR";
				Leer num;
			3:
				bandera <- falso;
		FinSegun
	Hasta Que bandera = falso;
FinProceso
