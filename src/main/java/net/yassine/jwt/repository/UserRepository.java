package net.yassine.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import net.yassine.jwt.entity.User;
@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,String> {

}
