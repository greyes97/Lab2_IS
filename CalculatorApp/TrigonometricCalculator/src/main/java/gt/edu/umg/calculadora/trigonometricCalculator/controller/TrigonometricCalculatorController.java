package gt.edu.umg.calculadora.trigonometricCalculator.controller;

import gt.edu.umg.calculadora.trigonometricCalculator.model.TrigonometricOperationModel;
import gt.edu.umg.calculadora.trigonometricCalculator.service.Trigonometric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TrigonometricCalculatorController {
    TrigonometricOperationModel operationModel = new TrigonometricOperationModel();

    @Autowired
    private Trigonometric trigonometric;

    @RequestMapping("/trigonometric")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return "calculator";
    }

    @RequestMapping(value="/trigonometric", params="sin", method = RequestMethod.POST)
    public String sin(@ModelAttribute("operationModel")  TrigonometricOperationModel operationModel, Model model ){
        model.addAttribute("result", trigonometric.sin(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/trigonometric", params="cos", method = RequestMethod.POST)
    public String cos(@ModelAttribute("operationModel")  TrigonometricOperationModel operationModel, Model model ){
        model.addAttribute("result", trigonometric.cos(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/trigonometric", params="tan", method = RequestMethod.POST)
    public String tan(@ModelAttribute("operationModel")  TrigonometricOperationModel operationModel, Model model ){
        model.addAttribute("result", trigonometric.tan(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/trigonometric", params="sec", method = RequestMethod.POST)
    public String sec(@ModelAttribute("operationModel")  TrigonometricOperationModel operationModel, Model model ){
        model.addAttribute("result", trigonometric.sec(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/trigonometric", params="cosec", method = RequestMethod.POST)
    public String cosec(@ModelAttribute("operationModel")  TrigonometricOperationModel operationModel, Model model ){
        model.addAttribute("result", trigonometric.cosec(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/trigonometric", params="cotg", method = RequestMethod.POST)
    public String cotg(@ModelAttribute("operationModel")  TrigonometricOperationModel operationModel, Model model ){
        model.addAttribute("result", trigonometric.cotg(operationModel));
        return "calculator";
    }
}
