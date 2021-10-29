package br.com.zup.exercicio2.service;

import br.com.zup.exercicio2.dtos.LeadDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {

    private List<LeadDto> leads = new ArrayList<>();



    public void verificarEmail(String email){
        for (LeadDto referencia:leads) {
            if (referencia.getEmail().equals(email)){
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY,"Email já cadastrado");
            }
        }
    }

    public void cadastrarLead(@RequestBody LeadDto lead){
        verificarEmail(lead.getEmail());
        leads.add(lead);
    }

    public List<LeadDto> leadsCadastrados(){
        return leads;
    }

    public LeadDto buscarLead(String email){
        for (LeadDto referencia:leads) {
            if (referencia.getEmail().equals(email)){
                return referencia;
            }
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Não encontrado");
    }

}
