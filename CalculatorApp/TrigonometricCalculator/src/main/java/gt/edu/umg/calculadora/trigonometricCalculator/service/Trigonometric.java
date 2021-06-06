package gt.edu.umg.calculadora.trigonometricCalculator.service;

import gt.edu.umg.calculadora.trigonometricCalculator.model.TrigonometricOperationModel;
import org.springframework.stereotype.Service;

@Service
public class Trigonometric {
    public double sin(TrigonometricOperationModel model){
        return Math.sin(model.getA());
    }
    public double cos(TrigonometricOperationModel model){
        return Math.cos(model.getA());
    }
    public double tan(TrigonometricOperationModel model){
        return Math.tan(model.getA());
    }
    public double sec(TrigonometricOperationModel model){
        return 1/Math.cos(model.getA());
    }
    public double cosec(TrigonometricOperationModel model){
        return 1/Math.sin(model.getA());
    }
    public double cotg(TrigonometricOperationModel model){
        return 1/Math.tan(model.getA());
    }
}
