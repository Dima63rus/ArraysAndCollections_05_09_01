import java.util.TreeSet;

public class Commands {
    final String MC_STR_NULL = " ";

    /* Выводит список электронных адресов */
    public void executeList(TreeSet<String> itEmailList) {
        for (String lvEmail : itEmailList) {
            System.out.println(lvEmail);
        }
    }

    /* Проверяет формат адреса, добавляет в множество */
    public void executeAdd(TreeSet<String> itEmailList,
                           String[] ltWordsFromScanner) {
        try {
            String lvEmailUnCheck = ltWordsFromScanner[1].trim();
            //Проверяет формат адреса
            if (!checkAdress(lvEmailUnCheck)) {
                System.out.println("Некорректный email: " + lvEmailUnCheck);
            }
            //Добавить в множество
            itEmailList.add(lvEmailUnCheck);

            System.out.println("email добавлен: " + lvEmailUnCheck + "\n");

            //Показать весь лист
            executeList(itEmailList);
        } catch (ArrayIndexOutOfBoundsException lxE) {
            System.out.println("Пустой email");
            System.exit(0);
        }
    }

    private Boolean checkAdress(String ivEmailUnCheck) {
        if (ivEmailUnCheck.contains(MC_STR_NULL)) {
            return false;
        }
        if (!ivEmailUnCheck.matches(".+@.+\\.[a-z]+")) {
            return false;
        }
//        if (ivEmailUnCheck.contains(MC_STR_NULL) || ivEmailUnCheck.matches(".+@.+\\.[a-z]+")) {
//            return false;
//        }
        return true;
    }
}