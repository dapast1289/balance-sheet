package com.dapast1289.googleSheets.balancesheet.service;

import com.dapast1289.googleSheets.balancesheet.dto.request.UserTimeRequest;
import com.dapast1289.googleSheets.balancesheet.entity.UserTimeEntity;
import com.dapast1289.googleSheets.balancesheet.repository.UserTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserTimeService {

    @Autowired
    private UserTimeRepository userTimeRepository;

    public void recordUserTime(UserTimeRequest request) {
        UserTimeEntity entity = new UserTimeEntity();
        entity.setSheetId(request.getSheetId());
        entity.setSheetVersion(request.getSheetVersion());
        entity.setCreateTime(new Date());
        userTimeRepository.save(entity);
    }

    public List<UserTimeEntity> getAll() {
        return userTimeRepository.findAll();
    }
}
