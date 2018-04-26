package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
@Api(value = "Description of demoController")
public class DemoController {
    @GetMapping
    @ApiOperation(value = "returns a string")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100 , message = "this is 100 code"),
                    @ApiResponse(code = 150 , message = "this is 150 code")
            }
    )
    public String getMethod()
    {
        return "i am a get method";
    }
    @PostMapping("/post")
    public String postMethod(@RequestBody final String requestBody){
        return "i am post method" + requestBody;
    }

    @PutMapping("/put")
    public String putMethod(@RequestBody final String requestBody){
        return "i am put method" + requestBody;
    }
}
