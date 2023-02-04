<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>My Resume - ${hero.name}</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href='<c:url value="/resources/img/favicon.png"/>' rel="icon">
  <link href='<c:url value="/resources/img/apple-touch-icon.png"/>' rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href='<c:url value="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"/>' rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href='<c:url value="/resources/vendor/aos/aos.css"/>' rel="stylesheet">
  <link href='<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/>' rel="stylesheet">
  <link href='<c:url value="/resources/vendor/bootstrap-icons/bootstrap-icons.css"/>' rel="stylesheet">
  <link href='<c:url value="/resources/vendor/boxicons/css/boxicons.min.css"/>' rel="stylesheet">
  <link href='<c:url value="/resources/vendor/glightbox/css/glightbox.min.css"/>' rel="stylesheet">
  <link href='<c:url value="/resources/vendor/swiper/swiper-bundle.min.css"/>' rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href='<c:url value="/resources/css/style.css"/>' rel="stylesheet">

  <!-- =======================================================
  * Template Name: MyResume - v4.10.0
  * Template URL: https://bootstrapmade.com/free-html-bootstrap-template-my-resume/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

<!-- ======= Mobile nav toggle button ======= -->
<!-- <button type="button" class="mobile-nav-toggle d-xl-none"><i class="bi bi-list mobile-nav-toggle"></i></button> -->
<i class="bi bi-list mobile-nav-toggle d-lg-none"></i>
<!-- ======= Header ======= -->
<header id="header" class="d-flex flex-column justify-content-center">

  <nav id="navbar" class="navbar nav-menu">
    <ul>
      <li><a href="/" class="nav-link scrollto active"><i class="bx bx-home"></i> <span>Home</span></a></li>
      <li><a href="/about" class="nav-link scrollto"><i class="bx bx-user"></i> <span>About</span></a></li>
      <li><a href="/resume" class="nav-link scrollto"><i class="bx bx-file-blank"></i> <span>Resume</span></a></li>
      <li><a href="/portfolio" class="nav-link scrollto"><i class="bx bx-book-content"></i> <span>Portfolio</span></a></li>
      <li><a href="/services" class="nav-link scrollto"><i class="bx bx-server"></i> <span>Services</span></a></li>
      <li><a href="/contact" class="nav-link scrollto"><i class="bx bx-envelope"></i> <span>Contact</span></a></li>
    </ul>
  </nav><!-- .nav-menu -->

</header><!-- End Header -->
