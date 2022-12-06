package com.jpa.api.querydsl.service;

import com.jpa.api.querydsl.model.TestQueryDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchTestQuery {
    public Object excute(TestQueryDTO.TestQueryRequest testQueryRequest) throws Exception{
        TestQueryDTO.TestQueryResponse resultResponse = TestQueryDTO.TestQueryResponse.builder().test3(testQueryRequest.getTest1()).build();
        return resultResponse;
    }
}
