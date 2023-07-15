package pojo_different_Types_oneByOne;

import java.util.List;

public class Example_3_1_pojo 
{
	/*{
		
		"isbn": "123-456-222",  
		 "author": [
		    {
		      "lastname": "Doe",
		      "firstname": "Jane"
		    },
			{
		      "lastname": "Ananda",
		      "firstname": "Reddy"
		    }
			],
		"editor": 
		    {
		      "lastname": "Smith",
		      "firstname": "Jane"
		    },
		  "title": "The Ultimate Database Study Guide",  
		  "category": ["Non-Fiction", "Technology"]
		 }*/
		private String isbn;
		private List<AuthorPojo_3_1>   author;
		private editorPojo_3_1 editor;
		private String title;
		private List<String> category;
		
		
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public List<AuthorPojo_3_1> getAuthor() {
			return author;
		}
		public void setAuthor(List<AuthorPojo_3_1> author) {
			this.author = author;
		}
		public editorPojo_3_1 getEditor() {
			return editor;
		}
		public void setEditor(editorPojo_3_1 editor) {
			this.editor = editor;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public List<String> getCategory() {
			return category;
		}
		public void setCategory(List<String> category) {
			this.category = category;
		}
		

}
