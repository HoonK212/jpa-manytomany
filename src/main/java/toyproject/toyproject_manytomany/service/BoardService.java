package toyproject.toyproject_manytomany.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import toyproject.toyproject_manytomany.domain.Board;
import toyproject.toyproject_manytomany.repository.AccountRepository;
import toyproject.toyproject_manytomany.repository.BoardRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    // 게시글 추가
    public int add(Board board) {
        boardRepository.save(board);
        return board.getIdx();
    }

    // 전체 게시글 조회
    public List<Board> findBoards() {
        return boardRepository.findAll();
    }

    // 특정 게시글 조회
    public Optional<Board> findOne(int idx) { return boardRepository.findById(idx); }
    public Optional<Board> findOne(String title) {
        return boardRepository.findByTitle(title);
    }
}
