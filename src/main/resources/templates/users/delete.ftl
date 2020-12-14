<#import "/spring.ftl" as spring />

<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>Index</title>
</head>

<body>
	<form action="" method="POST">
		<input type="hidden" name="user.id" value="${item.id}"/>
		<div>
			<label>Firstname</label> <input type="text" name="user.firstname" value="${item.firstname}" readonly/>
		</div>
		<div>
			<label>Lastname</label> <input type="text" name="user.lastname"  value="${item.lastname}" readonly/>
		</div>
		<div>
			<input type="submit">
		</div>
	</form>
</body>
</html>