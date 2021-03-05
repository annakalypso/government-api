<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>StartUpPage</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/custom.css" rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
</head>
<body>
<!-- Navigation -->
    <nav id="siteNav" class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Logo and responsive toggle -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>              
            </div>
            <!-- Navbar links -->
            <div class="collapse navbar-collapse" id="navbar">
                <ul class="nav navbar-nav navbar-right">
                    <li class="active">
                        <a href="StartPage.jsp">Home</a>
                    </li>					
                </ul>               
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container -->
    </nav>
        <header>
        <div class="header-content">
            <div class="header-content-inner">
                <h1>Application for Crime Analysis in Greece</h1>
                <p>Click to Start</p>
                <form action="SelectAction.jsp">
				<div style="text-align:center">
    				<a href="SelectAction.jsp" class="btn btn-primary btn-lg">Start</a>
    			</div>
				</form>                
            </div>
        </div>
    	</header>
    	
    <!-- Footer -->
    <footer class="page-footer">    
    	<!-- Contact Us -->
        <div class="contact">
        	<div class="container">
				<h2 class="section-heading">Contact Us</h2>
				<p><span class="glyphicon glyphicon-earphone"></span><br> +30 6981067882</p>
				<p><span class="glyphicon glyphicon-envelope"></span><br> annoulase14@gmail.com</p>
        	</div>
        </div>
     </footer>
</body>
</html>