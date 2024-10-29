package com.example.dto;

import lombok.Data;

@Data
public class BookDto {
    private String title;
    private String author;
    private double price;
    private boolean featured;

}