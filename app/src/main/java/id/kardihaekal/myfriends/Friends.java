package id.kardihaekal.myfriends;

import com.google.gson.annotations.SerializedName;

public class Friends {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getProfesi() {
        return profesi;
    }

    public void setProfesi(String profesi) {
        this.profesi = profesi;
    }

    public int getKelamin() {
        return kelamin;
    }

    public void setKelamin(int kelamin) {
        this.kelamin = kelamin;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @SerializedName("id")
    private int id;
    @SerializedName("nama")
    private String nama;
    @SerializedName("hobi")
    private String hobi;
    @SerializedName("profesi")
    private String profesi;
    @SerializedName("kelamin")
    private int kelamin;
    @SerializedName("birth")
    private String birth;
    @SerializedName("picture")
    private String picture;
    @SerializedName("value")
    private String value;
    @SerializedName("message")
    private String massage;}


