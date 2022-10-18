package lexicon.spring.thymleaflecture.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true ,nullable = false )
    private String name;
    private LocalDate createDate=LocalDate.now();

    public Category(String name) {
        this.name = name;
    }
}
