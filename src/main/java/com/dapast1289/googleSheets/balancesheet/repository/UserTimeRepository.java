package com.dapast1289.googleSheets.balancesheet.repository;

import com.dapast1289.googleSheets.balancesheet.entity.UserTimeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserTimeRepository extends MongoRepository<UserTimeEntity, String> {

}