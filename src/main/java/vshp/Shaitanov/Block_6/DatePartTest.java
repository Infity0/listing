package vshp.Shaitanov.Block_6;

import java.util.Date;

public class DatePartTest {
    public static void main(String[] args) {

        Date currentDate = new Date();
        DatePart dp = new DatePart(currentDate);
        int month = dp.getMonth();

        System.out.println("Текущий месяц: " + month);
    }
}

