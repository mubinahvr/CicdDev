package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Section;
import com.bezkoder.springjwt.models.SectionSubjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionRepository extends JpaRepository<Section, Integer> {

    Section findByName(String name);

    Section findById(int id);


    @Query("SELECT s.name FROM Section s")
    List<String> findAllSectionNames();


    @Query("SELECT a FROM Section a WHERE " +
            "LOWER(a.name) LIKE LOWER(CONCAT('%', :searchText, '%')) ")
    List<Section> findSectionsBySearchText(@Param("searchText") String searchText);

}
