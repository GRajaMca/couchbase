package com.javabeans.io.couchbase.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
public class CouchBaseSample {
    @Id
    private Long id;

    @Field
    private String name;

    @Field
    private String randomKey;

}
