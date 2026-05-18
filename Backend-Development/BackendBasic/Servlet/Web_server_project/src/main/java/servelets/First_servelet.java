package servelets;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(("/first"))
public class First_servelet implements Servlet{
	
	private ServletConfig serveletConfig;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroying servelet");
	}

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.serveletConfig=config;
		System.out.println("Initializating servelet");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service Request");
	}
	
	// non life cycle method
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.serveletConfig;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servelet is created by Shriyesh";
	}

	
}
