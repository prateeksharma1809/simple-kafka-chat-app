package common;

import java.time.LocalDateTime;

public class ChatMessage {
	
	private String user;
	private String message;
	private LocalDateTime timestamp;
	
	public ChatMessage() {}
	
	public ChatMessage(String user, String message) {
		this.user = user;
		this.message = message;
		this.timestamp=  LocalDateTime.now();
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "[" + timestamp + "] " + user + ": " + message;
	}
	
	

}
