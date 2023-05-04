package com.example.autoimageslideractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.autoimageslideractivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sliderImageSet()
        check("s874djkfhskjf6.4A5")

    }


    private fun sliderImageSet() {
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://bit.ly/2YoJ77H", "", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel("https://bit.ly/2BteuF2","" , ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel("https://bit.ly/3fLJf72", "", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel("https://bit.ly/2BteuF2","" , ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel("https://bit.ly/2YoJ77H", "", ScaleTypes.CENTER_CROP))




        binding.imageSlider.setImageList(imageList)




    }

    fun check(input :String){
//        val regex = Regex( "[A-Za-z]*")
//        val data = regex.matches(input)
//        Log.e("data", "check:, $data " )
//        println(data)

        var answer = input
        println(answer)
        answer = answer.replace("[^A-Za-z0-9 ]", "") // doesn't work
        println(answer)
        Log.e("ans", "check: $answer", )
        val re = Regex("[^0-9\$+. ]")
        answer = re.replace(answer, "") // works
        println(answer)
        Log.e("ans", "check: ${answer.plus("$")}", )



    }


}


