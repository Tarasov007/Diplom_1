import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Ingredient;
import ru.yandex.praktikum.IngredientType;

import java.util.Random;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTest {
    private final static Random random = new Random();
    private final Ingredient ingredient;
    private final IngredientType ingredientType;
    private final String name;
    private final float price;

    public IngredientTest(IngredientType ingredientType,
                          String name,
                          float price) {
        this.ingredientType = ingredientType;
        this.name = name;
        this.price = price;
        this.ingredient = new Ingredient(ingredientType, name, price);
    }

    @Parameterized.Parameters
    public static Object[][] createIngredient() {
        return new Object[][]{
                {IngredientType.FILLING, RandomStringUtils.randomAlphabetic(10), random.nextFloat()},
                {IngredientType.SAUCE, RandomStringUtils.randomAlphabetic(10), random.nextFloat()}
        };
    }

    @Test
    public void getIngredientTypeTest() {
        assertEquals(ingredientType, ingredient.getType());
    }

    @Test
    public void getNameTest() {
        assertEquals(name, ingredient.getName());
    }

    @Test
    public void getPriceTest() {
        assertEquals(price, ingredient.getPrice(), 0);
    }
}
