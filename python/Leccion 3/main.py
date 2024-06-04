#Ciclo while (Mientras o durante)
"""
contador = 0
while contador < 2:
    print("Ejecutamos nuestro ciclo while", contador)
    contador += 1
else:
    print("FIn del ciclo while")
"""

"""
#Imprimir los numeros del 0 al 5 con el ciclo while
maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1
"""
"""
minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -= 1
"""
"""
#CICLO FOR
cadena = "Hello"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for")
"""
"""
#PALABRA RESERVADA BREAK
for letra in "Alemania":
    if letra == "a":
        print(f"letra encontrada: {letra}")
        break #alemania tiene 2 a, si no tenemos el break, nos muestra las 2, con el break solo muestra 1
    else:"Fin del ciclo for";
"""

#PALABRA RESERVADA CONTINUE
for i in range (6):
    if i % 2 == 0:
        print(f"{i}")

for i in range (6):
    if i % 2 != 0:
        continue
    print(f"valor: {i}")