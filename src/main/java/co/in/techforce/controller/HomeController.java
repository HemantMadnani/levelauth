package co.in.techforce.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableGlobalMethodSecurity(jsr250Enabled=true, prePostEnabled=true, securedEnabled=true)
public class HomeController {

	@GetMapping("/")
	public String test() {

		return "home";
	}

	@GetMapping("/login")
	public ModelAndView login() {

		return new ModelAndView("login");
	}

	@GetMapping("/home")
	public String home() {

		return "index";
	}

	@GetMapping("/user")
	public String user() {
		
		return "index";
	}

	@GetMapping("/admin")
	public String admin() {
		
		return "index";
	}
	
	@PreAuthorize(value="hasAuthority('ROLE_ADMIN')")
	@GetMapping("/add")
	public String add() {
		
		return "index";
	}

	@PreAuthorize(value="hasRole('USER')")
	@GetMapping("/view")
	public String view() {
		
		return "index";
	}
	
	

}
