#en python leer 10 numeros e imprimir cuantos son positivos y cuantos negativos y cuantos neutros
# Inicialización de los contadores
conteo_positivos = 0
conteo_negativos = 0
conteo_neutros = 0

# Bucle para leer 10 números
for i in range(10):
    num = int(input("Digite un número: "))
    if num == 0:
        conteo_neutros += 1
    elif num > 0:
        conteo_positivos += 1
    else:
        conteo_negativos += 1

# Impresión de los resultados
print("La cantidad de positivos es:", conteo_positivos)
print("La cantidad de negativos es:", conteo_negativos)
print("La cantidad de neutros es:", conteo_neutros)
