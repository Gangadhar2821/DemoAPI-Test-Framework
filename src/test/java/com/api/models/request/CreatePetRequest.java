package com.api.models.request;

import java.util.List;

public class CreatePetRequest {

	private long id;
	private String name;
	private Category category;
	private List<String> photoUrls;
	private List<Tag> tags;
	private String status;

	@Override
	public String toString() {
		return "CreatePetRequest [id=" + id + ", name=" + name + ", category=" + category + ", photoUrls=" + photoUrls
				+ ", tags=" + tags + ", status=" + status + "]";
	}

	public CreatePetRequest(long id, String name, Category category, List<String> photoUrls, List<Tag> tags,
			String status) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
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

	public static class Builder {
		private long id;
		private String name;
		private Category category;
		private List<String> photoUrls;
		private List<Tag> tags;
		private String status;

		public Builder id(long id) {
			this.id = id;
			return this;
		}

		public Builder category(Category category) {
			this.category = category;
			return this;
		}

		public Builder tags(List<Tag> tags) {
			this.tags = tags;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder photoUrls(List<String> photoUrls) {
			this.photoUrls = photoUrls;
			return this;
		}

		public Builder status(String status) {
			this.status = status;
			return this;
		}

		public CreatePetRequest build() {
			CreatePetRequest createPetRequest = new CreatePetRequest(id, name, category, photoUrls, tags, status);
			return createPetRequest;
		}

	}

	// Inner Class: Category
	public static class Category {
		private long id;
		private String name;

		@Override
		public String toString() {
			return "Category [id=" + id + ", name=" + name + "]";
		}

		public Category(long id, String name) {
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

		public static class Builder {
			private long id;
			private String name;

			public Builder id(long id) {
				this.id = id;
				return this;
			}

			public Builder name(String name) {
				this.name = name;
				return this;
			}

			public Category build() {
				Category category = new Category(id, name);
				return category;
			}

		}
	}

	// Inner Class: Tag
	public static class Tag {
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

		public Tag(long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Tag [id=" + id + ", name=" + name + "]";
		}

		public static class Builder {
			private long id;
			private String name;

			public Builder id(long id) {
				this.id = id;
				return this;
			}

			public Builder name(String name) {
				this.name = name;
				return this;
			}

			public Tag build() {
				Tag tag = new Tag(id, name);
				return tag;
			}
		}

	}

}
