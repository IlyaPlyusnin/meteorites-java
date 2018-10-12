<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search for Meteorites by Mass</title>
    <link rel="stylesheet" href="CSS/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
</head>
<style type="text/css">
h1,p{
text-align:center;
}
</style>
<body>
<h1>Search For Meteorites by Mass: </h1>
<br>
<p> Please select an option to refine how you would like to search for meteorites. Then enter a mass value.</p>
<br>
	<div class="container">
		<div class="row">
			<div class="col">
				<form action="Servlet" method="post">
				    <p><select name="massOption" class="custom-select">
				        <option value="equal">Mass equal to</option>
				        <option value="less">Mass less than</option>
				        <option value="greater">Mass greater than</option>
				    </select>
				    </p>
				    
				    <input type="text" name="massInput" class="form-control" placeholder="Input an integer value">
				    <br />
				   <p> <button type="submit" class="btn btn-outline-primary">Submit</button></p>
		    	</form>
			</div>
		</div>
	</div>
	
    <script src="JS/jquery-3.2.1.js"></script>
    <script src="JS/tether.min.js"></script>
    <script src="JS/bootstrap.js"></script>
</body>
</html>