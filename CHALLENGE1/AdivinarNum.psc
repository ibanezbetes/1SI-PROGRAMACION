Algoritmo AdivinarNum
    Definir num Como Entero;
	Definir aciertos Como Entero;
	aciertos <- 0
    Dimension num[100];
    Para cont<-1 Hasta 100 Con Paso 1 Hacer
        num[cont]<- Azar(99)+1; // Aleatorio. 1 al 100
    Fin Para
    Para cont<-1 Hasta 100 Con Paso 1 Hacer
        Escribir Sin Saltar num[cont], ", "
    Fin Para
	Escribir "..................."
	Escribir "Adivina los n�meros"
    Para intentos<-1 Hasta 10 Con Paso 1 Hacer
        Escribir "Intento n�mero: " intentos
        Leer numUsuario
        Para cont1<-1 Hasta 100 Con Paso 1 Hacer
            Si num[cont1] = numUsuario Entonces
				Escribir "Enhorabuena, has acertado! El n�mero " numUsuario " est� en el listado."
				Escribir "..............................................................."
				aciertos <- aciertos +1
                numUsuario <- 0;
            Fin Si
			
			//Si num[cont1] <> numUsuario Entonces 
			//Escribir "Vaya, no has acertado! El n�mero " numUsuario " no est� en el listado."
			//num[cont1] <- numUsuario
			//FinSi
        Fin Para
    Fin Para
	Escribir "Has acertado " aciertos "/10 n�meros."
FinAlgoritmo
// 100 CASILLAS AISLADAS CON N�MEROS ALEATORIOS
// 100 n�meros aleatorios DEL 1 AL 100
// ADIVINAR N�M. DENTRO DEL ARRAY
// El usuario tiene 10 intentos
// Escribe un n�mero y si est�
// dentro del array, se sustituye la
//pos por valor
