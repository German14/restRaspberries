package com.Dev2qa.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.Dev2qa.example.entity.UserAccount;

	
public interface userAccountRepository extends CrudRepository<UserAccount, Long> {
	 /*
     * Get user list by user name. Please note the format should be
     * findBy<column_name>.
     */
    List<UserAccount> findByUserName(String userName);
    /*
     * Get user list by user name and password. Please note the format should be
     * findBy<column_name_1>And<column_name_2>.
     */
    List<UserAccount> findByUserNameAndPassword(String userName, String password);
    @Transactional
    void deleteByUserNameAndPassword(String userName, String password);

    @Transactional
    void deleteByUserName(String userName);

}
