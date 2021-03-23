package com.javabeans.io.couchbase.service;

import com.javabeans.io.couchbase.model.CouchBaseSample;

import java.util.List;
import java.util.Optional;

public interface CouchBaseService {

    List<CouchBaseSample> findAll();

    Optional<CouchBaseSample> findById(Long id);
}
