//TIPOS DE DATOS EN JS
/*
La sintaxis en los comentarios 
es identica a la de java.
*/ 

var nombre = "Guillermo"; //tipo string
console.log(nombre);
console.log(typeof nombre); //nos muestra de que tipo es la variable

var numero = 3800; //tipo numerico
console.log(numero);

var objeto = {
    nombre : "Guillermo",
    apellido : "Kondratiuk",
    telefono : 1177130370
}

console.log(objeto);
console.log(typeof objeto);

//Tipo de dato booleano 
var bandera = true 
console.log(bandera);

//Tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato symbol 
var simbolo = Symbol("Mi simbolo");
console.log(simbolo)

//Tipo de dato clase

class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona);