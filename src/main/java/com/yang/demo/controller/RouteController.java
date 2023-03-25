package com.yang.demo.controller;


import com.yang.demo.JenkinsConnect;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RouteController {
    @ResponseBody
    @GetMapping("/getRouteInfo")
    public Map<String,String> getRouteInfo(@RequestParam(value = "userId") String userId, @RequestHeader HttpHeaders httpHeaders){

        JenkinsConnect.connection();

        return null;
    }
}
