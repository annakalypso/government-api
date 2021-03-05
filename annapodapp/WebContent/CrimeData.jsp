<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<link href="css/FillSearch.css" rel="stylesheet">
<title>Page3.2</title>
</head>
<body>
 <form id="main-search-form" action="FetchCrimeData" method="get" name="searchForm">
  <input type="text" placeholder="Insert Crime" id="crime-search" onfocus="this.placeholder = ''"  name="searchCrime">
  <button type="submit">
    <i class="fa fa-search"></i> Search
  </button>
</form>
</body>
</html>


<!-- <h1 align="center">Search Crimes by Year</h1>
	<form action="fetchCrimesByYear" method="get">
    Enter year of Crimes: <input type="text" name="year" size="20">
    <input type="submit" value="Search" /> -->
