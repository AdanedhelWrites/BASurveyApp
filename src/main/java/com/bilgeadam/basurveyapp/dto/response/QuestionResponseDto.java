package com.bilgeadam.basurveyapp.dto.response;


import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class QuestionResponseDto {
    Long questionOid;
    String questionString;
    Integer order;
    Long tagOid;
    List<Long> subTagOids;

}
