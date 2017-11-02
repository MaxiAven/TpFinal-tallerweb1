<%@ include file="header.jsp" %>
<!-- <div class="container"> -->

<<<<<<< HEAD
	<div class="col-md-6 col-md-offset-3 fondoFormulario">
	<div class="panel panel-default">
  <div class="panel-heading">Comparte tu Hospedaje!</div>
  <div class="panel-body">
   <form:form action="cargar-hospedaje"  method="POST" modelAttribute="hospedaje">
=======
<!-- 	<div class="col-md-6 col-md-offset-3"> -->
<!-- 	 	Comparte tu Hospedaje! -->
<div class="container">
<div class="container">
	 	<div class="col-lg-4"></div>
	 	<div class="col-lg-4">
	 	<div class="panel panel-default">
	 	<div class="panel-heading">Paso 2/3: Ahora contanos sobre el hospedaje</div>
	 	<div class="panel-body cargaRuta">
	 	<form:form action="cargar-hospedaje"  method="POST" modelAttribute="hospedaje">
>>>>>>> 855dd6c5519f0965abd56aafbf16ec2abfa0087a
	 	<div class="form-group">
			<label for="tipoHospedaje">Tipo Hopedaje:</label>
			<input type="text" class="form-control" name="tipoHospedaje" id="tipoHospedaje">
		</div>
				
			<div class="form-group">
					  <label for="precio">Cuanto gastaste?</label>
					  <input type="number" class="form-control" placeholder="aca pone el monto en $ de cuanto gastaste" name="precio" id="precio">
				</div>
				
				<div class="form-group">
					  <label for="descripcion">Descripción:</label>
					  <textarea class="form-control" rows="3" name="descripcion" id="descripcion"></textarea>
				</div>
				
				<div class="form-group">
					  <label for="cantPersonas">Cantidad de viajeros??:</label>
					  <input type=number class="form-control"  name="cantPersonas" id="cantPersonas"></input>
				</div>
				
				<button type="submit" class="btn btn-default">Cargar Hospedaje</button>
	 	
	 	</form:form>
  </div>
</div>
	 	
	 	
	 	</div>
	 	</div>
	 	</div>
	 	</div>
	 	
		</div>
