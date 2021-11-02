package com.dybikowski.persistance;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuerySpec {
    private String table;
    private String column;
    private String parameter;
}
