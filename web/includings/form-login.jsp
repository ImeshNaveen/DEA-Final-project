        <!-- Start login section  -->
        <div class="login__section section--padding">
            <div class="container">
                <form action="login" method="get">
                    <div class="login__section--inner">
                        <div class="row row-cols-md-2 row-cols-1">
                            <div class="col">
                                <div class="account__login">
                                    <div class="account__login--header mb-25">
                                        <h2 class="account__login--header__title mb-10">Login your Account</h2>
                                        <p class="account__login--header__desc">Login if you already registered user.</p>
                                    </div>
                                    <div class="account__login--inner">
                                        <label>
                                            <input class="account__login--input" placeholder="Email Addres" type="email">
                                        </label>
                                        <label>
                                            <input class="account__login--input" placeholder="Password" type="password">
                                        </label>
                                        <div class="account__login--remember__forgot mb-15 d-flex justify-content-between align-items-center">
                                            <div class="account__login--remember position__relative">
                                                <input class="checkout__checkbox--input" id="check1" type="checkbox">
                                                <span class="checkout__checkbox--checkmark"></span>
                                                <label class="checkout__checkbox--label login__remember--label" for="check1">
                                                    Remember me</label>
                                            </div>
                                            <button class="account__login--forgot"  type="submit">Forgot Your Password?</button>
                                        </div>
                                        <button class="account__login--btn primary__btn" name="buttonClicked" value="login" type="submit">Login</button>
                                        <p class="account__login--header__desc">If you have not registered yet <a href="login.jsp?page=register">Register now</a></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>     
        </div>
        <!-- End login section  -->