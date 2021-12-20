package Design_Patterns.creational.factory.simpleFactory;

/**
 * This class acts as a simple factory for creation of
 * different posts on web site.
 */
public class PostFactory {

    public static Post createPost(PostTypes type) {
        switch (type) {
            case BLOGPOST:
                return new BlogPost();
            case NEWSPOST:
                return new NewsPost();
            case PRODUCTPOST:
                return new ProductPost();
            default:
                String message = String.format("Such type [%s] does not exist", type);
                throw new IllegalArgumentException(message);
        }
    }

}
