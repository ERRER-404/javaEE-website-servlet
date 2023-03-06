package isetj.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CoffeeServlet
 */
@WebServlet(name = "CoffeeServlet0", urlPatterns = { "/CoffeeServlet0" })
public class CoffeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String option;
	private String zone;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoffeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		option = request.getParameter("opt");
		zone = request.getParameter("ta");
		response.getWriter().println("<!DOCTYPE html><html><head><meta charset=\"ISO-8859-1\"><title>coffee</title></head><body><img src=\"https://media.istockphoto.com/id/1303583671/photo/cup-glass-of-coffee-with-smoke-and-coffee-beans-on-old-wooden-background.jpg?s=612x612&w=0&k=20&c=fAh3m6Hqxz-qeA45Tj2jGARhRiGFhgm80dLVthnvlD8=\" width=\"500\" height=\"500\">");
		response.getWriter().println("<br> <p> merci de nous avoir fait parvenirla remarque suivant <b>"+option+"</b> bonne</p>"); 
		response.getWriter().println("<br> votre demande: <b>"+zone+"</b></body></html>");
	}

}
