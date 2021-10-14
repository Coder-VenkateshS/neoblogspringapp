package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blogs")
public class Blogs {
		
		private long id;
		private String blogTitle;
		private String blogDescription;
		private LocalDate postedOn;
		
		public Blogs() {
			
		}
		
		public Blogs(long id, String blogTitle, String blogDescription, LocalDate postedOn) {
			this.id = id;
			this.blogTitle = blogTitle;
			this.blogDescription = blogDescription;
			this.postedOn = postedOn;
		}

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="blogId", nullable=false)
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
		
		@Column(name="blogTitle", nullable= false)
		public String getBlogTitle() {
			return blogTitle;
		}

		public void setBlogTitle(String blogTitle) {
			this.blogTitle = blogTitle;
		}
		@Column(name="blogDescription",nullable=false)
		public String getBlogDescription() {
			return blogDescription;
		}

		public void setBlogDescription(String blogDescription) {
			this.blogDescription = blogDescription;
		}
		@Column(name="postedOn", nullable = false)
		public LocalDate getPostedOn() {
			return postedOn;
		}

		public void setPostedOn(LocalDate postedOn) {
			this.postedOn = postedOn;
		}	
}
