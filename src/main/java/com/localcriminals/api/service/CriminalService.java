package com.localcriminals.api.service;

import com.localcriminals.api.model.Criminal;
import com.localcriminals.api.model.enums.CriminalAlertLevel;
import com.localcriminals.api.model.enums.CriminalWantedLevel;
import com.localcriminals.api.model.enums.District;
import com.localcriminals.api.model.enums.Province;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CriminalService {
    Criminal add(Criminal criminal);
    Criminal getById(int id);
    Criminal update(Criminal criminal);
    Boolean delete(int id);
    List<Criminal> getAll();
}
