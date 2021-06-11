package com.Monsters.Bolgging_App.ripository;

import com.Monsters.Bolgging_App.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
