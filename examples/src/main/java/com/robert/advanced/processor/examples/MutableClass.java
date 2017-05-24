package com.robert.advanced.processor.examples;

import com.robert.advanced.processor.Immutable;

@Immutable
public class MutableClass {
    private String name;
    
    public MutableClass( final String name ) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
