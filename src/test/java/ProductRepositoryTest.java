import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepositoryTest {

    Product book1 = new Book(12, 50, "Тараканище", "Чуковский А.И.");
    Product book2 = new Book(13, 130, "Война и мир", "Толстой Л.Н.");
    Product book3 = new Book(15, 80, "Обитаемый остров", "Братья Стругацких");
    Product book4 = new Book(17, 95, "Старик и море", "Э.Хемингуэй");
    Product smartphone1 = new Smartphone(56, 8990, "Xiaomi Redmi 9C", "Xiaomi");
    Product smartphone2 = new Smartphone(63, 8400, "Sony Xperia Z3", "Sony");
    Product smartphone3 = new Smartphone(71, 16200, "Samsung Galaxy A23", "Samsung");

    @Test
    public void shouldTestRepoSave() {

        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(smartphone1);

        Product[] expected = {book1, book2, smartphone1};
        Product[] actual = repo.getProduct();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestRepoFindAll() {

        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(book4);
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.save(smartphone3);

        Product[] expected = {book1, book2, book3, book4, smartphone1, smartphone2, smartphone3};
        Product[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestRepoRemoteById() {

        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(smartphone1);
        repo.remoteById(book2.getId());

        Product[] expected = {book1, smartphone1};
        Product[] actual = repo.getProduct();

        assertArrayEquals(expected, actual);
    }
}
