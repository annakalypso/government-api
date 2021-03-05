package annapodapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CrimeComparing
 */
@WebServlet("/CrimeComparing")
public class CrimeComparing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrimeComparing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String year1String = request.getParameter("year1");
		int year1 = Integer.parseInt(year1String);
		String year2String = request.getParameter("year2");
		int year2 = Integer.parseInt(year2String);
		String crime1 = request.getParameter("searchCrime1").toUpperCase();
		String crime2 = request.getParameter("searchCrime2").toUpperCase();
		response.setContentType("text/html; charset=UTF-8"); 
		response.setCharacterEncoding("UTF-8");  
		PrintWriter writer = response.getWriter();
		
		try {
			
			String datafromApi = Helper.GetAPIData();
			Data[] data = Helper.TurnToDataFormat(datafromApi);
			
			Data result1 = new Data();
			Data result2 = new Data();
			
			for (int i=0; i<data.length; i++)
			{
				if (data[i].year==year1 & data[i].crime.equals(crime1))
				{
					result1.attempted=data[i].attempted;
					result1.committed=data[i].committed;
					result1.crime=data[i].crime;
					result1.domestic_criminals=data[i].domestic_criminals;
					result1.foreign_criminals=data[i].foreign_criminals;
					result1.solved=data[i].solved;
					result1.year=data[i].year;
					//System.out.println(data[i].crime);
				}
				if (data[i].year==year2 & data[i].crime.equals(crime2))
				{
					result2.attempted=data[i].attempted;
					result2.committed=data[i].committed;
					result2.crime=data[i].crime;
					result2.domestic_criminals=data[i].domestic_criminals;
					result2.foreign_criminals=data[i].foreign_criminals;
					result2.solved=data[i].solved;
					result2.year=data[i].year;
					//System.out.println(data[i].crime);
				}
				
			}
				
				writer.println("<!DOCTYPE html>\r\n"
						+ "<html>\r\n"
						+ "<head>\r\n"
						+ "<meta charset=\"utf-8\">\r\n"
						+ "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
						+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
						+ "<link href=\"css/Results.css\" rel=\"stylesheet\">\r\n"
						+ "<title>Results</title>\r\n"
						+ "</head>\r\n"
						+ "<body>");
				
				writer.println("<div class=\"container\">\r\n"
						+ "  <h2>" + "Analysis" + "</h2>\r\n"
						+ "  <ul class=\"responsive-table\">\r\n"
						+ "    <li class=\"table-header\">\r\n"
						+ "      <div class=\"col col-1\">CRIME</div>\r\n"
						+ "      <div class=\"col col-2\">YEAR</div>\r\n"
						+ "      <div class=\"col col-2\">ATTEMPTED</div>\r\n"
						+ "      <div class=\"col col-2\">COMMITTED</div>\r\n"
						+ "      <div class=\"col col-2\">SOLVED</div>\r\n"
						+ "      <div class=\"col col-2\">DOMESTIC CRIMINALS</div>\r\n"
						+ "      <div class=\"col col-2\">FOREIGN CRIMINALS</div>\r\n"
						+ "    </li>");
				
				writer.println("<li class=\"table-row\">\r\n"
						+ "      <div class=\"col col-1\" data-label=\"CRIME\" >" + result1.crime + "</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"YEAR\" >" + result1.year + "</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"ATTEMPTED\" >"+ result1.attempted +"</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"COMMITTED\">"+ result1.committed +"</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"SOLVED\">"+ result1.solved +"</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"DOMESTIC CRIMINALS\">"+ result1.domestic_criminals +"</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"FOREIGN CRIMINALS\">"+ result1.foreign_criminals +"</div>\r\n"
						+ "    </li>");
				
				writer.println("<li class=\"table-row\">\r\n"
						+ "      <div class=\"col col-1\" data-label=\"CRIME\" >" + result2.crime + "</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"YEAR\" >" + result2.year + "</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"ATTEMPTED\" >"+ result2.attempted +"</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"COMMITTED\">"+ result2.committed +"</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"SOLVED\">"+ result2.solved +"</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"DOMESTIC CRIMINALS\">"+ result2.domestic_criminals +"</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"FOREIGN CRIMINALS\">"+ result2.foreign_criminals +"</div>\r\n"
						+ "    </li>");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
