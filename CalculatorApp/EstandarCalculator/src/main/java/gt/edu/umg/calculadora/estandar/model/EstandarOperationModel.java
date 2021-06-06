package gt.edu.umg.calculadora.estandar.model;

public class EstandarOperationModel {
    private String operation;
    private int a;
    private int b;

    public EstandarOperationModel() {
    }

    public EstandarOperationModel(String operation) {
        this.operation = operation;
    }

    public EstandarOperationModel(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

}
