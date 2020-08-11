package com.localcriminals.api.service.impl;

import com.localcriminals.api.model.Criminal;
import com.localcriminals.api.repository.CriminalRepository;
import com.localcriminals.api.service.CriminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CriminalServiceImpl implements CriminalService {

    private CriminalRepository criminalRepository;

    @Autowired
    public CriminalServiceImpl(CriminalRepository criminalRepository) {
        this.criminalRepository = criminalRepository;
    }

    @Override
    public Criminal add(Criminal criminal) {
        return criminalRepository.save(criminal);
    }

    @Override
    public Criminal getById(int id) {
        try{
            return criminalRepository.findById(id).get();
        }catch (NoSuchElementException e){
            System.out.println(e);
            return null;
        }
    }


    @Override
    public Criminal update(Criminal criminal) {
        return criminalRepository.save(criminal);
    }

    @Override
    public Boolean delete(int id) {
        try {
            criminalRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Criminal> getAll() {
        return criminalRepository.findAll();
    }
}
