package com.cmd.vision.signin.composable

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SignInWithGoogle(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val authResultLauncher = rememberLauncherForActivityResult(
        contract = viewModel.googleAuthClient.signInActivityForResultContract()
    ) {
        viewModel.loginWithGoogleResult(it)
    }

    Button(
        onClick = onClick,
        modifier = modifier
    ) {

    }
}
