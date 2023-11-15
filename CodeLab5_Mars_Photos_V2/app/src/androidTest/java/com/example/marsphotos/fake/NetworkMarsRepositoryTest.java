package com.example.marsphotos.fake;

import org.junit.Test;

public class NetworkMarsRepositoryTest {
}

    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest {
        val repository = NetworkMarsPhotosRepository(
        marsApiService = FakeMarsApiService()
        )
        assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
        }