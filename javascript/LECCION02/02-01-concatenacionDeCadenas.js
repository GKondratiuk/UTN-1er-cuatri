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