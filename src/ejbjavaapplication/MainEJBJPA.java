/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbjavaapplication;

import entity.UtilisateurNewEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lapin
 */
public class MainEJBJPA {
    

        public static void main(String[] args) {    
            
//-------- à regrouper dans une methode------------------------------ // 
      //================== CREATE====================================// 
      //================================================================//
            EntityManagerFactory emf;//declaration EntityManagerFactory toujours a faire
            EntityManager em;// declaration EntityManager toujours a faire   
            
            emf = Persistence.createEntityManagerFactory("EJBJavaApplicationPU");
            
            em = emf.createEntityManager();
            
                         //------------------------------------------------------//            
            em.getTransaction().begin();//demarrage de la transaction
            
            UtilisateurNewEntity utilisateurJPA = new UtilisateurNewEntity();
            UtilisateurNewEntity utilisateurJPA1 = new UtilisateurNewEntity();
            
            utilisateurJPA.setNom("Pierre");
            utilisateurJPA.setPrenom("Alain");
            
            utilisateurJPA1.setNom("Elhize");
            utilisateurJPA1.setPrenom("Gomez");
            
            em.persist(utilisateurJPA);
            em.persist(utilisateurJPA1);
            em.getTransaction().commit();
            
            em.close();
        }
        
         //================= FIN DU CREATE=================================== ///
        
        
        //-------------------------------------------------------------------//
        
        //READ //
        
        
}
         
           
            


       
          
      //List<EJBNewEntity> lejBNewEntitys = em.createNamedQuery("EJBNewEntity.findAll",EJBNewEntity.class).getResultList();
             //public Lister( String  ){
//            for (EJBNewEntity eJBNewEntity : listEmp) {
//                System.out.println("ID" + eJBNewEntity.getId());
//                System.out.println("NOM : " + eJBNewEntity.getNom());
//                System.out.println("PRENOM" + eJBNewEntity.getPrenom());
           
                
//}
       
//-------------------------------------------------------------
        //mise en place du CRUD
        // 1)C - Create
        // 2)R - Read
        // 3)U - Update
        // 4)D - Delete
    
        
//--------------Create-------------------------------        
        
            
        

    

