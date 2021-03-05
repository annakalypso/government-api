<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<link href="css/FillSearch.css" rel="stylesheet">
<title>Page3.1</title>
</head>
<body>
 <form id="main-search-form" action="CrimeComparing" method="get" name="searchForm">
  <input type="text" placeholder="Insert 1st Crime" id="crime-search" onfocus="this.placeholder = ''"  name="searchCrime1">
  <input type="text" placeholder="Insert 2nd Crime" id="crime-search" onfocus="this.placeholder = ''"  name="searchCrime2">
  <div class="select-wrap">
     <input type="text" placeholder="Year for 1st Crime" id="Year 1" onfocus="this.placeholder = ''" name="year1">
  </div>
  <div class="select-wrap">    
    <input type="text" placeholder="Year fro 2nd Crime" id="Year 2" onfocus="this.placeholder = ''" name="year2">    
  </div>
  <button type="submit">
    <i class="fa fa-search"></i> Search
  </button>
</form>
</body>
</html>