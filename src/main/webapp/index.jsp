<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 09/11/2021
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<style>

</style>
<body>
<h1>Simple Calculator</h1>

    <form action="/Servlet" method="post"><label for="first">First operand: </label>
        <input type="number" name="first" id="first"><br/>
        <label for="operator">Operator: </label>
        <select name="operator" id="operator">
            <option value="+">Cộng</option>
            <option value="-">Trừ</option>
            <option value="*">Nhân</option>
            <option value="/">Chia</option>
        </select><br/>
        <label for="second">Second operand</label>
        <input type="number" name="second" id="second"><br/>
        <button type="submit" name="result">Calculate</button>
    </form>


</body>
</html>
