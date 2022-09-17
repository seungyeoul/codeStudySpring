package org.zerock.service;

import org.zerock.domain.BoardVO;

public interface BoardService {
	public void registr(BoardVO board);
	
	public BoardVO get(Long bno);
}
