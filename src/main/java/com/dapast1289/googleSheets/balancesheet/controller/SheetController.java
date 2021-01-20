package com.dapast1289.googleSheets.balancesheet.controller;

import com.dapast1289.googleSheets.balancesheet.dto.request.UserTimeRequest;
import com.dapast1289.googleSheets.balancesheet.entity.UserTimeEntity;
import com.dapast1289.googleSheets.balancesheet.service.UserTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1.0")
public class SheetController {

    @Autowired
    private UserTimeService userTimeService;

    @PostMapping(value = "useTime")
    public ResponseEntity<String> keepNewToken(@RequestBody UserTimeRequest userTimeRequest) {
        userTimeService.recordUserTime(userTimeRequest);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "useTime")
    public ResponseEntity<List<UserTimeEntity>> get() {
        return new ResponseEntity<>(userTimeService.getAll(), HttpStatus.OK);
    }
}
