public class VendingMachine {
    private VendingMachineState currentState;
    
    public VendingMachine() {
        this.currentState = new IdleState();
    }
    
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }
    
    public void selectItem() {
        currentState.selectItem(this);
    }
    
    public void insertCoin() {
        currentState.insertCoin(this);
    }
    
    public void dispenseItem() {
        currentState.dispenseItem(this);
    }
    
    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }
}