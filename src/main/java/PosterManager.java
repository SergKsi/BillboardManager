public class PosterManager {

    private int maxCountFilms = 10; // кол-во для вывода, последние добавленных фильмов.

    public PosterManager() {
    }

    public PosterManager(int maxCountFilms) {
        this.maxCountFilms = maxCountFilms;
    }

    private PosterItem[] items = new PosterItem[0]; // изначально менеджер не должен содержать фильмов.

    // Добавление нового фильма в афишу.
    public void save(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];  // новый массив на 1 больше чем старый
        for (int i = 0; i < items.length; i++) {              // скопируем все элементы из старого массива в новый
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item; // сохраняем последний элемент
        items = tmp; // новый массив в items
    }

    // Вывод всех фильмов в порядке добавления
    public PosterItem[] findAll() {
        return items;

    }

    // Вывод всех фильмов в обратном от добавления порядке
    // Возвращаяет массив созданных элементов
    public PosterItem[] findLast() {
        PosterItem[] all = findAll();
        PosterItem[] reversed = new PosterItem[all.length];
        for (int i = 0; i < all.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    // Вывод  лимит последних добавленных фильмов в обратном от добавления порядке
    // Возвращаяет массив созданных элементов
    public PosterItem[] findLastMax() {

        int resultLength;

        PosterItem[] all = findAll();

        if (maxCountFilms > all.length) {
            resultLength = all.length;
        } else {
            resultLength = maxCountFilms;
        }

        PosterItem[] result = new PosterItem[resultLength];

        // заполняем result из массива что лежит в поле
        // в обратном порядке
        for (int i = 0; i < resultLength; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;
    }
}

