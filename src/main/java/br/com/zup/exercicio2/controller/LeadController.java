package br.com.zup.exercicio2.controller;

import br.com.zup.exercicio2.dtos.LeadDto;
import br.com.zup.exercicio2.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadController {

    @Autowired
    private LeadService leadService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarLead(@RequestBody LeadDto lead){
        leadService.cadastrarLead(lead);
    }


    @GetMapping
    public List<LeadDto> exibirLeadsCadastrados(){
        return leadService.leadsCadastrados();
    }

}
