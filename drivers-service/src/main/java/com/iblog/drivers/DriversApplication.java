package com.iblog.drivers;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Drivers Service",
                version = "1.0",
                description = "Drivers-service API",
                contact = @Contact(url = "https://lancexlab.cn", name = "Lance xu", email = "13554225105@163.com")
        )
)
public class DriversApplication {
    public static void main(String[] args) {
        Micronaut.run(DriversApplication.class);
    }
}
