package gt.edu.umg.calculadora.estandar.controller;

import gt.edu.umg.calculadora.estandar.model.EstandarOperationModel;
import gt.edu.umg.calculadora.estandar.service.SimpleCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EstandarCalculatorController {
    EstandarOperationModel operationModel = new EstandarOperationModel();

    @Autowired
    private SimpleCalculator calculateSimple;

    @RequestMapping("/estandar")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return "calculator";
    }

    @RequestMapping(value="/estandar", params="add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel")  EstandarOperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.add(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/estandar", params="substract", method = RequestMethod.POST)
    public String substract(@ModelAttribute("operationModel")  EstandarOperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.substract(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/estandar", params="multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("operationModel")  EstandarOperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.multiply(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/estandar", params="divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("operationModel")  EstandarOperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.divide(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/estandar", params="frac", method = RequestMethod.POST)
    public String frac(@ModelAttribute("operationModel")  EstandarOperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.frac(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/estandar", params="sqrt", method = RequestMethod.POST)
    public String sqrt(@ModelAttribute("operationModel")  EstandarOperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.sqr(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/estandar", params="exp", method = RequestMethod.POST)
    public String exp(@ModelAttribute("operationModel")  EstandarOperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.exp(operationModel));
        return "calculator";
    }

}
