Algoritmo patataCaliente
// una variable con la pregunta que querais fecha
//al usuario le decimos que empiece la patata caliente 10 intentos
	Definir fechaCorrecta Como Entero
	fechaCorrecta<-1936
	total=0;
	Escribir ".................................................................."
	Escribir "........................LA PATATA CALIENTE........................"
	Para contador<-1 Hasta 10 Con Paso 1 Hacer
		Escribir ".............................................................."
		Escribir ".............................................................."
		Escribir ".....�En que a�o comenz� la Guerra Civil Espa�ola? [AAAA]....."
		Escribir ".............................................................."
		Leer fecha
			Si fecha = fechaCorrecta Entonces
			FinSi

			Si fecha < fechaCorrecta Entonces
				Escribir ".............................................................."
				Escribir "..........Casi, pero no. Fue alg�n a�o posterior.............."
				Escribir ".............................................................."
			FinSi
			Si fecha > fechaCorrecta Entonces
				Escribir ".............................................................."
				Escribir "...........Casi, pero no. Fue alg�n a�o anterior.............."
				Escribir ".............................................................."
			Fin Si
			Si fecha = fechaCorrecta Entonces //en java es ==
					Escribir ".............................................................."
					Escribir "..CORRECTO. La Guerra Civil Espa�ola empez� en el a�o 1936...."
					Escribir ".............................................................."
					contador<-10
				SiNo
					Escribir ".............................................................."
					Escribir "INCORRECTO. La Guerra Civil Espa�ola no empez� en el a�o ", fecha "."
					Escribir ".........................................Te quedan " 10 - contador " intentos."
					Escribir ".............................................................."
					Escribir ".............................................................."
					Escribir ".............................................................."
				Si contador = 10 Entonces
					Escribir "............................."
					Escribir "BOOM! LA PATATA HA EXPLOTADO!"
					Escribir "............................."
				Fin Si

			Fin Si
	Fin Para
FinAlgoritmo
