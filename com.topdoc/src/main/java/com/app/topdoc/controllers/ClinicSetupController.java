package com.app.topdoc.controllers;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.topdoc.config.Product;
import com.app.topdoc.pojo.ClinicSetupRM;

@RestController
@RequestMapping("/clinicSetup")
public class ClinicSetupController {

	@PostMapping(value ="/updateClinic")
    public void createClinic(@Valid @RequestBody ClinicSetupRM clinic) throws IOException {
        System.out.println("clinic is "+clinic); 
//        return clinic.toString();
    }
	
	
	
	
	
	
	
	
	
//	@PostMapping(path = "users",         consumes = MediaType.APPLICATION_JSON_VALUE,         produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<User> create(@RequestBody User newUser) 
//	{     User user = userService.save(newUser);    
//	if (user == null) 
//	{         throw new ServerException();     }
//	else 
//	{         return new ResponseEntity<>(user, HttpStatus.CREATED);     } }

//    @GetMapping(value="/getClinics", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
//    public List<Clinic> getClinicByDoctorId(@RequestParam String doctorId) throws IOException {
//       Product product =  elasticSearchQuery.getDocumentById(productId);
//        return new ResponseEntity<>(product, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/deleteClinic/{id}")
//    public ResponseEntity<Object> deleteDocumentById(@RequestParam String productId) throws IOException {
//        String response =  elasticSearchQuery.deleteDocumentById(productId);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
//
//    @GetMapping("/getClinic/{id}")
//    public ResponseEntity<Object> searchAllDocument() throws IOException {
//        List<Product> products = elasticSearchQuery.searchAllDocuments();
//        return new ResponseEntity<>(products, HttpStatus.OK);
//    }
	
	
}
