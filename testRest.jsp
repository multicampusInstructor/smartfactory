<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test RESTful</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		console.log('ready');
		$('#btn1').on('click',function(){
			//alert('btn1');
			$.ajax({
				type : "get",
				url : "hello",
				dataType : "text",
				success : function(data,status){
					//console.log(data);
					alert(data);
				},
				error : function(data,status){
					
				},
				complete : function(data,status){
					
				}
				
			}); // ajax end
			
		}); // btn1 end
		
		$('#btn2').on('click',function(){
			$.ajax({
				type : "get",
				url : "reply",
				dataType : "text",
				success : function(data,status){
					console.log(data);
					let jsonObj = JSON.parse(data);
					//alert(jsonObj.replyDate);
					let rDate = new Date(jsonObj.replyDate);
					let result = "No. "+jsonObj.replySeq+"<br/>작성시간: "+rDate.toLocaleString()
								+"<br/>내용 : "+jsonObj.replyContent;
					$('#content').html(result);
				},
				error : function(data,status){
					
				},
				complete : function(data,status){
					
				}
				
			}); // ajax end
			
		}); // btn2 end
		
		$('#btn3').on('click',function(){
			$.ajax({
				type : "get",
				url : "replyList",
				dataType : "text",
				success : function(data,status){
					console.log(data);
					let arrayObj = JSON.parse(data);
					//alert(jsonObj.replyDate);
					let result = "";
					for(let i=0;i<arrayObj.length;i++){
						let jsonObj = arrayObj[i];
						let rDate = new Date(jsonObj.replyDate);
						result = result+"No. "+jsonObj.replySeq+"<br/>작성시간: "+rDate.toLocaleString()
									+"<br/>내용 : "+jsonObj.replyContent+"<br/><br/>";
					}
					$('#content').html(result);
				},
				error : function(data,status){
					
				},
				complete : function(data,status){
					
				}
				
			}); // ajax end
			
		}); // btn3 end
	
		$('#btn4').on('click',function(){
			$.ajax({
				type : "get",
				url : "replyMap",
				dataType : "text",
				success : function(data,status){
					console.log(data);
					let temp = JSON.parse(data);
					//alert(jsonObj.replyDate);
					let arrayObj = temp.replyList;
					let result = "Map 처리 <br/><br/>";
					for(let i=0;i<arrayObj.length;i++){
						let jsonObj = arrayObj[i];
						let rDate = new Date(jsonObj.replyDate);
						result = result+"No. "+jsonObj.replySeq+"<br/>작성시간: "+rDate.toLocaleString()
									+"<br/>내용 : "+jsonObj.replyContent+"<br/><br/>";
					}
					$('#content').html(result);
				},
				error : function(data,status){
					
				},
				complete : function(data,status){
					
				}
				
			}); // ajax end
			
		}); // btn4 end
		
	}); // document end	
</script>
</head>
<body>
<h1>Reply Content</h1>
<div id="content"></div>
<br/>
<input type="button" value="문자열받기" id="btn1">
<input type="button" value="VO받기" id="btn2">
<input type="button" value="List받기" id="btn3">
<input type="button" value="Map받기" id="btn4">
<br/>

</body>
</html>


