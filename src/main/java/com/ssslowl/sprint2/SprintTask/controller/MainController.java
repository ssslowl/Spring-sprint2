package com.ssslowl.sprint2.SprintTask.controller;



import com.ssslowl.sprint2.SprintTask.entity.ApplicationRequest;
import com.ssslowl.sprint2.SprintTask.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    RequestService requestService = new RequestService();


    @GetMapping("/")
    public String home(Model model){

        List<ApplicationRequest> requests = requestService.getRequests();
        model.addAttribute("requests", requests);

        return "home";
    }

    @GetMapping("/addRequest")
    public String addRequest(){
        return "addRequest";
    }

    @PostMapping("/addRequest")
    public String addRequest(ApplicationRequest applicationRequest){
        requestService.addRequest(applicationRequest);
        return "redirect:/";
    }

    @GetMapping("/handleRequest")
    public String handleRequest(ApplicationRequest request, Model model ){
        request = requestService.getRequestById(request.getId());
        model.addAttribute("request", request);

        return "editRequest";
    }

    @PostMapping("/handleRequest")
    public String handleRequest(ApplicationRequest request){
        request.setHandled(true);
        requestService.addRequest(request);
        return "redirect:/";
    }

    @PostMapping("/deleteRequest")
    public String deleteRequest(ApplicationRequest request){
        requestService.deleteRequest(request.getId());
        return "redirect:/";
    }
}


