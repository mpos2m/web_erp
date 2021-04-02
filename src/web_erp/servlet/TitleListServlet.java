package web_erp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_erp.dto.Title;
import web_erp.service.TitleService;

@WebServlet("/TitleListServlet")
public class TitleListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TitleService service;
	
	public TitleListServlet() {
		service = new TitleService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());


		List<Title> list = service.showTitles();
		list.stream().forEach(System.out::println);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("titleList.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
