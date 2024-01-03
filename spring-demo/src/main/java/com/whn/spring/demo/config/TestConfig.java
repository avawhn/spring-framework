package com.whn.spring.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ImportSelectorTest.class)
public class TestConfig {

}
