<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true"></tiles:insertAttribute>
</title>
</head>

<body>
  <table border="1">
  	<tr>
  		<td colspan="1"><tiles:insertAttribute name="header"></tiles:insertAttribute><br/></td>
  	</tr>
  	<tr>
  		<td><tiles:insertAttribute name="menu" /></td>
  		<td><tiles:insertAttribute name="body" /></td>
  	</tr>
  	<tr>
  		<td colspan="2"><tiles:insertAttribute name="footer" /></td>
  	</tr>
  </table>
</body>
</html>