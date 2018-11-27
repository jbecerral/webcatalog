<%@page import="com.demo.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" isELIgnored="false"%>
<%!String linkName = "";%>
<%
	linkName = (String)request.getAttribute("linkName");
%>

<html>
<head>
    <title>Welcome</title>
</head>
<body>
	<%
		if(linkName.equals("book")) {
	%><h2>Book Catalog</h2><hr/><%
		}
	%>
	<%
		if(linkName.equals("flower")) {
	%><h2>Flower Catalog</h2><hr/><%
		}
	%>
	<%
		if(linkName.equals("toy")) {
	%><h2>Toy Catalog</h2><hr/><%
		}
	%>
	<table>
	   <tr>
	       <td>Id</td>
	       <td>Name</td>
	       <td>Description</td>
	       <%
	       	if(linkName.equals("book")) {
	       %><td>Author ID</td><%
	       	}
	       %>
	       <td>Price</td>
	   </tr>
	   <%
	   	List<Product> productsList = (List<Product>) request.getAttribute("productCatalog");
	   	    for(Product product: productsList) {
	   %>
	        <tr>
	           <td><%= product.getId() %></td>
	           <td><%= product.getName() %></td>
	           <td><%= product.getDescription() %></td>
	           <% if(linkName.equals("book")) {%><td><%= product.getAuthorId() %></td><% }%>
	           <td><%= product.getPrice() %></td>
	       </tr>
	   <%
	    }
	   %>
	</table>
</body>
</html>
