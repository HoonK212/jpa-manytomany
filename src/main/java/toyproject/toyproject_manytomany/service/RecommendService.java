package toyproject.toyproject_manytomany.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import toyproject.toyproject_manytomany.domain.Recommend;
import toyproject.toyproject_manytomany.repository.BoardRepository;
import toyproject.toyproject_manytomany.repository.RecommendRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RecommendService {

    private final RecommendRepository recommendRepository;

    // 추천
    public int recommend(Recommend recommend) {
        recommendRepository.save(recommend);
        return recommend.getIdx();
    }

    // 특정 추천 조회
    public Optional<Recommend> findOne(int idx) {
        return recommendRepository.findById(idx);
    }

    // 추천 취소
    public Optional<Recommend> cancel(int idx) {
        return recommendRepository.deleteByIdx(idx);
    }
}
