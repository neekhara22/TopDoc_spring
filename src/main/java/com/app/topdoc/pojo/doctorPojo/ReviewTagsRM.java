package com.app.topdoc.pojo.doctorPojo;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewTagsRM {

	@Field(type = FieldType.Text, name = "description")
	private String description;

	@Field(type = FieldType.Text, name = "tagName")
	private String tagName;
}
