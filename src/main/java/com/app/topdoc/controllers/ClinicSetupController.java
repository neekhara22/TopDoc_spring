package com.app.topdoc.controllers;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.topdoc.pojo.associatedClinicsPojo.AssociatedClinicsRM;
import com.app.topdoc.services.ClinicSetupService;

import co.elastic.clients.elasticsearch.core.UpdateResponse;

@RestController
@RequestMapping("/clinicSetup")
public class ClinicSetupController {

	
	public static final Logger LOGGER = LoggerFactory.getLogger(ClinicSetupController.class);
	
	@Autowired
	public ClinicSetupService clinicSetupService;

	@PostMapping(value = "/save")
	public UpdateResponse<AssociatedClinicsRM> createClinic(@Valid @RequestBody AssociatedClinicsRM clinicSetupRM) {

		return null;
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
