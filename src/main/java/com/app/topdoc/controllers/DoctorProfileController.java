package com.app.topdoc.controllers;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.topdoc.pojo.doctorPojo.DoctorRM;
import com.app.topdoc.services.DoctorProfileService;

import co.elastic.clients.elasticsearch._types.ElasticsearchException;

@CrossOrigin
@RestController
@RequestMapping("/dashboard")
public class DoctorProfileController {

	public static final Logger LOGGER = LoggerFactory.getLogger(ClinicSetupController.class);

	@Autowired
	public DoctorProfileService doctorProfileService;

	@PostMapping(value = "/save")
	public ResponseEntity<Object> saveDoctor(@RequestBody DoctorRM doctorRM)
			throws ElasticsearchException, IOException {
		LOGGER.info("Creating/Updating doctor profile");
		String response = doctorProfileService.saveDoctor(doctorRM);
		LOGGER.info("Doctor profile created/updated");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Object> updateDoctorById(@PathVariable("id") String id, @RequestBody DoctorRM doctorRM)
			throws ElasticsearchException, IOException {
		LOGGER.info("Updating doctor profile by id");
		String doctor = doctorProfileService.updateDoctorById(id, doctorRM);
		LOGGER.info("Doctor profile updated by id");
		return new ResponseEntity<>(doctor, HttpStatus.OK);
	}

	@GetMapping(value = "/get")
	public ResponseEntity<Object> getDoctors() throws ElasticsearchException, IOException {
		LOGGER.info("Fetching doctors list");
		List<DoctorRM> doctor = doctorProfileService.getDoctors();
		LOGGER.info("Doctor list fetched");
		return new ResponseEntity<>(doctor, HttpStatus.OK);
	}

	@GetMapping(value = "/get/{id}")
	public ResponseEntity<Object> getDoctorById(@PathVariable("id") String id)
			throws ElasticsearchException, IOException {
		LOGGER.info("Fetching doctor by id");
		DoctorRM doctor = doctorProfileService.getDoctorById(id);
		LOGGER.info("doctor feched by id");
		return new ResponseEntity<>(doctor, HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Object> deleteDoctorById(@PathVariable("id") String id)
			throws ElasticsearchException, IOException {
		LOGGER.info("Deleting doctor by id");
		String response = doctorProfileService.deleteDoctorById(id);
		LOGGER.info("doctor deleted by id");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
