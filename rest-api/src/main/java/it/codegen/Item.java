package it.codegen;

import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;

/*
 * Copyright (c) 2017. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 
 * Created by ishara on 6/9/2017 3:42 PM
 */
public class Item extends ResourceSupport
{
    String code;
    String name;

    public Item()
    {
    }

    public Item( String code, String name )
    {
        this.code = code;
        this.name = name;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode( String code )
    {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }
}
