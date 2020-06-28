<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container">
<h1>Ajouter</h1>
<form action="Article" method="post">
<div class="form-group">
<label for="cat">Category</label>
<input type="text" class="form-control" name="cat" id="cat">
</div>
<div class="form-group">
<label for="sub">Subcategory</label>
<input type="text" class="form-control" name="sub" id="sub">
</div>
<div class="form-group">
<label for="price">Price</label>
<input type="text" class="form-control" name="price" id="price">
</div>
<div class="form-group">
<label for="qty">Quantity</label>
<input type="text" name="qty" id="qty" class="form-control">
</div>
<div class="form-group">
<label for="desc">Description</label>
<input type="text" name="desc" id="desc" class="form-control">
</div>
<button type="submit" name="add" class="btn btn-primary">Submit</button>
</form>
<hr>
<br>
<h1>Consulter</h1>
<table class="table table-hover">
<thead>
<tr>
<th scope="col">Ref</th>
<th scope="col">Category</th>
<th scope="col">Subcategory</th>
<th scope="col">Price</th>
<th scope="col">quantity</th>
<th scope="col">Description</th>
</tr>
</thead>
<tbody>
<c:forEach items="${articles}" var="a">
<tr>

<th scope="row">${a.getRef()}</th>
<td>${a.getCategory()}</td>
<td>${a.getSubcategory()}</td>
<td>${a.getPrice()}</td>
<td>${a.getQuantity()}</td>
<td>${a.getDescription()}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>