package gt.edu.umg.calculadora.scientificCalculator.service;

import gt.edu.umg.calculadora.scientificCalculator.model.ScientificOperationModel;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.springframework.stereotype.Service;

@Service
public class ScientificCalculator {

    public double pi(ScientificOperationModel model){
        return Math.PI;
    }
    public double exp(ScientificOperationModel model){
        System.out.println(Math.pow(model.getA(),2));
        return Math.pow(model.getA(),2);
    }
    public double abs(ScientificOperationModel model){
        return Math.abs(model.getA());
    }
    public double mod(ScientificOperationModel model){
        return model.getA() % model.getB();
    }
    public long fact(ScientificOperationModel model){
       return CombinatoricsUtils.factorial(model.getA());
    }
    public double log(ScientificOperationModel model){
        return Math.log10(model.getA());
    }
    public double logNatural(ScientificOperationModel model){
        return Math.log(model.getA());
    }
}

