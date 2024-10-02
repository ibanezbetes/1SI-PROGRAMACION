Algoritmo Simpson
	Definir matriz Como Caracter
	Definir homer Como Caracter
	Definir bart Como Caracter
	Definir vidas Como Entero
	vidas <- 3
	Dimension matriz[10,10]

	
	Para contadorx=1 Hasta 10 Con Paso 1 Hacer 		//Establecer casillas vacias con nombre de "Vacio"
		Para contadory=1 Hasta 10 Con Paso 1 Hacer
			matriz[contadorx, contadory] = "[V]"
		Fin Para
	Fin Para
	matriz[10,10] = "[M]"
	Para ContadorHomer=1 Hasta 10 Con Paso 1 Hacer	//Establecer cordenadas aleatorias de Homer
		HomerX = azar(9)+1
		HomerY = azar(9)+1
		
			Si matriz[HomerX,HomerY] = "[H]" o matriz[10,10]=matriz[HomerX,HomerY] Entonces		//Si la casilla que ha salido está ocupada no se aplica y repetir proceso
				ContadorHomer = ContadorHomer-1
			SiNo
				matriz[HomerX,HomerY] = "[H]"
			Fin Si
	Fin Para
	
	
	
	Para ContadorBart=1 Hasta 1 Con Paso 1 Hacer	//Establecer cordenadas aleatorias de Bart
		BartX = azar(9)+1
		BartY = azar(9)+1
		Si matriz[BartX,BartY] = "[V]" Entonces		//Si la casilla que ha salido está ocupada no se aplica y repetir proceso
			matriz[BartX,BartY] = "[B]"
		SiNo
			ContadorBart = ContadorBart-1
		Fin Si
	Fin Para
	
	
	
	Para contadorx=1 Hasta 10 Con Paso 1 Hacer
		Para contadory=1 Hasta 10 Con Paso 1 Hacer
			Imprimir Sin Saltar " " matriz[contadorx,contadory] " "
		Fin Para
		Imprimir ""
	Fin Para
	
	

	
	Repetir 
		Escribir ".....................)"
		Escribir "Mueve a Bart (W A S D)"

		Leer mov
		mov = Minusculas(mov)
		Si mov = "a" Entonces
			Si BartY = 1 Entonces
				Limpiar Pantalla
				Escribir "..............................."
				Escribir "No puede ir más a la izquierda."
				Escribir "..............................."
				Borrar Pantalla;
			SiNo
				Limpiar Pantalla
				matriz[BartX,BartY] = "[V]"
				BartY <- BartY-1
				Si matriz[BartX,BartY]="[H]" Entonces
					vidas <- vidas - 1
					
				FinSi
				matriz[BartX,BartY] = "[B]"
			Fin Si
		Fin Si
		
		
		Si mov = "d" Entonces
			Si BartY = 10 Entonces
				Limpiar Pantalla
				Escribir "............................."
				Escribir "No puede ir más a la derecha."
				Escribir "............................."
				Borrar Pantalla;
			SiNo
				Limpiar Pantalla
				matriz[BartX,BartY] = "[V]"
				BartY <- BartY+1
				Si matriz[BartX,BartY]="[H]" Entonces
					vidas <- vidas - 1
					
				FinSi
				matriz[BartX,BartY] = "[B]"
			Fin Si
		Fin Si
		
		Si mov = "w" Entonces
			Si BartX = 1 Entonces
				Limpiar Pantalla
				Escribir "......................."
				Escribir "No puede ir más arriba."
				Escribir "......................."
				Borrar Pantalla;
			SiNo
				Limpiar Pantalla
				matriz[BartX,BartY] = "[V]"
				BartX <- BartX-1
				Si matriz[BartX,BartY]="[H]" Entonces
					vidas <- vidas - 1
					
				FinSi
				matriz[BartX,BartY] = "[B]"
			Fin Si
		Fin Si
		
		Si mov = "s" Entonces
			Si BartX = 10 Entonces
				Limpiar Pantalla
				Escribir "......................"
				Escribir "No puede ir más abajo."
				Escribir "......................"
				Borrar Pantalla;
			SiNo
				Limpiar Pantalla
				matriz[BartX,BartY] = "[V]"
				BartX <- BartX+1
				Si matriz[BartX,BartY]="[H]" Entonces
					vidas <- vidas - 1
					
				FinSi
				matriz[BartX,BartY] = "[B]"
			Fin Si
		Fin Si
		
	Si mov <> a y mov <> w y mov <> s y mov <> d Entonces 
		Limpiar Pantalla
	FinSi
		Para contadorx=1 Hasta 10 Con Paso 1 Hacer
			Para contadory=1 Hasta 10 Con Paso 1 Hacer
				Imprimir Sin Saltar " " matriz[contadorx,contadory] " "
			Fin Para
			Imprimir ""
		Fin Para
		Escribir "............................"		
		Escribir "Te quedan " vidas "/3 vidas."
		
	Hasta Que matriz(10,10) = "[B]" o vidas = 0
	
	Si vidas = 0 Entonces
		Escribir "GAME OVER"
	SiNo
		Escribir "Has ganado."
	FinSi
	

	
	
FinAlgoritmo
