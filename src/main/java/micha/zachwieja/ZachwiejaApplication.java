package micha.zachwieja;

import lombok.AllArgsConstructor;
import micha.zachwieja.model.Address;
import micha.zachwieja.model.AuthorEntity;
import micha.zachwieja.model.BookEntity;
import micha.zachwieja.respository.AuthorRepository;
import micha.zachwieja.respository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

/**
 * @author Michał Zachwieja
 */
@SpringBootApplication
@AllArgsConstructor
public class ZachwiejaApplication implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(ZachwiejaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        AuthorEntity authorEntity = AuthorEntity.builder()
                .address(Address.builder()
                        .city("Wrocław")
                        .street("ulica")
                        .country("Polska")
                        .build())
                .birth("01.01.2000")
                .name("Jan")
                .surname("Kowalski")
                .build();
        authorRepository.save(authorEntity);
        BookEntity bookEntity = BookEntity.builder()
                .created(LocalDateTime.now())
                .title("ksiązka")
                .isbn("isbn")
                .build();
        bookRepository.save(bookEntity);
    }

}
