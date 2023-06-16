package org.zerock.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ReplyDTO {
	//변수 선언
	private int rno;						//pk
	private int bno;						//게시물번호
	private String reply;				//댓글내용
	private String replyer;			//작성자
	private String dueDate;			//작성날짜
	private String updateDate;	//수정날짜
}
