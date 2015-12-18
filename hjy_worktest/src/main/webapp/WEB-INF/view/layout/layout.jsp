<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML>
<head>
	<title>
		<tiles:insertAttribute name="title" ignore="true" />
	</title>
</head>
 
<table border="1" align="center" width="100%">
	<tr>
	    <td colspan="2"><tiles:insertAttribute name="header"/></td>
	</tr>
	<tr>
		<td><tiles:insertAttribute name="body"/></td>
	</tr>
	<tr>
		<td colspan="2"><tiles:insertAttribute name="footer"/></td>
	</tr>
</table>