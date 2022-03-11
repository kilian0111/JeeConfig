package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class TrainController extends MultiActionController {

    @RequestMapping("/recap.htm")
    public void recap(){

    }

    @RequestMapping("/calculer.htm")
    public void calculer(){

    }

    @RequestMapping("/lister.htm")
    public void lister(){

    }

}
