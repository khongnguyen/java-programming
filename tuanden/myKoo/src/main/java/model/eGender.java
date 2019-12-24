package model;

public enum  eGender {
    FEMALE(0), MALE(1);
    private int code;

    eGender(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
