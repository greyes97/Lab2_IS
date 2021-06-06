package gt.edu.umg.calculadora.grafica;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculateController {
    @RequestMapping(value = "/graphic", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/graph.html";
    }
}
