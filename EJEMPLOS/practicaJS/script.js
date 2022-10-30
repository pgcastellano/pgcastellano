function pressed() {
const text = document.getElementById("inp").value;
// var output = document.getElementById("output");


if (text > 18){
    document.getElementById("output").innerHTML = "Older than 18";
} else if (text == 18) {
    document.getElementById("output").innerHTML = "You are 18";
} else {
    document.getElementById("output").innerHTML = "Not older than 18";
}

}

