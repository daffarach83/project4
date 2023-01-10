/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Farhan
 */
public class fdoUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
   
    
    	public static HttpSession getSession() {
		return (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
	}

	public static HttpServletRequest getRequest() {
		return (HttpServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest();
	}

	public static String getUserName() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		return session.getAttribute("username").toString();
	}

	public static String getUserId() {
		HttpSession session = getSession();
		if (session != null)
			return (String) session.getAttribute("userid");
		else
			return null;
	}
        
     public String inputValid( String title, String ytlink, String cast, String director, String production){
     ArrayList<String> errList = new ArrayList<>();
     String alert = "";
     
            if (!title.matches("[^<>{}]+") || title.isEmpty()){
            errList.add(" Invalid Title Name ");
            }
            if (!ytlink.matches("https:\\/\\/www\\.youtube\\.com\\/watch\\?v\\=(.*?)") || ytlink.isEmpty()){
            errList.add(" Invalid Youtube Link (Example: https://www.youtube.com/watch?v=XXXXXXXXXXXXXXX ) ");
            }
            if (!cast.matches("[^<>{}]+") || cast.isEmpty()){
            errList.add(" Invalid Cast Name ");
            }
            if (!director.matches("[^<>{}]+") || director.isEmpty()){
            errList.add(" Invalid Director Name ");
            }
            if (!production.matches("[^<>{}]+") || production.isEmpty()){
            errList.add(" Invalid Production House Name ");
            }
           if (!errList.isEmpty()) {
                for (String msg : errList) {
                alert += (" |F|" +msg );
            }
           }  
           return alert;
    }
}
