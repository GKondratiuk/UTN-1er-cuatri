#Ingresar "N" enteros, visualizar la suma de los numeros pares de la lista, cuantos numeros pares existen y cual es el promedio de los numeros impares

n_elementos = 0
i = 1 
num = 0
suma_pares = 0
conteo_pares = 0
conteo_impares = 0
promedio_impares = 0

n_elementos = input("Digite la cantidad de elementos a ingresar:")

while i < n_elementos:
    num = input("Digite un numero")
    if num % 2 == 0:
        suma_pares = suma_pares + num
        conteo_pares = conteo_pares + 1
        i = i + 1
    else:
        suma_impares = suma_impares + num
        conteo_impares = conteo_impares + 1
        i = i + 1


