package com.yang.demo.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RouteController {
    @ResponseBody
    @GetMapping("/getRouteInfo")
    public Map<String,String> getRouteInfo(@RequestParam(value = "userId") String userId, @RequestHeader HttpHeaders httpHeaders){
        Map<String,String> result = new HashMap<>();

        result.put("from","威海");
        result.put("to","上饶");
        result.put("flight", "MU5542");
        result.put("client","zhangsan");

        return result;
    }
}
