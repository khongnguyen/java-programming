package model;

import exceptions.GenderException;

public class MathematicsStudent extends Student {

    public MathematicsStudent() {
    }
    public MathematicsStudent(String code, String name, String age, eGender gender, double mark) {
        super(code, name, age, gender, mark);
    }

    @Override
    public void setGender(eGender gender) throws GenderException {
        super.setGender(gender);
        if(gender == eGender.FEMALE)
            throw new GenderException("gioi tinh cho MathematicsStudent sai");
    }
}
