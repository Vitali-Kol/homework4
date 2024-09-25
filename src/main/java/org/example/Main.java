package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Массивы с названиями цветов и животных
    private static final String[] COLORS = {"Зеленый", "Красный", "Желтый", "Белый", "Черный"};
    private static final String[] ANIMALS = {"Крыса", "Корова", "Тигр", "Заяц", "Дракон", "Змея", "Лошадь", "Овца", "Обезьяна", "Курица", "Собака", "Свинья"};

    public static void main(String[] args) {
        int year = 2016; // любой год
        System.out.println(getYearName(year));
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