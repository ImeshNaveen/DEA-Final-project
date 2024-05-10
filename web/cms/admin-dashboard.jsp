<!doctype html>
<html lang="en">


<!-- Mirrored from risingtheme.com/html/demo-partsix/partsix/my-account.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 08 Apr 2024 17:35:43 GMT -->
<head>
  <meta charset="utf-8">
  <title> My Account</title>
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
   <style>
       .account__left--sidebar a {
           color:#000;
       }
   </style>
</head>

<body>

    <!-- Start preloader -->
         <jsp:include page="includings/preloader.jsp"/>
    <!-- End preloader -->
    
    <!-- Start header area -->
        <jsp:include page="includings/nav-bar.jsp"/>
    <!-- End header area -->

<main class="main__content_wrapper">

    <section class="cms-admin">
        <div class="container">
            <div class="admin-search-bar">
              <form class="admin-search" action="#">
                <div class="admin-search-selects">
                  <div class="admin__search--width">
                    <select class="admin__search--select__field">
                      <option selected value="1">Select Make</option>
                      <option value="2">Brake Calipers </option>
                      <option value="3">Engine Oil </option>
                      <option value="4">Motor Oil </option>
                      <option value="5">Oil Filters </option>
                    </select>
                  </div>

                  <div class="admin__search--width">
                    <select class="admin__search--select__field">
                      <option selected value="1">Select Model</option>
                      <option value="2">Toyota Combo </option>
                      <option value="3">Model 2022 </option>
                      <option value="4">Air Boxes </option>
                    </select>
                  </div>

                  <div class="admin__search--width">
                    <select class="admin__search--select__field">
                      <option selected value="1">Select Additional</option>
                      <option value="2">Option 1</option>
                      <option value="3">Option 2</option>
                      <option value="4">Option 3</option>
                    </select>
                  </div>

                  <div class="admin__search--width">
                    <select class="admin__search--select__field">
                      <option selected value="1">Select Another</option>
                      <option value="2">Another Option 1</option>
                      <option value="3">Another Option 2</option>
                      <option value="4">Another Option 3</option>
                    </select>
                  </div>

                  <div class="admin__search--width">
                    <button class="admin__search--btn primary__btn" type="submit">Search</button>
                  </div>
                </div>
              </form>
            </div>
        </div>
    </section>
    
    <section class="admin-items">
        <div class="container">
            <div class="admin-items-edit">
                <div class="container text-center">
                    <div class="row">
                      <div class="col">
                            <div class="card" style="width: 28rem;">
                                <img src="assets/img/categories-product1.webp" class="card-img-top" alt="...">
                                <div class="card-body">
                                  <h5 class="card-title">Card title</h5>
                                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                  <div class="edit-btn">
                                    <a href="#" class="btn btn-primary">Edit</a>
                                    <a href="#" class="btn btn-primary">Delete</a>
                                  </div>
                                </div>
                            </div>
                      </div>
                      <div class="col">
                            <div class="card" style="width: 28rem;">
                                <img src="assets/img/categories-product1.webp" class="card-img-top" alt="...">
                                <div class="card-body">
                                  <h5 class="card-title">Card title</h5>
                                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                  <div class="edit-btn">
                                    <a href="#" class="btn btn-primary">Edit</a>
                                    <a href="#" class="btn btn-primary">Delete</a>
                                  </div>
                                </div>
                            </div>
                      </div>
                      <div class="col">
                            <div class="card" style="width: 28rem;">
                                <img src="assets/img/categories-product1.webp" class="card-img-top" alt="...">
                                <div class="card-body">
                                  <h5 class="card-title">Card title</h5>
                                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                  <div class="edit-btn">
                                    <a href="#" class="btn btn-primary">Edit</a>
                                    <a href="#" class="btn btn-primary">Delete</a>
                                  </div>
                                </div>
                            </div>
                      </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

</main>


    <br><br>
    <!-- Start footer section -->
    <jsp:include page="includings/footer.jsp"/>
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

<!-- Mirrored from risingtheme.com/html/demo-partsix/partsix/my-account.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 08 Apr 2024 17:35:43 GMT -->
</html>