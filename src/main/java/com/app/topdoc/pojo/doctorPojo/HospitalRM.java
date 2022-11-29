package com.app.topdoc.pojo.doctorPojo;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalRM {

	@Field(type = FieldType.Text, name = "identfier")
	private String identfier;

	@Field(type = FieldType.Text, name = "name")
	private String name;
}
