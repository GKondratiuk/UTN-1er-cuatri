#EN ESTA CLASE VEREMOS LA SENTENCIA IF/ELSE
'''
condicion = 10
if condicion == True:
    print("Condición Verdadera")
elif condicion == False:
    print("Condición Falsa")
else:
    print("Condición sin especificar")
'''

#CONVERSIÓN DE NUMERO A TEXTO
'''
num = int(input("Digite un numero en el rango del 1 al 3"))
numTexto = ""
if num == 1:
    numTexto = "Numero uno"
elif num == 2:
    numTexto = "Numero dos"
elif num == 3:
    numTexto = "Numero trs"
else:
    numTexto = "Has ingresado un numero fuera de rango"
print(f"El numero ingresado es: {num} - {numTexto}")
'''

#OPERADOR TERNARIO
condicion = False

print("Condicion Verdadera") if condicion else print("Condicion falsa")