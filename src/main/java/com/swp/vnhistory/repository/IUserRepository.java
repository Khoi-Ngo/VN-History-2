package com.swp.vnhistory.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.swp.vnhistory.dto.respone.UserForm;
import com.swp.vnhistory.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String name); // Tim kiem User co ton tai trong DB khong?

	Boolean existsByUsername(String username); // username da co trong DB chua, khi tao du lieu

	Boolean existsByEmail(String email); // email da co trong DB chua

//    List<User> findAllByUsernameContaining(String keyword);
	@Transactional
	@Modifying
	@Query("UPDATE User u SET u.typeUser = :typeUser WHERE u.userId = :userId")
	void updateTypeUserById(@Param("userId") long userId, @Param("typeUser") String typeUser);

	@Query("SELECT new com.swp.vnhistory.dto.respone.UserForm(u.userId, u.avatar, u.email, u.username) FROM User u WHERE u.userId = :userId")
	Optional<UserForm> findUserFormById(@Param("userId") long userId);


	
	//update change profile
	@Transactional
	@Modifying
	@Query("UPDATE User u SET u.avatar = :avatar, u.email = :email, u.username = :userName WHERE u.userId = :userId")
	void updateUserDetails(@Param("userId") long userId, @Param("avatar") String avatar, @Param("email") String email, @Param("userName") String userName);

	

}
