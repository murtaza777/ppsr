<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>PPSR Operations</title>
</head>
<body>
<form:form method="POST" commandName="operation" action="/response">
  <table>
    <tr>
      <td>Username</td>
      <td><form:input path="username"/></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><form:password path="password"/></td>
    </tr>
    <tr>
      <td>Select an operation:</td>
      <td>
        <form:select path="operationName">
          <form:option value="-" label="--Select phone">
            <form:options items="${operationsMap}"/>
          </form:option>
        </form:select>
      </td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="POST"/></td>
    </tr>
  </table>
</form:form>
</body>
</html>
