<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search For Meteorites By Name</title>
    <link rel="stylesheet" href="CSS/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
</head>
<style type="text/css">
h1,p{
text-align:center;
</style>
<body>
<h1> Search for Meteorites By Name:</h1>
<br>
<p> Please type a name of a meteorite to be searched..</p>
	<div class="container">
		<div class="row">
			<div class="col">
				<form action="Servlet" method="post">
		            <p><input type="text" class="form-control" name="nameCity" placeholder="Enter a name of a city"></p>
		            <p><button type="submit" class="btn btn-outline-primary">Submit</button></p>
	    		</form>
			</div>
		</div>
	</div>
    
	<script src="JS/jquery-3.2.1.js"></script>
    <script src="JS/tether.min.js"></script>
    <script src="JS/bootstrap.js"></script>
</body>
</html>