# Job Search Portal

This is the code for Job Search Portal which uses various types of **Validation** for **Spring Boot**.
This also uses **H2 database** and **JPA** for as data source

- **Validation** : These are the types of annotation which are used to validate data to a certain type.


## 🚀 About Me
Hi, My name is Nikhil Sharma,

I'm a full stack developer trainee at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA, SpringBoot.


## Data Flow

### Controller
-   This section contains a class named JobController which uses functions as mentioned below :

       #### 1. @GetMapping("getByCrudRepo")
       #### 2. @DeleteMapping("deleteByCrudRepo/{Id}")
       #### 3. @PostMapping("addByCrudRepo")
       #### 4. @PutMapping("updateDescriptionByCrudRepo/{Id}/{description}")
       #### 5. @GetMapping("getByIdFinder/{Id}")
       #### 6. @GetMapping("getByTypeFinder/{Type}")
       #### 7. @GetMapping("getBySalaryFinder/{Salary}")
       #### 8. @GetMapping("getByLocationFinder/{location}")
       #### 9. @PutMapping("updateBySalaryQuery/{Id}/{salary}")
       #### 10. @PutMapping("updateByLocationQuery/{Id}/{location}")
       #### 11. @DeleteMapping("deleteByCompanyNameQuery/{companyName}")
       #### 12. @DeleteMapping("deleteByTitleQuery/{Title}")

### Services
-   This section contains a class JobService with functions that helps API to perform their specific tasks : 

    #### 1. Iterable<Job> getByCrudRepo() 
    #### 2. String deleteByCrudRepo(Long id)
    #### 3. String addByCrudRepo(List<Job> jobs)
    #### 4. String updateDescriptionByCrudRepo(Long Id, String description)
    #### 5. Job getByIdFinder(Long id)
    #### 6. List<Job> getByTypeFinder(JobType type)
    #### 7. List<Job> getBySalaryFinder(Double salary)
    #### 8. List<Job> getByLocationFinder(String location)
    #### 9. String updateBySalaryQuery(long id, Double salary)
    #### 10. String updateByLocationQuery(long id, String location)
    #### 11. String deleteByCompanyNameQuery(String companyName)
    #### 12. String deleteByTitleQuery(String title)
    

###  Repository
-   This section contains a **Interface** named iJobRepo which extends the **CRUDRepository** of JPA which defines various funtionality of interface and by extension via object of this interface we can access CRUDRepository methods to provide funtionality to our project.

    #### 1. private List<User>

### Database Design
- In this section we used a Job class which is used as a table to store data.
- It also uses H2 database and JPA to create datastructure.


## Data Structure Used

- We used **H2 database** along with **JPA** as the data source in this project.
- H2 database is a temporary **In-Memory** database. Which stores data in structured format(In form of tables and databases).
- The data created in this is temporary and is lost as soon as the program is terminated.
## Summary

This project performs the task of managing user data with various types of API's like **Get, Post, Put, Delete**.

This project shows the implementation of various types of **validations** that are used in **SpringBoot**. Such as **Size()**, **NotNull()**, **Pattern()**, etc.

We used **MVC Architecture** to create this project. 
And this is created in **SpringBoot** using **Maven** and **Java**.


## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)
