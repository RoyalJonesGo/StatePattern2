public class IdleState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected.");
        machine.setState(new ItemSelectedState());
    }
    public void insertCoin(VendingMachine machine) {
        System.out.println("Cannot insert coin. Select an item first.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Cannot dispense. Select an item and insert a coin first.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}