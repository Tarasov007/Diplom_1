import org.junit.Assert;
import org.junit.Test;
import ru.yandex.praktikum.Database;
import ru.yandex.praktikum.IngredientType;

import static org.junit.Assert.assertEquals;


public class DatabaseTest {
    private final Database database;

    public DatabaseTest() {
        this.database = new Database();
    }

    @Test
    public void testAvailableBuns() {
        var buns = database.availableBuns();

        assertEquals(3, buns.size());

        assertEquals("black bun", buns.get(0).getName());
        assertEquals(100, buns.get(0).getPrice(), 0);

        assertEquals("white bun", buns.get(1).getName());
        assertEquals(200, buns.get(1).getPrice(), 0);

        assertEquals("red bun", buns.get(2).getName());
        assertEquals(300, buns.get(2).getPrice(), 0);
    }

    @Test
    public void testAvailableIngredients() {
        var ingredients = database.availableIngredients();

        assertEquals(6, ingredients.size());

        Assert.assertEquals(IngredientType.SAUCE, ingredients.get(0).getType());
        assertEquals("hot sauce", ingredients.get(0).getName());
        assertEquals(100, ingredients.get(0).getPrice(), 0.0);

        assertEquals(IngredientType.FILLING, ingredients.get(3).getType());
        assertEquals("cutlet", ingredients.get(3).getName());
        assertEquals(100, ingredients.get(3).getPrice(), 0.0);
    }
}