package ptithcm.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class StudentController {
	@RequestMapping("/student/form")
	public String showForm() {
		return "student/form";
	}
	
	@RequestMapping("/student/save")
	public String saveData(HttpServletRequest request) {
		String name = request.getParameter("name");
		String major = request.getParameter("major");
		String mark = request.getParameter("mark");
		
		request.setAttribute("name", name);
		request.setAttribute("mark", mark);
		request.setAttribute("major", major);
		
		return "student/success";
	}
}
