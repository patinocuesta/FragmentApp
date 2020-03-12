package com.example.fragmentapp.model.DAO;

import com.example.fragmentapp.model.Log;

import java.util.ArrayList;
import java.util.List;

public class LogDAO implements DAO {
    private List<String> logsList = new ArrayList<>();
    @Override
    public List getAll() {
        return logsList;
    }

    @Override
    public void insertLog (Log l) {
        logsList.add(l.toString());
    }

    @Override
    public void delete(int id) {
        logsList.remove(id);
    }


}
