package com.example.traineeez

import android.provider.ContactsContract.CommonDataKinds.Email
import android.security.identity.AccessControlProfileId

data class User(val name : String , val uniqueId: String , val email: String  , val password : String )
