//Ejercicio para encontrar numeros pares 

let num = 3; 
if (num % 2 == 0){
    console.log("es par")
}
else{
    console.log("Es impar")
}

//Ejercicio: es mayor de edad

let edad = 17;

if (edad > 17){
    console.log("Es mayor")
}
else{
    console.log("Es menor")
}

//Ejercicio dentro de un rango
let dentroRango = 5; //vamos a ir cambiando el valor 
let valMin = 0, valMax = 10;
if (dentroRango >= valMin && dentroRango <= valMax){
    console.log("Dentro del rango establecido")
}

//EJERCICIO: SI EL PADRE PUEDE ASISTIR AL JUEGO DEL HIJO 

let vacaciones = false, diaDescanso = false;
if(vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
}else{
    console.log("El padre no puede asistir al juego de su hijo")
}

//OPERADOR TERNARIO 

let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2)

let numero = 2;
resultado2 = numero % 2 == 0 ? "Es un numero PAR" : "Es un numero IMPAR"

console.log(resultado2)

//CONVERTIR STRING A NUMBER

let miNumero = "10x";
console.log(typeof miNumero);
let edad2 = Number(miNumero);
console.log(typeof edad2);

if(isNaN(edad2)){
    console.log("La variable no contiene solo numeros")
}
else{
    if(edad2 >= 18){
        console.log("Podes votar");
    }else{
        console.log("No podes votar")
    }
}


let resultado3 = edad2 >= 18 ? "Podes votar" : "No podes votar"
console.log(resultado3);

//FUNCION isNaN