package com.api.tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.model.response.CreatePetResponse;
import com.api.models.request.CreatePetRequest;
import com.api.services.PetServices;

import io.restassured.response.Response;

public class CreatePetAPITest {

	@Test(description = "To Verify Create Pet API is Working!")
	public void createPet() {
		List<String> photoUrls = new ArrayList<>();
		photoUrls.add("http://dog.img/1");

		CreatePetRequest.Category category = new CreatePetRequest.Category.Builder().id(0).name("Dog").build();
		CreatePetRequest.Tag tag = new CreatePetRequest.Tag.Builder().id(0).name("Street Dog").build();
		List<CreatePetRequest.Tag> tags = List.of(tag);
		CreatePetRequest createPetRequest = new CreatePetRequest.Builder().id(0).name("Chimtu").category(category)
				.photoUrls(photoUrls).tags(tags).status("available").build();
		PetServices petServices = new PetServices();
		Response response = petServices.createPet(createPetRequest);
		System.out.println(response.asPrettyString());
		CreatePetResponse createPetResponse = response.as(CreatePetResponse.class);// DeSerializaion
		Assert.assertEquals(createPetResponse.getName().toLowerCase(), "chimtu");

	}
}
