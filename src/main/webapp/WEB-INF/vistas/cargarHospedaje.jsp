<%@ include file="header.jsp" %>
<!-- <div class="container"> -->

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
				
				<button type="submit" class="btn btn-default">Cargar Hospedaje</button>
	 	
	 	</form:form>
	 	</div>
	 	</div>
	 	</div>
	 	</div>
	 	
		</div>
