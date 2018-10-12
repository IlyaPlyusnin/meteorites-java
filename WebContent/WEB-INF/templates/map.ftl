<!DOCTYPE html>
<html lang="en">
<head>
<style type="text/css">
h1,p{
text-align: center;
</style>
    <meta charset="UTF-8">
    <title>Map</title>
    <link rel="stylesheet" href="CSS/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <style>
        #map{
            height:400px;
            width: 100%;
        }
    </style>
    
<body>
	
    <h1>Meteorites Found Based on Your Search:</h1>
    <div id="map"></div>
    <script>
        var markers = [];
    </script>

    <#list meteorites as met>
        <script>
            markers.push(
            {
                cords:{lat:${met.getLatitude()} ,lng:${met.getLongitude()} },
                content:
                "<h1>Name: ${met.getDescription()}<h1>" +
                	"<h1>Mass: ${met.getMass()}<h1>" +
                	"<h1>Year: ${met.getYear()}<h1>"	
            });

            var x = ${met.getLatitude()};
            var y = ${met.getLongitude()};
        </script>
    </#list>
    <script>
        function initMap(){
            //map options
            var options = {
                zoom:8,
                center:{lat:x,lng:y}
            };
            //new map
            var map = new google.maps.Map(document.getElementById('map'),options);
			
            //Loop through the marker array
            for(var i = 0; i< markers.length; i++){
                addMarker(markers[i]);
            }

            //Add Marker Function
            function addMarker(props){
                var marker = new google.maps.Marker({
                    position:props.cords,
                    map:map,
                    //icon: props.iconImage
                });

                //check for custom icon
                if(props.iconImage){
                    //Set icon image
                    marker.setIcon(props.iconImage);
                }

                //check for content
                if(props.content){
                    var infoWindow = new google.maps.InfoWindow({
                        content: props.content
                    });
                }
                marker.addListener('click',function(){
                    infoWindow.open(map,marker);
                });
            }//addMarker
        }
    </script>
    <script src="JS/jquery-3.2.1.js"></script>
    <script src="JS/tether.min.js"></script>
    <script src="JS/bootstrap.js"></script>
    <script async defer
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB54Ya2-xg84ZgJFNquS3JyiIg6NxOhaLI&callback=initMap">
    </script>
			<p><a href="http://localhost:8080/TermProject/index.html">Search Again</a>
			<br><a href="https://www.lpi.usra.edu/meteor/"> Find More Information About Your Meteorite</a>
			 <br>
			<a href="https://data.nasa.gov/">Discover More</a> </p>

</body>
</html>