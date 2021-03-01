package timeanddate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateDemo2 {

    public static void main(String[] args) {

        Date date = new Date();
        DateFormat formatdate = new SimpleDateFormat("dd/MM/YYYY");

        String currentDate = formatdate.format(date);
        System.out.println("Current Date: " + currentDate);

    }

}
