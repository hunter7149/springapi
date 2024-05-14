package com.springapi.springapi.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.springapi.entity.userInfo;

@RestController
@RequestMapping("/api")
public class userController {

private Map<String, userInfo> userInformationList = new HashMap<>();

@GetMapping("/getAllUser")
public List<userInfo> getAllUser(){
    return new ArrayList<>(userInformationList.values());
}

@PostMapping("/addUser")
public Map<String, String> addUser(@RequestBody userInfo uinfo) {
    Map<String, String> response = new HashMap<>();

    if (uinfo == null) {
        response.put("error", "User information is null");
    } else {
        userInformationList.put("1", uinfo);
        response.put("success", "User information added successfully");
    }

    return response;
}
;

}



