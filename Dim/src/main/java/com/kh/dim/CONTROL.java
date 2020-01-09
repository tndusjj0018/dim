package com.kh.dim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CONTROL {

	@RequestMapping(value = "/temp", method = (RequestMethod.GET))
	public String tempt() {
		return "board/temp";
	}

	@RequestMapping(value = "/detail", method = (RequestMethod.GET))
	public String detail() {
		return "board/detail";
	}

	@RequestMapping(value = "/pay", method = (RequestMethod.GET))
	public String pay() {
		return "board/pay";
	}

}
