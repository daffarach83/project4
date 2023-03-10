package pojo;
// Generated Oct 15, 2022 12:07:25 AM by Hibernate Tools 4.3.1


import dao.movDAO;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import util.fdoUtil;

/**
 * Movies generated by hbm2java
 */

@ManagedBean (name = "fdo")
public class Movies  implements java.io.Serializable {


     private Integer id;
     private String title;
     private String ytlink;
     private String genre;
     private Date rdate;
     private String language;
     private String casts;
     private String director;
     private String production;
     private String tempimg;
     
    public List<Movies> getAllMov() {
        movDAO lib = new movDAO();
        List<Movies> listMov = lib.rtvMov();
        return listMov;
    }
    
    public String goBack(){
     id = null; title = ""; ytlink = ""; genre = ""; rdate = null; language = ""; casts = ""; director = ""; production = "";
       return "dashboard";
    }

    public String deleteMov(int ids) {
        movDAO mov = new movDAO();
        mov.deleteMovie(ids);
     id = null; title = ""; ytlink = ""; genre = ""; rdate = null; language = ""; casts = ""; director = ""; production = "";
        return "dashboard";
    }
    public String getById(int ids) {
        id = ids;
        String idLib = Integer.toString(ids);
        movDAO mov = new movDAO();
        List<Movies> listMov = mov.getbyID(idLib);
        try {
            if (!listMov.isEmpty()) {
                title = listMov.get(0).title; tempimg=listMov.get(0).ytlink; ytlink = "https://www.youtube.com/watch?v="+listMov.get(0).ytlink; genre = listMov.get(0).genre; rdate = listMov.get(0).rdate; language = listMov.get(0).language; casts = listMov.get(0).casts; director = listMov.get(0).director; production = listMov.get(0).production;
                return "editor";
            }else{
              return "dashboard";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "dashboard";
    }

        public String saveMov() {
        fdoUtil sch = new fdoUtil();
        String validation = sch.inputValid(title, ytlink, casts, director, production);
            if (!validation.isEmpty()) {
            title = ""; ytlink = ""; genre = ""; rdate = null; language = ""; casts = ""; director = ""; production = "";
            return "dashboard"; 
            } else {
            String video_id = ytlink.replace("https://www.youtube.com/watch?v=", "");
            ytlink = video_id;
            movDAO mov = new movDAO();
            mov.addMovie(this);
            title = ""; ytlink = ""; genre = ""; rdate = null; language = ""; casts = ""; director = ""; production = "";
            }
        return "dashboard";   
    }
        
    public String editMov() {
        fdoUtil sch = new fdoUtil();
        String validation = sch.inputValid(title, ytlink, casts, director, production);
            if (!validation.isEmpty()) {
            tempimg = ""; title = ""; ytlink = ""; genre = ""; rdate = null; language = ""; casts = ""; director = ""; production = "";
            return "dashboard"; 
            } else { 
            String video_id = ytlink.replace("https://www.youtube.com/watch?v=", "");
            ytlink = video_id;
            movDAO mov = new movDAO();
            mov.editMovie(this);
            tempimg = "";title = ""; ytlink = ""; genre = ""; rdate = null; language = ""; casts = ""; director = ""; production = "";
        }      
        return "dashboard"; 
    }
     
     

    public Movies() {
    }

    public Movies(String title, String ytlink, String genre, Date rdate, String language, String casts, String director, String production) {
       this.title = title;
       this.ytlink = ytlink;
       this.genre = genre;
       this.rdate = rdate;
       this.language = language;
       this.casts = casts;
       this.director = director;
       this.production = production;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getYtlink() {
        return this.ytlink;
    }
    
    public void setYtlink(String ytlink) {
        this.ytlink = ytlink;
    }
    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Date getRdate() {
        return this.rdate;
    }
    
    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getCasts() {
        return this.casts;
    }
    
    public void setCasts(String casts) {
        this.casts = casts;
    }
    public String getDirector() {
        return this.director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    public String getProduction() {
        return this.production;
    }
    
    public void setProduction(String production) {
        this.production = production;
    }
    
    public String getTempimg() {
        return this.tempimg;
    }
    
    public void setTempimg(String tempimg) {
        this.tempimg = tempimg;
    }
}


