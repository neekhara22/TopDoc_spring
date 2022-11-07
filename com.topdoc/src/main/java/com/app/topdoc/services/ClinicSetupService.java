package com.app.topdoc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.app.topdoc.customGlobalExecption.DataErrorException;
import com.app.topdoc.customGlobalExecption.ExceptionHelper;
import com.app.topdoc.pojo.ClinicSetupRM;

@Service
public class ClinicSetupService {

	public static final Logger LOGGER = LoggerFactory.getLogger(ClinicSetupService.class);
	   
	public void  addClinic(ClinicSetupRM clinicSetupRM) throws Exception {
	try {
		LOGGER.info("Clinic setup has been started for");	
		
	} catch (DataErrorException e) {
		LOGGER.error("Error while adding the clinic. Reason: "+e.getLocalizedMessage());
		throw new DataErrorException("400",e.getLocalizedMessage(),400);//reason+custom+localised messsage
	}catch (Exception e) {
		LOGGER.error("Error while adding the clinic. Reason: "+e.getLocalizedMessage());
		throw new Exception(e.getLocalizedMessage());
	}
}
}
//springboot actuator 
//naming covention
//logger
//exception
//try catch
//java 8
//@author etc....