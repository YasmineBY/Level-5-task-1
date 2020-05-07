package com.example.level5task1att2.database

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.level5task1att2.model.Note

@Dao
interface NoteDao {

    @Insert
    suspend fun insertNote(note: ContactsContract.CommonDataKinds.Note)

    @Query("SELECT * FROM Note LIMIT 1")
    fun getNotepad(): LiveData<Note?>

    @Update
    suspend fun updateNote(note: Note)

}
