package ru.gb;
/*
1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
2. Добавьте зависимости org.apache.commons:commons-lang3:3.14.0 и com.google.code.gson:gson:2.10.1.
3. Создайте класс Person с полями firstName, lastName и age.
4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.
 */

public class Main {
    public static void main(String[] args) {

        // Сериализация
        Person person = new Person("Иван", "Петров", 30);
        String json = person.toJson();
        System.out.println(json);

        // Десериализация
        Person newPerson = Person.fromJson(json);
        System.out.println(newPerson.getName());
        System.out.println(newPerson.getAge());
    }
}