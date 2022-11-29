package com.app.topdoc.pojo.associatedClinicsPojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AssociatedClinicsRM {

	@Field(type = FieldType.Float, name = "fees")
	private int fees;

	@Field(type = FieldType.Text, name = "country")
	private String country;

	@Field(type = FieldType.Text, name = "district")
	private String district;

	@GeoPointField
	@Field(name = "geoPoint")
	private String geoPoint;

	@Id
	@Field(type = FieldType.Text, name = "clinicId")
	private String id;

	@Field(type = FieldType.Text, name = "clinicImageUrl")
	private String imageUrl;

	@Field(type = FieldType.Boolean, name = "isActive")
	private boolean isActive;

	@Field(type = FieldType.Text, name = "clinicLocation")
	private String location;

	@Field(type = FieldType.Text, name = "clinicName")
	private String name;

	@Field(type = FieldType.Double, name = "clinicRating")
	private double rating;

	@Field(type = FieldType.Text, name = "state")
	private String state;

	@Field(type = FieldType.Auto, name = "tagReceived")
	private List<String> tagReceived = new ArrayList<String>();

	@Field(type = FieldType.Text, name = "zipCode")
	private String zipCode;

	@Field(type = FieldType.Nested, name = "clinicSchedule")
	private ClinicScheduleRM clinicSchedule;

}
