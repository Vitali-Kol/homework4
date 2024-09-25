package org.example;

import java.util.Scanner;

public class Main {

    // Массивы с названиями цветов и животных
    private static final String[] COLORS = {"Зеленый", "Красный", "Желтый", "Белый", "Черный"};
    private static final String[] ANIMALS = {"Крыса", "Корова", "Тигр", "Заяц", "Дракон", "Змея", "Лошадь", "Овца", "Обезьяна", "Курица", "Собака", "Свинья"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод года пользователем
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        // Вывод названия года по восточному календарю
        System.out.println(getYearName(year));

        scanner.close();
    }

    // Метод для получения названия года по восточному календарю
    public static String getYearName(int year) {
        int cycleStartYear = 1984;
        int cycleLength = 60;

        // Считаем разницу между текущим годом и началом цикла
        int yearDifference = (year - cycleStartYear) % cycleLength;

        // Вычисляем индекс цвета и животного
        int colorIndex = (yearDifference % 10) / 2;  // Один цвет повторяется 2 года подряд
        int animalIndex = yearDifference % 12;

        // Возвращаем название года
        return COLORS[colorIndex] + " " + ANIMALS[animalIndex];
    }
}
