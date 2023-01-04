# example-config-server
Exemplo uso de servidor de configuração spring

Servidor de configuração
Após iniciar o servidor poderá verificar as configurações disponíveis acessando:
URL DEV: http://localhost:8888/config-server-app/dev
URL HM: http://localhost:8888/config-server-app/hm
URL PD: http://localhost:8888/config-server-app/pd
URL Padrão: http://localhost:8888/config-server-app/pd

Aplicação cliente
Para verificar qual a configuração está sendo usada acesse: http://localhost:8080/api/props/name
Para mudar a configuração mude no applicação o profile, exemplo: 

--Obter do ambiente de desenvolvimento
spring:  
  cloud:
    config:
    profile: dev

--Obter do ambiente de homologação
spring:  
  cloud:
    config:
    profile: hm

--Obter do ambiente de produção
spring:  
  cloud:
    config:
    profile: pd

