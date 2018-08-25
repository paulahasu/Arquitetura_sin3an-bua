package br.usjt.cadastraFilmes.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String execute() {
		return "hello";
	}
	
	
		
}
