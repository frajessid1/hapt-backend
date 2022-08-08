package com.hapt.hapt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PagesController {
    @RequestMapping(value = "/inscription", method = RequestMethod.GET)
    public ModelAndView loginPage() {
        ModelAndView modelAndViewLogin = new ModelAndView();
        modelAndViewLogin.setViewName("inscription");
        return modelAndViewLogin;
    }
    @RequestMapping(value = "/inscr-formation", method = RequestMethod.GET)
    public ModelAndView formationPage() {
        ModelAndView modelAndViewLogin = new ModelAndView();
        modelAndViewLogin.setViewName("inscr-formation");
        return modelAndViewLogin;
    }
    @RequestMapping(value = "/formation-achat-vente",method = RequestMethod.GET)
    public String formationAchatVente(){

        return "formation-achat-vente";
    }
    @RequestMapping(value = "/contact",method = RequestMethod.GET)
    public String getContact(){

        return "contact";
    }
    @RequestMapping(value = "/formation-bureautique",method = RequestMethod.GET)
    public String getBureautique(){
        return "formation-bureautique";
    }
    @RequestMapping(value = "/formation-comptabilite-sousse",method = RequestMethod.GET)
    public String getCompta(){

        return "formation-comptabilite-sousse";
    }
    @RequestMapping(value = "/formation-dev-perso",method = RequestMethod.GET)
    public String getDevPERSO(){
        return "formation-dev-perso";
    }
    @RequestMapping(value = "/formation-infographie-sousse",method = RequestMethod.GET)
    public String getInforgrqphie(){
        return "formation-infographie-sousse";
    }
    @RequestMapping(value = "/formation-inter",method = RequestMethod.GET)
    public String getInter(){
        return "formation-inter-sousse.html";
    }
    @RequestMapping(value = "/formation-interII",method = RequestMethod.GET)
    public String getInterII(){
        return "formation-inter-II";
    }
    @RequestMapping(value = "/formation-intra",method = RequestMethod.GET)
    public String getIntra(){
        return "formation-intra-sousse";
    }
    @RequestMapping(value = "/formation-intra-II",method = RequestMethod.GET)
    public String getIntraII(){
        return "formation-intra-II";
    }
    @RequestMapping(value = "/formation-management",method = RequestMethod.GET)
    public String getManagement(){
        return "formation-management";
    }
    @RequestMapping(value = "/formation-marketing",method = RequestMethod.GET)
    public String getMarketing(){
        return "formation-marketing";
    }
    @RequestMapping(value = "/formation-organisation",method = RequestMethod.GET)
    public String getOrganisation(){
        return "formation-organisation";
    }
    @RequestMapping(value = "/formation-qualite",method = RequestMethod.GET)
    public String getQualite(){
        return "formation-qualite";
    }
    @RequestMapping(value = "/formation-ressource",method = RequestMethod.GET)
    public String getRessource(){
        return "formation-ressources";
    }
    @RequestMapping(value = "/formation-sante",method = RequestMethod.GET)
    public String getSante(){
        return "formation-sante";
    }
    @RequestMapping(value = "/formation-logistic",method = RequestMethod.GET)
    public String getLogistic(){
        return "formation-logistique";
    }
    @RequestMapping(value = "/comingsoon",method = RequestMethod.GET)
    public String getComingsoon(){
        return "comingsoon";
    }
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String getIndex(){
        return "index";
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String getLogin(){
        return "login";
    }


}
