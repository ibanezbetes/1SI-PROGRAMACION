Algoritmo mosca
	Dimension matriz[10,10]
	posicionx <- Azar (10)
	posiciony <- Azar (10)
	
	Repetir
	Escribir "Dime la posici�n X"
	Leer usuariox
	Escribir "Dime la posici�n Y"
	Leer usuarioy
	
	Si (usuariox<>posicionx) y (usuarioy<>posiciony) Entonces
		Si usuarioy<posiciony
			Escribir "La posici�n Y est� mas a la derecha."
			Si usuarioy>posiciony
				Escribir "La posici�n Y est� mas a la izquierda."
				Si usuariox<posicionx
					Escribir "La posici�n X est� mas a la derecha."
					Si usuariox>posicionx
						Escribir "La posici�n X est� mas a la izquierda."
					FinSi
			FinSi
		FinSi
		
		
		FinSi
		
	Fin Si
	
	Si (usuariox=posicionx) y (usuarioy<>posiciony) Entonces
		Si usuarioy<posiciony
			Escribir "Has acertado la posici�n X pero la posici�n Y est� mas a la derecha."
			Si usuarioy>posiciony
				Escribir "Has acertado la posici�n X pero la posici�n Y est� mas a la izquierda."
			FinSi
		FinSi
	Fin Si
	
	Si (usuariox<>posicionx) y (usuarioy=posiciony) Entonces
		Si usuariox<posicionx
			Escribir "Has acertado la posici�n Y pero la posici�n X est� mas a la derecha."
				Si usuariox>posicionx
					Escribir "Has acertado la posici�n Y pero la posici�n X est� mas a la izquierda."
		FinSi
				FinSi
	Fin Si
Hasta Que (usuariox=posicionx) y (usuarioy=posiciony)
Escribir "HAS ACERTADO LAS COORDENADAS DE LA MOSCA."
FinAlgoritmo
