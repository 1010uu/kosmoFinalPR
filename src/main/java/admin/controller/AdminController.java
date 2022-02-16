package admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	//룰렛 매핑 처리
	@RequestMapping("/admin.do")
	public String reviewWrite() {
		return "admin/main";
	}
}
