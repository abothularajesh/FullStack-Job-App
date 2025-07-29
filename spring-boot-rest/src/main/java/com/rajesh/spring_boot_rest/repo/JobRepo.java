package com.rajesh.spring_boot_rest.repo;

import com.rajesh.spring_boot_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {


    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile,String postDesc);
}


//List<JobPost> jobs=new ArrayList<>(Arrays.asList(
//        new JobPost(1,"Java Developer","Must have good experiance in core java ",1, Arrays.asList("java","SpringBoot","hibernate")),
//        new JobPost(2,"Frontend Developer","Must have good experiance in Front end and Backend languages ",1, Arrays.asList("html","css","javaScript")),
//        new JobPost(3,"Mobile App Devloper","Must have good experiance in  Python ",1, Arrays.asList("Python","Machine learning")),
//        new JobPost(4,"DataAnalyst","Must have good experiance in core Backend  ",1, Arrays.asList("java","python","node.js"))
//));
//
//public List<JobPost> getAllJobs(){
//    return jobs;
//}
//public void addJob(JobPost job){
//    jobs.add(job);
//    System.out.println(jobs);
//}
//
//public void updateJob(JobPost jobPost) {
//    for(JobPost jobPost1: jobs){
//        if(jobPost1.getPostId()==jobPost.getPostId()){
//            jobPost1.setPostProfile(jobPost.getPostProfile());
//            jobPost1.setPostDesc(jobPost.getPostDesc());
//            jobPost1.setReqExperience(jobPost.getReqExperience());
//            jobPost1.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//}
//
//public JobPost getJob(int postId) {
//
//    for(JobPost job:jobs){
//        if(job.getPostId()==postId){
//            return job;
//        }
//    }
//
//
//    return null;
//}
//
//public void deleteJob(int postId) {
//    for(JobPost jobPost:jobs){
//        if(jobPost.getPostId()==postId){
//            jobs.remove(jobPost);
//        }
//    }
//}