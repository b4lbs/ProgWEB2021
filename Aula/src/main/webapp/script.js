function verificaNumero(value) {
    if (value.trim() !== "") {
        var regra = /^[0-9]+$/;
        if (value.match(regra)) {
        } else {
            alert("São permitidos apenas NÚMEROS");
        }
    }
}

function verificaLetra(value) {
    if (value.trim() !== "") {
        var regra = /^[a-zA-Z]+$/;
        if (value.match(regra)) {
        } else {
            alert("São permitidas apenas LETRAS");
        }
    }
}