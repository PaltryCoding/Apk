import org.joda.time.DateTime;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        DateTime time = new DateTime();
        int month = time.getMonthOfYear();
        int day = time.getDayOfWeek();
        System.out.println("Miesiac: " + Month.ToText(month));
        System.out.println("Jest " + Day.ToText(day));
        JOptionPane.showMessageDialog(null,"Dzisiaj jest " + Day.ToText(day) + Month.ToText(month));
    }



}
