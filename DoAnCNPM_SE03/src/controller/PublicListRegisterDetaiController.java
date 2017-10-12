package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PublicListRegisterDetaiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PublicListRegisterDetaiController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
         RequestDispatcher rd = request.getRequestDispatcher("/list_register_detai.jsp");
         rd.forward(request, response);
	}

}