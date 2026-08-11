package com.example.booklist.dto;

import java.util.UUID;

public record BookResponse(UUID id, String author, String title, String description, Integer year) {
}
