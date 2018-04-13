package com.kong_food_map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.kong_food_map.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
	
	@Modifying
	@Transactional
	@Query(value="update Member set del_yn='Y' where id = :id")
	void updateDeleteByid(@Param("id") int id);
}
