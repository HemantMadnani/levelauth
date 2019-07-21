<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>This is the loginpage!</p>
        
        <form action="authenticate" method="post" >
         ${ SPRING_SECURITY_LAST_EXCEPTION } 
       <pre>
        Username: <input type="text" name="email"> 
        Password: <input type="password" name="password">
         <input type="hidden"                          
        name="${_csrf.parameterName}"  
        value="${_csrf.token}"/>  
        <input type="submit" value="Login">
        
        </pre>
        </form>
        
    </body>
</html>
