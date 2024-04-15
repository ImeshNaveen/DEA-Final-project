<!doctype html>
<html lang="en">


<!-- Mirrored from risingtheme.com/html/demo-partsix/partsix/my-account.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 08 Apr 2024 17:35:43 GMT -->
<head>
  <meta charset="utf-8">
  <title> My Account</title>
  <meta name="description" content="Morden Bootstrap HTML5 Template">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="shortcut icon" type="image/x-icon" href="../assets/img/favicon.ico">
    
   <!-- ======= All CSS Plugins here ======== -->
   <link rel="stylesheet" href="../assets/css/plugins/swiper-bundle.min.css">
   <link rel="stylesheet" href="../assets/css/plugins/glightbox.min.css">
   <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800;900&amp;family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700&amp;family=Rubik:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,300;1,400;1,500&amp;display=swap" rel="stylesheet">
 
   <!-- Plugin css -->
   <link rel="stylesheet" href="../assets/css/vendor/bootstrap.min.css">
 
   <!-- Custom Style CSS -->
   <link rel="stylesheet" href="../assets/css/style.css">
</head>

<body>

    <!-- Start preloader -->
         <jsp:include page="includings/preloader.jsp"/>
    <!-- End preloader -->
    
    <!-- Start header area -->
        <jsp:include page="includings/nav-bar.jsp"/>
    <!-- End header area -->

    <main class="main__content_wrapper">

        <!-- Start breadcrumb section -->
        <section class="breadcrumb__section breadcrumb__bg">
            <div class="container">
                <div class="row row-cols-1">
                    <div class="col">
                        <div class="breadcrumb__content text-center">
                            <ul class="breadcrumb__content--menu d-flex justify-content-center">
                                <li class="breadcrumb__content--menu__items"><a href="index.html">Home</a></li>
                                <li class="breadcrumb__content--menu__items"><span>My Account</span></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- End breadcrumb section -->
        
        <!-- my account section start -->
        <section class="my__account--section section--padding">
            <div class="container">
                <p class="account__welcome--text">Hello, Admin welcome to your dashboard!</p>
                <div class="my__account--section__inner border-radius-10 d-flex">
                    <div class="account__left--sidebar">
                        <h2 class="account__content--title mb-20">My Profile</h2>
                        <ul class="account__menu">
                            <li class="account__menu--list active"><a href="#">Dashboard</a></li>
                            <li class="account__menu--list"><a href="#">My Oders</a></li>
                            <li class="account__menu--list"><a href="#">Profile</a></li>
                        </ul>
                    </div>
                    
                    <jsp:include page="contents/my-oders.jsp"/>
                    
                    
                    <!-- this area for contents -->
                    
                    
                    
                    
                </div>
            </div>
        </section>
        <!-- my account section end -->


    </main>

    <!-- Start footer section -->
        <jsp:include page="includings/footer.jsp"/>
    <!-- End footer section -->

    <!-- Scroll top bar -->
    <button id="scroll__top"><svg xmlns="http://www.w3.org/2000/svg" class="ionicon" viewBox="0 0 512 512"><path fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="48" d="M112 244l144-144 144 144M256 120v292"/></svg></button>

<!-- All Script JS Plugins here  -->
<script src="../assets/js/vendor/popper.js" defer="defer"></script>
<script src="../assets/js/vendor/bootstrap.min.js" defer="defer"></script>
<script src="../assets/js/plugins/swiper-bundle.min.js"></script>
<script src="../assets/js/plugins/glightbox.min.js"></script>

<!-- Customscript js -->
<script src="../assets/js/script.js"></script>
  
</body>

<!-- Mirrored from risingtheme.com/html/demo-partsix/partsix/my-account.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 08 Apr 2024 17:35:43 GMT -->
</html>