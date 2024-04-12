package ru.gb.saikalb;
/**
 * Класс отвечает за отображение текста пользователю.
 */
public class CubeView{
    /**
     * Отображает меню для выбора кубика.
     */
    public void displayMenu() {
        System.out.println("~~~~~Меню приложения~~~~~ ");
        System.out.println("Выберите кубик: ");
        System.out.println("Большой золотой кубик: 1 ");
        System.out.println("Маленький золотой кубик: 2 ");
        System.out.println("Большой М: 3 ");
        System.out.println("Большой Л: 4 ");
        System.out.println("Большой Р: 5 ");

        // Добавить остальные кубики в меню
        System.out.println("0. Выйти");
    }

    /**
     * Отображает текущую грань кубика.
     *
     * @param faceText текст текущей грани кубика
     */

    public void displayFace(String faceText) {System.out.println(faceText);}

    /**
     * Отображает меню для повторного вращения кубика.
     */

    public void displayMenuForRotation() {
        System.out.println("Желаете вращать кубик еще раз?");
        System.out.println("1. Да");
        System.out.println("0. Нет (выход из программы)");
    }
}


