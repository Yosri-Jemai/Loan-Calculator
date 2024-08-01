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
					<td><input type="text" name="credit"></td>
					<td>TND</td>
				</tr>
				<tr>
					<td>Interest:</td>
					<td><input type="text" name="interest"></td>
					<td>%</td>
				</tr>
				<tr>
					<td>Duration:</td>
					<td><input type="text" name="duration"></td>
					<td>Months</td>
				</tr>
			</table>
			<button type="submit">Calculate</button>
		</form>
	</div>
</body>
</html>