$(document).ready(function() {
	$("#loginBtn").click(function() {
		// alert("alert text");
		// $.post("",{},function(){});
		$.post("home",
			{},
			function(data, status){
				console.log(data);
				$("#msgDiv").html(data);
			});
	});
});
