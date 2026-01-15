public class Restraurant{
        static double bill(double[] items){
            double amount = 0;
            for(double item : items){
                amount+=item;
            }
            return amount;
        }


        static double bill(double[] items, boolean serviceCharge){
            double amount = bill(items);
            if(serviceCharge=true){
                double sc = amount*0.05;
                amount+=sc;
            }
            return amount;
        }
        static double bill(double[] items, boolean serviceCharge, double tipPercent){
            double amount = bill(items, serviceCharge);
            double tipAmountAdd = amount * tipPercent/100;
            return tipAmountAdd;
        }
    public static void main(String[] args){
        double[] items = {250, 180, 420};
        boolean serviceCharge = true;
        
        double tipPercent = 10;
            int baseAmount = (int)bill(items);
            System.out.println("Base = " + baseAmount);
            double base = bill(items);
            double serviceChargeBase = bill(items,serviceCharge);
            System.out.println("Service Charge = " + (serviceChargeBase-base) + " --> " + serviceChargeBase);
            double tipAmountAdd = bill(items, true, 10);
            System.out.println("Tip " + tipPercent + "% = " + tipAmountAdd);

            double total =  tipAmountAdd + serviceChargeBase;
            System.out.println("Final = " + total);


    }
}