package de.demo.android_project.model;

public class Client {
    private String id;
    private String name;
    private String adress , Telephone , email;

    public Client(String id, String name, String adress, String telephone, String email) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        Telephone = telephone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getTelephone() {
        return Telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
