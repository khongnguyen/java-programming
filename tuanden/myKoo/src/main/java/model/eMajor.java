package model;

public enum  eMajor {
    MATH(0), LITERARY(1);
    private int code;

    eMajor(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
