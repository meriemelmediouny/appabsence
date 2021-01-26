package org.example.Model;

public class ApprenantAbsente {

    private String Nometprenom;
    private String Email;
    private String Type_absence;
    private String lajustification;

    public ApprenantAbsente(String nometprenom, String email, String type_absence, String lajustification) {
        Nometprenom = nometprenom;
        Email = email;
        Type_absence = type_absence;
        this.lajustification = lajustification;
    }

    public String getNometprenom() {
        return Nometprenom;
    }

    public void setNometprenom(String nometprenom) {
        Nometprenom = nometprenom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getType_absence() {
        return Type_absence;
    }

    public void setType_absence(String type_absence) {
        Type_absence = type_absence;
    }

    public String getLajustification() {
        return lajustification;
    }

    public void setLajustification(String lajustification) {
        this.lajustification = lajustification;
    }
}