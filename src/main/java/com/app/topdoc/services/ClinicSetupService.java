package com.app.topdoc.services;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.app.topdoc.customGlobalExecption.DataErrorException;
import com.app.topdoc.customGlobalExecption.ExceptionHelper;
import com.app.topdoc.pojo.ClinicSetupRM;

import co.elastic.clients.elasticsearch.core.UpdateResponse;


public interface ClinicSetupService {

	public UpdateResponse<ClinicSetupRM> createClinic(@Valid ClinicSetupRM clinicSetupRM);

	

	
	


}
//springboot actuator 
//naming covention
//logger
//exception
//try catch
//java 8
//@author etc....