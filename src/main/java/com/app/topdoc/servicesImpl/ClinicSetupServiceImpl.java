package com.app.topdoc.servicesImpl;

import java.io.IOException;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.topdoc.config.ElasticSearchQuery;
import com.app.topdoc.customGlobalExecption.DataErrorException;
import com.app.topdoc.pojo.ClinicSetupRM;
import com.app.topdoc.services.ClinicSetupService;

import co.elastic.clients.elasticsearch.core.UpdateResponse;

@Service
public class ClinicSetupServiceImpl implements ClinicSetupService {
	public static final Logger LOGGER = LoggerFactory.getLogger(ClinicSetupService.class);

	public void addClinic(ClinicSetupRM clinicSetupRM) throws Exception {
		try {
			LOGGER.info("Clinic setup has been started for");

		} catch (DataErrorException e) {
			LOGGER.error("Error while adding the clinic. Reason: " + e.getLocalizedMessage());
			throw new DataErrorException("400", e.getLocalizedMessage(), 400);// reason+custom+localised messsage
		} catch (Exception e) {
			LOGGER.error("Error while adding the clinic. Reason: " + e.getLocalizedMessage());
			throw new Exception(e.getLocalizedMessage());
		}
	}

	@Autowired
	public ElasticSearchQuery elasticSearchQuery;

	@Override
	public UpdateResponse<ClinicSetupRM> createClinic(@Valid ClinicSetupRM clinicSetupRM) {
		UpdateResponse<ClinicSetupRM> clinic = null;
		try {
			clinic = elasticSearchQuery.createOrUpdateDocument(clinicSetupRM);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clinic;
	}

}
