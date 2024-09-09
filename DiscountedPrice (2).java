import java.util.Scanner;

public class DiscountedPrice {
    // To simulate Truman State University's Bookstore discounts
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isPromoCodeValid = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the promo code: ");
        String promoCode = scanner.next();
        
        if (promoCode.length() == 4 && (promoCode.charAt(0) == 'P') && (promoCode.charAt(1) == 'T') && (promoCode.charAt(2) == 'B')) {
        	isPromoCodeValid = true;
        	System.out.println("Promo code is valid.");
        } else {
        	System.out.println("Promo code is not valid.");
        	System.exit(1);
        }
        
        System.out.println("Enter the original price: ");
        double originalPrice = scanner.nextDouble();
        
        System.out.println("Enter the discount percentage: ");
        int discountPercentage = scanner.nextInt();
        
        double discount = 0;
        if (discountPercentage > 0 && discountPercentage < 100) {
        	discount = originalPrice * (discountPercentage / 100.0);
        } else {
        	System.out.println("discountPercentage is not valid.");
        	System.exit(1);
        }
        
        double discountedPrice = originalPrice - discount;
        
        discountedPrice = Math.round(discountedPrice);
        
        System.out.println("Discounted price: $" + discountedPrice);
        
        scanner.close();
        
        System.exit(0);
	}
}
