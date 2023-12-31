package com.bilgeadam.basurveyapp.dto.request;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UpdateTagDto {
    private String tagString;
    private String newTagString;
    private String tagClass;
}
