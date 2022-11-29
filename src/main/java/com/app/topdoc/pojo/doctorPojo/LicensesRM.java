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
public class LicensesRM {

	@Field(type = FieldType.Text, name = "identifier")
	private String identifier;

	@Field(type = FieldType.Text, name = "name")
	private String name;

	@Field(type = FieldType.Date, format = DateFormat.basic_date, name = "registrationYear")
	private Date registrationYear;

	@Field(type = FieldType.Date, format = DateFormat.basic_date, name = "validUpTo")
	private Date validUpTo;

	@Field(type = FieldType.Text, name = "provider")
	private String provider;
}
