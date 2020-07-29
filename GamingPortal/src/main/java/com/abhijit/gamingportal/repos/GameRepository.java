package com.abhijit.gamingportal.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.abhijit.gamingportal.entities.Game;

public interface GameRepository extends CrudRepository<Game, Long> {



}
