package annapodapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/FetchCrimeData")
public class FetchCrimeData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchCrimeData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String crime = request.getParameter("searchCrime").toUpperCase();
		response.setContentType("text/html; charset=UTF-8"); 
		response.setCharacterEncoding("UTF-8");  
		PrintWriter writer = response.getWriter();
		
		try {
			
			String datafromApi = Helper.GetAPIData();
			Data[] data = Helper.TurnToDataFormat(datafromApi);
			
			List<Data> result = new LinkedList<Data>();
			//total
			for (int i=0; i<data.length; i++)
			{
				if (data[i].crime.equals(crime))
				{
					result.add(data[i]);
					
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
					+ "  <h2>" + result.get(0).crime + "</h2>\r\n"
					+ "  <ul class=\"responsive-table\">\r\n"
					+ "    <li class=\"table-header\">\r\n"
					+ "      <div class=\"col col-1\">YEAR</div>\r\n"
					+ "      <div class=\"col col-2\">ATTEMPTED</div>\r\n"
					+ "      <div class=\"col col-2\">COMMITTED</div>\r\n"
					+ "      <div class=\"col col-2\">SOLVED</div>\r\n"
					+ "      <div class=\"col col-2\">DOMESTIC CRIMINALS</div>\r\n"
					+ "      <div class=\"col col-2\">FOREIGN CRIMINALS</div>\r\n"
					+ "    </li>");
			
			for (int i=0; i<result.size(); i++)
			{
				writer.println("<li class=\"table-row\">\r\n"
						+ "      <div class=\"col col-1\" data-label=\"YEAR\" >" + result.get(i).year + "</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"ATTEMPTED\" >"+ result.get(i).attempted +"</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"COMMITTED\">"+ result.get(i).committed +"</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"SOLVED\">"+ result.get(i).solved +"</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"DOMESTIC CRIMINALS\">"+ result.get(i).domestic_criminals +"</div>\r\n"
						+ "      <div class=\"col col-2\" data-label=\"FOREIGN CRIMINALS\">"+ result.get(i).foreign_criminals +"</div>\r\n"
						+ "    </li>");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
