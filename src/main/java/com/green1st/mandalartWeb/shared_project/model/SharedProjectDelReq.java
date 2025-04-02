package com.green1st.mandalartWeb.shared_project.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class SharedProjectDelReq {
    @NotNull
    @Positive
    @Schema(description = "삭제할 프로젝트 PK", example = "1")
    private long projectId;
    @NotNull
    @Length(min = 10, max = 100)
    @Schema(description = "로그인한 사용자 아이디", example = "test@gmail.com")
    private String userId;
}
