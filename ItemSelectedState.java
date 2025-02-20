public class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Insert a coin.");
    }
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted.");
        machine.setState(new DispensingState());
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert coin before dispensing.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}