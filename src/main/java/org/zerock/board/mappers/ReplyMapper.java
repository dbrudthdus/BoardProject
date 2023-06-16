package org.zerock.board.mappers;

import java.util.List;

import org.zerock.board.dto.ReplyDTO;

public interface ReplyMapper {
	
	//등록
	int replyRegist(ReplyDTO replyDTO);

	// 목록
	List<ReplyDTO> selectList(int bno);

	// 수정
	int modifyReply(ReplyDTO replyDTO);

}
