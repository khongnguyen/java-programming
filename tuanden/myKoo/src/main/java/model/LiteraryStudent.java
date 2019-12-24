package model;

import exceptions.GenderException;

public class LiteraryStudent extends Student {

    public LiteraryStudent() {
    }

    public LiteraryStudent(String code, String name, String age, eGender gender, double mark) {
        super(code, name, age, gender, mark);
    }

    @Override
    public void setGender(eGender gender)throws GenderException {
        super.setGender(gender);
        if(gender == eGender.MALE)
            throw new GenderException("gioi tinh cho LiteraryStudent sai");
    }
}
