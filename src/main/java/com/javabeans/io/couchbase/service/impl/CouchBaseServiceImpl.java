package com.javabeans.io.couchbase.service.impl;

import com.javabeans.io.couchbase.model.CouchBaseSample;
import com.javabeans.io.couchbase.repository.CouchRepository;
import com.javabeans.io.couchbase.service.CouchBaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Slf4j
@Service
public class CouchBaseServiceImpl implements CouchBaseService {

    private final CouchRepository couchRepository;

    public CouchBaseServiceImpl(CouchRepository couchRepository) {
        this.couchRepository = couchRepository;
    }

    @PostConstruct
    private void initCouchBaseService() {
        this.couchRepository.saveAll(
                Stream.of(CouchBaseSample
                                .builder()
                                .id(1L)
                                .name("Raja")
                                .randomKey(UUID.randomUUID().toString())
                                .build(),
                        CouchBaseSample
                                .builder()
                                .id(2L)
                                .name("Jack")
                                .randomKey(UUID.randomUUID().toString())
                                .build())
                        .collect(Collectors.toList())
        );
        log.info("Data Loaded Successfully");
    }

    @Override
    public List<CouchBaseSample> findAll() {
        return StreamSupport
                .stream(this.couchRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CouchBaseSample> findById(Long id) {
        return this.couchRepository.findById(id);
    }
}
