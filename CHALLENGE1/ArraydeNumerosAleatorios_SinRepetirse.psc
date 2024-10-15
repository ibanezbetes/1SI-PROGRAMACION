Algoritmo ArraydeNumerosAleatorios
	
    Definir num Como Entero
    Definir lista Como Entero
	Definir indiceAleatorio Como Entero
	Definir temp Como Entero
    Dimension lista[5]
	Sumatotal=0
	
    // Inicializamos la lista con los n�meros del 1 al 5
    Para num <- 1 Hasta 5 Con Paso 1 Hacer
        lista[num] <- num	//En cada iteraci�n, asignamos el valor de num a la posici�n num en la lista. La lista contendr� [1, 2, 3, 4, 5].
    Fin Para
	
    // Barajamos la lista
    Para num <- 1 Hasta 5 Con Paso 1 Hacer
        indiceAleatorio <- Aleatorio(1, 5)	//Genera un n�mero aleatorio entre 1 y 5. Este n�mero representa una posici�n en la lista.	//Intercambiamos valores->
        temp <- lista[num]	//Guarda el valor actual de la lista en la posici�n num en una variable temporal temp
        lista[num] <- lista[indiceAleatorio]	//Asigna el valor de la lista en la posici�n indiceAleatorio a la posici�n num.
        lista[indiceAleatorio] <- temp	//Asigna el valor guardado en temp a la posici�n indiceAleatorio
    Fin Para
	
    // Escribimos los n�meros barajados
    Para num <- 1 Hasta 5 Con Paso 1 Hacer
        Escribir lista[num]	//Escribimos la lista de forma aleatoria y sin repeticiones
		Sumatotal=Sumatotal+lista[num]
    Fin Para
	
	Escribir "Suma total:", Sumatotal
	
	
FinAlgoritmo
