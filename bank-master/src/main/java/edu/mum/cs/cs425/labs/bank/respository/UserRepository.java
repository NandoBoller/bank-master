package edu.mum.cs.cs425.labs.bank.respository;

import edu.mum.cs.cs425.labs.bank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
