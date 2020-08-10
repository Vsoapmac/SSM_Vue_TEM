package smg.Vsoapmac.mapper;

import smg.Vsoapmac.bean.city;

import java.util.List;

public interface cityMapper {
    List<city> findAll();
    city find(int id);
    void insert(city info);
    void update(city info);
    void delete(int id);
}
