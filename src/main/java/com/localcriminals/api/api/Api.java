package com.localcriminals.api.api;

import com.localcriminals.api.model.Criminal;
import com.localcriminals.api.service.CriminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/api/v1")
@Controller
public class Api {

    private CriminalService criminalService;

    @Autowired
    public Api(CriminalService criminalService) {
        this.criminalService = criminalService;
    }

    @PostMapping("/criminal")
    @ResponseBody
    public Criminal add(@RequestBody Criminal criminal){
        return criminalService.add(criminal);
    }

    @GetMapping("/criminal/{id}")
    @ResponseBody
    public Criminal getById(@PathVariable("id") int id){
        return criminalService.getById(id);
    }

    @GetMapping("/criminal")
    @ResponseBody
    public List<Criminal> getById(){
        return criminalService.getAll();
    }

    @PatchMapping("/criminal")
    @ResponseBody
    public Criminal update(@RequestBody Criminal criminal){
        return criminalService.update(criminal);
    }

    @DeleteMapping("/criminal/{id}")
    @ResponseBody
    public Boolean delete(@PathVariable("id") int id){
        return criminalService.delete(id);
    }




}
