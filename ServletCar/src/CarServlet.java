
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CarServlet
 */
@WebServlet("/CarServlet")
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String make;
	private String model;
	private int year;
	private double mpg;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		
		make = request.getParameter("make");
		model = request.getParameter("model");
		year = Integer.parseInt(request.getParameter("year"));
		mpg = Long.parseLong(request.getParameter("mpg"));
		

		Car newCar = new Car(make, model, year, mpg);
		
		pw.println("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset='ISO-8859-1'>"
				+ "<title>Car Servlet Demo</title>"
				+ "</head>"
				+ "<body>"
				+ "<h2>Thanks!</h2>"
				+ "<p>Information below from given data.</p>"
				+ "<h2>Your Information:</h2>");
		pw.println("<p>Car Make: " + newCar.getMake() +
                        "</p><p>Model: " + newCar.getModel() + "</p><p>Year: "
                        + newCar.getYear() + "</p><p>Miles Per Gallon: " +
                        newCar.getMpg());
		pw.println("</body>"
				+ "</html>");
	}

}
