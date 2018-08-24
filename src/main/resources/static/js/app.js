
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
			 url: '/laboratorio',    // cambiar: url: /sisistlab/laboratorio para pruebas 
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
	$("#listLaboratorio").change(function(){
		
	});
	
	/*function RegistrarAsist(){
		let iddocente = $("#iddocente").val();
		let curso = $("#listCurso").val();
		let laboratorioid =$("#listLaboratorio").val();
		
		let tramite = new TramiteMF(PeriodoAusente,PeriodoRegreso,CodigoAlumno,tipoTramite,InicPeriodo,FechaRegreso,RD);
		return tramite;
	}
	
	function enviarAsist(){
		$("#ValidarRegistro").html(null);
		let RegistroAsistAMF = RegistrarAsist();
		let RegistroAsistAMFjson = JSON.stringify(RegistroAsistAMF);
		string_rt=RegistroAsistAMFjson;

		$.ajax({
	        url: '/sismatricula/confirmartramiteres',
	        type: 'POST',
	        contentType: "application/json; charset=utf-8",


	        dataType: "html",
	        data: string_rt,

	        success: function(data) {
	        	var response=$('<div/>').html(data);
	        	var exito=response.find("#exito");
	        	console.log("se entrego datoas");
	          	console.log(data);
	          	console.log("exito"+exito.text());
	          	if(exito.text().length!=0){
	          		console.log("exitox2x2x2");
	          		$("#todo").html(data);
	          	 }
	          	else{
	          		document.getElementById('enviarReserva').style.display ='block';
	          		$("#ValidarRegistro").html(data);
	          	}
	        string_rt = null;
	        },
	        error : function(xhr, status) {
	            alert('Disculpe, existio un problema -- '+xhr+" -- "+status);
	        },
	      });
	}*/
	
});