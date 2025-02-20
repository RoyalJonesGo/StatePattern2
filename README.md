# StatePattern2

<p><b>Problem:</b></p>  

<p>A vending machine needs to manage different states, including <b>"Idle", "ItemSelected", "Dispensing", and "OutOfOrder"</b>.  
Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like  
<b>item inventory</b> and <b>balance</b>.</p>  

<p><b>Requirements:</b></p>  

<p><b>Idle State:</b></p>  
<p>- Allow item selection.</p>  
<p>- Disallow dispensing items and inserting coins.</p>  

<p><b>ItemSelected State:</b></p>  
<p>- Allow inserting coins and dispensing items.</p>  
<p>- Disallow item selection.</p>  

<p><b>Dispensing State:</b></p>  
<p>- Allow no operations.</p>  
<p>- Automatically transition back to the "Idle" state after dispensing is complete.</p>  

<p><b>OutOfOrder State:</b></p>  
<p>- Disallow all operations.</p>  

<p><b>Current System:</b></p>  
<p>The system currently relies on <b>conditional statements within the VendingMachine class</b> to check the machine state and determine  
valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.</p>  

<hr>  

<p><b>Implement the State Pattern to Improve Code Maintainability and Flexibility:</b></p>  

<p><b>1. Define VendingMachine States:</b></p>  
<p>- Create separate classes representing different machine states:</p>  
<p>&nbsp;&nbsp;&nbsp;&nbsp; - <b>IdleState</b></p>  
<p>&nbsp;&nbsp;&nbsp;&nbsp; - <b>ItemSelectedState</b></p>  
<p>&nbsp;&nbsp;&nbsp;&nbsp; - <b>DispensingState</b></p>  
<p>&nbsp;&nbsp;&nbsp;&nbsp; - <b>OutOfOrderState</b></p>  

<p><b>2. Implement State Interface:</b></p>  
<p>- Define an interface <b>VendingMachineState</b> with methods for common actions like:</p>  
<p>&nbsp;&nbsp;&nbsp;&nbsp; - <code>selectItem()</code></p>  
<p>&nbsp;&nbsp;&nbsp;&nbsp; - <code>insertCoin()</code></p>  
<p>&nbsp;&nbsp;&nbsp;&nbsp; - <code>dispenseItem()</code></p>  
<p>&nbsp;&nbsp;&nbsp;&nbsp; - <code>setOutOfOrder()</code></p>  

<p><b>3. Implement State Behaviors:</b></p>  
<p>- Each concrete state class implements the <b>VendingMachineState</b> interface, providing specific behavior for its respective state.</p>  
<p>- Example:</p>  
<p>&nbsp;&nbsp;&nbsp;&nbsp; - The <b>IdleState</b> class allows item selection.</p>  
<p>&nbsp;&nbsp;&nbsp;&nbsp; - The <b>OutOfOrderState</b> class doesn't allow any operations.</p>  

<p><b>4. Update VendingMachine Class:</b></p>  
<p>- Include attributes for <b>item inventory</b> and <b>balance</b>.</p>  
<p>- Remove state-specific logic from the <b>VendingMachine</b> class.</p>  
<p>- Introduce a reference to the <b>current VendingMachineState</b> object.</p>  
<p>- Delegate actions (<code>selectItem()</code>, <code>insertCoin()</code>, <code>dispenseItem()</code>, <code>setOutOfOrder()</code>)  
to the current state object through its corresponding methods.</p>  

