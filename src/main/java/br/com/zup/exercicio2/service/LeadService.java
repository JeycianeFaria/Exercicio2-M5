package br.com.zup.exercicio2.service;

import br.com.zup.exercicio2.dtos.LeadDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {

    private List<LeadDto> leads = new ArrayList<>();


    public void verificarEmail(String email){
        for (LeadDto referencia:leads) {
            if (referencia.getEmail().equals(email)){
                throw new RuntimeException("Email já cadastrado");
            }
        }
    }

    public void cadastrarLead(LeadDto lead){
        verificarEmail(lead.getEmail());
        leads.add(lead);
    }

}
