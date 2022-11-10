package com.beslimir.solid_principles_example.single_responsibility_01

//this way of defining a class is violating the first SOLID principle:
//Single Responsibility Principle
//because some potential changes in the authentication process would also affect the User class

data class User01(
    var id: Long,
    var name: String,
    var password: String
) {
    fun signIn() {
        //used for sign in operations
    }

    fun signOut() {
        //used for sign out operations
    }

}
