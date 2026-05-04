<html>
<body>
<h2>Mark Attendance</h2>
<form action="AttendanceServlet" method="post">
    Student Name: <input type="text" name="studentName"><br>
    Date: <input type="date" name="date"><br>
    Status:
    <select name="status">
        <option>Present</option>
        <option>Absent</option>
    </select><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
