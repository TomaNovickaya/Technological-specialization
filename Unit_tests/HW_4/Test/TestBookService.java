import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import seminars.fourth.book.Book;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TestBookService {

    @Mock
    private BookRepository mockRepository;

    private BookService bookService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        bookService = new BookService(mockRepository);
    }

    @Test
    public void testFindAllBooks() {
        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Преступление и наказание", "Федор Достоевский"),
                new Book("2", "Гордость и предубеждение", "Джейн Остен")
        );
        when(mockRepository.findAll()).thenReturn(expectedBooks);
        List<Book> result = bookService.findAllBooks();
        verify(mockRepository).findAll();
        assertEquals(expectedBooks, result);
    }

     @Test
    public void testFindBookById() {
        Book expectedBook = new Book("111", "Преступление и наказание", "Федор Достоевский");
        when(mockRepository.findById("111")).thenReturn(expectedBook);
        Book result = bookService.findBookById("111");
        verify(mockRepository).findById("111");
        assertEquals(expectedBook, result);
    }
}
