#diseñar un programa que ingresando un año, nos devuelva
#por consola si es un año bisiesto o no, repetir la
#accion hasta que el usuario lo decida
bandera = False

while (bandera == False):
    num = int(input("Digite el año a conocer: "))
    if (num % 4 == 0) and (num % 100 != 0) or (num % 400 == 0):
        print("El año es Bisiesto")
    else:
        print("El año no es bisiesto")
    
    opcion1 = int(input("Para finalizar digite la opcion 1: "))
    if opcion1 == 1:
        bandera = True;  
else: 
    print(f"Programa finalizado")   
