public abstract class Figure {
    private String name;
    private int operand1;
    private int operand2;
 /*
    Figure(String name, int operand1) {
        this(name, operand1, 0);
    }

    Figure(String name, int operand1, int operand2) {
        this.name = name;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public void makeFigure() {
        System.out.println("The figure is:" + name+". Operand1:"+operand1+". Operand2:"+operand2);
    }
}
