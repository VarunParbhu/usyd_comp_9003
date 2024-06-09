import java.util.List;
import java.util.ArrayList;

public class Post {
	private User author;
	private String topic;
	private String content;
	private List<Post> replies;
	private long postTime;
	private long lastEdited;
	
	
	public Post(User author, String topic, String content) {
		this.author = author;
		this.topic = topic;
		this.content = content;
		this.replies = new ArrayList<Post>();
	}
	
	public String getContent() {
		return content;
	}
	
	public String getTopic() {
		return topic;
	}
	
	public List<Post> getReplies() {
		return replies;
	}
	
	public void addReply(Post p) {
		
	}
	
	public User getUser() {
		return author;
	}
	
}
