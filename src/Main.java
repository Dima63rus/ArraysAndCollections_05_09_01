import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
/*
   ���� �������
      ��������� �������� �� ���������� TreeSet.
   ��� ����� �������
      1.	�������� ���������, � ������� ����� ��������� �������� ������� ����������� �����.
          ������ ����� ��������� ����� ������� �������� ADD � �������� ���� ������ �������� LIST.
      2.	��������� ������ ��������� ������������ �������� email��� � �������� ���������
          �� ������ ��� �������������.
   ������� ������ ������
      �	LIST � ������� ������ ����������� �������.
      �	ADD � ��������� �, ���� ������ ������ ������, ��������� � ���������.

   ������� ������
      �	LIST
      �	ADD hello@skillbox.ru

   ������� �������� ����� ������� ������������� � �������.
*/
        final String LC_LIST = "LIST";
        final String LC_ADD = "ADD";

        Scanner loScanner = new Scanner(System.in);
        String lvTextBlock = """
                ������� ������� �� ������:
                         LIST (������� ������ ����������� �������)
                         ADD email(��������� ������ ������, ��������� � ���������) 
                """;
        System.out.println(lvTextBlock);
        String loScannerLine = loScanner.nextLine();

        //����� ������� ����� = �������
        String[] ltWordsFromScanner = loScannerLine.split("\\s+");
        String lvFirstWordFromScanner = ltWordsFromScanner[0];

        //������ ������� email
        TreeSet<String> ltEmailList = new TreeSet<>();
        ltEmailList.add("Dmitriy.Matveev89@inbox.ru");
        ltEmailList.add("Natalia.Zanozina@mail.ru");
        ltEmailList.add("Ilya.Zanozin@yandex.ru");

        //������� ��������� ������
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