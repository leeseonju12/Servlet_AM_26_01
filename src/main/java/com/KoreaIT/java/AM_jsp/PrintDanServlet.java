package com.KoreaIT.java.AM_jsp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/printDan")
public class PrintDanServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
//		response.getWriter().append("==8단==<br>");
//		response.getWriter().append("8 * 1 = 8<br>");
//		response.getWriter().append(String.format("%d * %d = %d<br>", 8, 1, 8));
//		response.getWriter().append(String.format("%d * %d = %d<br>", 8, 2, 16));x

		String inputDan = request.getParameter("dan");
		String inputLimit = request.getParameter("limit");
		System.out.println(inputDan);
		
		if (inputDan == null) {
			inputDan = "1";
		}
		
		if (inputLimit == null) {
			inputLimit = "1";
		}
		
// 		문장의 정수화
// 		http://localhost:8081/Servlet_AM_26_01/printDan?dan=9
		int dan = Integer.parseInt(inputDan);
		int limit = Integer.parseInt(inputLimit);
		
		response.getWriter().append("==" + dan + "단==<br>");
		
		for (int i = 1; i <= limit; i++) {
			response.getWriter().append(String.format("%d * %d = %d<br>", dan, i, dan * i));
		}

	}

}