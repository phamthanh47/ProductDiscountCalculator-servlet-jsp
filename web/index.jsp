<%--
  Created by IntelliJ IDEA.
  User: ThanhPC
  Date: 10/14/2019
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
<link rel="stylesheet" href="css/style.css"  type="text/css">
  </head>
  <body>
  <form method="post" action="/productdiscountcalculator">
    <input type="text" placeholder="description" name="productdescription"/>
    <input type="text" placeholder="price" name="listprice"/>
    <input type="text" placeholder="percent" name="discountpercent"/>
    <input type="submit" name="submit" value="Result"/>
  </form>
  </body>
</html>
