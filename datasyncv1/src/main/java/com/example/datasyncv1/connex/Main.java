package com.example.datasyncv1.connex;

import com.example.datasyncv1.dao.*;
import com.example.datasyncv1.interfaces.NotificationRepository;
import com.example.datasyncv1.models.CategorieProduit;
import com.example.datasyncv1.models.Notification;
import com.example.datasyncv1.models.ProduitCategorie;
import com.example.datasyncv1.models.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{

        Connection con = com.example.datasyncv1.ObjectBdd.ManipDb.pgConnect("postgres","enchere","hasinjaka");
        Connexion con1= new Connexion();
        EnchereDao ed = new EnchereDao();
        int result = ed.AjouterEncher(con1,2,"hhu",3222,22);
        System.out.println(result);
    }
}
