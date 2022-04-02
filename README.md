# Project1
Dog of the Day App

## Description

This project demonstrates how to make web API requests using network calls, how to parse API responses, and how to load images from a network location and display them.

The completed app should:
* Display a dog image (a jpg image is returned from calling the endpoint https://dog.ceo/api/breeds/image/random)
* Have a button that lets the user generate a new image


## Getting Started

### Dependencies

* [Retrofit with Moshi Converter] (https://github.com/square/retrofit/tree/master/retrofit-converters/moshi?msclkid=56381962b2d111eca8064cdbfe36035f)
* [Coil](https://github.com/coil-kt/coil)

### API

* Main endpoint: https://dog.ceo/api/breeds/image/random 
* The API response from that endpoint looks like:
```
{
    "message": "https://images.dog.ceo/breeds/briard/n02105251_7738.jpg",
    "status": "success"
}
```
* You can read more about the specific endpoint here: https://dog.ceo/dog-api/documentation/random 


## App Preview

![](https://media.giphy.com/media/yQK6M4TwMRY6IRYcm2/giphy.gif)

## Extra Challenges

* Let user input dog breed and see dog images from just that breed (check out endpoints for breed specific images: ​​https://dog.ceo/dog-api/documentation/breed)
* Add loading and error images :white_check_mark: (you can see examples of how to do this in Step 3 of the [Load and display images from the Internet codelab](https://developer.android.com/codelabs/basic-android-kotlin-training-internet-images?)
  * This app uses an image of a paw as a loading icon


## Helpful Resources
* Android Basics Pathway: [Get and display data from the internet](https://developer.android.com/courses/pathways/android-basics-kotlin-unit-4-pathway-2)
* [This YouTube video explains additional Coil features](https://www.youtube.com/watch?v=IBaUjzn2Rgo)
* Similar Exercise: [Inspirational Quotes Exercise](https://github.com/calren/InspirationalQuotesExercise)
