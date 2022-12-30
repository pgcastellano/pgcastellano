<!Doctype html>


<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
    <title>BUENOS AIRES MARATON - 2022</title>
<link href="bootstrap.min.css" rel="stylesheet">
<link href="style.css" rel="stylesheet">

<!-- FUNCION BOTON DE INSCRIBIRME -->
<%-- <script type="text/javascript">
			function inscribirme() {
				//http://localhost:8080/app-web/AltaCorredorController
				window.location = '<%=request.getContextPath()%>/AltaCorredorController';
			}
		</script> --%>

  </head>


<body class="text-center">

<!-- NAVBAR  -->
<jsp:include page="navbar.jsp"/>

      <main role="main" class="inner cover">
        <h1 class="cover-heading">MARATON BUENOS AIRES 2022</h1>
        <p class="lead"> La maratón de Buenos Aires es una de las maratones más grandes del mundo. Su edición 2022 se celebra el viernes 23 de diciembre. A partir del 1 de diciembre, la Asociación de Carreras y Maratones tiene abiertas las inscripciones. </p>
        <p class="lead">

<!--   <a href="inscribirme.jsp"><button class="btn btn-lg btn-secondary">INSCRIBIRME</button></a>
 -->       
 
 <a href="corredores?opcion=crear"><button class="btn btn-lg btn-secondary">INSCRIBIRME</button></a>
  <a href="corredores?opcion=listar"><button class="btn btn-lg btn-secondary">VER TODOS LOS INSCRIPTOS</button></a>
 
 
  </p>
      </main>

      <footer class="mastfoot mt-auto">
        <div>
          <p>Organiza la Asociación de Carreras y Maratones de Buenos Aires - maratones@buenosaires.gov</p>
        </div>
      </footer>

  </body>
</html>