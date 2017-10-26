/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milou;

import generated.Chien;
import generated.Personne;
import java.io.FileInputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Mushu
 */
public class Milou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        JAXBContext jc = JAXBContext.newInstance("generated");
        Unmarshaller u = jc.createUnmarshaller();
        Chien mimi = (Chien) u.unmarshal(new FileInputStream("D:\\GoogleDrive\\EPSI.Montpellier.2017\\WebServices\\CodeJava\\Milou\\Files\\milou.xml"));
        System.out.println("nom du chien :" + mimi.getNom());
        Personne mait = mimi.getMaitre();
        System.out.println("nom du maitre :" + mait.getNom());
        System.out.println("adresse du maitre : " + mait.getAdresse());
        System.out.println("nombre de puces = " + mimi.getPuces());
    }

}
