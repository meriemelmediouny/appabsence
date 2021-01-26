package org.example.DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.Model.ApprenantAbsente;
import org.example.Model.Secretaire;
import org.example.MysqlConnect.Connexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SecretaireDaoImp  extends ApprenantAbsente implements SecretaireDao {

    Statement statement=null;

    public SecretaireDaoImp(String nometprenom, String email, String type_absence, String lajustification) {
        super(nometprenom, email, type_absence, lajustification);
    }


    @Override
    public List<Secretaire> getAll() throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public Secretaire getById(int id) throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public Secretaire sauveSecretaire(String full_name, String email, String password) throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public void updateSecretaire(int id, String full_name, String email, String password) throws ClassNotFoundException, SQLException {

    }

    @Override
    public void deleteById(int id_user) throws ClassNotFoundException, SQLException {

    }

    @Override
    public void UpdateJustification(String justification, String full_name) {

    }
}




