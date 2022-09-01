package com.itwillbs.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	// 변수x,상수o
	// 인스턴스 메서드x,추상메서드o
	// => 상속을 통해서 추상메서드를 오버라이딩 사용 (강제성)
	
	
	/**
	 * 추상메서드 이며, 반드시 오버라이딩 해서 사용해야함.
	 * 실행할때 request,response 정보를 전달해야지만 호출 가능
	 * 호출이 완료되면 ActionForward(주소,방식) 정보를 리턴
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	
	public ActionForward execute(HttpServletRequest request,
			                   HttpServletResponse response)throws Exception;
	
	
}
