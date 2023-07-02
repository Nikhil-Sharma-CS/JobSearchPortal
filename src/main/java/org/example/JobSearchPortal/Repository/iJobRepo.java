package org.example.JobSearchPortal.Repository;


import jakarta.transaction.Transactional;
import org.example.JobSearchPortal.Model.Job;
import org.example.JobSearchPortal.Model.JobType;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface iJobRepo extends CrudRepository<Job, Long> {

    //Custom finders------------------------------------------------------------------------------------
    Job findByid(Long Id);

    List<Job> findByJobType(JobType jobType);

    List<Job> findBySalary(Double salary);

    List<Job> findByLocation(String location);

    //Custom Queries------------------------------------------------------------------------------------

    @Modifying
    @Transactional
    @Query(value = "update Jobs set SALARY = :Salary where ID = :Id", nativeQuery = true)
    void updateSalary(Long Id, Double Salary);

    @Modifying
    @Transactional
    @Query(value = "update Jobs set LOCATION = :Location where ID = :Id", nativeQuery = true)
    void updateLocation(Long Id, String Location);

    @Modifying
    @Transactional
    @Query(value = "delete from Jobs where COMPANY_NAME = :companyName", nativeQuery = true)
    void deleteByCompanyName(String companyName);

    @Modifying
    @Transactional
    @Query(value = "delete from Jobs where TITLE = :Title", nativeQuery = true)
    void deleteByTitle(String Title);

}
