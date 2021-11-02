package com.dybikowski.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDTO {
    private Long id;
    private String name;
    private String model;
    private String engineId;
    private Double engineCapacity;
}
