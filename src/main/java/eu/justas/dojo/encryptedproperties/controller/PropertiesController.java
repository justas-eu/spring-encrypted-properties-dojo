package eu.justas.dojo.encryptedproperties.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class PropertiesController {
    @Value("${encrypted.property}")
    private String encrypted;

    @GetMapping
    public String getEncrypted() {
        return encrypted;
    }
}
