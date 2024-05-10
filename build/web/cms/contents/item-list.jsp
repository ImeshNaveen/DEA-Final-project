<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../../productServlet" />
<div class="account__wrapper">
                        <div class="account__content">
                            <h2 class="account__content--title h3 mb-20">All Products</h2>
                            <div class="account__table--area">
                                <table class="account__table">
                                    <thead class="account__table--header">
                                        <tr class="account__table--header__child">
                                            <th class="account__table--header__child--items">Id</th>
                                            <th class="account__table--header__child--items">Product_Name</th>
                                            <th class="account__table--header__child--items"></th>
                                        </tr>
                                    </thead>
                                    <tbody class="account__table--body mobile__none">
                <c:forEach var="oneproduct" items="${allProducts}">
                    <tr>
                        <td><c:out value="${oneproduct.id}" /></td>
                        <td><c:out value="${oneproduct.name}" /></td>
                        <td></td>
                        
                        <td></td>
                    </tr>
                </c:forEach>    
                                    </tbody> 
                                </table>
                            </div>
                        </div>
                    </div>