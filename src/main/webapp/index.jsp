<%@ page language="java" isELIgnored="false"%>
<html>
<head>
    <title>Product Catalog</title>
</head>
<body>
	<h2>List of Product Catalogs</h2><hr/>
	<a href="${pageContext.servletContext.contextPath}/product-catalog?linkName=book">View Book Catalog</a>
	<a href="${pageContext.servletContext.contextPath}/product-catalog?linkName=flower">View Flower Catalog</a>
	<a href="${pageContext.servletContext.contextPath}/product-catalog?linkName=toy">View Toy Catalog</a>
</body>
</html>
