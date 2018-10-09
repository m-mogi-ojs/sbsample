package ojs.mogi.m.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ojs.mogi.m.domain.entity.User;

@Repository
public interface SampleRepository extends JpaRepository<User, Integer> {


}
