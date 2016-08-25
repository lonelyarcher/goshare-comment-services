package goshare.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import goshare.domain.Post;



public interface PostRepository extends MongoRepository<Post, String> {
	
		List<Post> findByPoiId(String poiId);
		
		void deleteByPoiId(String poiId);
	
}
