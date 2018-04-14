package org.eclipse.che.examples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class GreetingController {

    @RequestMapping("/greet")
    public ModelAndView greet(@RequestParam(value ="user", required =false) String user) {
        String result = "";
        if (user != null) {
            result = "Hello, " + user + "!";
        }

        ModelAndView view = new ModelAndView("hello_view");
        view.addObject("greeting", result);
        return view;
    }
}
