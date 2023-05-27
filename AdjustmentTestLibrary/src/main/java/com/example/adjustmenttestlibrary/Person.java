package com.example.adjustmenttestlibrary;

import com.google.gson.annotations.SerializedName;

public class Person {
    @SerializedName("id")
    private Long id;
    @SerializedName("name")
    private String name;
    @SerializedName("lastname")
    private String lastName;
    @SerializedName("age")
    private int age;
    @SerializedName("astrologicalSign")
    private String astrologicalSign;

    public Person(Long id, String name, String lastName, int age, String astrologicalSign) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.astrologicalSign = astrologicalSign;
    }


    public Long getId() {
        return id;
    }

    public Person setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAstrologicalSign() {
        return astrologicalSign;
    }

    public Person setAstrologicalSign(String astrologicalSign) {
        this.astrologicalSign = astrologicalSign;
        return this;
    }
}
