package goshare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import goshare.domain.Post;
import goshare.repository.PostRepository;

/**
 * @author mexu
 * Restful CRUD of Commends
 */

@RestController
public class PostController {
	
	@Autowired
	PostRepository postRepo;
	
	@Autowired 
	MongoTemplate template;
    
    @RequestMapping("/")
    public String index() {
        return "<p>Welcome to Goshare Comment!</p>";
    }
    
    /**
     * @param p
     * @return saved/updated post in database
     */
    @RequestMapping(value = "/savePost", method = RequestMethod.POST)
    public Post create(@RequestBody Post p) {
    	return postRepo.save(p);
    }
    
    @RequestMapping(value = "/readPost/{pid}", method = RequestMethod.GET)
    public Post read(@PathVariable String pid) {
    	return postRepo.findOne(pid);
    }
    
    @RequestMapping(value = "/deletePost/{pid}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String pid) {
    	postRepo.delete(pid);
    }
    
    @RequestMapping(value = "/readPostsByPoiId/{poiId}", method = RequestMethod.GET)
    public List<Post> readPosts(@PathVariable String poiId) {
    	return postRepo.findByPoiId(poiId);
    }
    
    @RequestMapping(value = "/deletePostsByPoiId/{poiId}", method = RequestMethod.DELETE)
    public void deleteAll(@PathVariable String poiId) {
    	postRepo.deleteByPoiId(poiId);
    }
    
    /**
     * @return total count of points in database
     */
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public long count() {
    	return postRepo.count();
    }
    
    
    /**
     * @param pid
     * @return whether this point id is in database
     */
    @RequestMapping(value = "/exists/{pid}", method = RequestMethod.GET)
    public boolean remove(@PathVariable String pid) {
    	return postRepo.exists(pid);
    }
    
}