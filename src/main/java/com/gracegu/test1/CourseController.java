package com.gracegu.test1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @RequestMapping("/mycourse")
    public String getCourse() {
        return "My Course";
    }
}
