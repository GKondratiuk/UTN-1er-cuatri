/*
Con var podes reasignar en cualquier momento esto forma parte del ambito global. Un error es que se sobre-escriba
*/

var nombre = "Guillermo";
nombre = "Adrian";
console.log(nombre)

function saludar(){
    var nombre = "Pedro";
    console.log(nombre);
}
console.log(nombre); //Aqui no lee el dato de la funcion

if(true){
    var edad = 34;
    console.log(edad)
}
console.log(edad);//En la funcion funcionó correctamente, en la estructura if, falló

/*
LET: eta puede ser reasignado en cualquier momento, la diferencia es que su ambito es de bloque, solo disponible dentro de un bloque de llaves o dentro de una funcion
*/

function saludar2(){
    let nombre2 = "Guilllermo"
    console.log(nombre2);
}

if(true){
    let edad = 33;
    console.log(edad + " En let" );
}
console.log(edad)


/*
CONST: Se utilizan apra valores constantes que no pueden ser reasignadas
 */

const fechaNacimiento = 1992;
console.log(fechaNacimiento);
//fechaNacimiento = 2006; ESTO TIRA ERROR
//console.log(fechaNacimiento); ESTO TIRA ERROR
