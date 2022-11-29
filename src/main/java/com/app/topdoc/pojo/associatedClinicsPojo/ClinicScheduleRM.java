package com.app.topdoc.pojo.associatedClinicsPojo;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClinicScheduleRM {

	@Field(type = FieldType.Text, name = "from")
	private String from;

	@Field(type = FieldType.Text, name = "to")
	private String to;

	@Field(type = FieldType.Text, name = "duration")
	private String duration;
}
