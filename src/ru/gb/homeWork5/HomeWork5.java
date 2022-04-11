package ru.gb.homeWork5;


public class HomeWork5 {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Петов Петя", "Слесарь", "petr@mail.ru", 32456, 40000, 29);
        Employee employee2 = new Employee("Васьков Вася", "Механик", "vasV@mail.ru", 24656, 45000, 44);
        Employee employee3 = new Employee("Ромов Роман", "Замдир", "Roma@mail.ru", 22897, 60000, 52);
        Employee employee4 = new Employee("Пупкин Иван", "Столер", "pup@mail.ru", 32165, 43000, 37);
        Employee employee5 = new Employee("Рогов Толя", "Водитель", "rogov@mail.ru", 66552, 48000, 34);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].infoPrint();

            }
        }
    }
}
