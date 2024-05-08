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

//TIPO DE DATO UNDEFINED
var x;
console.log(typeof x);

x = undefined;
console.log(x)
//TIPO DE DATO NULL
//null significa ausencia de valor 
var y = null; //null no es un tipo de dato, pero su origen es obect
console.log(typeof y)

//Tipo de dato array y Empty array 

var autos = ["Citroen","Audi","BMW","Ford"]
console.log(autos)
console.log(typeof autos) //es de tipo objeto

var z = ""; //empty string - cadena vacía
console.log(z);
console.log(typeof z);
