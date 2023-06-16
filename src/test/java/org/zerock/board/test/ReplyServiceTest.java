package org.zerock.board.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.dto.ReplyDTO;
import org.zerock.board.service.ReplyService;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class ReplyServiceTest {
	
	@Autowired(required = false)
	private ReplyService replyService;

	@Test
	public void modifyReply(){

		ReplyDTO replyDTO = ReplyDTO.builder()
												.bno(720874)
												.rno(1)
												.reply("test")
												.build();

		replyService.modifyReply(replyDTO);

	}

	@Test
	public void replyRegistServiceTest(){
		ReplyDTO dto = ReplyDTO.builder()
		.bno(720874)
		.reply("Testttttttt")
		.replyer("test")
		.build();

		replyService.replyRegist(dto);
		

		log.info("=============================");
		log.info("=============================");
		log.info(dto);
		log.info(dto.getRno());
	}

	@Test
	public void replySelectTest() {

		List<ReplyDTO> dto = replyService.replyList(720874);

		log.info(dto);

	}
	
}
