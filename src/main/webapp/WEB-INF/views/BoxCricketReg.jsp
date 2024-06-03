<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>---Box Cricket Registration---</h1>
<form action="savereg" method="post">
Name: <input type="text" name="studentName"  placeholder="Enter the Name" />
<br><br>

Playing Type : 
		Batsman :<input type="radio" name="playerType" value="Batsman"/>
		Bowller :<input type="radio" name="playerType" value="Bowller"/>
		AllRounder :<input type="radio" name="playerType" value="AllRounder"/>
		<br><br>

Food Preference:
 	<select name="foodPreference">
 			<option value="1">----Select Your Fodd Preference----</option>
 	 		<option value="Regular">Regular</option>
 	 		<option value="Jain">Jain</option>
 	
 	</select>
 	<br><br>
 	
 Drink:
 
 	RB: <input type="checkbox" name="drink" value="rb"/>
 	MD: <input type="checkbox" name="drink" value="md"/>
 	TH: <input type="checkbox" name="drink" value="th"/>
 	LJ: <input type="checkbox" name="drink" value="lj"/>
 	PS: <input type="checkbox" name="drink" value="ps"/>
 	<br><br>
 	
 	<input type="submit" value="Register"/>
 
</form>
</body>
</html>