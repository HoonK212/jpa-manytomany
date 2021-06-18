package toyproject.toyproject_manytomany.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "idx")

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    private String email;
    private String passwd;

    @OneToMany(mappedBy = "account")
    private List<Board> boards;
    @OneToMany(mappedBy = "account")
    private List<Recommend> recommends;
}
