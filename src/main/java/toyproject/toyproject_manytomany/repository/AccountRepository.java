package toyproject.toyproject_manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyproject.toyproject_manytomany.domain.Account;
import toyproject.toyproject_manytomany.service.AccountService;

import javax.persistence.EntityManager;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    Optional<Account> findByEmail(String email);
}
