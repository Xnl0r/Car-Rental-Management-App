package com.example.carrental.models

import android.provider.ContactsContract.CommonDataKinds.Email

class User {
    var email : String = ""
    var userid : String = ""

    constructor(email: String,userid: String){
        this.email = email
        this.userid = userid

    }
    constructor()
}