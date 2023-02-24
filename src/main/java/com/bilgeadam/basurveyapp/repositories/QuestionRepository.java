package com.bilgeadam.basurveyapp.repositories;

import com.bilgeadam.basurveyapp.entity.Question;
import com.bilgeadam.basurveyapp.entity.Survey;
import com.bilgeadam.basurveyapp.repositories.base.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends BaseRepository<Question, Long> {
    @Query("SELECT q.oid FROM Question q WHERE q.surveys IN ?1")
    List<Long> findSurveyQuestionOidList(Survey survey);

    @Query("SELECT q FROM Question q WHERE q.surveys IN ?1")
    List<Question> findSurveyQuestionList(Survey survey);

    @Query("SELECT q FROM Question q WHERE q.state = 'ACTIVE' AND q.surveys IN ?1")
    List<Question> findSurveyActiveQuestionList(Survey survey);

    @Query(value = "SELECT * FROM questions q WHERE oid IN (SELECT questions_oid FROM questions_surveys WHERE surveys_oid IN ?1)", nativeQuery = true)
    List<Question> findSurveyQuestionList(Long surveyOid);

    //TODO better solution
    Optional<List<Question>> findByRole(String role);
}