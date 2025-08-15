package Lectures.L01WorkingWithAbstractions.HotelReservetation_04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

           String[] data = scanner.nextLine().split("\\s+");

            double price = Double.parseDouble(data[0]);
            int days = Integer.parseInt(data[1]);
            String seasonEnum = data[2];
            String discount = data[3];

            Season season = Season.valueOf(seasonEnum.toUpperCase(Locale.ROOT));
            DiscountType discountType = DiscountType.NONE;
            if(discount.equals("VIP")){
                discountType = DiscountType.VIP;
            } else if (discount.equals("SecondVisit")) {
                discountType = DiscountType.SECOND_VISIT;
            }
            double finalrice = price*days*season.getMultiplayer()*discountType.getPercent();
            System.out.printf("%.2f",finalrice);
    }
}
