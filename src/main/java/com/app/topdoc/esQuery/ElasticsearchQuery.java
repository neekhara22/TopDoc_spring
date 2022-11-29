package com.app.topdoc.esQuery;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch.core.*;
import co.elastic.clients.elasticsearch.core.search.Hit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Repository;

import com.app.topdoc.pojo.doctorPojo.DoctorRM;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ElasticsearchQuery {

	@Autowired
	private ElasticsearchClient elasticsearchClient;

	private final String indexName = "doctor_v1";

	public String save(DoctorRM doctorRM) throws ElasticsearchException, IOException {
		IndexResponse response = elasticsearchClient
				.index(i -> i.index(indexName).id(doctorRM.getId()).document(doctorRM));
		if (response.result().name().equals("Created")) {
			return new StringBuilder("Document has been successfully created.").toString();
		} else if (response.result().name().equals("Updated")) {
			return new StringBuilder("Document has been successfully updated.").toString();
		}
		return new StringBuilder("Error while performing the operation.").toString();

	}

	public List<DoctorRM> getDoctors() throws ElasticsearchException, IOException {
		SearchRequest searchRequest = SearchRequest.of(s -> s.index(indexName));
		SearchResponse searchResponse = elasticsearchClient.search(searchRequest, DoctorRM.class);
		List<Hit> hits = searchResponse.hits().hits();
		List<DoctorRM> doctors = new ArrayList<>();
		for (Hit object : hits) {
			System.out.print(((DoctorRM) object.source()));
			doctors.add((DoctorRM) object.source());
		}
		return doctors;
	}

	public DoctorRM getDoctorById(String id) throws ElasticsearchException, IOException {
		DoctorRM doctor = null;
		GetResponse<DoctorRM> response = elasticsearchClient.get(g -> g.index(indexName).id(id),
				DoctorRM.class);
		System.out.println("get call " + response);

		if (response.found()) {
			doctor = response.source();
			System.out.println("Doctor name " + doctor.getName());
		} else {
			System.out.println("Doctor not found");
		}

		return doctor;
	}

	public String deleteDoctorById(String id) throws ElasticsearchException, IOException {
		DeleteRequest request = DeleteRequest.of(d -> d.index(indexName).id(id));

		DeleteResponse deleteResponse = elasticsearchClient.delete(request);
		if (Objects.nonNull(deleteResponse.result()) && !deleteResponse.result().name().equals("NotFound")) {
			return new StringBuilder("Doctor with id " + deleteResponse.id() + " has been deleted.").toString();
		}
		System.out.println("Doctor not found");
		return new StringBuilder("Doctor with id " + deleteResponse.id() + " does not exist.").toString();

	}

}
