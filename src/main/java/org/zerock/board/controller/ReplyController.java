package org.zerock.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.board.dto.ReplyDTO;
import org.zerock.board.service.ReplyService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/replies/")
@RequiredArgsConstructor
@Log4j2
public class ReplyController {

	private final ReplyService replyService;
	
	@PostMapping("{bno}/new")
	public Map<String, Integer> regist(@PathVariable("bno") int bno,
	@RequestBody ReplyDTO replyDTO){

		replyDTO.setBno(bno);

		int rno = replyService.replyRegist(replyDTO);

		log.info(rno);

		return Map.of("result", rno);
	}


	@GetMapping(value = "{bno}/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReplyDTO> replyList(@PathVariable("bno") int bno) {

		
		return replyService.replyList(bno);

	}


	@PutMapping("{rno}")
	public int modifyReply(@PathVariable("rno") int rno, ReplyDTO replyDTO) {

		return replyService.modifyReply(replyDTO);

	}

}
