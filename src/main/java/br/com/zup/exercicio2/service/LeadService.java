package br.com.zup.exercicio2.service;

import br.com.zup.exercicio2.dtos.LeadDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {

    private List<LeadDto> leads = new ArrayList<>();


    public void cadastrarLead(LeadDto lead){
        leads.add(lead);
    }

}
