'''
Haremos un programa que cuando el usuario ingrese su edad le diga, o imprima la etpa de su vida en una 
breve oración
0 a 10 = La infancia es increible y bella
10 a 19 = Tiene muchos cambios y mucho que estudiar
20 a 29 = Amor y comienza el laburo
30 a 49 = Aca se complica bastante
50 a 59 = Terminaste de vivir la vida loca
60 a 69 = Ya empezas a envejecer 
70 a 79 = Más cerca del cajón que de la fruta
80 a 100 = Si sobrevivis sos el verdadero papu
'''

edad = int(input("¿que etapa queres consultar de tu vida?: "))
if  edad <=10 and edad == 0: 
    print("La infancia es increible y bella") 
elif edad >=11 and edad <=19:
    print("Tiene muchos cambios y mucho que estudiar")
elif edad >= 20 and edad <=29:
    print("Amor y comienza el laburo")
elif edad >= 30 and edad <=49:
    print("Aca se complica bastante")
elif edad >= 50 and edad <=59:
    print("Terminaste de vivir la vida loca")
elif edad >= 60 and edad <=69:
    print("Ya empezas a envejecer")
elif edad >= 70 and edad <=79:
    print("Más cerca del cajón que de la fruta")
elif edad >= 80 and edad <=100:
    print("Si sobrevivis sos el verdadero papu")
else:
    print("Ingrese un numero válido")


