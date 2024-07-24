package com.project.demo.api.controle;

import com.project.demo.api.modelo.Cliente;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.project.demo.api.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class Controle {

    @Autowired
    private Repositorio action;

    @GetMapping("/")
    public Iterable<Cliente> selecionar(){
        return action.findAll();
    }

    @PostMapping("/cadastrar")
    public Cliente cadastrar(@RequestBody Cliente c){
        return action.save(c);
    }

    @PutMapping("/atualizar")
    public Cliente atualizar(@RequestBody Cliente c){
        return action.save(c);
    }

    @DeleteMapping("/remover/{codigo}")
    public void remover(@PathVariable long codigo){
        action.deleteById(codigo);
    }
}
