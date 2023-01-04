package br.com.rodrigoaralmeida.examples.configclient01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/props")
public class ClientApiController {
    private AppProperties appProperties;

    public ClientApiController(AppProperties appProperties){
        this.appProperties = appProperties;
    }
    
    @GetMapping("/name")
    public String getPropName(){
        log.debug("{}",appProperties);        
        return appProperties.name();

    }

    @GetMapping("/message")
    public String getPropMesage(){        
        log.debug("{}",appProperties);
        return appProperties.message();
    }
    
}
