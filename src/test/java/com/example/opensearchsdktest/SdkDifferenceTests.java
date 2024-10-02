package com.example.opensearchsdktest;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SdkDifferenceTests {

    static final Logger log = LoggerFactory.getLogger(SdkDifferenceTests.class);

    @Test
    void testOpenSearchSdk() {
        var searchQuery = new org.opensearch.client.opensearch.core.SearchRequest.Builder()
                .index("opensearch")
                .query(org.opensearch.client.opensearch._types.query_dsl.Query.of(q -> q.bool(builder -> builder)))
                .build();

        log.info("OS: {}", searchQuery);
    }


    @Test
    void testElasticSearch() {
        var searchQuery = new co.elastic.clients.elasticsearch.core.SearchRequest.Builder()
                .index("elasticsearch")
                .query(co.elastic.clients.elasticsearch._types.query_dsl.Query.of(q -> q.bool(builder -> builder)))
                .build();

        log.info("ES: {}", searchQuery);
    }
}
