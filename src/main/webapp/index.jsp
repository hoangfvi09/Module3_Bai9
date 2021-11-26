<%--
  Created by IntelliJ IDEA.
  User: hoangfvi
  Date: 26/11/2021
  Time: 09:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
  .login {
    height:180px; width:230px;
    margin:0;
    padding:10px;
    border:1px #CCC solid;
  }
  .login input {
    padding:5px; margin:5px
  }
</style>

<%--LOGIN--%>
<%--<body>--%>
<%--<form method="post" action="/login">--%>
<%--  <div class="login">--%>
<%--    <h2>Login</h2>--%>
<%--    <input type="text" name="username" size="30"  placeholder="username" />--%>
<%--    <input type="password" name="password" size="30" placeholder="password" />--%>
<%--    <input type="submit" value="Sign in"/>--%>
<%--  </div>--%>
<%--</form>--%>
<%--</body>--%>


<%--DEMO--%>
<%--<body>--%>
<%--<form method="get" action="/cal">--%>
<%--  <h2> Input a and b</h2>--%>
<%--  <input type="text" name="a" size="30"  placeholder="a" />--%>
<%--  <input type="text" name="b" size="30"  placeholder="b" />--%>
<%--  <input type="submit" value="Submit"/>--%>
<%--</form>--%>
<%--</body>--%>

<%--BAITAP--%>
<body>
<form method="post" action="/calDiscount">
  <h2> nhap zo di nao</h2>
  <input type="text" name="description" size="30"  placeholder="Product Description" />
  <input type="text" name="price" size="30"  placeholder="Price" />
  <input type="text" name="discountPercent" size="30"  placeholder="Discount Percent" />
  <input type="submit" value="Submit"/>
</form>
</body>
</html>
