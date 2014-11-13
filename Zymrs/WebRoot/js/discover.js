// JavaScript Document

$(document).ready(function(){
	
	$(function() {
		$( ".exhibits_picture" ).click(function() {
			$( this).toggleClass( "exhibits_show");
		});
	});
	
	$(".discover ul li a").click(function(e) {
		e.preventDefault;
		return false;
	})
		
	$(".discover ul li a").click(function(e) {
		var nam = $(this).attr("id");	
		$.ajax({
    		dataType: 'json',
			url: 'assets/js/animals.json',
    		success: function(data) {
				$.each(data.animals, function(i,data){					
						var div_name = data.Name;	 
						if ( div_name == nam){
							$('#animals').html("<h1>"+data.Name+"</h1>"+
														"<a href='assets/images/"+data.Img+"' rel='lightbox'><img src='assets/images/"+data.Img+"'/></a>"+			 
										 				"<div class='info'>"+
    									 				"<span>Scientific Name:</span>"+data.ScientificName+"<br />"+
    									 				"<span>Origin:</span>"+data.Origin+"<br />"+
    									 				"<span>Location:</span>"+data.Location+"<br />"+
    									 				"<span>Status:</span>"+data.Status+"<br />"+
  														"</div>"+
														"<div class='story'>"+data.Story+"</div>"	
							); 
			  			}				
				});
    		},
			error: function() {
				alert("Error load json file");
			}
		});
   }); 

}); 