<#import "/spring.ftl" as spring />

<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>Index Users</title>
</head>

<body>
	<div>
		<a href="./create">Create new</a>
	</div>
	<table>
		<thead>
			<tr>
				<th>Firstname</th>
				<th>Lastname</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<#foreach item in items>
			<tr>
				<td>${item.firstname}</td>
				<td>${item.lastname}</td>
				<td><p>
						<a href="./edit/${item.id}">edit</a>
					</p>
					<p>
						<a href="./delete/${item.id}">delete</a>
					</p></td>
			</tr>
			</#foreach>
		</tbody>
	</table>
</body>
</html>