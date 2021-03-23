package com.javabeans.io.couchbase.controller;

import com.javabeans.io.couchbase.model.CouchBaseSample;
import com.javabeans.io.couchbase.service.CouchBaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping(path = "/couchbase/api")
public class CouchBaseController {

    private final CouchBaseService couchBaseService;

    public CouchBaseController(CouchBaseService couchBaseService) {
        this.couchBaseService = couchBaseService;
    }

    @GetMapping
    public List<CouchBaseSample> findAll() {
        return this.couchBaseService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CouchBaseSample> findById(@NonNull @PathVariable Long id) {
        return this.couchBaseService.findById(id);
    }
}
