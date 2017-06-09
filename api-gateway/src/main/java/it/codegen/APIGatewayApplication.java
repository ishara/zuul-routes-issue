package it.codegen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/*
 * Copyright (c) 2017. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 
 * Created by ishara on 6/9/2017 3:27 PM
 */
@EnableZuulProxy
@SpringBootApplication
public class APIGatewayApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run( APIGatewayApplication.class, args );
    }
}
