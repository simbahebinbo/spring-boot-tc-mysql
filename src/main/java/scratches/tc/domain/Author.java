package scratches.tc.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Rashidi Zin
 */
@Data
@Embeddable
public class Author {

    @Column(name = "author_name")
    private String name;

}
