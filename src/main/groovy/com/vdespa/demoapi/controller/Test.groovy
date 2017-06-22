package com.vdespa.demoapi.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Test {
    @RequestMapping('api/test')
    def show() {
        return new Person(name: 'Bob');
    }

    class Person {
        String name
    }
}
