package com.app.topdoc.config;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.*;
import co.elastic.clients.elasticsearch.core.search.Hit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.app.topdoc.pojo.ClinicSetupRM;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

@Component
public class ElasticSearchQuery {

	@Autowired
	private ElasticsearchClient elasticsearchClient;

//    private final String indexName = "products";

	public UpdateResponse<ClinicSetupRM> createOrUpdateDocument(@Valid ClinicSetupRM clinicSetupRM) throws IOException {

		UpdateResponse<ClinicSetupRM> response = elasticsearchClient.update(i -> i.index("doctor_v1").id("1").doc(clinicSetupRM),ClinicSetupRM.class);
//        if (response.result().name().equals("Created")) {
//            return new StringBuilder("Document has been successfully created.").toString();
//        } else if (response.result().name().equals("Updated")) {
//            return new StringBuilder("Document has been successfully updated.").toString();
//        }
//        return new StringBuilder("Error while performing the operation.").toString();
		System.out.println(response+"aaaaaaaaaaaaaaaaaaa");
		return response;

	}
	
//	client.update(u -> u.index("your_index")
//	        .id("id-foo")
//	        .doc(foo), Foo.class);

//
//    @Autowired
//    private ElasticsearchTemplate elasticsearchTemplate;

//    @Override
//    public void updateAddress(User user, String updatedAddress){
//		IndexResponse response = elasticsearchClient.index(i -> i.index("doctor").id("1").document(clinicSetupRM));
//
//        IndexRequest indexRequest = new IndexRequest();
//        indexRequest.source("address", updatedAddress);
//        UpdateQuery updateQuery = new UpdateQueryBuilder().withId("1").withClass(ClinicSetupRM.class).withIndexRequest("doctor").build();
//        elasticsearchTemplate.update(updateQuery);
//    }
//}

//    public Product getDocumentById(String productId) throws IOException {
//        Product product = null;
//        GetResponse<Product> response = elasticsearchClient.get(g -> g
//                        .index(indexName)
//                        .id(productId),
//                Product.class
//        );
//
//        if (response.found()) {
//            product = response.source();
//            System.out.println("Product name " + product.getName());
//        } else {
//            System.out.println("Product not found");
//        }
//
//        return product;
//    }
//
//    public String deleteDocumentById(String productId) throws IOException {
//
//        DeleteRequest request = DeleteRequest.of(d -> d.index(indexName).id(productId));
//
//        DeleteResponse deleteResponse = elasticsearchClient.delete(request);
//        if (Objects.nonNull(deleteResponse.result()) && !deleteResponse.result().name().equals("NotFound")) {
//            return new StringBuilder("Product with id " + deleteResponse.id() + " has been deleted.").toString();
//        }
//        System.out.println("Product not found");
//        return new StringBuilder("Product with id " + deleteResponse.id() + " does not exist.").toString();
//
//    }
//
//    public List<Product> searchAllDocuments() throws IOException {
//
//        SearchRequest searchRequest = SearchRequest.of(s -> s.index(indexName));
//        SearchResponse searchResponse = elasticsearchClient.search(searchRequest, Product.class);
//        List<Hit> hits = searchResponse.hits().hits();
//        List<Product> products = new ArrayList<>();
//        for (Hit object : hits) {
//
//            System.out.print(((Product) object.source()));
//            products.add((Product) object.source());
//
//        }
//        return products;
//    }
}
