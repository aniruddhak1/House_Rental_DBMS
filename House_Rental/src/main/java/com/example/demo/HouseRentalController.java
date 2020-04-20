package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HouseRentalController {
	
	@GetMapping(path="/test")
    public int login() {
        System.out.println("*******logging*********");
        RentalDAO obj = new RentalDAO();
		//obj.Save();
        return obj.Save();
    }

}
