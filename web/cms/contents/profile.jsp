<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../../userServlet/userProfile" />

<div class="account__wrapper">
    <div class="account__content">
        <h2>Your Profile</h2>
        <div class="profile-container">
          <div class="profile-photo">
            <img src="assets/img/profile.jpg">
          </div>
          <div class="profile-details">
            <h2>User Name</h2>
            <p><c:out value="${selectedUser.username}" /></p>
            <h2>Address</h2>
            <p><c:out value="${selectedUser.address}" /></p>
            <h2>Mobile Number</h2>
            <p><c:out value="${selectedUser.mobile}" /></p>
            <h2>Email address</h2>
            <p><c:out value="${selectedUser.email}" /></p>
            <h2><a href="../userServlet/logout"><button>Logout</button></a></h2>
          </div>
        </div>
    </div>

</div>