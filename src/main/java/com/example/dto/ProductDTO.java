package com.example.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ProductDTO {

    public String title;
    public String description;
    public String color;
    public int price;
    public boolean isInStock;
    

}
