package com.app.topdoc.pojo.doctorPojo;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessionRM {

	@Field(type = FieldType.Text, name = "session1_start_time")
	private String session1_start_time;

	@Field(type = FieldType.Text, name = "session1_end_time")
	private String session1_end_time;

	@Field(type = FieldType.Text, name = "session2_start_time")
	private String session2_start_time;

	@Field(type = FieldType.Text, name = "session2_end_time")
	private String session2_end_time;
}
