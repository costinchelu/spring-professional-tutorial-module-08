package module08.question04.ds;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@AllArgsConstructor
@Entity
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@Table(name = "rooms")
public class Room implements Identifiable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "section")
    private String section;

    public Room(String name, String section) {
        this(null, name, section);
    }
}
