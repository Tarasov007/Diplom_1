import org.junit.Assert;
import org.junit.Test;
import ru.yandex.praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTypeTest {
    public static final String SAUCE = "SAUCE";
    public static final String FILLING = "FILLING";

    @Test
    public void sauceTest() {
        Assert.assertEquals(SAUCE, IngredientType.SAUCE.name());
    }

    @Test
    public void fillingTest() {
        assertEquals(FILLING, IngredientType.FILLING.name());
    }
}
