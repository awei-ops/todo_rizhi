package com.example.tododemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootTest
class TodoDemoApplicationTests {

    @Test
    void contextLoads() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new Time(System.currentTimeMillis()));
        System.out.println(time);
    }

}
