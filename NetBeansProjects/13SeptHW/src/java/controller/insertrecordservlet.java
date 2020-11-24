
package controller;

import dao.studentdao;
import dao.studentdaoimpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.modeldb;

@WebServlet(name = "insertrecordservlet", urlPatterns = {"/insertrecordservlet"})
public class insertrecordservlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet insertrecordservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            studentdao obj = new studentdaoimpl();
            modeldb ob1 = new modeldb(id,name,email);
//            modeldb ob1 = null;
            obj.createRecord(ob1);
            out.println("Insert Successfully...");
            
            out.println("<h1>Servlet insertrecordservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo()
    {
        return "Short description";
    }
}
