package br.com.washiner.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {

    UserModel findByUsername(String username); //vai no banco buscar por username
  
}
