package org.example.JobSearchPortal.Controller;

import jakarta.validation.Valid;
import org.example.JobSearchPortal.Model.Job;
import org.example.JobSearchPortal.Model.JobType;
import org.example.JobSearchPortal.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class JobController {

    @Autowired
    JobService jobService;

    //-----------------------------------------------------------------------------------------------------
    //crud operations using inbuilt @CrudRepo methods,

    @GetMapping("getByCrudRepo")
    public Iterable<Job> getByCrudRepo()
    {
        return jobService.getByCrudRepo();
    }

    @DeleteMapping("deleteByCrudRepo/{Id}")
    public String deleteByCrudRepo(@PathVariable Long Id)
    {
        return jobService.deleteByCrudRepo(Id);
    }

    @PostMapping("addByCrudRepo")
    public String addByCrudRepo(@RequestBody @Valid List<Job> Jobs)
    {
        return jobService.addByCrudRepo(Jobs);
    }

    @PutMapping("updateDescriptionByCrudRepo/{Id}/{description}")
    public String updateDescriptionByCrudRepo(@PathVariable Long Id, @PathVariable String description)
    {
        return jobService.updateDescriptionByCrudRepo(Id, description);
    }
    //-------------------------------------------------------------------------------------------------

    //custom get methods using your own custom finders
    @GetMapping("getByIdFinder/{Id}")
    public Job getByIdFinder(@PathVariable Long Id)
    {
        return jobService.getByIdFinder(Id);
    }

    @GetMapping("getByTypeFinder/{Type}")
    public List<Job> getByTypeFinder(@PathVariable JobType Type)
    {
        return jobService.getByTypeFinder(Type);
    }

    @GetMapping("getBySalaryFinder/{Salary}")
    public List<Job> getBySalaryFinder(@PathVariable Double Salary)
    {
        return jobService.getBySalaryFinder(Salary);
    }

    @GetMapping("getByLocationFinder/{location}")
    public List<Job> getByLocationFinder(@PathVariable String location)
    {
        return jobService.getByLocationFinder(location);
    }

    //---------------------------------------------------------------------------------------------------

    //write operations (update and delete) using Custom queries (using @Query)
    @PutMapping("updateBySalaryQuery/{Id}/{salary}")
    public String updateBySalaryQuery(@PathVariable long Id, @PathVariable Double salary)
    {
        return jobService.updateBySalaryQuery(Id, salary);
    }

    @PutMapping("updateByLocationQuery/{Id}/{location}")
    public String updateByLocationQuery(@PathVariable long Id, @PathVariable String location)
    {
        return jobService.updateByLocationQuery(Id, location);
    }

    @DeleteMapping("deleteByCompanyNameQuery/{companyName}")
    public String deleteByCompanyNameQuery(@PathVariable String companyName)
    {
        return jobService.deleteByCompanyNameQuery(companyName);
    }

    @DeleteMapping("deleteByTitleQuery/{Title}")
    public String deleteByTitleQuery(@PathVariable String Title)
    {
        return jobService.deleteByTitleQuery(Title);
    }

}
