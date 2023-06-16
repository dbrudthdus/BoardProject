package org.zerock.board.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.board.dto.ReplyDTO;

@Transactional
public interface ReplyService {
	
	int replyRegist(ReplyDTO replyDTO);

	List<ReplyDTO> replyList(int bno);

	int modifyReply(ReplyDTO replyDTO);

}
