import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
/*
   Цель задания
      Научиться работать со множеством TreeSet.
   Что нужно сделать
      1.	Напишите программу, в которой будет храниться перечень адресов электронной почты.
          Адреса можно добавлять через консоль командой ADD и печатать весь список командой LIST.
      2.	Программа должна проверять корректность вводимых email’ов и печатать сообщение
          об ошибке при необходимости.
   Принцип работы команд
      •	LIST — выводит список электронных адресов.
      •	ADD — проверяет и, если формат адреса верный, добавляет в множество.

   Примеры команд
      •	LIST
      •	ADD hello@skillbox.ru

   Команды вводятся одной строкой пользователем в консоль.
*/
        final String LC_LIST = "LIST";
        final String LC_ADD = "ADD";

        Scanner loScanner = new Scanner(System.in);
        String lvTextBlock = """
                Введите команду из списка:
                         LIST (Выводит список электронных адресов)
                         ADD email(Проверяет формат адреса, добавляет в множество) 
                """;
        System.out.println(lvTextBlock);
        String loScannerLine = loScanner.nextLine();

        //Поиск первого слова = команда
        String[] ltWordsFromScanner = loScannerLine.split("\\s+");
        String lvFirstWordFromScanner = ltWordsFromScanner[0];

        //Список вручную email
        TreeSet<String> ltEmailList = new TreeSet<>();
        ltEmailList.add("Dmitriy.Matveev89@inbox.ru");
        ltEmailList.add("Natalia.Zanozina@mail.ru");
        ltEmailList.add("Ilya.Zanozin@yandex.ru");

        //Создать экземпляр класса
        Commands loCommands = new Commands();

        //LIST
        if (lvFirstWordFromScanner.equals(LC_LIST)) {
            loCommands.executeList(ltEmailList);
        }
        //ADD
        if (lvFirstWordFromScanner.equals(LC_ADD)) {
            loCommands.executeAdd(ltEmailList, ltWordsFromScanner);
        }
    }
} 