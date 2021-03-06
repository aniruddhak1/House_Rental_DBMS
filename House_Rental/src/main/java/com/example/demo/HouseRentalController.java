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
	public User Login(@RequestBody User user) {	    	      
	    return dao.login(user);
	}
	
	@RequestMapping(value = "/houses")
	public List<House> displayhouses() {	    	      
	    return dao.allhouses();
	}
	
	@RequestMapping("houses/{oid}")
	public List<House> ownerhouses(@PathVariable(name = "oid") int oid) {	    
	    return dao.ownerhouses(oid);      
	}
	
	@RequestMapping("houses/add/{oid}")
	public int addhouses(@PathVariable(name = "oid") int oid, @RequestBody House house) {	    
	    return dao.addhouse(oid, house);      
	}
	
	@RequestMapping("houses/delete/{oid}")
	public int deleteHouse(@PathVariable(name = "oid") int oid, @RequestBody House house) {	    
	    return dao.deleteHouse(oid, house);      
	}
	
	@RequestMapping("houses/edit/{oid}")
	public int editHouse(@PathVariable(name = "oid") int oid, @RequestBody House house) {	    
	    return dao.editHouse(oid, house);      
	}
	
	@RequestMapping("card/add/{oid}")
	public int addCard(@PathVariable(name = "oid") int oid, @RequestBody Card card) {	    
	    return dao.addCard(oid, card);      
	}
	
	@RequestMapping("ach/add/{oid}")
	public int addACH(@PathVariable(name = "oid") int oid, @RequestBody ACH ach) {	    
	    return dao.addACH(oid, ach);      
	}
	
	@RequestMapping("lease/sign/{oid}")
	public int signLease(@PathVariable(name = "oid") int oid, @RequestBody Lease lease) {	    
	    return dao.signLease(oid, lease);
	}
	
	@RequestMapping("lease/view/{uid}")
	public List<Lease> displayLease(@PathVariable(name = "uid") int uid) {	    
	    return dao.displayLease(uid);      
	}
	
	@RequestMapping("lease/pay/{oid}")
	public int makePayment(@PathVariable(name = "oid") int oid, @RequestBody PaymentDetails pd) {	    
	    return dao.makePayment(oid, pd);      
	}
	
	@RequestMapping("lease/payments/{uid}")
	public List<PaymentDetails> displayPayments(@PathVariable(name = "uid") int uid) {	    
	    return dao.displayPayments(uid);      
	}

}
