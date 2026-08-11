package com.example.booklist.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "Author is required")
    private String author;

    @NotBlank(message = "Title is required")
    private String title;

    @Size(min = 10, message = "Description must be at least 10 characters long")
    private String description;

    @Min(value = 1450, message = "Year should not be earlier than 1450")
    @Max(value = 2026, message = "Year should not be later than 2026")
    @Column(name = "`year`")
    private Integer year;
}
