package house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import house.beans.House;

/**
 * @author andrewmccoy - agmccoy
 * CIS175 - Fall 2021
 * Mar 7, 2023
 */
public interface HouseRepository extends JpaRepository<House, Long> {

}
