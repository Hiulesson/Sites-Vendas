package org.example.service;

import org.example.model.Cliente;
import org.example.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository repository;

    @Autowired
    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.persistir(cliente);

    }

    public void validarCliente(Cliente cliente){
        //Aplicar validações
    }
}
