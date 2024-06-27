#Dadas las horas trabajadas de 5 personas y la tarifa de pago, calcular el salario y la sumatoria de todos los salarios

i = 1
horas = 0
tarifa = 0
salario = 0
suma = 0

while i <= 5:
    print(f"Salario del empleado {i}")
    horas = float(input("Digite las horas trabajadas "))
    tarifa = float(input("Digite la tarifa por horas "))
    salario = horas + tarifa
    print(f"El salario es ${salario}")
    suma = suma + salario
    i = i + 1
    print("")
print(f"La suma de todos los salarios es {suma}")