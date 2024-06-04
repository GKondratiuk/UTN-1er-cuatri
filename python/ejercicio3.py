"""
Pedir al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12, luego le decimos en que estación del año está:
Verano: 21/12 al 21/03 {1,2,3}.  Otoño: 21/03 al 21/06{4,5,6}. Invierno: 21/06 al 21/09{7,8,9}. Primavera: 21/09 al 21/12{10,11,12}. 
"""

obtener_Estacion = int(input("Ingrese el mes "))
if obtener_Estacion == 1 or obtener_Estacion == 2 or obtener_Estacion == 3:
    print("verano")
elif obtener_Estacion == 4 or obtener_Estacion == 5 or obtener_Estacion == 6:
    print("Otoño")
elif obtener_Estacion == 7 or obtener_Estacion == 8 or obtener_Es4tacion == 9:
    print("Invierno")
    
elif obtener_Estacion == 10 or obtener_Estacion == 11 or obtener_Estacion == 12:
    print("primavera")
else:
    print("Estacion no seleccionada, Digite otra nuevamente")




    

