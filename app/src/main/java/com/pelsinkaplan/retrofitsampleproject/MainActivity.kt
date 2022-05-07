package com.pelsinkaplan.retrofitsampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pelsinkaplan.retrofitsampleproject.api.APIInstance
import com.pelsinkaplan.retrofitsampleproject.api.APIService
import com.pelsinkaplan.retrofitsampleproject.data.HotCoffee
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var postList: List<HotCoffee>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


val dataResponse = APIInstance.getInstance().create(APIService::class.java).getRequest()

dataResponse.enqueue(object : Callback<List<HotCoffee>> {
    override fun onFailure(call: Call<List<HotCoffee>>, t: Throwable) {
        Toast.makeText(applicationContext, t.message.toString(), Toast.LENGTH_LONG)
            .show()
    }

    override fun onResponse(
        call: Call<List<HotCoffee>>,
        response: Response<List<HotCoffee>>
    ) {
        if (response.isSuccessful) {
            postList = (response.body() as MutableList<HotCoffee>?)!!
            Toast.makeText(applicationContext, postList.toString(), Toast.LENGTH_LONG)
                .show()
        }
    }
})
    }
}