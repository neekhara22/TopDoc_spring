package com.app.topdoc.services.servicesImpl;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.topdoc.esQuery.ElasticsearchQuery;
import com.app.topdoc.pojo.doctorPojo.DoctorRM;
import com.app.topdoc.services.DoctorProfileService;

import co.elastic.clients.elasticsearch._types.ElasticsearchException;

@Service
public class DoctorProfileServiceImpl implements DoctorProfileService {

	public static final Logger LOGGER = LoggerFactory.getLogger(DoctorProfileServiceImpl.class);

	@Autowired
	private ElasticsearchQuery elasticSearchQuery;

	@Override
	public String saveDoctor(DoctorRM doctorRM) throws ElasticsearchException, IOException {
		String response = elasticSearchQuery.save(doctorRM);
		return response;
	}

	@Override
	public List<DoctorRM> getDoctors() throws ElasticsearchException, IOException {
		List<DoctorRM> products = elasticSearchQuery.getDoctors();
		return products;
	}

	@Override
	public DoctorRM getDoctorById(String id) throws ElasticsearchException, IOException {
		DoctorRM doctor = elasticSearchQuery.getDoctorById(id);
		return doctor;
	}

	@Override
	public String deleteDoctorById(String id) throws ElasticsearchException, IOException {
		String response = elasticSearchQuery.deleteDoctorById(id);
		return response;
	}

	@Override
	public String updateDoctorById(String id, DoctorRM doctorRM) throws ElasticsearchException, IOException {
		String response = elasticSearchQuery.updateDoctorById(id, doctorRM);
		return response;
	}

}
