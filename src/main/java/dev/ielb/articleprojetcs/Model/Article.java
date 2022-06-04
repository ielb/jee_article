package dev.ielb.articleprojetcs.Model;

import java.util.Objects;

public class Article {
    private String code ;
    private  String designation;
    private  float prix;

    public  Article(){ }
    public  Article(String code){
     this.code = code;
    }
    public  Article(String code,String designation,float prix){
      this.code = code;
      this.designation = designation;
      this.prix = prix;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Article) return  ((Article)o).code.equals(code);
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, designation, prix);
    }
}
