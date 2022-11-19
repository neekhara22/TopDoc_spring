package com.app.topdoc.pojo;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClinicSetupRM {
 
 private int clinicConsultationFee;
private String clinicCountry;
 private String clinicDistrict;
 private String clinicGeoPoint;
 private String clinicId;
 private String clinicImageUrl;
 private boolean clinicIsActive;
 private String clinicLocation;
 private String clinicName;
 private double clinicRating;
 private String clinicState;
// private String[] clinicTagReceived;
 private int clinicZipCode;
 
}
