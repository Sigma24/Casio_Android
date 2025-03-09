import com.example.fyp_casio.arthematic_interface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object arthematic_api {
    private const val BASE_URL = "http://YOUR_PYTHON_BACKEND_URL/"

    val api: arthematic_interface by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())  // GSON for JSON parsing
            .build()
            .create(arthematic_interface::class.java)
    }
}
