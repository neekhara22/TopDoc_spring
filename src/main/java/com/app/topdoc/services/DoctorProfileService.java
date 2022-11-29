package com.app.topdoc.services;

import java.io.IOException;
import java.util.List;

import com.app.topdoc.pojo.doctorPojo.DoctorRM;

import co.elastic.clients.elasticsearch._types.ElasticsearchException;

public interface DoctorProfileService {

	public String saveDoctor(DoctorRM doctorRM) throws ElasticsearchException, IOException;

	public List<DoctorRM> getDoctors() throws ElasticsearchException, IOException;

	public DoctorRM getDoctorById(String id) throws ElasticsearchException, IOException;

	public String deleteDoctorById(String id) throws ElasticsearchException, IOException;

}
