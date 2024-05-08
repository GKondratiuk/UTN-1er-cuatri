'''
miVariable = 3
print(miVariable) # imprime un 3
miVariable = "a"
print(miVariable)
miVariable = 3.5
print(miVariable)

x = 10
y = 2
z = x + y
print(id(x)) # imprime en que lugar de la memoria ram se guarda la variable x.
print(id(y))
print(id(z))
# las literales se escriben de la siguiente manera x624(los ultimos tres digitos)

a = "Hola alumnos"
print(type(a)) # Imprime que tipo de dato es; en este caso es str = string

#dato booleano
a = True
print(type(a))

print("-------------------------------------------")
# tipos int, float, String, Bool
print("-------------------------------------------")
print("TIPOS DE DATOS INT, FLOAT, STRING, BOOL")
print("-------------------------------------------")
x = 10
print(x)
print(type(x))
print("-------------------------------------------")
x = 14.5
print(x)
print(type(x))
print("-------------------------------------------")
x = "Hola estudiantes"
print(x)
print(type(x))
print("-------------------------------------------")
x = True
print(x)
print(type(x))
print("-------------------------------------------")
x = False
print(x)
print(type(x))
print("-------------------------------------------")
print("")
print("-------------------------------------------")
print("MANEJO DE CADENAS")
print("-------------------------------------------")
miGrupoFavorito ="Renacer"
caracteristicas = "Metal Argentino"
print("Mi grupo favorito es", miGrupoFavorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(numero1 + numero2)
print(int(numero1) + int(numero2)) # transformamos el string a int

# tipos booleanos (bool)

miBooleano = True
print(miBooleano)
miBooleano = 1 > 2
print(miBooleano)

if miBooleano: # si el booleano es verdadero entra acá
    print("el resultado es verdadero")
else: # si el booleano es falso entra acá
    print("El resultado es falso")

# Procesar la entrada del usuario
# funcion input
# resultado = input("Digite un numero: ") # ingresas un valor y regresa un dato tipo string
# print(resultado) # te imprime un valor

# conversion de la entrada de datos
numero1 = int(input("Escribe el primer numero"))
numero2 = int(input("Escribe el segundo numero"))
resultado = numero1 + numero2
print("El resultado de la suma es:", resultado)
'''

'''
print("************************************************")
print("OPERADORES MATEMATICOS")
print("************************************************")
operandoA = 8
operandoB = 5
print("---------------------------------------------")

suma = operandoA + operandoB
#print("El resultado de la suma es:", suma)
print(f"El resultado de la suma es {suma}")

print("---------------------------------------------")

resta = operandoA - operandoB
print(f"El resultado de la resta es {resta}")

print("---------------------------------------------")

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacion es {multiplicacion}")

print("---------------------------------------------")

division = operandoA / operandoB
print(f"El resultado de la division es {division}")

print("---------------------------------------------")

modulo = operandoA % operandoB
print(f"El residuo de la division es {modulo}")

print("---------------------------------------------")

exponente = operandoA ** operandoB
print(f"El resultado del exponente es {exponente}")
'''
'''
alto = int(input("Proporciona el alto del rectangulo: "))
ancho = int(input("Proporciona el ancho del rectangulo: "))
area = alto * ancho
perimetro = (alto + ancho) * 2
print("Area ", area)
print("Perimetro ", perimetro)
'''
'''
print("*******************************")
print("OPERADORES DE ASIGNACION")
print("*******************************")

miVariable3 = 10
print(miVariable3)

#operadores de reasignación
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

#miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)

#miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

#miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)
'''
'''
print("*******************************")
print("OPERADORES DE COMPARACIÓN")
print("*******************************")

d = 4
b = 2
resultado = d == b # comprobamos si son iguales
print(resultado)

# operador diferente, comprobamos si son diferentes
resultado = d != b
print(resultado)

# operador mayor que
resultado = d < b
print(resultado)
'''
'''
print("*******************************")
print("EJERCICIO DE PAR O IMPAR")
print("*******************************")

a = int(input("Digite un número: "))
print(f"el residuo de la division es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un número PAR")
else:
    print(f"El valor de a es: {a} es un número IMPAR")
'''
'''
print("*******************************")
print("EJERCICIO DE ES MAYOR")
print("*******************************")

edadAdulto = 18
edadPersona = int(input("Digite su edad: "))
if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadAdulto} es mayor de edad")
else:
    print(f"Su edad es: {edadAdulto} es menor de edad")
'''
'''
print("*******************************")
print("OPERADORES LOGICOS")
print("*******************************")

a = False
b = True

resultado = a or b
print(resultado)


resultado = a and b
print(resultado)

a = not a
print(resultado)
'''
'''
print("*******************************")
print("EJERCICIO DENTRO DE RANGO")
print("*******************************")

valor = int(input("Digite un numero dentro del rango del 0 al 5"))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f"El valor {valor} está dentro del rango")
else:
    print(f"El valor {valor} No está dentro del rango")
'''
'''
print("*******************************")
print("EJERCICIO DE OPERADOR OR, NOT")
print("*******************************")

vacaciones = False
diaDescanso = True
if not(vacaciones or diaDescanso):
    print("Tiene trabajo que hacer")
else:
    print("Puede ir al juego")
'''
'''
print("*******************************")
print("EJERCICIO DE RANGO ENTRE 20 Y 30 ")
print("*******************************")

edad = int(input("Digite su edad: "))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)

if veinte or treinta:
    print("Estas dentro del rango de los (20\'0) a (30\'0) años ")
else:
    print("No Estas dentro del rango de los (20\'0) a (30\'0) años ")
'''
'''
numero1 = int(input("Digite el valor para el numero1: "))
numero2 = int(input("digite el valor para el numero2: "))

if numero1 > numero2:
    print("El numero 1 es mayor")
else:
    print("El numero 2 es mayor")
'''
print("*******************************")
print("EJERCICIO TIENDA DE LIBROS ")
print("*******************************")

print("Digite los siguientes datos del libro")
nombre = input("Digite el nombre del libro:")
id = int(input("Digite el ID del libro"))
precio = float(input("Digite el precio del libro"))
envioGratuito = input("Indicar si el libro es gratuito (True/False)")

if envioGratuito == "True":
    envioGratuito = True
elif envioGratuito == "False":
    envioGratuito = False
else:
    envioGratuito = "El valor de incorrecto, debe escribir True/False"

print(f'''
        nombre: {nombre}
        id: {id}
        precio: {precio}
        envío Gratuito {envioGratuito}
'''
    )