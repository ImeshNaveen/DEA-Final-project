        <!-- Start register section  -->
        <div class="login__section section--padding">
            <div class="container">
                <form action="registerServlet" method="post">
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
                                        <p class="account__login--header__desc">Already have an account? <a href="login.jsp?page=login">Log now</a></p>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>     
        </div>
        <!-- End register section  -->