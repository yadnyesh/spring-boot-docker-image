package yb.yadnyesh.springbootdockerimage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerImageController {

    @GetMapping("/")
    public String getMapping(){
        return "Running from Docker container";
    }
}
