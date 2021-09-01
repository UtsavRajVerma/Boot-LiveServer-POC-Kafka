package com.extramarks.DeptServiceKafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Controller {
    @Value("${app.service-name}")
    private String serviceName;

    @GetMapping("/service")
    public String getServiceName() {
        return "service name-> [" + this.serviceName + "]";
    }
}
