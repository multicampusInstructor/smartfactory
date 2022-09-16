<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JQuery Test</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		//alert('ready');
		$('#btn_call').on('click',function(){
			alert('event calling');
		});
		
		$('#btn_json').on('click',function(){
			let jsonStr = '{"name": ["kim","lee","park"]}';
			let jsonObj = JSON.parse(jsonStr);
			for(let idx in jsonObj.name){
				//console.log(jsonObj.name[idx]);
			}
			
			for(let val of jsonObj.name){
				console.log(val);
			}
			
		});
		
		$('#btn_ajax').on('click',function(){
			let jsonStr = '{"name": ["kim","lee","park"]}';
			$.ajax({
				type : "post",
				dataType : "text",
				async : false,
				url : "./MyServlet?command=json",
				data : {name:jsonStr},
				success : function(data,status){
					alert('success '+data);

				},
				error : function(data,status){
					alert('fail '+status);
				},
				complete : function(data,status){
					
				}
			});
		});
	});
</script>
</head>
<body>
<h1>JQuery</h1>
<button id="btn_call">이벤트 호출</button>
<button id="btn_json">JSON 테스트</button>
<button id="btn_ajax">ajax 테스트</button>
</body>
</html>