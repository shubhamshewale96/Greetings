package com.h2database.Model;

import javax.persistence.*;

@Entity
@Table(name = "greeting_tb")
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting() {

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
