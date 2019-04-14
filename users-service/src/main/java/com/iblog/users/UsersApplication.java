package com.iblog.users;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info = @Info(
        title = "Users Service",
        version = "1.0",
        description = "Users-service API",
        contact = @Contact(url = "https://lancexlab.cn", name = "Lance xu", email = "13554225105@163.com")
    )
)
public class UsersApplication {
    public static void main(String[] args) {
        Micronaut.run(UsersApplication.class);
    }
}
