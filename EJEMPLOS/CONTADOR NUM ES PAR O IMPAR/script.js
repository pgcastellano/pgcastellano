let edad = 0;
//sumar 1 a edad
edad = edad + 1;

let otraEdad = edad++;
let edad2 = ++edad;

let altura = 175;
altura--;
--altura;

/*== ===*/
let a = '10';
let b = 10;
// console.log(a == b) //valor : true | false
// console.log(a === b); //tipo de variable y valor

function incrementar() {
    const labelContador = document.getElementById('contador');
    let valorDelLabelContador = +(labelContador.innerHTML);

    valorDelLabelContador++;
    labelContador.innerHTML = valorDelLabelContador;

    imprimePar(valorDelLabelContador);
}

function decrementar() {
    const labelContador = document.getElementById('contador');
    let valorDelLabelContador = +(labelContador.innerHTML);

    valorDelLabelContador--;
    labelContador.innerHTML = valorDelLabelContador;

    imprimePar(valorDelLabelContador);
}

function imprimePar(valor) {
    let textoParidad;
    if(esPar(valor)) {
        textoParidad = 'ES PAR';
    }else { 
        textoParidad = 'ES IMPAR';
    }

    actualizarTexto('paridad', textoParidad);
}

function actualizarTexto(id, nuevoValor) {
    const labelParidad = document.getElementById(id);
    labelParidad.innerHTML = nuevoValor;
}

function esPar(valor) {
    /*
    if( (valor % 2) === 0) {
        return true;
    }else {
        return false;
    }*/

    /*let resto = valor % 2; // 0 como false cuando esta dentro de un if()
    return resto;*/

    return valor % 2 === 0;
}

// console.log(esPar(1));//true|false
// console.log(esPar(2));//true|false
// console.log(esPar(250));//true|false