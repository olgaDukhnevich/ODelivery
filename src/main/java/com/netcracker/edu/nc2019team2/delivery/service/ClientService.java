package com.netcracker.edu.nc2019team2.delivery.service;

import com.netcracker.edu.nc2019team2.delivery.database.entity.Client;
import com.netcracker.edu.nc2019team2.delivery.database.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ClientService {
    @Autowired
    ClientRepo clientRepo;

    public Client getClientByID(String id){
        return clientRepo.findClientsById(Integer.parseUnsignedInt(id)).get(0);
    }
}
