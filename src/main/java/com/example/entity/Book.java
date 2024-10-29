package com.example.entity;

import com.example.service.BookDecorator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Book implements BookDecorator {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;
    String author;
    double price;
    @Getter
    private boolean featured;

    // TODO: Implement description and price methods

    @Override
    public String getDescription() {
        return title + " by " + author;
    }
    @Override
    public double getPrice() {
        return price;
    }

    public boolean getFeatured() {
        return featured;
    }
}