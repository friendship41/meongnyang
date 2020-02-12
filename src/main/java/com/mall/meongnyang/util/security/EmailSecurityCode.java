package com.mall.meongnyang.util.security;

import java.util.UUID;

public class EmailSecurityCode {

	public static String secuCode() {
		return UUID.randomUUID().toString().substring(0, 8);
	}

}
