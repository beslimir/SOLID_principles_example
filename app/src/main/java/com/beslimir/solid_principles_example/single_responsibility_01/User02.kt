package com.beslimir.solid_principles_example.single_responsibility_01

//this way of defining classes is better, and doesn't violate the first SOLID principle:
//Single Responsibility Principle
//because any change in the authentication process would not affect the User class whose
//only purpose is to hold user data

data class User02(
    var id: Long,
    var name: String,
    var password: String
)

class AuthenticationService() {

    fun signIn() {
        //sign in operations
    }

    fun signOut() {
        //sign out operations
    }

}