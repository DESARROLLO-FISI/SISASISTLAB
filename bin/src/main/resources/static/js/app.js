
$(document).ready(function(){
	$("#busquedaBoton").click(function(){
		$.ajax({
			 url: '/cursos',    // cambiar: url: /jsonDP para pruebas 
	         type: 'POST', 
	         contentType: "application/json; charset=utf-8",
	         dataType: "json",
	         data: JSON.stringify($("#iddocente").val()),
	         success: function(data){
	         	console.log(data);
	         	$("#listCurso").html("");
	         	
	         	$.each(data, function(index,value){
	         		$("#listCurso").append("<option value='"+value.idCursoPeriodo+"'>"+value.cursoPeriodoNombre+"</option>");
	         		
	         	})
	         	
	         	
	         	
	         },
	         error : function(xhr, status) {
	             alert('Disculpe, existio un problema -- '+xhr+" -- "+status);
	         },		
		});
	});	
});