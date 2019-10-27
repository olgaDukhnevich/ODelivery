package com.netcracker.edu.nc2019team2.delivery.controler;

import com.netcracker.edu.nc2019team2.delivery.database.entity.Client;
import com.netcracker.edu.nc2019team2.delivery.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    ClientService clientService;

    @RequestMapping("/greeting")
    public Client greeting(@RequestParam(value = "id", defaultValue = "1") String id) {
        return clientService.getClientByID(id);
    }
}
