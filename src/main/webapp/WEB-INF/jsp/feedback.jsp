<html>

<head>
<title>Feedback Form</title>
</head>

<body>
<h1>E Commerce Web Application</h1>
<h2>Feedback Form</h2>
<h3>Kindly enter your details</h3>

	<font color="red">${errorMessage}</font>
	<form method="post">
	Name : <br> <input type="text" name="name" /><br>
	
	Email Address : <br> <input type="text" name="email" /> <br>
	
	Location : <br> <input type="text" name="location" /> <br>		
    
    Your feedback : <br> <textarea rows="5" cols="50" name = "comments"></textarea><br>

     <br>		
    <button type="submit">Submit Feedback</button>
</form>
</body>

</html>