package scratches.tc.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Rashidi Zin
 */
@DataJpaTest
class BookRepositoryTests {

    @Autowired
    private TestEntityManager em;

    @Autowired
    private BookRepository repository;

    @Test
    void findById() {
        var author = author();
        var book = book(author);

        var id = em.persistAndGetId(book, Long.class);

        assertThat(repository.findById(id)).isNotEmpty();
    }

    private Author author() {
        var author = new Author();

        author.setName("Rudyard Kipling");

        return author;
    }

    private Book book(final Author author) {
        var book = new Book();

        book.setAuthor(author);
        book.setTitle("The Jungle Book");

        return book;
    }

}
