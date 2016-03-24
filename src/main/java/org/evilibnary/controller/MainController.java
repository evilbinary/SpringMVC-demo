package org.evilibnary.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;


@Controller
public class MainController {



    @RequestMapping("test")
    public String test(ModelMap modelMap){
        try {

            for (Resource r : new PathMatchingResourcePatternResolver().getResources("classpath:")){
                System.out.println("The real path is : "+r.getFile().getAbsolutePath());
                modelMap.addAttribute("message",r.getFile().getAbsolutePath() );

            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return "test";
    }
}
