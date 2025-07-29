package com.rajesh.spring_boot_rest.serivce;

import com.rajesh.spring_boot_rest.model.JobPost;
import com.rajesh.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

        @Autowired
        private JobRepo repo;

        public void addJob(JobPost jobPost){
                repo.save(jobPost);
        }
        public List<JobPost> getAllJobs(){
                return repo.findAll();
        }

    public void updateJob(JobPost jobPost) {
            repo.save(jobPost);
    }

    public JobPost getJob(int postId) {
            return repo.findById(postId).orElse(new JobPost());
    }

    public void deleteJob(int postId) {
            repo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs=new ArrayList<>(Arrays.asList(
                new JobPost(1,"Java Developer","Must have good experiance in core java ",1, Arrays.asList("java","SpringBoot","hibernate")),
                new JobPost(2,"Frontend Developer","Must have good experiance in Front end and Backend languages ",1, Arrays.asList("html","css","javaScript")),
                new JobPost(3,"Mobile App Devloper","Must have good experiance in  Python ",1, Arrays.asList("Python","Machine learning")),
                new JobPost(4,"DataAnalyst","Must have good experiance in core Backend  ",1, Arrays.asList("java","python","node.js"))
        ));
        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {

        return repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
