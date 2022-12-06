package com.jpa.api.querydsl.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class TestQueryDTO {
    private String value;

    @Getter
    @Setter
    @Builder
    public static class TestQueryRequest{
        private String test1;
    }

    @Getter
    @Setter
    public static class TestQueryResult{
        private String test2;
    }

    @Getter
    @Builder
    public static class TestQueryResponse{
        private String test3;
    }
}
