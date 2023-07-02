package org.example.JobSearchPortal.Service;

import org.example.JobSearchPortal.Model.Job;
import org.example.JobSearchPortal.Model.JobType;
import org.example.JobSearchPortal.Repository.iJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    iJobRepo iJobRepo;

    //CrudRepoMethods-----------------------------------------------------------------------

    public Iterable<Job> getByCrudRepo() {
        return iJobRepo.findAll();
    }

    public String deleteByCrudRepo(Long id) {
        iJobRepo.deleteById(id);
        return "Deleted";
    }

    public String addByCrudRepo(List<Job> jobs) {
        iJobRepo.saveAll(jobs);
        return "Added";
    }

    public String updateDescriptionByCrudRepo(Long Id, String description) {
        Optional<Job> jobs = iJobRepo.findById(Id);
        Job job = null;

        if(jobs.isPresent())
        {
            job = jobs.get();
        }
        else
        {
            return "Job not found";
        }

        job.setDescription(description);
        iJobRepo.save(job);
        return "Job Description Updated";
    }

    //CustomFinderMethods--------------------------------------------------------------------

    public Job getByIdFinder(Long id) {
        return iJobRepo.findByid(id);
    }

    public List<Job> getByTypeFinder(JobType type) {
        return iJobRepo.findByJobType(type);
    }


    public List<Job> getBySalaryFinder(Double salary) {
        return iJobRepo.findBySalary(salary);
    }

    public List<Job> getByLocationFinder(String location) {
        return iJobRepo.findByLocation(location);
    }


    //Custom Query Methods--------------------------------------------------------------------

    public String updateBySalaryQuery(long id, Double salary) {
        iJobRepo.updateSalary(id, salary);
        return "Salary Updated";
    }

    public String updateByLocationQuery(long id, String location) {
        iJobRepo.updateLocation(id, location);
        return "Location Updated";
    }

    public String deleteByCompanyNameQuery(String companyName) {
        iJobRepo.deleteByCompanyName(companyName);
        return "Deleted Job by Company Name";
    }

    public String deleteByTitleQuery(String title) {
        iJobRepo.deleteByTitle(title);
        return "Deleted Job by Title";
    }

    //-------------------------------------------------------------------------------------------------
}
