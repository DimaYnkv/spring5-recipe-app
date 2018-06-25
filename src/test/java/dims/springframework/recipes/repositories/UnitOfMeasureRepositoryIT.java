package dims.springframework.recipes.repositories;

import dims.springframework.recipes.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.text.html.Option;

import java.util.Optional;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByDescription() throws Exception {
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Tablespoon");
        assertEquals("Tablespoon", uomOptional.get().getDescription() );

    }

}