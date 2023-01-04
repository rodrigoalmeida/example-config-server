# Exemplo de uso de servidor de configuração spring

O servidor de configuração tem três ambientes:
- Desenvolvimento (dev)
- Homologação (hm)
- Produção (pd)

## Servidor de configuração 
Após iniciar o servidor poderá verificar as configurações disponíveis acessando: 
- URL DEV : http://localhost:8888/config-server-app/dev 
- URL HM: http://localhost:8888/config-server-app/hm 
- URL PD: http://localhost:8888/config-server-app/pd 

## Aplicação cliente 
Para verificar qual a configuração está sendo usada acesse: http://localhost:8080/api/props/name 

Para mudar a configuração da aplicação cliente, mude no application.yml o profile  seguindo os exemplos:

- Ambiente de desenvolvimento
```
spring:
  cloud:
    config: 
      profile: dev
```
- Ambiente de homologação 
```
spring:
  cloud:
    config:
      profile: hm
```
- Ambiente de produção
```
spring:
  cloud:
    config:
      profile: pd
```