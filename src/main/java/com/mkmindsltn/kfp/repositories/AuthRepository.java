package com.mkmindsltn.kfp.repositories;


import com.mkmindsltn.kfp.models.Authenticate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Authenticate,Long> {

    Authenticate findByUsername(String name);
}
