package Lab20.CoffeeShop;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView my = new ModelAndView("home");

		return my;
	}

	@RequestMapping("/userregistration")
	public ModelAndView showregistration() {
		ModelAndView my = new ModelAndView("userregistration");

		return my;
	}



	@RequestMapping("/summarypage")
	// model and view is a parameter that allows us to add stuff to our jsp
	public ModelAndView addUser(Model model, @RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname, @RequestParam("email") String email,
			@RequestParam("phonenumber") String phonenumber, @RequestParam("password") String password) {
		// add the values to the jsp using the model and addObject method
		ModelAndView my = new ModelAndView("summarypage");
		my.addObject("firstname", firstname);
		my.addObject("lastname", lastname);
		my.addObject("email", email);
		my.addObject("phonenumber", phonenumber);
		my.addObject("password", password);

		return my;
	}
	
	
	
	@RequestMapping("/Menu")
	public ModelAndView Menu() {
		ModelAndView my = new ModelAndView("Menu");

		return my;
	}
	
	
	
	
	
	
	
	

}
