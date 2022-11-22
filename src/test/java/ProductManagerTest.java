import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest {
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product book1 = new Book(12, 50, "Тараканище", "Чуковский А.И.");
    Product book2 = new Book(13, 130, "Война и мир", "Толстой Л.Н.");
    Product book3 = new Book(15, 80, "Обитаемый остров", "Братья Стругацких");
    Product book4 = new Book(17, 95, "Старик и море", "Э.Хемингуэй");
    Product smartphone1 = new Smartphone(56, 8990, "Xiaomi Redmi 9C", "Xiaomi");
    Product smartphone2 = new Smartphone(63, 8400, "Sony Xperia Z3", "Sony");
    Product smartphone3 = new Smartphone(71, 16200, "Samsung Galaxy A23", "Samsung");

    @Test
    public void shouldFindAllProducts() {

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.searchBy("Xiaomi Redmi 9C");

        Product[] expected = {book1, book2, book3, book4, smartphone1, smartphone2, smartphone3};
        Product[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }
}

