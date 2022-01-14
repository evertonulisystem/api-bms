package br.cassi.apibms.controller;

import br.cassi.apibms.models.LGPD;
import br.cassi.apibms.services.LGPDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api")
public class LGPDController{

    @Autowired
    public LGPDService lgpdService;

    @GetMapping(name = "/lgpd")
    public


    }


}
