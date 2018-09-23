package com.virginblue.api.spring.dao;
 
import java.util.List;
 
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
 
import com.virginblue.api.spring.model.User;
 
@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao{
	
    @SuppressWarnings("unchecked")
    public List<User> findAllUsers() {
        Criteria criteria = getSession().createCriteria(User.class);
        return (List<User>) criteria.list();
    }
    
    public User findByUserName(String userName){
    	Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("userName",userName));
        return (User) criteria.uniqueResult();
    }
    
}