package dev.ielb.articleprojetcs.DAO;

import dev.ielb.articleprojetcs.Model.Article;

import java.util.ArrayList;
import java.util.List;

public class DaoArticle {
    static List<Article> lesArticles = new ArrayList<Article>();


    public static  void initialize(){
        lesArticles.add(new Article("Art 1", "Article1",120));

        lesArticles.add(new Article("Art 2", "Article2",100));

        lesArticles.add(new Article("Art 3", "Article3",190));
    }

    public  static  void create(Article art){
        lesArticles.add(art);
    }

    public  static  List<Article> getAll(){
        return  lesArticles;
    }

    public  static  Article getArticle(String code){
        Article art = new Article(code);
        int i  = lesArticles.indexOf(art);
       return lesArticles.get(i);
    }


    public static void  updateArticle(Article art){
        int i  = lesArticles.indexOf(art);
        lesArticles.get(i).setDesignation(art.getDesignation());
        lesArticles.get(i).setPrix(art.getPrix());
    }

    public  static  void deleteArticle(Article art ){
        int i = lesArticles.indexOf(art);
        if(i!=-1){
            lesArticles.remove(i);
        }
    }
 }
