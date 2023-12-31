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
public class AuthenticationResponseDto {
    private String token;

    private String qrCode;
}
