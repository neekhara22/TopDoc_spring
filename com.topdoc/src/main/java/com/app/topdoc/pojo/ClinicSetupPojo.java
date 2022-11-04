package com.app.topdoc.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ClinicSetupPojo {
 private String clinicImageUrl;
 private String clinicId;
 private Integer clinicConsultationFee;
 private Integer clinicZipCode;
 private String clinicName;
 private String clinicCountry;
 private String clinicState;
 private String clinicDistrict;
 private String clinicLocation;
 private Boolean clinicIsActive;
 private String clinicGeoPoint;
 private Double clinicRating;
 private String[] clinicTagReceived;

}
