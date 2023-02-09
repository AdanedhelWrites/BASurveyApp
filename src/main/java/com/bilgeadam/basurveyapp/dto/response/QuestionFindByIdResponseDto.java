package com.bilgeadam.basurveyapp.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class QuestionFindByIdResponseDto {
    String questionString;
    Integer order;
    String surveyTitle;
    String questionType;
}
