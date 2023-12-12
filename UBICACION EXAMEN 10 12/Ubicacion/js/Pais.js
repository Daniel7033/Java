  function getDocuments() {
    // Realizar la solicitud AJAX
    $.ajax({
        url: 'http://localhost:9000/v1/api/continente',
        method: 'GET',
        dataType: 'json',
        success: function (data) {
            // Limpiar el selector antes de agregar nuevas opciones
            $('#continente_id').empty();

            // Crear opciones para el selector
            for (var i = 0; i < data.length; i++) {
                var option = document.createElement('option');
                option.value = data[i].id;
                option.text = data[i].id + ' - ' + data[i].nombre;
                $('#continente_id').append(option);
            }
        },
        error: function (error) {
            console.error('Error al obtener los datos:', error);
        }
    });
  }
  function save() {
    // Construir el objeto data
    var data = {
        'codigo': $('#codigo').val(),
        'nombre': $('#nombre').val(),
        'continente_id': JSON.stringify($('#continente_id').val()),
        'estado': parseInt($('#estado').val()),
    };

    // Enviar los datos a la API
    var jsonData = JSON.stringify(data);
    $.ajax({
        url: 'http://localhost:9000/v1/api/pais',
        method: 'POST',
        dataType: 'json',
        contentType: 'application/json',
        data: jsonData,
        success: function (data) {
            alert("Registro agregado con éxito");
            loadData();
            clearData();
        },
        error: function (error) {
            console.error('Error en la solicitud:', error);
        }
    });
}
    
  function update() {
    // Construir el objeto data
    var data = {
      'codigo': $('#codigo').val(),
      'nombre': $('#nombre').val(),
      'continente_id': JSON.stringify($('#continente_id').val()),
      'estado': parseInt($('#estado').val()),
    };
    var id = $("#id").val();
    var jsonData = JSON.stringify(data);
    $.ajax({
      url: 'http://localhost:9000/v1/api/pais/' + id,
      data: jsonData,
      method: "PUT",
      headers: {
        "Content-Type": "application/json"
      }
    }).done(function (result) {
      alert("Registro actualizado con éxito");
      loadData();
      clearData();
  
      //actualzar boton
      var btnAgregar = $('button[name="btnAgregar"]');
      btnAgregar.text('Agregar');
      btnAgregar.attr('onclick', 'save()');
    })
  }
  
  function loadData() {
    $.ajax({
      url: 'http://localhost:9000/v1/api/pais',
      method: 'GET',
      dataType: 'json',
      success: function (data) {
        var html = '';
  
        data.forEach(function (item) {
          // Construir el HTML para cada objeto
          html += `<tr>
                  <td>`+ item.codigo + `</td>
                  <td>`+ item.nombre + `</td>
                  <td>`+ item.continente_id + `</td>
                  <td>`+ (item.estado == true ? 'Activo' : 'Inactivo') + `</td>
                  <th><img src="../asset/icon/pencil-square.svg" alt="" onclick="findById(`+ item.id + `)"></th>
                  <th><img src="../asset/icon/trash3.svg" alt="" onclick="deleteById(`+ item.id + `)"></th>
              </tr>`;
        });
  
        $('#resultData').html(html);
      },
      error: function (error) {
        // Función que se ejecuta si hay un error en la solicitud
        console.error('Error en la solicitud:', error);
      }
    });
  }
  
  function findById(id) {
    $.ajax({
      url: 'http://localhost:9000/v1/api/pais/' + id,
      method: 'GET',
      dataType: 'json',
      success: function (data) {
        $('#id').val(data.id);
        $('#codigo').val(data.codigo);
        $('#nombre').val(data.nombre);
        $('#continente_id').val(data.continente_id);
        $('#estado').val(data.estado == true ? 1 : 0);
  
        //Cambiar boton.
        var btnAgregar = $('button[name="btnAgregar"]');
        btnAgregar.text('Actualizar');
        btnAgregar.attr('onclick', 'update()');
      },
      error: function (error) {
        // Función que se ejecuta si hay un error en la solicitud
        console.error('Error en la solicitud:', error);
      }
    });
  }
  
  function deleteById(id) {
    $.ajax({
      url: 'http://localhost:9000/v1/api/pais/' + id,
      method: "delete",
      headers: {
        "Content-Type": "application/json"
      }
    }).done(function (result) {
      alert("Registro eliminado con éxito");
      loadData();
      clearData();
    })
  }
  
  function clearData() {
    $('#id').val('');
    $('#codigo').val('');
    $('#nombre').val('');
    $('#continente_id').val('');
    $('#estado').val('');
  }
  
  