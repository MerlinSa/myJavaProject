package ru.gb.saikalb;

/**
 * @author <SAIKALB>
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */

public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     * Создает экземпляр контроллера и запускает основной цикл программы.
     * @param args стандартные аргументы командной строки.
     */
    public static void main(String[] args) {
        Cube cube = new Cube();
        CubeView view = new CubeView();
        Controller controller = new Controller(cube, view);
        controller.start();
    }
}

