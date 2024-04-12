package ru.gb.saikalb;

import java.util.Scanner;

/**
 * Класс Controller координирует работу приложения.
 */
public class Controller {
    private final Cube cube;
    private final CubeView view;

    public Controller(Cube cube, CubeView view) {
        this.cube = cube;
        this.view = view;
    }
    /**
     * Начинает выполнение программы.
     */

    public void start() {
        while (true) {
            view.displayMenu();
            int choice = getChoiceFromUser();
            if (choice == 0) {
                System.out.println("Выход из программы.");
                break;
            }
            Cube newCube = cube.createCube(choice);
            startRotation(newCube);
        }
    }

    /**
     * Возвращает номер выбранного кубика. Номер выбранного кубика.
     */
    private int getChoiceFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер кубика: ");
        return scanner.nextInt();
    }

    /**
     * Начинает вращение кубика.
     */

    private void startRotation(Cube cube) {
        for (int i = 0; i < cube.getFacesCount(); i++) {
            view.displayFace(cube.getCurrentFaceText());
            try {
                Thread.sleep(1500); // Пауза перед вращением
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cube.rotate();
        }
        view.displayMenuForRotation();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            startRotation(cube);
        } else if (choice == 0) {
            System.out.println("Выход из программы.");
        } else {
            System.out.println("Неверный выбор. Программа завершена.");
        }
        view.displayMenu();
    }
}
