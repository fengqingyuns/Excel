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
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>  
    <script type="text/javascript">  
        //请求的是json，输出的是json  
        function reuqestJson(){  
        	alert(1); 
        <!--    $.ajax({  
                type:'post',  
                url:'${pageContext.request.contextPath }/requestJson.action',  
                contentType:'application/json;charset=utf-8',     
                //数据格式是json串,商品信息  
                data:'{"name":"手机","price":999}',  
                success:function(data){//返回json结果  
                    alert(data);  
                }   
            });  -->
        }  
    </script>  
  
  </head>  
    
  <body>  
    <input type="button" onclick="reuqestJson()"  value="请求的是json，输出的是json"/>  
  </body>  
</html>  