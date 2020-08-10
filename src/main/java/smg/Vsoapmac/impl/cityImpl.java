package smg.Vsoapmac.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smg.Vsoapmac.bean.city;
import smg.Vsoapmac.service.cityService;

import java.util.List;

@Service("cityImpl")
public class cityImpl implements cityService {

    @Autowired
    private smg.Vsoapmac.mapper.cityMapper cityMapper;

    @Override
    public List<city> findAll() {
        return cityMapper.findAll();
    }

    @Override
    public city find(int id) {
        return cityMapper.find(id);
    }

    @Override
    public void insert(city info) {
        cityMapper.insert(info);
    }

    @Override
    public void update(city info) {
        cityMapper.update(info);
    }

    @Override
    public void delete(int id) {
        cityMapper.delete(id);
    }
}
