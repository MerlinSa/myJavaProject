package ru.gb.saikalb;

/**
 * Класс Cube представляет кубик с текстами на его гранях.
 */

public class Cube {
    private final String[] faces;
    private int currentFace;

    /**
     * Конструктор. Создает новый экземпляр кубика с заданными гранями.
     */
    public Cube() {
        this.faces = new String[6];
        this.currentFace = 0;

    }

    /**
     * Геттер для получения текста с грани кубика по индексу
     *
     * @param index представляет грань кубика по индексу
     *              (0 to the length of the faces array, which represents the cube's faces)
     * @return the text from the corresponding face.
     */
//    public String getFace(int index) {
//        if (index >= 0 && index < faces.length) {
//            return faces[index];
//        } else {
//            System.out.println("Неверный индекс грани");
//            return null;
//        }
//    }

    /**
     * Сеттер для установки текста на грань кубика по индексу
     */
    public void setFace(int index, String text) {
        if (index >= 0 && index < faces.length) {
            faces[index] = text;
        } else {
            System.out.println("Неверный индекс грани");
        }
    }

    /**
     * Создает новый экземпляр кубика в зависимости от выбора пользователя.
     *
     * @param choice выбор пользователя
     * @return экземпляр Cube с заданными характеристиками
     */

    public Cube createCube(int choice) {
        switch (choice) {
            case 1:
                return createBigGoldCube();
            case 2:
                return createSmallGoldCube();
            case 3:
                return createBigMCube();
            case 4:
                return createBigLCube();
            case 5:
                return createBigRCube();
            default:
                throw new IllegalArgumentException("Неверный выбор.");
        }
    }

    private Cube createBigGoldCube() {
        Cube cube = new Cube();
        cube.setFace(0, "У");
        cube.setFace(1, "О");
        cube.setFace(2, "А");
        cube.setFace(3, "Э");
        cube.setFace(4, "Ы");
        cube.setFace(5, "Картинка большой клубники");
        return cube;
    }

    private Cube createSmallGoldCube() {
        Cube cube = new Cube();
        cube.setFace(0, "Ю");
        cube.setFace(1, "Ё");
        cube.setFace(2, "Я");
        cube.setFace(3, "Е");
        cube.setFace(4, "И");
        cube.setFace(5, " ");
        return cube;
    }

    private Cube createBigMCube() {
        Cube cube = new Cube();
        cube.setFace(0, "му");
        cube.setFace(1, "мо");
        cube.setFace(2, "ма");
        cube.setFace(3, "мэ");
        cube.setFace(4, "мы");
        cube.setFace(5, "м");
        return cube;
    }

    private Cube createBigLCube() {
        Cube cube = new Cube();
        cube.setFace(0, "лу");
        cube.setFace(1, "ло");
        cube.setFace(2, "ла");
        cube.setFace(3, "лэ");
        cube.setFace(4, "лы");
        cube.setFace(5, "л");
        return cube;
    }

    private Cube createBigRCube() {
        Cube cube = new Cube();
        cube.setFace(0, "ру");
        cube.setFace(1, "ро");
        cube.setFace(2, "ра");
        cube.setFace(3, "рэ");
        cube.setFace(4, "ры");
        cube.setFace(5, "р");
        return cube;
    }


    /**
     * Возвращает текст текущей грани кубика.
     *
     * @return текст текущей грани кубика
     */

    public String getCurrentFaceText() {
        return this.faces[this.currentFace];
    }

    /**
     * Возвращает количество граней у кубика.
     *
     * @return количество граней у кубика
     */
    public int getFacesCount() {
        return this.faces.length;
    }

    /**
     * Вращает кубик, переходя к следующей грани.
     */
    public void rotate() {
        this.currentFace = (this.currentFace + 1) % this.faces.length;
    }
}