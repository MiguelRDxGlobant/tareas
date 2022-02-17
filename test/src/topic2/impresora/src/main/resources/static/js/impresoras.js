// Call the dataTables jQuery plugin
$(document).ready(function() {
console.log("hola mundo prueba");
    cargarImpresoras();
  $('#impresoras').DataTable();
});


async function cargarImpresoras(){

console.log("hola mundo prueba");

    const request = await fetch('impresoras', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        }
      });

      const impresoras = await request.json();



      let listadoHtml = '';
      for (let impresora of impresoras) {
      let botonEliminar = '<a href="#" onclick="eliminarImpresora('+ impresora.id +')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

      let impresoraHTML = '<tr><td>'+ impresora.id +'</td> <td>'+ impresora.marca +'</td> <td>'+ impresora.blancoYnegro +'</td> <td>'+ impresora.color+ '</td><td>'+ botonEliminar +'</td></tr>'
      listadoHtml += impresoraHTML;
      }



      console.log("hola mundo prueba");

      document.querySelector('#impresoras tbody').outerHTML = listadoHtml;
}

async function eliminarImpresora(id){

    if (!confirm('¿Deseas eliminar esta impresora')){
        return;
    }

    const request = await fetch('impresora/' + id, {
            method: 'DELETE',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            }
          });

          location.reload()
}