
$(document).ready(function(){
	$("#iddocente").change(function(){
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
	         		$("#listCurso").append("<option value='"+value.idGrupo+"'>"+value.cursoPeriodoNombre+"</option>");
	         	})
	         	
	         },
	         error : function(xhr, status) {
	             alert('Disculpe, existio un problema -- '+xhr+" -- "+status);
	         },		
		});
	});	
	
	
	$("#listCurso").change(function(){
		$.ajax({
			 url: '/laboratorio',    // cambiar: url: /jsonDP para pruebas 
	         type: 'POST', 
	         contentType: "application/json; charset=utf-8",
	         dataType: "json",
	         data: JSON.stringify($("#listCurso").val()),
	         success: function(data){
	         	console.log(data);
	         	let labdisp = data;
	         	$("#listLaboratorio").val(labdisp); 
	         },
	         error : function(xhr, status) {
	            
	         },		
		});
	});
});