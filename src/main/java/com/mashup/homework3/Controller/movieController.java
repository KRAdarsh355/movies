package com.mashup.homework3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
 public class movieController {

    @GetMapping("/show")
    public String show(Model m) {
    	
        String name = "FightClub";
        String firstLine="Fight Club is a 1999 American film directed by David Fincher starring Brad Pitt, Edward Norton, "
        		+ "and Helena Bonham Carter.";
        boolean loginStatus= true;
        m.addAttribute("name", name);
        m.addAttribute("firstline",firstLine);
        m.addAttribute("logg",loginStatus);
        
        return "moviee";
    }
    
}