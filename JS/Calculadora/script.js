var primeironumero = document.getElementById("first");
var segundonumero = document.getElementById("second");
var resultado = document.getElementById("resultado");

function soma() {
    var n1 = Number(primeironumero.value);
    var n2 = Number(segundonumero.value);
    let soma = n1 + n2
    resultado.innerHTML = `O resultado é ${soma}`
}
function subtracao() {
    var n1 = Number(primeironumero.value);
    var n2 = Number(segundonumero.value);
    let subtracao = n1 - n2
    resultado.innerHTML = `O resultado é ${subtracao}`
}
function multiplicacao() {
    var n1 = Number(primeironumero.value);
    var n2 = Number(segundonumero.value);
    let multiplicacao = n1 * n2
    resultado.innerHTML = `O resultado é ${multiplicacao}`
}
function divisao() {
    var n1 = Number(primeironumero.value);
    var n2 = Number(segundonumero.value);
    let divisao = n1 / n2
    resultado.innerHTML = `O resultado é ${divisao}`
}