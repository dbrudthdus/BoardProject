package org.zerock.board.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.board.dto.ReplyDTO;
import org.zerock.board.mappers.ReplyMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyServicImpl implements ReplyService {

	private final ReplyMapper replyMapper;

	@Override
	public int replyRegist(ReplyDTO replyDTO) {
		
		replyMapper.replyRegist(replyDTO);

		//result  1
		int newRno = replyDTO.getRno();

		return newRno;
	}

	@Override
	public List<ReplyDTO> replyList(int bno) {
	
		return replyMapper.selectList(bno);

	}

	@Override
	public int modifyReply(ReplyDTO replyDTO) {
		
		return replyMapper.modifyReply(replyDTO);

	}
	
}
