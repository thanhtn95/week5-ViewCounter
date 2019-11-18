package controller;

import model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("counter")
public class CounterController {
    @ModelAttribute("counter")
    public Counter counter(){
        return new Counter();
    }
    @GetMapping("")
    public ModelAndView getIndex(@ModelAttribute("counter") Counter counter){
        counter.increase();
        ModelAndView modelAndView = new ModelAndView("/index");
        return modelAndView;
    }
}
