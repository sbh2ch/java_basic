package kr.goci.lec;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sonbyeonghwa on 2017. 9. 14..
 */
@RestController
public class HelloWorld {

    @GetMapping("/")
    public ResponseEntity hello() {


        return new ResponseEntity<>("hi", HttpStatus.OK);
    }
}
