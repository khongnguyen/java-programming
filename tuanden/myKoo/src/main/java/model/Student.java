package model;

import exceptions.*;

public class Student {
    private String code;
    private String name;
    private String age;
    private eGender gender;
    private double mark;

    public Student() {
    }

    public Student(String code, String name, String age, eGender gender, double mark) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mark = mark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws TooLongException, TooShortException, WrongNameFomatException {
        int size = name.length();
        if (checkName(name))
            throw new WrongNameFomatException("ten ko dk la so");
        if(size > 25)
            throw new TooLongException("do dai qua lon");
        else if(size < 2)
            throw new TooShortException("do dai chua dat");
        else
            this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) throws TooOldException, TooYoungException {
        int a = Integer.parseInt(age);
        if (a > 50)
            throw new TooOldException("do tuoi vuot qua");
        else if(a < 8)
            throw new TooYoungException("do tuoi qua tre");
        else
            this.age = age;
    }

    public eGender getGender() {
        return gender;
    }

    public void setGender(eGender gender) throws GenderException {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    boolean checkName(String name){
        try{
            Double.parseDouble(name);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }

    }
    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender=" + gender +
                ", mark=" + mark +
                '}';
    }
}
