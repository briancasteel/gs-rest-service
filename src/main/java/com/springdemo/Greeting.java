package com.springdemo;

/**
 * Created by Brian Casteel on 2/9/2016.
 */
public class Greeting {
    private final long id;

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }

    private final String content;

    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }
}
