<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../../userServlet/listUser" />


<div class="account__wrapper">
                        <div class="account__content">
                            <h2 class="account__content--title h3 mb-20">All users</h2>
                            <div class="account__table--area">
                                <table class="account__table">
                                    <thead class="account__table--header">
                                        <tr class="account__table--header__child">
                                            <th class="account__table--header__child--items">ID</th>
                                            <th class="account__table--header__child--items">Username</th>
                                            <th class="account__table--header__child--items">Email</th>
                                            <th class="account__table--header__child--items">Password</th>
                                            <th class="account__table--header__child--items">mobile</th>
                                            <th class="account__table--header__child--items">Address</th>
                                            <th class="account__table--header__child--items">City</th>
                                            <th class="account__table--header__child--items">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody class="account__table--body mobile__none">
                <c:forEach var="user" items="${listusers}">
                    <tr>
                        <td><c:out value="${user.id}" /></td>
                        <td><c:out value="${user.username}" /></td>
                        <td><c:out value="${user.email}" /></td>
                        <td><c:out value="${user.password}" /></td>
                        <td><c:out value="${user.mobile}" /></td>
                        <td><c:out value="${user.address}" /></td>
                        <td><c:out value="${user.city_id}" /></td>
                        <td></td>
                    </tr>
                </c:forEach>    
                                    </tbody> 
                                </table>
                            </div>
                        </div>
                    </div>
