package com.dapast1289.googleSheets.balancesheet.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1.0")
//@Api(value = "${api-version}", tags = "BTI vendor")
public class SheetController {

//    @Autowired
//    private BTIService btiService;
//
    @PutMapping(value = "useTime")
    public ResponseEntity<String> keepNewToken(String version, String sheetId) {
//        btiService.keepNewToken(request);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
