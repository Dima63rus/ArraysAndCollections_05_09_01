import java.util.TreeSet;

public class Commands {
    final String MC_STR_NULL = " ";

    /* ������� ������ ����������� ������� */
    public void executeList(TreeSet<String> itEmailList) {
        for (String lvEmail : itEmailList) {
            System.out.println(lvEmail);
        }
    }

    /* ��������� ������ ������, ��������� � ��������� */
    public void executeAdd(TreeSet<String> itEmailList,
                           String[] ltWordsFromScanner) {
        try {
            String lvEmailUnCheck = ltWordsFromScanner[1].trim();
            //��������� ������ ������
            if (!checkAdress(lvEmailUnCheck)) {
                System.out.println("������������ email: " + lvEmailUnCheck);
            }
            //�������� � ���������
            itEmailList.add(lvEmailUnCheck);

            System.out.println("email ��������: " + lvEmailUnCheck + "\n");

            //�������� ���� ����
            executeList(itEmailList);
        } catch (ArrayIndexOutOfBoundsException lxE) {
            System.out.println("������ email");
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