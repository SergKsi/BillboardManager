import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    PosterItem item1 = new PosterItem(1, 120, "Бладшот", "Боевик");
    PosterItem item2 = new PosterItem(2, 230, "Вперед", "Мультьфильм");
    PosterItem item3 = new PosterItem(3, 5, "Отель 'Белград' ", "Боевик");
    PosterItem item4 = new PosterItem(5, 4, "Матрица", "Боевик");
    PosterItem item5 = new PosterItem(8, 3, "007", "Мультьфильм");
    PosterItem item6 = new PosterItem(6, 2, "Игра", "Боевик");
    PosterItem item7 = new PosterItem(12, 1, "Патриот", "Боевик");
    PosterItem item8 = new PosterItem(11, 20, "Назад", "Мультьфильм");
    PosterItem item9 = new PosterItem(10, 45, "Вперед", "Боевик");
    PosterItem item10 = new PosterItem(4, 22, "Киндзадза", "Боевик");
    PosterItem item11 = new PosterItem(22, 24, "Снайпре", "Мультьфильм");
    PosterItem item12 = new PosterItem(31, 23, "ВИМП", "Боевик");

//
//    PosterManager manager = new PosterManager();
//
//    @BeforeEach
//    public void setup() {
//        manager.save(item1);
//        manager.save(item2);
//        manager.save(item3);
//        manager.save(item4);
//        manager.save(item5);
//        manager.save(item6);
//        manager.save(item7);
//        manager.save(item8);
//        manager.save(item9);
//        manager.save(item10);
//        manager.save(item11);
//        manager.save(item12);
//    }

    // тест - Вывод всех фильмов в порядке добавления (findAll)
    @Test
    public void shouldFindAll() {

        PosterManager manager = new PosterManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.save(item11);
        manager.save(item12);
        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    // тест - Вывод всех фильмов в обратном порядке  (findLast)
    @Test
    public void shouldReversedAllItems() {
        PosterManager manager = new PosterManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.save(item11);
        manager.save(item12);
        PosterItem[] expected = {item12, item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    // тест - Вывод 10 фильмов в обратном порядке  (findLast)
    @Test
    public void shouldReversedAllItemsMax10() {

        PosterManager manager = new PosterManager(); // констурктор пустой - вывожу 10 фильмов (по умолчанию)
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.save(item11);
        manager.save(item12);
        PosterItem[] expected = {item12, item11, item10, item9, item8, item7, item6, item5, item4, item3};
        PosterItem[] actual = manager.findLastMax();

        Assertions.assertArrayEquals(expected, actual);
    }

    // тест - Вывод 5 фильмов в обратном порядке  (findLast)
    @Test
    public void shouldReversedAllItemsMaxN() {

        PosterManager manager = new PosterManager(5); // констурктор содержит параметр = 5 - вывожу 5 фильмов
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.save(item11);
        manager.save(item12);
        PosterItem[] expected = {item12, item11, item10, item9, item8};
        PosterItem[] actual = manager.findLastMax();

        Assertions.assertArrayEquals(expected, actual);
    }
}
