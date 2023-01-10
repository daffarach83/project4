/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Staff;
import util.fdoUtil;
/**
 *
 * @author Farhan
 */
public class staffDAO {
        public List<Staff> getBy(String uEmail, String uPass) {
        Transaction trans = null;
        Staff st = new Staff();
        List<Staff> stf = new ArrayList();
        Session session = fdoUtil.getSessionFactory().openSession();
        
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from Staff where username =:usr AND password=:uPwd");
            query.setString("usr", uEmail);
            query.setString("uPwd", uPass);
            st = (Staff) query.uniqueResult();
            stf = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
        return stf;
    }
}
