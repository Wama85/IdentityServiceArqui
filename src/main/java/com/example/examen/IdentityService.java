package com.example.examen;

import java.util.ArrayList;
import java.util.List;

public class IdentityService {

    private static final List<Integer> listaCi = new ArrayList<>();
    static {
        listaCi.add(1);
        listaCi.add(2);
    }


    public boolean verifyExistence(int id) {
        return listaCi.contains(id);
    }
}
