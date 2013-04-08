package blog;
public class BlogPost {
	
	String headline;
	String content;
	BlogAuthor author;
	BlogCategory category;
	
	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public BlogAuthor getAuthor() {
		return author;
	}

	public void setAuthor(BlogAuthor author) {
		this.author = author;
	}

	public BlogCategory getCategory() {
		return category;
	}

	public void setCategory(BlogCategory category) {
		this.category = category;
	}

	public String GetPost() {
		return headline + "\n" + content + "\n" + category.GetCategory() + "\n" + author.GetAuthor() + "\n";
	}

}
