import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class User {
	
	private String username;
	private List<Post> posts;
	private long joined;
	
	public User(String username, long joined) {
		this.joined = joined;
		this.username = username;
		this.posts = new ArrayList<Post>();
	}
	
	public String getUsername() {
		return username;
	}
	
	public Date joinedDate() {
		return new Date(joined);
	}
	
	public List<Post> getPosts() {
		return posts;
	}
	
}
