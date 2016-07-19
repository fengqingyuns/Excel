<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
      
    <title>json交互测试</title>  
    <script type="text/javascript" src="js/jquery.min.js"></script>  
    <script type="text/javascript">  
        //请求的是json，输出的是json  
        function reuqestJson(){  
        	
        	alert(1);
        	
        	
        	/*	$.get("http://localhost:8080/ssmm/wl",
        		    {
        				teacherid:3091973
        		     
        		    },
        		    function(data,status){
        		      alert("数据：" + data + "\n状态：" + status);
        		     
        		      
        		    });       
        	*/
        }  
    </script>  
  </head>  
    
  <body>  
    <input type="button" onclick="reuqestJson()"  value="请求的是json，输出的是json"/>  
    
    

  </body>
  
  
    
</html>  