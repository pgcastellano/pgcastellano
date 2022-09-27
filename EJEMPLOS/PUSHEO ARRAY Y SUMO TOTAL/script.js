let miArray = [];


function pushear() {
    const numValue = document.getElementById('numberingreso').value
    miArray.push(numValue);

    document.getElementById('muestranum').innerHTML = miArray;

    console.log(miArray);

    

}