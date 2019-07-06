package com.bbit.controller;


import com.bbit.model.Course;
import com.bbit.model.University;
import com.bbit.repository.UniversityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "university")
public class UniversityController {

    private final UniversityRepository universityRepository;
    private Object courses;

    public UniversityController(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @GetMapping
    private List<University> getAllUniversities() {
        return universityRepository.findAll();
    }
    @PostMapping
    public University createUniversity(@RequestBody University university){
        return universityRepository.save(university);

    }
    @DeleteMapping(value="{id}")
    public void deleteUniversity(@PathVariable Long id){
    universityRepository.deleteById(id);
    }
       @PatchMapping(value="{id}")
       public University updateUniversity(@PathVariable Long id,@RequestBody University university){
    University foundUniversity=findOneById(id);

    foundUniversity.setName(university.getName());
    foundUniversity.setLocation(university.getLocation());


    return universityRepository.save(foundUniversity);
    }
    @GetMapping(value = "{id}")
    private University findOneById(@PathVariable Long id) {
        Optional<University> university = universityRepository.findById(id);

        if (university.isPresent()) {
            return university.get();

        } else

            @PostMapping(value="{universityid}/courses")
                    public Course createCourse(@PathVariable Long id, @RequestBody Course courses){
            return courseRepository.save(courses);

        }

        }
        //University university1 = universityRepository.findById(id).orElseThrow(
       //         () -> new NotFoundException("No university with" + id - "not found")
       // );

       // university.setName("some new name");
       // universityRepository.save(university);
        //return university;
    }
    //localHost:8080/universities/1

       // @GetMapping(value = "{universityId}/courses")
        //public List<Course> findCourseByUniversityId(@PathVariable Long universityId){
            //return universityId.findByUniversityId(universityId);
        }

