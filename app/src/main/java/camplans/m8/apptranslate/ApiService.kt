package camplans.m8.apptranslate

import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    @GET("/0.2/languages")
    suspend fun getLanguages(): Response<List<Language>>

    @Headers("Authorization: Bearer 4b431500d5b0911103545f4848e1c1ab")
    @FormUrlEncoded
    @POST("/0.2/detect")
    suspend fun getTextLanguage(@Field("q")text:String):Response<DetectionResponse>
}