<%-- 
    Document   : Add
    Created on : Apr 19, 2024, 1:59:00 PM
    Author     : sandi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">


<!-- Mirrored from risingtheme.com/html/demo-partsix/partsix/my-account.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 08 Apr 2024 17:35:43 GMT -->
<head>
  <meta charset="utf-8">
  <title> Add items</title>
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

    <main class="Additems">


        <!-- Add Item section start -->
        <div class="login-container">
        <div class="login-box">
            
            <form action="" method="POST" >
                <h1>Add Items</h1><br>
            <div class="user-box">
                <input type="text" vlaue="" name="name" required>
                <label for="Name">Item Name:</label>
            </div>

            <label for="brand">Brand:</label>
            <div class="select">
                <select name="brand" id="brand" required>
                    <option value="bmw">BMW</option>
                    <option value="toyota">Toyota</option>
                    <option value="mercedes">Mercedes</option>
                    <option value="audi">Audi</option>
                </select>
              </div>
              <br>
            <label for="model">Model:</label>
            <div class="select">
                    <select name="model" id="model" required>
                        <option value="aaa">aaa</option>
                        <option value="bbb">bbb</option>
                        <option value="ccc">ccc</option>
                        <option value="ddd">ddd</option>
                    </select>
            </div>
            <br>
            <label for="year">Year:</label>
            <div class="select">
                    <select name="year" id="year" required>
                        <option value="2024">2024</option>
                        <option value="2023">2023</option>
                        <option value="2022">2022</option>
                        <option value="2021">2021</option>
                    </select>
            </div>
            <br>
            <label for="condition">Condition:</label>
            <div class="radio-input">
                Brand new:<input name="condition" id="brandnew" type="radio" class="radio" checked="">
                Recondition:<input name="condition" id="recondition" type="radio" class="radio">
            </div>
            <br>
            <div class="user-box">
                <input type="text" id="ides" name="ides" required>
                <label for="itemdescription">Item Description:</label>
            </div>
            <br>
            <label for="date">Date</label>
            <div class="">
                <input class="date" type="date" name="date" id="date" required>
            </div>
            <br>
            <label for="time">Time</label>
            <div class="time">
                <label style="color: rgb(9, 255, 0); font-size: small;">Select Time:</label>
                <input type="time" id="time" name="time" required>
            </div>
            <br>
            <br>
            <div class="">
            <label class="custum-file-upload" for="file">
                <div class="icon">
                <svg xmlns="http://www.w3.org/2000/svg" fill="" viewBox="0 0 24 24"><g stroke-width="0" id="SVGRepo_bgCarrier"></g><g stroke-linejoin="round" stroke-linecap="round" id="SVGRepo_tracerCarrier"></g><g id="SVGRepo_iconCarrier"> <path fill="" d="M10 1C9.73478 1 9.48043 1.10536 9.29289 1.29289L3.29289 7.29289C3.10536 7.48043 3 7.73478 3 8V20C3 21.6569 4.34315 23 6 23H7C7.55228 23 8 22.5523 8 22C8 21.4477 7.55228 21 7 21H6C5.44772 21 5 20.5523 5 20V9H10C10.5523 9 11 8.55228 11 8V3H18C18.5523 3 19 3.44772 19 4V9C19 9.55228 19.4477 10 20 10C20.5523 10 21 9.55228 21 9V4C21 2.34315 19.6569 1 18 1H10ZM9 7H6.41421L9 4.41421V7ZM14 15.5C14 14.1193 15.1193 13 16.5 13C17.8807 13 19 14.1193 19 15.5V16V17H20C21.1046 17 22 17.8954 22 19C22 20.1046 21.1046 21 20 21H13C11.8954 21 11 20.1046 11 19C11 17.8954 11.8954 17 13 17H14V16V15.5ZM16.5 11C14.142 11 12.2076 12.8136 12.0156 15.122C10.2825 15.5606 9 17.1305 9 19C9 21.2091 10.7909 23 13 23H20C22.2091 23 24 21.2091 24 19C24 17.1305 22.7175 15.5606 20.9844 15.122C20.7924 12.8136 18.858 11 16.5 11Z" clip-rule="evenodd" fill-rule="evenodd"></path> </g></svg>
                </div>
                <div class="text">
                   <span>Click to upload image</span>
                   </div>
                   <input type="file" id="file">
            </label>
            </div>

            <br><br>
            <div class="user-box">
                <input type="number" id="price" name="price" min="0" step="0.01" required>
                <label for="price">Price:</label>
            </div>
            <center>
                <input type="submit" value="Submit" class="submit">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" value="reset" class="reset">  
            </center>
            </form>
        </div>
    </div>
        <!-- Add Item section end -->


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