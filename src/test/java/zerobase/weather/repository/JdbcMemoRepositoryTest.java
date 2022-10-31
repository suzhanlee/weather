package zerobase.weather.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather.domain.Memo;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional // 테스트코드에서의 transactional 은 모두 rollback 시켜줌
class JdbcMemoRepositoryTest {

    @Autowired
    JdbcMemoRepository jdbcMemoRepository;

    @Test
    void insertTest() {
        //given
        Memo newMemo = new Memo(2, "this is new Memo");
        //when
        jdbcMemoRepository.save(newMemo);
        //then
        Optional<Memo> memo = jdbcMemoRepository.findById(2);
        assertEquals(memo.get().getText() , "this is new Memo");
    }

    @Test
    void test2() {
        //given
        List<Memo> all = jdbcMemoRepository.findAll();
        System.out.println(all);
        //when
        //then
        assertNotNull(all);
    }

}