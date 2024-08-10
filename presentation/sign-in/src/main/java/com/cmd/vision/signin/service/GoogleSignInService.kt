package com.cmd.vision.signin.service

import androidx.credentials.CredentialManager
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GoogleSignInService @Inject constructor(
    private val googleSignInClient: CredentialManager
) {
   
}
