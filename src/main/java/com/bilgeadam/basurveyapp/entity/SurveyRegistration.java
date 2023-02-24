package com.bilgeadam.basurveyapp.entity;

import com.bilgeadam.basurveyapp.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "survey_registration")
public class SurveyRegistration extends BaseEntity {

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToOne(fetch = FetchType.EAGER)
    private Survey survey;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Classroom classroom;
}
