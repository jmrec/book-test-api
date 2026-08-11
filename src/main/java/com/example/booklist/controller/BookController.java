package com.example.booklist.controller;

import com.example.booklist.dto.BookCreateRequest;
import com.example.booklist.dto.BookResponse;
import com.example.booklist.dto.BookUpdateRequest;
import com.example.booklist.service.BookService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Tag(name = "Book Controller", description = "CRUD API for books")
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookResponse> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookResponse getBookById(@PathVariable UUID id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public BookResponse createBook(@Valid @RequestBody BookCreateRequest request) {
        return bookService.createBook(request);
    }

    @PutMapping("/{id}")
    public BookResponse updateBook(@PathVariable UUID id, @Valid @RequestBody BookUpdateRequest request) {
        return bookService.updateBook(id, request);
    }
}
