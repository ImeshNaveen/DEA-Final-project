<main class="Additems">


        <!-- Add Item section start -->
        <div class="login-container">
        <div class="login-box">
            
            <% if (request.getAttribute("message") != null) { %>
            <p><%= request.getAttribute("message") %></p>
            <% } %>
            
            <form action="../additemservlet" method="post">
                <h1>Add Items</h1><br>
                <div class="user-box">
                    <input type="text" name="name" required>
                    <label for="name">Item Name:</label>
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
                    <label for="ides">Item Description:</label>
                </div>
                <br>
                <div class="user-box">
                    <input type="number" id="price" name="price" min="0" step="0.01" required>
                    <label for="price">Price:</label>
                </div>
                <div class="form-btn">
                    <input type="submit" value="Submit" class="submit">
                    <input type="reset" value="Reset" class="reset">  
                </div>
            </form>
        </div>
    </div>
        


</main>