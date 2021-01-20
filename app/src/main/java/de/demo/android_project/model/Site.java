package de.demo.android_project.model;

public class Site {
    private int id , codePostale ;
    private float longitude , latitude ;
    private String adress , rue , ville, contact , telecontact;

    public Site(int id, int codePostale, float longitude, float latitude, String adress, String rue, String ville, String contact, String telecontact) {
        this.id = id;
        this.codePostale = codePostale;
        this.longitude = longitude;
        this.latitude = latitude;
        this.adress = adress;
        this.rue = rue;
        this.ville = ville;
        this.contact = contact;
        this.telecontact = telecontact;
    }

    public Site(String key, String codepostalesite, String longitudesite, String latitudesite, String s, String villesite, String contactsite, String telcontactsite) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(int codePostale) {
        this.codePostale = codePostale;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelecontact() {
        return telecontact;
    }

    public void setTelecontact(String telecontact) {
        this.telecontact = telecontact;
    }
}
