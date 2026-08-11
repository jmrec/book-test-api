package com.example.booklist.dto;

import jakarta.validation.constraints.*;

import java.util.UUID;

public record BookUpdateRequest(@NotBlank(message = "Author is required") String author,
        @NotBlank(message = "Title is required") String title,
        @Size(min = 10, message = "Description must be at least 10 characters long") String description,
        @Min(value = 1450, message = "Year should not be earlier than 1450") @Max(value = 2026, message = "Year " +
                "should not be later than 2026") Integer year) {
}
