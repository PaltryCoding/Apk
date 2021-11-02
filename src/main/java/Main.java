import org.joda.time.DateTime;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        DateTime time = new DateTime();
        int month = time.getMonthOfYear();
        int day = time.getDayOfWeek();
        JOptionPane.showMessageDialog(null, "Dzisiaj jest " + time.getDayOfMonth() + " " + Month.ToText(month) + ". Mamy " + Day.ToText(day));
    }



}
