package design_patterns.design_patterns__and_solid_principles.creational.factory.simpleFactory;

public class Client {

	public static void main(String[] args) {
		Post post = PostFactory.createPost(PostTypes.BLOGPOST);
		post.setContent("some content");
		System.out.println(post.getContent());

	}

}
