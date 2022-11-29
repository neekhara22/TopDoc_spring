package com.app.topdoc.pojo.doctorPojo;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class scheduleRM {

	@Field(type = FieldType.Object, name = "monday")
	private SessionRM monday;

	@Field(type = FieldType.Object, name = "tuesday")
	private SessionRM tuesday;

	@Field(type = FieldType.Object, name = "wednesday")
	private SessionRM wednesday;

	@Field(type = FieldType.Object, name = "thursday")
	private SessionRM thursday;

	@Field(type = FieldType.Object, name = "friday")
	private SessionRM friday;

	@Field(type = FieldType.Object, name = "saturday")
	private SessionRM saturday;

	@Field(type = FieldType.Object, name = "sunday")
	private SessionRM sunday;
}
