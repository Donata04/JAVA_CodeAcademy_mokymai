package donv.spring_demo.service;

import donv.spring_demo.entities.Book;
import donv.spring_demo.repositories.BookRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@Service
@Component
public class BookService {
    private BookRepository bookRepository;
    public void addTestBooks(){
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setAuthorName("NAME-" + i);
            book.setAuthorLastName("LAST-NAME-" + i);
            book.setTitle("TITLE-" + i);
            book.setPublisher("PUBLISHER-" + i);
            book.setYearPublished(1900 + (int)(Math.random() * 124));
            book.setPageNumber(130 + (int)(Math.random() * 450));
            books.add(book);
            //System.out.println(book);
        }
        this.bookRepository.saveAllAndFlush(books);
    }
}
