<%@page import="model.CreditModel"%>
<%
	CreditModel model = (CreditModel)request.getAttribute("creditModel");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loan Interest Calculator</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
</head>
<body>
	<div class="container d-flex justify-content-center align-items-center">
        <div class="card border-primary mt-5 w-75">
            <div class="card-header bg-primary text-white text-center h3">Loan Interest Calculator</div>
            <div class="card-body text-dark">
                <div>
					<form action="controller" method="post">
						<table class="table table-striped">
							<tr class="h5">
								<th>Credit:</td>
								<td><input type="text" name="credit" value="<%= model.getCredit() == 0.0 ? "" : model.getCredit()%>"></td>
								<td>TND</td>
							</tr>
							<tr class="h5">
								<th>Interest:</td>
								<td><input type="text" name="interest" value="<%= model.getInterestPrcnt() == 0.0 ? "" : model.getInterestPrcnt()%>"></td>
								<td>%</td>
							</tr>
							<tr class="h5">
								<th>Duration:</td>
								<td><input type="text" name="duration" value="<%= model.getDuration() == 0.0 ? "" : model.getDuration()%>"></td>
								<td>Months</td>
							</tr>
						</table>
						<button type="submit" class="btn btn-danger btn-lg">Calculate</button>
					</form>
				</div>
				<% if (model.getInterestToPay() != 0.0) { %>
				    <div class="mt-3 h5">
				        Interest per year = <strong><%= model.getInterestToPay() %></strong>
				    </div>
				<% } %>
            </div>
        </div>
    </div>
	
</body>
</html>