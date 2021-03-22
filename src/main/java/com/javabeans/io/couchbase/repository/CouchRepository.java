package com.javabeans.io.couchbase.repository;

import com.javabeans.io.couchbase.model.CouchBaseSample;
import org.springframework.data.repository.CrudRepository;


public interface CouchRepository extends CrudRepository<CouchBaseSample, Long> {
}
