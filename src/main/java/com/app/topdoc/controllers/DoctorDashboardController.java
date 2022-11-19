package com.app.topdoc.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.topdoc.services.DoctorDashboardService;

@CrossOrigin
@RestController
@RequestMapping("/doctorDashboard")
public class DoctorDashboardController {
	public void DoctorDashboardController (){
		System.out.println("In constructor");
	}
	@Autowired
	DoctorDashboardService doctorDashboardService;

	@GetMapping("/getDetails")
	public String addPracticeDetails() throws Exception {
		System.out.println("Try1");
		//return "Akash";
		 return doctorDashboardService.getDetails();
//		customerService.updateCustomerAddress(data, id, userType, externalId);
//		return new ResponseEntity<>(new JSONObject().put(STATUS, SUCCESS).toString(), HttpStatus.OK);

	}
}
