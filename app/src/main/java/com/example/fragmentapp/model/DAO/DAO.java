package com.example.fragmentapp.model.DAO;

import com.example.fragmentapp.model.Log;

import java.util.ArrayList;
import java.util.List;

public interface DAO<Log> {

    List<com.example.fragmentapp.model.Log> getAll();
    void insertLog (com.example.fragmentapp.model.Log l);
    void delete(int id);

}
