package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class DateController {
    private Date getDate(){
        Date now = new Date();
        return now;
    }
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
    @RequestMapping("/date")
        public String date(Model viewmodel) {
            viewmodel.addAttribute("datetime", getDate());
            return "date";
        }
        @RequestMapping("/time")
        public String time(Model viewmodel){
            viewmodel.addAttribute("datetime", getDate());
            return "time";
        }

}
