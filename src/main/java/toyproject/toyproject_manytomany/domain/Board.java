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
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    private String title;
    private String contents;

    @ManyToOne
    @JoinColumn(name = "account_idx")
    private Account account;

    @OneToMany(mappedBy = "board")
    private List<Recommend> recommends;
}
