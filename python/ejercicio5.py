""""
El objetivo del programa será crear un sistema de calificaciones de la siguinte manera:
Le pedimos al usuario que ingrese un valor de 0 a 10
Luego si ingreso 9 o 10 imprimimos A
Entre 8 y menor a 9 imprimimos B
Entre 7 y menor a 8 imprimimos C
Entre 6 y menor a 7 imprimimos D
Entre 0 y menor a 6 imprimimos F
De lo contrario el valor ingresado es incorrecto
"""


calificacion = float(input("Ingrese la calificación: "))

if calificacion <= 9 or calificacion <= 10:
    print("Su calificación es: A")
elif 8 <= calificacion < 9:
    print("Su calificación es: B")
elif 7 <= calificacion < 8:
    print("Su calificación es: C")
elif 6 <= calificacion < 7:
    print("Su calificación es: D")
elif 0 <= calificacion < 6:
    print("Su calificación es: F")
else:
    print("El valor ingresado es incorrecto. Por favor, ingrese un número del 0 al 10.")
    