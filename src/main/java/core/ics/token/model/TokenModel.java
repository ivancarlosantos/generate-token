package core.ics.token.model;

import java.net.InetAddress;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TokenModel {
	
	private String token;
	
	private String createDateToken;

	private InetAddress networkAddress;
}
