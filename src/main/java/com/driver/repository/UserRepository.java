package com.driver.repository;
import com.driver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
//    Create a social media platform
//
//    User = UserId, Name, Age, List<Post>, List<Notification>
//            Post = Content, Time, User, Like;
//    Notification = Post, Time
//
//    Description: A user will create a post and will receive notification wrt the post (for likes).
//
//    POST API - Add a User
//    POST API - Add a Post under given user
//
//1.PUT API - Like a given post
//2.POST API - Send a notification each time a post is liked.
//3.GET API - Find the most number of notifications received by a user

}
