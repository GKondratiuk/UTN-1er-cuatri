//Ejercicio 1:  Calcular estacion del año
/*
let mes = 4;
let estacion; 
if(mes == 1 || mes == 2 || mes == 12 ){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5 ){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8 ){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11 ){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estacion de: " + estacion)
*/
//Ejercicio 2: hora del dia
/*
let horaDia = 9;
let mensaje;

if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Good Morging";
}else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Good Afternoom";
}else if(horaDia >= 17 && horaDia <= 19){
    mensaje = "Good Evening";
}else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Good night";
}
else{
    mensaje = "Valor incorrecto";
}
*/
//Estructura switch 
let mes = 1;
let estacion = "desconocida";
switch(mes){
    case 1: case 2: case 3:
        estacion = "Verano";
        break;
    case 4: case 5: case 6:
        estacion = "Otoño";
        break;
    case 7: case 8: case 9:
        estacion = "Invierno";
        break;
    case 10: case 11: case 12:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
    console.log("Bienvenido a la estacion de: " + estacion);
}