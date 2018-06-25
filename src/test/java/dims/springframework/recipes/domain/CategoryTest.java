package dims.springframework.recipes.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setup(){
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4l;

        System.out.println("testing");
        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception {
    }

    @Test
    public void getRecipes() throws Exception {
    }

}