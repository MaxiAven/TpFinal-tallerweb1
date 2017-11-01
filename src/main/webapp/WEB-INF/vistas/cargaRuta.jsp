<%@ include file="header.jsp" %>
	 	<div class="container">
	 	<div class="col-lg-4"></div>
	 	<div class="col-lg-4">
	 	<div class="panel panel-default">
	 	<div class="panel-heading">Carga tu Ruta</div>
	 	<div class="panel-body cargaRuta">
			
			<form:form action="cargar-ruta" method="POST" modelAttribute="ruta">
  			<div class="form-group">
    			<label for="salida">Salida:</label>
    			<input type="text" class="form-control" name="salida" id="salida">
  			</div>
  			<div class="form-group">
   				 <label for="llegada">Llegada</label>
    			 <input type="text" class="form-control" name="llegada" id="llegada">
  			</div>
  			
  				<button type="submit" class="btn btn-default">Cargar Ruta</button>
  			</form:form>
		</div>
		</div>
		</div>
		<div class="col-lg-4"></div>
		</div>
		
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
		<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
