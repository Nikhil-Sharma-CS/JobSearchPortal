# Job Search Portal

This is the code for Job Search Portal which uses various types of **Validation** for **Spring Boot**.
This also uses **H2 database** and **JPA** for as data source

- **Validation** : These are the types of annotation which are used to validate data to a certain type.


## 🚀 About Me
*Hi, My name is Nikhil Sharma*,

I'm a full stack developer trainee at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA, SpringBoot.


# Data Flow

## Controller
*   *This section contains a class named JobController which uses functions as mentioned below :*

       * @GetMapping("getByCrudRepo")
       * @DeleteMapping("deleteByCrudRepo/{Id}")
       * @PostMapping("addByCrudRepo")
       * @PutMapping("updateDescriptionByCrudRepo/{Id}/{description}")
       * @GetMapping("getByIdFinder/{Id}")
       * @GetMapping("getByTypeFinder/{Type}")
       * @GetMapping("getBySalaryFinder/{Salary}")
       * @GetMapping("getByLocationFinder/{location}")
       * @PutMapping("updateBySalaryQuery/{Id}/{salary}")
       * @PutMapping("updateByLocationQuery/{Id}/{location}")
       * @DeleteMapping("deleteByCompanyNameQuery/{companyName}")
       * @DeleteMapping("deleteByTitleQuery/{Title}")

## Services
*   *This section contains a class JobService with functions that helps API to perform their specific tasks :*

    * Iterable<Job> getByCrudRepo() 
    * String deleteByCrudRepo(Long id)
    * String addByCrudRepo(List<Job> jobs)
    * String updateDescriptionByCrudRepo(Long Id, String description)
    * Job getByIdFinder(Long id)
    * List<Job> getByTypeFinder(JobType type)
    * List<Job> getBySalaryFinder(Double salary)
    * List<Job> getByLocationFinder(String location)
    * String updateBySalaryQuery(long id, Double salary)
    * String updateByLocationQuery(long id, String location)
    * String deleteByCompanyNameQuery(String companyName)
    * String deleteByTitleQuery(String title)
    
## Model
- *This section contains a model of type Job, which uses various data members to define its properties. And when the table of jobs will be created these will be columns.*

##  Repository
-   *This section contains a **Interface** named iJobRepo which extends the **CRUDRepository** of JPA which defines various funtionality of interface and by extension via object of this interface we can access CRUDRepository methods to provide funtionality to our project.*

## Database Design
- *In this section we used a Job class which is used as a table to store data.*
- *It also uses H2 database and JPA to create datastructure.*


## Data Structure Used
- *We used **H2 database** along with **JPA** as the data source in this project*.
- *H2 database is a temporary **In-Memory** database. Which stores data in structured format(In form of tables and databases)*.
- *The data created in this is temporary and is lost as soon as the program is terminated*.
 
## Summary

*This project performs the task of managing Job data with various types of API's like **Get, Post, Put, Delete**.*

*This project shows the implementation of various types of **validations** that are used in **SpringBoot**. Such as **Size()**, **NotNull()**, **Pattern()**, etc.*

*We used **MVC Architecture** to create this project. 
And this is created in **SpringBoot** using **Maven** & **Java**.*


## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)
