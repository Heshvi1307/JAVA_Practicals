package Discount;

public class DiscountRules {

    public static DiscountRule tenPercentDiscount() {
        return price -> price * 0.90;
    }

    public static DiscountRule twentyPercentDiscount() {
        return price -> price * 0.80;
    }

    public static DiscountRule flatHundredDiscount() {
        return price -> {
            double finalPrice = price - 100;

            if (finalPrice < 0) {
                return 0;
            }

            return finalPrice;
        };
    }

    public static DiscountRule noDiscount() {
        return price -> price;
    }
}