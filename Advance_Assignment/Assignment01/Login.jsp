<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Logic.jsp" method="post">
        <fieldset>
            <legend>Personal Details</legend>
 
            <p>
                <label>
                    Salutation
                    <br />
                    <select name="salutation">
                        <option>--None--</option>
                        <option>Mr.</option>
                        <option>Ms.</option>
                        <option>Mrs.</option>
                        <option>Dr.</option>
                        <option>Prof.</option>
                    </select>
                </label>
            </p>
 
            <p>
                <label>First name: <input name="firstName" /></label>
            </p>
 
            <p>
                <label>Last name: <input name="lastName" /></label>
            </p>
 
            <p>
                Gender :
                <label><input type="radio" name="gender"
                              value="male" />
                      Male   
                  </label>
                <label><input type="radio" name="gender"
                              value="female" />
                      Female   
                  </label>
            </p>
 
            <p>
                <label>Email:<input type="email"
                                    name="email" />
                  </label>
            </p>
 
            <p>
            <label>Password:<input type="password"
                                    name="pwd" />
                  </label>
 </p>
            <p>
                <button type="submit">Submit</button>
            </p>
 
        </fieldset>
    </form>


</body>
</html>