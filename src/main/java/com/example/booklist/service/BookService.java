package com.example.booklist.service;

import com.example.booklist.dto.BookCreateRequest;
import com.example.booklist.dto.BookResponse;
import com.example.booklist.dto.BookUpdateRequest;
import com.example.booklist.exception.ResourceNotFoundException;
import com.example.booklist.mapper.BookMapper;
import com.example.booklist.model.Book;
import com.example.booklist.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookService(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    private Book getBookByIdOrThrow(UUID id) {
        return bookRepository.findById(id)
                             .orElseThrow(() -> new ResourceNotFoundException("Book not found with id: " + id));
    }

    public List<BookResponse> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return bookMapper.toResponseList(books);
    }

    public BookResponse getBookById(UUID id) {
        return bookMapper.toResponse(getBookByIdOrThrow(id));
    }

    public BookResponse createBook(BookCreateRequest request) {
        Book book = bookMapper.toEntity(request);
        return bookMapper.toResponse(bookRepository.save(book));
    }

    public BookResponse updateBook(UUID id, BookUpdateRequest request) {
        Book existingBook = getBookByIdOrThrow(id);

        bookMapper.updateEntityFromRequest(request, existingBook);

        return bookMapper.toResponse(bookRepository.save(existingBook));
    }

    public void deleteBook(UUID id) {
        getBookByIdOrThrow(id);
        bookRepository.deleteById(id);
    }
}
