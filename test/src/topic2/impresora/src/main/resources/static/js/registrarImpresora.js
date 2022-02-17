$(document).ready(function() {
console.log("hola mundo prueba desde el otro script");

});


async function registrarImpresoras(){

    let datos = {};

    datos.marca = document.getElementById('txtMarca').value;
    datos.blancoYnegro = document.getElementById('txtBlancoYNegro').value;
    datos.color = document.getElementById('txtColor').value;

    const request = await fetch('impresoras', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)

        location.reload()
      });

      const impresoras = await request.json();
}