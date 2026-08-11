package com.example.booklist.mapper;

import com.example.booklist.dto.BookCreateRequest;
import com.example.booklist.dto.BookUpdateRequest;
import com.example.booklist.dto.BookResponse;
import com.example.booklist.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookResponse toResponse(Book book);

    List<BookResponse> toResponseList(List<Book> books);

    Book toEntity(BookCreateRequest bookCreateRequest);

    void updateEntityFromRequest(BookUpdateRequest bookUpdateRequest, @MappingTarget Book book);
}
