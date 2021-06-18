package toyproject.toyproject_manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyproject.toyproject_manytomany.domain.Account;
import toyproject.toyproject_manytomany.domain.Board;

import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

    Optional<Board> findByTitle(String title);
}
