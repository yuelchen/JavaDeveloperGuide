package Main;

import Factory.BasicPackage;
import Factory.LuxuryPackage;
import Factory.Premium1Factory;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args){
        BasicPackage basic = new BasicPackage();
        double basicTotal = basic.getUtility("electric").calculateBill() + basic.getUtility("internet").calculateBill() + basic.getUtility("water").calculateBill() + basic.getUtility("trash").calculateBill() + basic.getUtility("sewage").calculateBill();
        System.out.println("Jamie is straight out of college and choose the basic utility package, of which her electric was '$" + basic.getUtility("electric").calculateBill() +
                "', internet was '$" + basic.getUtility("internet").calculateBill() + "', water was '$" + basic.getUtility("water").calculateBill() + "'" +
                "with a fixed non-negotiable price for trash and sewage of '$" + basic.getUtility("trash").calculateBill() + "' and '$" + basic.getUtility("sewage").calculateBill() +
                "' respectively; totalling to '$" + new BigDecimal(basicTotal).setScale(2, RoundingMode.HALF_UP) + "'\n");

        LuxuryPackage luxury = new LuxuryPackage();
        double luxuryTotal = luxury.getUtility("electric").calculateBill() + luxury.getUtility("internet").calculateBill() + luxury.getUtility("water").calculateBill() + luxury.getUtility("trash").calculateBill() + luxury.getUtility("sewage").calculateBill();
        System.out.println("Henry has been working really hard the last few year and opted for the luxurious utility package as a reward, of which his electric was '$" + luxury.getUtility("electric").calculateBill() +
                "', internet was '$" + luxury.getUtility("internet").calculateBill() + "', water was '$" + luxury.getUtility("water").calculateBill() + "'" +
                "with a fixed non-negotiable price for trash and sewage of '$" + luxury.getUtility("trash").calculateBill() + "' and '$" + luxury.getUtility("sewage").calculateBill() +
                "' respectively; totalling to '$" + new BigDecimal(luxuryTotal).setScale(2, RoundingMode.HALF_UP) + "'\n");

        double difference = luxuryTotal - basicTotal;
        System.out.println("When Henry talked to his friend Jamie about his bill, he was shocked ot find out the difference was '$" + difference + "'. After talking to the support team about this being out of his budget, he was able to downgrade to the premium package.\n");

        Premium1Factory premium = new Premium1Factory();
        double premiumTotal = premium.getUtility("electric").calculateBill() + premium.getUtility("internet").calculateBill() + premium.getUtility("water").calculateBill() + premium.getUtility("trash").calculateBill() + premium.getUtility("sewage").calculateBill();
        System.out.println("After switching, Henry's electric was '$" + premium.getUtility("electric").calculateBill() +
                "', internet was '$" + premium.getUtility("internet").calculateBill() + "', water was '$" + premium.getUtility("water").calculateBill() + "'" +
                "with a fixed non-negotiable price for trash and sewage of '$" + premium.getUtility("trash").calculateBill() + "' and '$" + premium.getUtility("sewage").calculateBill() +
                "' respectively; totalling to '$" + new BigDecimal(premiumTotal).setScale(2, RoundingMode.HALF_UP) + "'\n");

        double newDifference = premiumTotal - basicTotal;
        double savingsFromChange = luxuryTotal - premiumTotal;

        System.out.println("Althought Henry is still paying more than Jamie for his utilities - by '$" + new BigDecimal(newDifference).setScale(2, RoundingMode.HALF_UP) + "', he is satisfied with saving '$" + new BigDecimal(savingsFromChange).setScale(2, RoundingMode.HALF_UP) + "' when comparing against the luxurious package.");
    }
}
