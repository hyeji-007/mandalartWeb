package com.green1st.mandalartWeb.shared_project_comment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Schema(title = "공유 프로젝트 댓글 등록 요청")
@ToString
public class ProjectCommentPostReq {
    @JsonIgnore
    @Positive
    private long commentId;

    @NotNull
    @Positive
    @Schema(title = "프로젝트 PK", requiredMode = Schema.RequiredMode.REQUIRED)
    private long projectId;
    @Schema(title = "유저아이디", requiredMode = Schema.RequiredMode.REQUIRED)
    private String userId;
    @Schema(title = "댓글 내용", example = "댓글입니다."
            , requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "댓글 내용은 필수입니다.")
    private String content;
}
