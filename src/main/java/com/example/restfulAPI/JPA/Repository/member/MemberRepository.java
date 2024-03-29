package com.example.restfulAPI.JPA.Repository.member;

import com.example.restfulAPI.JPA.Entity.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {  // JpaRepository를 상속하여 사용. <객체, ID>
    List<Member> findByMemberSeq(long memberSeq);
    Member findBymbId(String memberId);
}