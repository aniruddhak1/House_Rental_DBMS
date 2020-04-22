package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins="http://localhost:4200") 
public class HouseRentalController {
	
	@Autowired
    private RentalDAO dao;
	
	@GetMapping(path="/test")
    public int login() {
        System.out.println("*******logging*********");
        //RentalDAO obj = new RentalDAO();
		dao.list();
        return 0;
    }
	
	@PostMapping(path="/register")  
    public int saveRegister(@RequestBody User user) {
         return dao.Register(user);
		 //System.out.println(user.getFirstname());
         //return 36; 
   }
	
	@RequestMapping(value = "/login")
	public String Login(@RequestBody User user) {
	    dao.login(user);	      
	    return "redirect:/";
	} 

}
