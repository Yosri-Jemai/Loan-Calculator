<%@page import="model.CreditModel"%>
<%
	CreditModel model = (CreditModel)request.getAttribute("creditModel");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loan Interest Calculator</title>
</head>
<body>
	<div>
		<form action="controller" method="post">
			<table>
				<tr>
					<td>Credit:</td>
					<td><input type="text" name="credit" value="<%= model.getCredit() == 0.0 ? "" : model.getCredit()%>"></td>
					<td>TND</td>
				</tr>
				<tr>
					<td>Interest:</td>
					<td><input type="text" name="interest" value="<%= model.getInterestPrcnt() == 0.0 ? "" : model.getInterestPrcnt()%>"></td>
					<td>%</td>
				</tr>
				<tr>
					<td>Duration:</td>
					<td><input type="text" name="duration" value="<%= model.getDuration() == 0.0 ? "" : model.getDuration()%>"></td>
					<td>Months</td>
				</tr>
			</table>
			<button type="submit">Calculate</button>
		</form>
	</div>
	<div>
		<p><%= model.getInterestToPay() == 0.0 ? "" : "Interest per year = "+model.getInterestToPay()%></p>
	</div>
</body>
</html>