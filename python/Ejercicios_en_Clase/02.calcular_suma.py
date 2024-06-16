#calcular la suma de "n" primeros numeros

def  suma_primeros_numeros(n):
    return n* (n+1) // 2

n = int(input("Introduce un numero entero positivo"))
resultado = suma_primeros_numeros(n)
print(f"La suma de los primeros numeros {n} numeros es: {resultado}")

