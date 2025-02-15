package com.fullstackproject.repositories;

import com.fullstackproject.models.entities.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Likes, String> {

}
