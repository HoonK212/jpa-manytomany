package toyproject.toyproject_manytomany.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import toyproject.toyproject_manytomany.domain.Account;
import toyproject.toyproject_manytomany.repository.AccountRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    // 회원 가입
    public int join(Account account) {
        validateDuplicateAccount(account);
        accountRepository.save(account);
        return account.getIdx();
    }

    // 중복 회원 검증
    private void validateDuplicateAccount(Account account) {
        accountRepository.findByEmail(account.getEmail())
                .ifPresent(a -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    // 전체 회원 조회
    public List<Account> findAccounts() {
        return accountRepository.findAll();
    }

    // 특정 회원 조회
    public Optional<Account> findOne(int idx) {
        return accountRepository.findById(idx);
    }
    public Optional<Account> findOne(String email) { return accountRepository.findByEmail(email); }
}
