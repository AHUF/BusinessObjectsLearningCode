<%-- 
    Document   : index
    Created on : Nov 24, 2015, 2:03:08 PM
    Author     : Ann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	jwsccwebclienta.CreditCardServiceA_Service service = new jwsccwebclienta.CreditCardServiceA_Service();
	jwsccwebclienta.CreditCardServiceA port = service.getCreditCardServiceAPort();
	 // TODO initialize WS operation arguments here
	java.lang.String sql = "Select AccountNo, Balance, Limit, expirationDate, name from Account order by AccountNo";
	// TODO process result here
	java.util.List<java.lang.Object> result = port.read(sql);
	for(int i=0;i<result.size();i++){
            String line = result.get(i).toString();
    %>
    <br>
    <%= line%>
    <%
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
        <h2><a href="List.html"> List An Account Transactions </a></h2>
    </body>
</html>
