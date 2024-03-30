package com.jiayi.reggie;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
public class TestUpload {

    @Test
    public void test1(){
        File file = new File("D:\\img\\");
        if ( ! file.exists()){
            file.mkdirs();
        }
    }


}
