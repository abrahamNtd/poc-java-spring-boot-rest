package mx.abrahamntd.poc.rest.restservice;

public class RestMessage {

	private final long id;
	private final String content;

	public RestMessage(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
