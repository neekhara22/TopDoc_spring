package com.app.topdoc.pojo.doctorPojo;

import java.util.Date;

import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationRM {

	@Field(type = FieldType.Text, name = "degree")
	private String degree;

	@Field(type = FieldType.Text, name = "description")
	private String description;

	@Field(type = FieldType.Date, format = DateFormat.basic_date, name = "endDate")
	private Date endDate;

	@Field(type = FieldType.Text, name = "fieldOfStudy")
	private String fieldOfStudy;

	@Field(type = FieldType.Text, name = "institute")
	private String institute;

	@Field(type = FieldType.Date, format = DateFormat.basic_date, name = "startDate")
	private Date startDate;
}
