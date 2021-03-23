package com.javabeans.io.couchbase.repository;

import com.javabeans.io.couchbase.model.CouchBaseSample;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CouchRepository extends CrudRepository<CouchBaseSample, Long> {
}
