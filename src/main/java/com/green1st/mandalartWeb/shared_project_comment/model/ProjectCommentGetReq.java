package com.green1st.mandalartWeb.shared_project_comment.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.ToString;

@Getter
@Schema(title = "공유 프로젝트 댓글 리스트 요청")
@ToString
public class ProjectCommentGetReq {

    @NotNull
    @Positive
    @Schema(title = "프로젝트 PK", description = "프로젝트 PK", requiredMode = Schema.RequiredMode.REQUIRED)
    private long projectId;

    public ProjectCommentGetReq(long projectId) {
        this.projectId = projectId;
    }
}