package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.daotasks;
import model.pojo;


@WebServlet("/register")
public class registerservlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String name=req.getParameter("username");
		String mobile=req.getParameter("mobile");
		String password=req.getParameter("password");

		daotasks d=new daotasks();
		d.add_details(new pojo(name,mobile,password));

		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h3> Registration a successful <a href='login.html'>click here to login</a></h3>");
	}
}
