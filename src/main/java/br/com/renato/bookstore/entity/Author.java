package br.com.renato.bookstore.entity;

import javax.persistence.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private Integer age;
}