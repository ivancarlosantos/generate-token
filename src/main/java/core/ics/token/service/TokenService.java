package core.ics.token.service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Service;

import core.ics.token.model.TokenModel;

@Service
public class TokenService {

	private String t;
	private String o;
	private String k;
	private String e;
	private String n;

	public TokenModel generateToken(TokenModel token) throws InterruptedException, UnknownHostException {

		String key;

		t = UUID.randomUUID().toString().substring(0, 4).toUpperCase();
		o = UUID.randomUUID().toString().substring(0, 4).toUpperCase();
		k = UUID.randomUUID().toString().substring(0, 4).toUpperCase();
		e = UUID.randomUUID().toString().substring(0, 4).toUpperCase();
		n = UUID.randomUUID().toString().substring(0, 4).toUpperCase();

		key = t + o + k + e + n;
		token.setToken(key);
		TokenModel model = new TokenModel(token.getToken(), new Date().toString(), InetAddress.getLoopbackAddress());
		Thread.sleep(3000);
		return model;
	}
}
