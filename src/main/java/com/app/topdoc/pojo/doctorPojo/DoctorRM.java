package com.app.topdoc.pojo.doctorPojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;
import org.springframework.data.elasticsearch.annotations.InnerField;
import org.springframework.data.elasticsearch.annotations.MultiField;

import com.app.topdoc.pojo.associatedClinicsPojo.AssociatedClinicsRM;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorRM {

	@Field(type = FieldType.Long, name = "yearsOfExperience")
	private long yearsOfExperience;

	@Field(type = FieldType.Long, name = "noOfReviews")
	private long noOfReviews;

	@Field(type = FieldType.Long, name = "consultations")
	private long consultations;

	@Field(type = FieldType.Long, name = "satisfiedPatients")
	private long satisfiedPatients;

	@Field(type = FieldType.Text, name = "state")
	private String state;

	@Id
//	@ReadOnlyProperty
	@Field(type = FieldType.Text, name = "id")
	private String id;

	@Field(type = FieldType.Auto, name = "languages")
	private List<String> languages = new ArrayList<String>();

	@Field(type = FieldType.Text, name = "profImageUrl")
	private String profImageUrl;

	@Field(type = FieldType.Text, name = "phone")
	private String phone;

	@GeoPointField
	@Field(name = "location")
	private String location;

	@Field(type = FieldType.Boolean, name = "isVideoAllowed")
	private boolean isVideoAllowed;

	@Field(type = FieldType.Boolean, name = "isPersonAllowed")
	private boolean isPersonAllowed;

	@Field(type = FieldType.Text, name = "gender")
	private String gender;

	@Field(type = FieldType.Text, name = "designation")
	private String designation;

	@Field(type = FieldType.Text, name = "country")
	private String country;

	@Field(type = FieldType.Double, name = "averageRating")
	private double averageRating;

	@MultiField(mainField = @Field(type = FieldType.Text, name = "landmark"), otherFields = {
			@InnerField(suffix = "keyword", type = FieldType.Keyword) })
	private String landmark;

	@MultiField(mainField = @Field(type = FieldType.Text, name = "firstName"), otherFields = {
			@InnerField(suffix = "keyword", type = FieldType.Keyword) })
	private String firstName;

	@MultiField(mainField = @Field(type = FieldType.Text, name = "lastName"), otherFields = {
			@InnerField(suffix = "keyword", type = FieldType.Keyword) })
	private String lastName;

	@MultiField(mainField = @Field(type = FieldType.Text, name = "email"), otherFields = {
			@InnerField(suffix = "keyword", type = FieldType.Keyword) })
	private String email;

	@MultiField(mainField = @Field(type = FieldType.Text, name = "locality"), otherFields = {
			@InnerField(suffix = "keyword", type = FieldType.Keyword) })
	private String locality;

	@MultiField(mainField = @Field(type = FieldType.Text, name = "name"), otherFields = {
			@InnerField(suffix = "keyword", type = FieldType.Keyword) })
	private String name;

	@MultiField(mainField = @Field(type = FieldType.Text, name = "district"), otherFields = {
			@InnerField(suffix = "keyword", type = FieldType.Keyword) })
	private String district;

	@MultiField(mainField = @Field(type = FieldType.Text, name = "city"), otherFields = {
			@InnerField(suffix = "keyword", type = FieldType.Keyword) })
	private String city;

	@MultiField(mainField = @Field(type = FieldType.Text, name = "ailmentsTreated"), otherFields = {
			@InnerField(suffix = "keyword", type = FieldType.Keyword) })
	private List<String> ailmentsTreated = new ArrayList<String>();

	@MultiField(mainField = @Field(type = FieldType.Text, name = "address"), otherFields = {
			@InnerField(suffix = "keyword", type = FieldType.Keyword) })
	private String address;

	@MultiField(mainField = @Field(type = FieldType.Text, name = "specialization"), otherFields = {
			@InnerField(suffix = "keyword", type = FieldType.Keyword) })
	private List<String> specialization = new ArrayList<String>();

	@Field(type = FieldType.Nested, name = "associatedClinics")
	private ArrayList<AssociatedClinicsRM> associatedClinics;

	@Field(type = FieldType.Nested, name = "education")
	private ArrayList<EducationRM> education;

	@Field(type = FieldType.Nested, name = "experience")
	private ArrayList<ExperienceRM> experience;

	@Field(type = FieldType.Nested, name = "hospital")
	private HospitalRM hospital;

	@Field(type = FieldType.Nested, name = "licenses")
	private ArrayList<LicensesRM> licenses;

	@Field(type = FieldType.Nested, name = "awardsAndPublications")
	private ArrayList<AwardsAndPublicationsRM> awardsAndPublications;

	@Field(type = FieldType.Nested, name = "reviewTags")
	private ArrayList<ReviewTagsRM> reviewTags;

	@Field(type = FieldType.Object, name = "schedule")
	private scheduleRM schedule;
}
