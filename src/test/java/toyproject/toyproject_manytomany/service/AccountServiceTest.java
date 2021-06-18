package toyproject.toyproject_manytomany.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import toyproject.toyproject_manytomany.domain.Account;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
public class AccountServiceTest {

    @Autowired AccountService accountService;

    @BeforeEach
    void beforeEach() {}

    @AfterEach
    void afterEach() {}

    @Test
    public void join() {
        // given
        Account account = new Account();
        account.setEmail("");
        account.setPasswd("");

        // when
        int saveIdx = accountService.join(account);

        // then
    }

}
