package phonebill;

public class Main {
    public static void main(String[] args) {
        PhoneBill bill = new PhoneBill();
        bill.setAllottedMinutes(1000);
        bill.setMinutesUsed(1500);
        bill.printItemizedBill();
    }
}
