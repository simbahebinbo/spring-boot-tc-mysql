package scratches.tc.domain;

import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Rashidi Zin
 */
@Data
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private Author author;

    private String title;

}
