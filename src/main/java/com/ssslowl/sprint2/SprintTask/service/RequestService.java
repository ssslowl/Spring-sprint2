package com.ssslowl.sprint2.SprintTask.service;



import com.ssslowl.sprint2.SprintTask.entity.ApplicationRequest;
import com.ssslowl.sprint2.SprintTask.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;


    public List<ApplicationRequest> getRequests(){return  requestRepository.findAll();}

    public List<ApplicationRequest> getHandledRequests(){
        return requestRepository.FindAllByHandled(true);
    }

    public List<ApplicationRequest> getUnhandledRequests(){
        return requestRepository.FindAllByHandled(false);
    }


    public ApplicationRequest addRequest(ApplicationRequest request){
        return  requestRepository.save(request);
    }

    public ApplicationRequest getRequestById(long id){
        return requestRepository.getById(id);
    }

    public void deleteRequest(long id){
        requestRepository.deleteById(id);
    }


}
