package blog;
import java.util.ArrayList;
import java.util.List;


public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <BlogAuthor> author = new ArrayList<BlogAuthor>();
		
			BlogAuthor a = new BlogAuthor();
			a.name = "Anders Karlsson";
			a.age = 17;
			author.add(a);
			
			BlogAuthor a2 = new BlogAuthor();
			a2.name = "Johan Svensson";
			a2.age = 20;
			author.add(a2);
			
			BlogAuthor a3 = new BlogAuthor();
			a3.name = "Assar Khamid";
			a3.age = 23;
			author.add(a3);
		
		List <BlogCategory> categoryList = new ArrayList<BlogCategory>();
		
			BlogCategory c = new BlogCategory();
			c.categoryName = "Debatt";
			categoryList.add(c);
		
			BlogCategory c2 = new BlogCategory();
			c2.categoryName = "Nyhet";
			categoryList.add(c2);
			
		BlogList blogList = new BlogList();
		
			BlogPost p = new BlogPost();
			p.headline = "Hej";
			p.content = "Innehåll bla bla bla";
			p.author = a;
			p.category = c;
			blogList.post.add(p);
			
			BlogPost p2 = new BlogPost();
			p2.headline = "News";
			p2.content = "Senaste nytt!!";
			p2.author = a;
			p2.category = c2;
			blogList.post.add(p2);
		
		for (int i = 0; i < blogList.post.size(); i++) {
			System.out.println(blogList.post.get(i).GetPost());
		}

	}

}
