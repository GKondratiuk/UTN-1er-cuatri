console.log(" ");
console.log("CONCATENACIÓN DE CADENAS");
console.log(" ");
var nombre = "Guillermo";
var apellido = "Kondratiuk";
var nombreCompleto = nombre+" "+apellido
console.log(nombreCompleto);
var nombreCompleto2 = "Adrian"+" "+"Kondratiuk";
console.log(nombreCompleto2);
var juntos = nombre + 219; //lee de izquierda a derecha siguiendo la cadena lee el numero como tipo str
console.log(juntos);
juntos = nombre + (78 + 17);//se puede diferenciar a traves de parentesis
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido;
console.log(nombre);

let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido2 = "peres"; una constante no puede ser modificada
console.log(apellido2);

//SIMILITUDES CON JAVA

let x,y //Se puede crear varias variables dentro de una misma linea
x = 17, y = 21;//Se pueden hacer asignaciones varias dentro de la misma linea
let z = x + y; //Se asigna el valor de la operacion
console.log(z);

let _1num = 34; //no utilizar numeros para iniciar el nombre de una variable
let rompiendo = "rompe" // no utilizar palabras reservadas para variables

console.log(_1num);
console.log(rompiendo);

//hoy ya no se usa var, se utiliza let o const
let nombre3 = "Pedro"; //literl tipo string
console.log(nombre3)

const apellido3 = "Lepes"
//apellido3 = "perez" - una constante no puede ser modificada 
console.log(apellido3)