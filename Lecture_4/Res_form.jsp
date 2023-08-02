<html>
<head>
  <title>Registration Form</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>

  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
    }

    .container {
      width: 400px;
      background-color: #fff;
      padding: 20px;
      margin: 0 auto;
      margin-top: 50px;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    h2 {
      text-align: center;
    }

    .form-group {
      margin-bottom: 20px;
    }

    label {
      display: block;
      margin-bottom: 5px;
    }

    input[type="text"],
    input[type="password"] {
      width: 100%;
      padding: 8px;
      border-radius: 4px;
      border: 1px solid #ccc;
    }

    input[type="submit"] {
      background-color: #4caf50;
      color: #fff;
      padding: 10px 20px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>

	<jsp:include page="Header.html"/>  

  <div class="container">
    <h2>Registration Form</h2>
    <form action="Home.jsp" method="post">
      <div class="form-group">
        <label for="name">Name:</label>
        <input type="text" name="name" required>
      </div>
      <div class="form-group">
        <label for="email">Email:</label>
        <input type="text" name="email" required>
      </div>
      <select name="city">
		  <option value="mumbai">mumbai</option>
		  <option value="pune">pune</option>
		  <option value="surat">surat</option>
		  <option value="goa">goa</option>
	  </select>
      <div class="form-group">
        <input type="submit" value="Register">
      </div>
    </form>
  </div>
</body>
</html>
