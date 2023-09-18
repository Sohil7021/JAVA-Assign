import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class even_day_party {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = 2023;
        int monthValue = Month.AUGUST.getValue();

        int count = 0;

        LocalDate startDate = LocalDate.of(year,monthValue,1);
        LocalDate endDate = startDate.plusMonths(1).minusDays(1);
       while (!startDate.isAfter(endDate)) {
           if (startDate.getDayOfMonth() % 2 == 0){
               count++;
           }
           startDate = startDate.plusDays(1);
       }

        System.out.println("The even days goes party:- " + count);

    }
}
