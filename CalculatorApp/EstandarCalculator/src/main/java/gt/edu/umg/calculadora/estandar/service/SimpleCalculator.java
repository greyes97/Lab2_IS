package gt.edu.umg.calculadora.estandar.service;

import gt.edu.umg.calculadora.estandar.model.EstandarOperationModel;
import org.springframework.stereotype.Service;

@Service
public class SimpleCalculator {

    public int add(EstandarOperationModel model){
        return model.getA() + model.getB();
    }
    public int substract(EstandarOperationModel model){
        return model.getA()-model.getB();
    }
    public float divide(EstandarOperationModel model){
        return model.getA()/model.getB();
    }
    public int multiply(EstandarOperationModel model){
        return model.getA()*model.getB();
    }
    public double frac(EstandarOperationModel model){
        return 1/(double)model.getA();
    }
    public double sqr(EstandarOperationModel model){
        return Math.sqrt(model.getA());
    }
    public double exp(EstandarOperationModel model){
        return Math.pow(model.getA(),model.getB());
    }
    /*public int mem1(int a, int b){}
    public int mem2(int a, int b){}
    public int clearMem(int a, int b){}*/

}
