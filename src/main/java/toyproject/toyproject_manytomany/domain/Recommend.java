package toyproject.toyproject_manytomany.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "idx")

@Entity
public class Recommend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    @ManyToOne
    @JoinColumn(name = "account_idx")
    private Account account;
    @ManyToOne
    @JoinColumn(name = "board_idx")
    private Board board;
}
