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
@Transactional
class JpaMemoRepositoryTest {

    @Autowired
    JpaMemoRepository jpaMemoRepository;

    @Test
    void insertMemoTest() {

        //given
        Memo newMemo = new Memo(1, "this is jpa memo");
        //when
        jpaMemoRepository.save(newMemo);
        System.out.println("newMemo.getId() = " + newMemo.getId());
        //then
        List<Memo> all = jpaMemoRepository.findAll();
        assertTrue(all.size() > 0);

    }

    @Test
    void findByIdTest() {
        //given
        Memo newMemo = new Memo(2, "jpa");
        //when
        Memo save = jpaMemoRepository.save(newMemo);
        System.out.println("save.getId() = " + save.getId());
        //then
        Optional<Memo> result = jpaMemoRepository.findById(save.getId());
        assertEquals(result.get().getText(), "jpa");
    }


}