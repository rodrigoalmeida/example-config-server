package br.com.rodrigoaralmeida.examples.configclient01;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
@RefreshScope

@ConfigurationProperties("app")
public record AppProperties(String name, String message){}