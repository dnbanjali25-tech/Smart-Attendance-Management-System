import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AttendanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String studentName = req.getParameter("studentName");
        String date = req.getParameter("date");
        String status = req.getParameter("status");

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO attendance(student_name,date,status) VALUES(?,?,?)"
            );

            ps.setString(1, studentName);
            ps.setString(2, date);
            ps.setString(3, status);

            ps.executeUpdate();
            res.sendRedirect("dashboard.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
