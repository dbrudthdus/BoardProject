package org.zerock.board.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.dto.ReplyDTO;
import org.zerock.board.mappers.ReplyMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class ReplyTest {
	
	@Autowired(required = false)
	private ReplyMapper replyMapper;

	@Test
	public void modifyTest() {
		
		ReplyDTO replyDTO = ReplyDTO.builder()
												.bno(720874)
												.rno(1)
												.reply("수정 테스트")
												.build();

		replyMapper.modifyReply(replyDTO);

	}

	@Test
	public void replyRegistTest(){
		ReplyDTO replyDTO = ReplyDTO.builder()
		.bno(720874)										
		.reply("test")
		.replyer("testtttttttt")
		.build();

		replyMapper.replyRegist(replyDTO);

		log.info("=============================");
		log.info("=============================");
		log.info(replyDTO);
	}

	@Test
	public void replySelectTest() {
		
		List<ReplyDTO> dto = replyMapper.selectList(720874);

		log.info(dto);
	}
}
