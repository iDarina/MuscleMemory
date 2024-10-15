package phonebill;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill() {

    }

    public PhoneBill(int id) {
        this.id = id;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage() {
        if (minutesUsed > allottedMinutes) {
            int extraMinutes = minutesUsed - allottedMinutes;
            double ratePerMinute = 0.25;
            return extraMinutes * ratePerMinute;
        }else {
            return 0;
        }
    }


    public double calculateTax() {
        double taxRate = 0.15; // 15% tax
        return (baseCost + calculateOverage()) * taxRate;
    }

    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill() {
        System.out.println("Phone Bill ID: " + id);
        System.out.println("Base Cost: " + baseCost);
        System.out.println("Overage: " + calculateOverage());
        System.out.println("Tax: " + calculateTax());
        System.out.println("Total: " + calculateTotal());
    }
}

