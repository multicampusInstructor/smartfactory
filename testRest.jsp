<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test RESTful</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 100px; /* Location of the box */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-content {
  background-color: #fefefe;
  margin: auto;
  padding: 20px;
  border: 1px solid #888;
  width: 80%;
}

/* The Close Button */
.close {
  color: #aaaaaa;
  float: right;
  font-size: 28px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}
</style>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
		console.log('ready');
		let arrayObj;
		
		$('#btn3').on('click',function(){
			$.ajax({
				type : "get",
				url : "/rest/all",
				dataType : "text",
				success : function(data,status){
					console.log(data);
					arrayObj = JSON.parse(data);
					//alert(jsonObj.replyDate);
					let result = "";
					for(let i=0;i<arrayObj.length;i++){
						let jsonObj = arrayObj[i];
						result = result+"No. "+jsonObj.id+"<br/>작성시간: "+jsonObj.name
									+"<br/>내용 : "+jsonObj.imageName+"<br/><br/>";
						//alert(result);
					}
					//$('#content').html(result);
				},
				error : function(data,status){
					alert('error');
				},
				complete : function(data,status){
					alert('complete');
					processReady(arrayObj);
				}
				
			}); // ajax end
			
		}); // btn3 end
		var processReady = function(arrayObj2){
			var srcBtn = "";
			for(var i=0;i<arrayObj2.length;i++){
				srcBtn += '<button id="myBtn_'+i+'">'+arrayObj2[i].imageName+'</button>&nbsp;';
				//alert(srcBtn);
			}
			$('#loc').html(srcBtn);
			for(var i=0;i<arrayObj2.length;i++){
				let obj = arrayObj2[i];
				$('#myBtn_'+i).on('click',function(){
					alert('result ');
					let result = viewModal(obj);
					alert(result);
					$('#modal_loc').html(result);
					$('#myModal').css("display", "block");
					$('#myModal').on('click',function(){
						$('#myModal').css("display", "none");
					});
				});
			}
			
			
			
		}

		var viewModal = function(obj){
			//alert(obj.id);
			let display = '<div id="myModal" class="modal"><div class="modal-content"><span class="close">&times;</span><p>'+obj.name+'</p></div></div>';
			return display;
		}
	}); // document end	
</script>

</head>
<body>
<h1>Reply Content</h1>
<div id="content"></div>
<br/>
<h1>data 전송</h1>
<input type="button" value="List받기" id="btn3">

<br/>
<h2>Modal Example</h2>

<!-- Trigger/Open The Modal -->
<div id="loc"></div>

<!-- The Modal -->
<div id="modal_loc"></div>

</body>
</html>


