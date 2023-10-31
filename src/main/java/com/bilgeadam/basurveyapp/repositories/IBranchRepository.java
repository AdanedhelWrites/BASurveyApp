package com.bilgeadam.basurveyapp.repositories;

import com.bilgeadam.basurveyapp.entity.Branch;
import com.bilgeadam.basurveyapp.repositories.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBranchRepository extends BaseRepository<Branch,Long> {

}
