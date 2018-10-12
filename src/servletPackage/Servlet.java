package servletPackage;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.lang.Object;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Map<String, Object> root = new HashMap<String, Object>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    static String templateDir = "WEB-INF/templates";
    //static String resultTemplateName = "converter.ftl";//template after proper login
    
    private Configuration cfg;

    public void init(){

		//Prepare freeMarker config
		//Load templates from the WEB-INF/templates directory of the Web App
		cfg = new Configuration();
		cfg.setServletContextForTemplateLoading(getServletContext(), "WEB-INF/templates");
    }//init
    /**
     * This function displays a new webpage to the user based on the template templName that is passed in
     * */
    public void runTemplate(HttpServletRequest request, HttpServletResponse response, String templName) {
		// You can use this structure for all of your objects to be sent to browser
		Template template = null;
		
		
		try {
			String templateName = templName;
			template = cfg.getTemplate(templateName);
			response.setContentType("text/html");
			Writer out = response.getWriter();
			template.process(root, out);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
}// runTemplate
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection con = null;
		//Create a meteorite arraylist to store all of the meteorites found in db
		ArrayList<Meteorite> mets = new ArrayList<Meteorite>();
		//clear it before each search
		mets.clear();
		
		String year = null;
		year = request.getParameter("yearMet");
		String input = null;
		input = request.getParameter("val");
		String name = null;
		name = request.getParameter("nameCity");
		String continent = null;
		continent = request.getParameter("cont");
		String massOption = null;
		massOption = request.getParameter("massOption");
		
		
		try {
			con = DbAccessImpl.connect();
			LogicImpl logic = new LogicImpl(request, response,con);
			
			if(name != null) {
				mets = logic.getByName(name);
				root.put("meteorites",mets);
				runTemplate(request, response,"map.ftl");
			}
			//if continent is not null search and display the correct continent
			if(continent != null) {
				if(continent.equals("NorthAmerica")) {
					mets = logic.getNA();
					root.put("meteorites",mets);
					runTemplate(request, response,"map.ftl");
				}
				else if(continent.equals("SouthAmerica")) {
					mets = logic.getSA();
					root.put("meteorites",mets);
					runTemplate(request, response,"map.ftl");
				}
				else if(continent.equals("Antarctica")) {
					mets = logic.getAnt();
					root.put("meteorites",mets);
					runTemplate(request, response,"map.ftl");
				}
				else if(continent.equals("Africa")) {
					mets = logic.getAfrica();
					root.put("meteorites",mets);
					runTemplate(request, response,"map.ftl");
				}
				else if(continent.equals("Australia")) {
					mets = logic.getAustralia();
					root.put("meteorites",mets);
					runTemplate(request, response,"map.ftl");
				}
				else if(continent.equals("Europe")) {
					mets = logic.getEurope();
					root.put("meteorites",mets);
					runTemplate(request, response,"map.ftl");
				}
				else if(continent.equals("Asia")) {
					mets = logic.getAsia();
					root.put("meteorites",mets);
					runTemplate(request, response,"map.ftl");
				}
			}
			//if input is not null display the correct template based on the input
			if(input != null) {
				if(input.equals("name")) {
					runTemplate(request, response,"city.ftl");
				}
				else if(input.equals("mass")) {
					System.out.println("In the else if of mass");
					runTemplate(request, response,"mass.ftl");
				}
				else if(input.equals("year")) {
					runTemplate(request, response,"year.ftl");
				}
				else if(input.equals("all")) {
					mets = logic.getAll();
					root.put("meteorites",mets);
					runTemplate(request, response,"map.ftl");
				}
				else if(input.equals("continent")) {
					runTemplate(request, response,"continent.ftl");
				}
			}
			
			if(year != null) {
				String y = request.getParameter("inputYear");
				System.out.println("YEAR IS: "+year);
				System.out.println("Y IS: "+y);
				mets = logic.getByYear(year,y);
				root.put("meteorites",mets);
				runTemplate(request, response,"map.ftl");
			}
			
			if(massOption != null) {
				String massInput = request.getParameter("massInput");
				mets = logic.getByMass(massOption,massInput);
				root.put("meteorites",mets);
				runTemplate(request, response,"map.ftl");
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				DbAccessImpl.disconnect(con);
			}
		}
	}//doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
