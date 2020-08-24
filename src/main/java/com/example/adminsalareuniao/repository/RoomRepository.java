package com.example.adminsalareuniao.repository;

import com.example.adminsalareuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    
}