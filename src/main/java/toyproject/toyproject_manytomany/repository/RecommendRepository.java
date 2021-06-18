package toyproject.toyproject_manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyproject.toyproject_manytomany.domain.Board;
import toyproject.toyproject_manytomany.domain.Recommend;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface RecommendRepository extends JpaRepository<Recommend, Integer> {

    @Transactional
    Optional<Recommend> deleteByIdx(int idx);
}
