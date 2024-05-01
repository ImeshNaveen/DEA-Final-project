<!doctype html>
<html lang="en">


<!-- Mirrored from risingtheme.com/html/demo-partsix/partsix/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 08 Apr 2024 17:35:44 GMT -->
<head>
  <meta charset="utf-8">
  <title>Register user</title>
  <meta name="description" content="Morden Bootstrap HTML5 Template">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
    
  <!-- ======= All CSS Plugins here ======== -->
  <link rel="stylesheet" href="assets/css/plugins/swiper-bundle.min.css">
  <link rel="stylesheet" href="assets/css/plugins/glightbox.min.css">
  <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800;900&amp;family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700&amp;family=Rubik:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,300;1,400;1,500&amp;display=swap" rel="stylesheet">

  <!-- Plugin css -->
  <link rel="stylesheet" href="assets/css/vendor/bootstrap.min.css">

  <!-- Custom Style CSS -->
  <link rel="stylesheet" href="assets/css/style.css">

</head>

<body>

    <!-- Start preloader -->
    <jsp:include page="includings/preloader.jsp" />
    <!-- End preloader -->
    
    <!-- Start header area -->
    <jsp:include page="includings/nav-bar.jsp" />
    <!-- End header area -->


    <main class="main__content_wrapper">
        
        <%
        String status = request.getParameter("status");
            if(status != null){
                if(status.equals("1")){
        %>
                    <div class="alert alert-warning">
                        <strong>    Alert!</strong> Please log before you enter your profile.
                    </div>
        <%
                }
                if(status.equals("2")){
        %>
                    <div class="alert alert-warning">
                        <strong>    Alert!</strong> Passwords does not match.
                    </div>
        <%
                }
                if(status.equals("3")){
        %>
                    <div class="alert alert-success">
                        <strong>    Success!</strong> Your account created successfully!
                    </div>
        <%
                }
                if(status.equals("4")){
        %>
                    <div class="alert alert-warning">
                        <strong>    Alert!</strong> User is not inserted!.
                    </div>
        <%
                }
            }
        %>
        <!-- Start register section  -->
        <div class="login__section section--padding">
            <div class="container">
                <form action="userServlet/insertUser" method="post">
                    <div class="login__section--inner">
                        <div class="row row-cols-md-2 row-cols-1">
                            <div class="col">
                                <div class="account__login register">
                                    <div class="account__login--header mb-25">
                                        <h2 class="account__login--header__title mb-10">Create an Account</h2>
                                        <p class="account__login--header__desc">Register here if you are a new customer</p>
                                    </div>
                                    <div class="account__login--inner">
                                        <label>
                                            <input class="account__login--input" name="username" placeholder="Username" type="text">
                                        </label>
                                        <label>
                                            <input class="account__login--input" name="email" placeholder="Email Addres" type="email">
                                        </label>
                                        <label>
                                            <input class="account__login--input" name="phone_no" placeholder="Telephone" type="text">
                                        </label>
                                        <label>
                                            <textarea rows="25" cols="30" name="address" class="account__login--input" placeholder="Address"></textarea>
                                        </label>
                                        <label>
                                            <input class="account__login--input" name="pw" placeholder="Password" type="password">
                                        </label>
                                        <label>
                                            <input class="account__login--input" name="cpw" placeholder="Confirm Password" type="password">
                                        </label>
                                        <button class="account__login--btn primary__btn mb-10" name="buttonClicked" value="register" type="submit">Submit & Register</button>
                                        <p class="account__login--header__desc">Already have an account? <a href="userServlet/login">Log now</a></p>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>     
        </div>
        <!-- End register section  -->
        
        <!-- Start breadcrumb section -->
        <section class="breadcrumb__section breadcrumb__bg">
            <div class="container">
                <div class="row row-cols-1">
                    <div class="col">
                        <div class="breadcrumb__content text-center">
                            <ul class="breadcrumb__content--menu d-flex justify-content-center">
                                <li class="breadcrumb__content--menu__items"><a href="index.jsp">Home</a></li>
                                <li class="breadcrumb__content--menu__items"><span>Login or Register</span></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- End breadcrumb section -->



        <!-- Start shipping section -->
        <jsp:include page="includings/shipping-section.jsp" />
        <!-- End shipping section -->

    </main>

    <!-- Start footer section -->
    <jsp:include page="includings/footer.jsp" />
    <!-- End footer section -->

     <!-- Scroll top bar -->
   <button id="scroll__top"><svg xmlns="http://www.w3.org/2000/svg" class="ionicon" viewBox="0 0 512 512"><path fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="48" d="M112 244l144-144 144 144M256 120v292"/></svg></button>

   <!-- All Script JS Plugins here  -->
   <script src="assets/js/vendor/popper.js" defer="defer"></script>
   <script src="assets/js/vendor/bootstrap.min.js" defer="defer"></script>
   <script src="assets/js/plugins/swiper-bundle.min.js"></script>
   <script src="assets/js/plugins/glightbox.min.js"></script>
 
  <!-- Customscript js -->
  <script src="assets/js/script.js"></script>
  
</body>

<!-- Mirrored from risingtheme.com/html/demo-partsix/partsix/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 08 Apr 2024 17:35:44 GMT -->
</html>