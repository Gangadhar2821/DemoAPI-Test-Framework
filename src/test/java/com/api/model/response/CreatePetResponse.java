package com.api.model.response;

import java.util.List;

public class CreatePetResponse {

	public CreatePetResponse() {
		// DeSerialization
	}

	private long id;
	private String name;
	private Category category;
	private List<String> photoUrls;
	private List<Tag> tags;
	private String status;

	public CreatePetResponse(long id, String name, Category category, List<String> photoUrls, List<Tag> tags,
			String status) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
	}

	@Override
	public String toString() {
		return "CreatePetResponse [id=" + id + ", name=" + name + ", category=" + category + ", photoUrls=" + photoUrls
				+ ", tags=" + tags + ", status=" + status + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<String> getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static class Category {
		public Category() {

		}

		public Category(long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		private long id;
		private String name;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Category [id=" + id + ", name=" + name + "]";
		}

	}

	public static class Tag {
		private long id;
		private String name;

		public Tag() {
		}

		public Tag(long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Tag [id=" + id + ", name=" + name + "]";
		}

	}
}
