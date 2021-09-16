<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  <h3 class="text-center mt-5">Registeration Form</h3>
  <div class="container mt-5">
    <form action="processform" method="post">
    <div class="form-group">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
  
  </div>
   <div class="form-group">
    <label for="userId" class="form-label">User Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name">
   
  </div>
   <div class="form-group">
    <label for="exampleInputEmail1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="password">
  </div>
  <div class="container text-center mt-1">
   <button type="submit" class="btn btn-success">Sign up</button>
  </div>
 
    </form>
    </div>
  </body>
</html>