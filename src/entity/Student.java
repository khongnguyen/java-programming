/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Namcx12
 */
public class Student {
    private int stuId;
    private String stuName;
    private String certificate;

    public Student(int stuId, String stuName, String certificate) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.certificate = certificate;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

   

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return  stuId + "\t\t" + stuName + "\t\t" + certificate;
    }

    
}
