package com.stiick.stockback.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import java.util.List;

@Data
public class Product {

    @Id
    private String id;
    private String name;
    private int quantity;
    private String details;
    private long price;
    private String userOwner;
    private String teamOwner;
    private List<Label> labels;

}
