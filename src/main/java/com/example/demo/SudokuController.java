package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SudokuController {
	@RequestMapping("home")
	public String Home() {
		return "home.html";
	}
}
