package com.winkey.eventviewer.controller;

import com.winkey.eventviewer.dto.BaseResponse;
import com.winkey.eventviewer.dto.HomeDto;
import com.winkey.eventviewer.dto.UserDTO;
import com.winkey.eventviewer.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Venkatesh Rajendran
 * @vendor (Ideas2IT)
 */

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    public ResponseEntity<BaseResponse> registration(){
        BaseResponse<HomeDto> response = homeService.getData();
        return response.asResponseEntity();
    }
}
