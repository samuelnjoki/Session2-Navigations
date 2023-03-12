package com.example.session2_navigations.navigations

const val Id="id"
sealed class Screen(val route:String){

    object HomeScreen:Screen(route = "home_screen")

    object DetailScreen:Screen(route="detail_screen")

    object RatingScreen:Screen(route = "rating_screen/{$Id}"){

        fun passArgument(id:Float):String{
            return "rating_screen/$id"
        }
    }
}