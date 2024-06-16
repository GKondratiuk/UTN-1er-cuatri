#Calcular el factorial de un nº mayor o igual a 0

numero = 0
while numero <= 0:
    print("hola")
    numero = int(input("Ingrese un numero"))
    resultado = 0

    for i in range(1, numero + 1):
        resultado = i * numero
    print(resultado * numero)
    
        



