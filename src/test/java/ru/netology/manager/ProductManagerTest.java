package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);

    private Product book1 = new Book(1, "Прованс", 100, "Мейл", 150, 2015);
    private Product book2 = new Book(2, "Прислуга", 150, "Стокетт", 200, 2010);
    private Product book3 = new Book(3, "Алхимик", 350, "Коэльо", 300, 1990);
    private Product smartphone1 = new Smartphone(11, "Galaxy S", 15000, "Samsung", 7, 2015);
    private Product smartphone2 = new Smartphone(12, "Redmi A", 10000, "Xiaomi", 9, 2017);
    private Product smartphone3 = new Smartphone(13, "iPhone", 50000, "Apple", 11, 2019);
    private Product product1 = new Product(7, "X", 500);
    private Product product2 = new Product(8, "A", 50);
    private Product product3 = new Product(9, "B", 5000);

    @BeforeEach
    void setUp() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
    }

    @Test
    void searchByAuthorBook() {
        Product[] actual = manager.searchBy("Мейл");
        Product[] expected = new Product[]{book1};

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchByNameBook() {
        Product[] actual = manager.searchBy("Прислуга");
        Product[] expected = new Product[]{book2};

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchByMakerSmartphone() {
        Product[] actual = manager.searchBy("Samsung");
        Product[] expected = new Product[]{smartphone1};

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchByNameSmartphone() {
        Product[] actual = manager.searchBy("iPhone");
        Product[] expected = new Product[]{smartphone3};

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchByNotProductForTest() {
        Product[] actual = manager.searchBy("XX");
        Product[] expected = new Product[0];

        assertArrayEquals(expected, actual);
    }
}
