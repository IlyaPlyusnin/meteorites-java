<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
	h1,p{
	text-align:center;
	}</style>
<title>Meteorite Landings</title>

	<link rel="stylesheet" href="CSS/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<br>
			<br>
			<div class="col-12">
				<h1>Meteorite Landings by NASA's Open Data Portal</h1>
			</div> 
			<br>
			<div class="col">
				<div class="card">
					<h5 class="card-header">
							<p>Select an option below to view different meteorite landings based on the continents</p>
							<br>
					</h5>
					
					<div class="card-body">
						<form action="Servlet" method="post">
							<input type="radio" name="cont" value="NorthAmerica">North America<br />
							<input type="radio" name="cont" value="SouthAmerica">South America<br />
							<input type="radio" name="cont" value="Europe">Europe<br />
							<input type="radio" name="cont" value="Asia">Asia<br />
							<input type="radio" name="cont" value="Africa">Africa<br />
							<input type="radio" name="cont" value="Australia">Australia<br />
							<input type="radio" name="cont" value="Antarctica">Antarctica<br />
							<br>
							<p><button type="submit" class="btn btn-outline-primary">Search</button></p>
						</form>
					</div>
				</div>
				
			</div>
		</div>
	</div>
	
	
	<script src="JS/jquery-3.2.1.js"></script>
    <script src="JS/tether.min.js"></script>
    <script src="JS/bootstrap.js"></script>
	
</body>
</html>