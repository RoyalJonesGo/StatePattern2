public class DispensingState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Cannot select item. Dispensing in progress.");
    }
    public void insertCoin(VendingMachine machine) {
        System.out.println("Cannot insert coin. Dispensing in progress.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing item...");
        machine.setState(new IdleState());
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Cannot set out of order while dispensing.");
    }
}