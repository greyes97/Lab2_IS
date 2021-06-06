package gt.edu.umg.calculadora.scientificCalculator.controller;

import gt.edu.umg.calculadora.scientificCalculator.model.ScientificOperationModel;
import gt.edu.umg.calculadora.scientificCalculator.service.ScientificCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ScientificCalculateController {
    ScientificOperationModel operationModel = new ScientificOperationModel();

    @Autowired
    private ScientificCalculator scientific;

    @RequestMapping("/scientific")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return "calculator";
    }

    @RequestMapping(value="/scientific", params="pi", method = RequestMethod.POST)
    public String pi(@ModelAttribute("operationModel")  ScientificOperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.pi(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/scientific", params="expc", method = RequestMethod.POST)
    public String expc(@ModelAttribute("operationModel")  ScientificOperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.exp(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/scientific", params="abs", method = RequestMethod.POST)
    public String abs(@ModelAttribute("operationModel")  ScientificOperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.abs(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/scientific", params="mod", method = RequestMethod.POST)
    public String mod(@ModelAttribute("operationModel")  ScientificOperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.mod(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/scientific", params="fact", method = RequestMethod.POST)
    public String fact(@ModelAttribute("operationModel")  ScientificOperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.fact(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/scientific", params="log", method = RequestMethod.POST)
    public String log(@ModelAttribute("operationModel")  ScientificOperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.log(operationModel));
        return "calculator";
    }

    @RequestMapping(value="/scientific", params="logn", method = RequestMethod.POST)
    public String logN(@ModelAttribute("operationModel")  ScientificOperationModel operationModel, Model model ){
        model.addAttribute("result", scientific.logNatural(operationModel));
        return "calculator";
    }
}
