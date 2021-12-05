package ly.algjamia.service;

import ly.algjamia.model.User;


public interface UserService {
   
	void save(User user);

    User findByUsername(String username);
}