import java.util.List;
import java.util.ArrayList;

public class BulletinBoard {
	
	private List<Post> posts;
	private List<User> users;
	private Scanner keyboard;
	
	public BulletinBoard() {
		posts = new ArrayList<>();
		users = new ArrayList<>();
		keyboard = new Scanner(System.in);
	}
	
	public void displayPosts() {
		
	}
	
	public List<Post> searchForPosts(String search) {
		
	}
	
	public Post getPost(int index) {
		posts.get(index);
	}
	
	public void reply(Post p, Post r) {
		
	}
	
	public void go() {
		while(keyboard.hasNextLine()) {
			String line = keyboard.nextLine();
		}
	}
	
}
