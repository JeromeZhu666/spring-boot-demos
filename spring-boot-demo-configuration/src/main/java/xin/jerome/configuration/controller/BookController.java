package xin.jerome.configuration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.jerome.configuration.domain.Book;

/**
 * {@link Book} {@link RestController}
 *
 * @author Jerome Zhu
 * @since 2018.09.21 17:48
 */
@RestController
@EnableConfigurationProperties(Book.class)
public class BookController {

    @Autowired
    private Book book;

    @GetMapping("/book")
    public Book getBook() {
        return book;
    }
}
