package com.jpa.api.querydsl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.api.querydsl.model.TestQueryDTO;
import com.jpa.api.querydsl.service.SearchTestQuery;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class QueryDsl {
    private final SearchTestQuery searchTestQuery;

    @GetMapping("/test")
    public Object TestQueryCall(@RequestParam(value = "testType", required = true) String testType)throws Exception{
        TestQueryDTO.TestQueryRequest testQueryRequest = TestQueryDTO.TestQueryRequest.builder().test1(testType).build();
        return searchTestQuery.excute(testQueryRequest);
    }
}
