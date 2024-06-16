calificaciones = [8, 7, 6, 9, 5, 6, 7, 8, 4, 5]
sumaDeLasNotas = sum(calificaciones)
promedio =  sum(calificaciones)/10
print ("El promedio es de: ",promedio)

calificacionMinima = calificaciones[0]

for calificacion in calificaciones:
    if calificacion < calificacionMinima:
        calificacionMinima = calificacion


print("La calificacion mas baja del grupo es:", calificacionMinima)
