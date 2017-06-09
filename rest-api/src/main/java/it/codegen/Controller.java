package it.codegen;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/*
 * Copyright (c) 2017. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 
 * Created by ishara on 6/9/2017 3:38 PM
 */
@RestController
public class Controller
{

    @RequestMapping(method = RequestMethod.GET, value = {"/item"})
    public ResponseEntity<Item> item(  )
    {
        Item item = new Item( "1", "One" );
        item.add( linkTo( methodOn( Controller.class ).itemDetails() ).withSelfRel() );
        return new ResponseEntity<>(item, HttpStatus.OK );
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/itemDetails"})
    public ResponseEntity<Item> itemDetails(  )
    {
        return new ResponseEntity<>( new Item("1","One"), HttpStatus.OK );
    }
}
