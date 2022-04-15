package com.sahan.configconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sahan.configconsumer.model.MenberProfileConfiguration;
@Component
public class ProfileController {

	 @Autowired
	 MenberProfileConfiguration memberProfileConfiguration;
	
	 

	    @RequestMapping("/profile")
	    public String getConfig(Model model){

	        model.addAttribute("model",memberProfileConfiguration.getDefaultModel());
	        model.addAttribute("min",memberProfileConfiguration.getMinRentPeriod());
	        return "mprofile";

	    }
	
}
