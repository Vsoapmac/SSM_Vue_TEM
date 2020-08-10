package smg.Vsoapmac.service;

import smg.Vsoapmac.bean.city;

import java.util.List;

public interface cityService {
    List<city> findAll();
    city find(int id);
    void insert(city info);
    void update(city info);
    void delete(int id);
}
