Algoritmo e9
	Imprimir "Estos son todos los primos en los 100 primeros d�gitos:"
	Imprimir "-------------------------------------------------------"
    Imprimir "El n�mero 2 es primo."
    cont <- 1
    num <- 3

    Mientras cont<25 Hacer
        
        primo <- Verdadero
        
        Para aumen<-3 hasta rc(num) con paso 2 Hacer
            Si num MOD aumen = 0 entonces
                primo <- Falso
            FinSi
        FinPara
        
        Si primo Entonces
            cont <- cont + 1
            Escribir "El n�mero " num " es primo."
        FinSi
        
        num <- num + 2 
        
    FinMientras
FinAlgoritmo
