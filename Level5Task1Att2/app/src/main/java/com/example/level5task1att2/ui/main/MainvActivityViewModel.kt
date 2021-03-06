package com.example.level5task1att2.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.level5task1att2.repositories.NoteRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository = NoteRepository(application.applicationContext)

    val note = noteRepository.getNotepad()

}
