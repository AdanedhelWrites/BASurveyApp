package com.bilgeadam.basurveyapp.dto.response;

import lombok.*;

/**
 * @author Eralp Nitelik
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserSimpleResponseDto {
    private String firstName;
    private String lastName;
    private String email;
}
