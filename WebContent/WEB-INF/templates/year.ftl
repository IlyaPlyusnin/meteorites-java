<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search For Meteorites By Year</title>
    <link rel="stylesheet" href="CSS/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
</head>
<style type="text/css">
h1,p{
text-align: center;
}
</style>
<body>
<h1>Search for a Meteorite by Year:</h1>
<br>
<p> Please select an option to refine how you would like to search for meteorites. Then enter a four digit year.</p>
<br>
<br>
	<div class="container">
		<div class="row">
			<div class="col">
				<form action="Servlet" method="post">
			        <p><select name="yearMet" class="custom-select">
			                <option value="equal">Equal to</option>
			                <option value="before">Year before</option>
			                <option value="after">Year after</option>
			            </select>
			         </p>
			            <input type="text" name="inputYear" class="form-control" placeholder="Enter a four digit year value">
			            <br>
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