package core.ics.token.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import core.ics.token.model.TokenModel;
import core.ics.token.service.TokenService;

@RestController
@RequestMapping(path = "/generate")
public class TokenController {

	@Autowired
	private TokenService tokenService;

	@GetMapping(path = "/token")
	public ResponseEntity<TokenModel> generateToken(TokenModel tokenModel) throws InterruptedException{
		
		TokenModel token = tokenService.generateToken(tokenModel);

		return ResponseEntity.status(HttpStatus.CREATED).body(token);
	}
}
