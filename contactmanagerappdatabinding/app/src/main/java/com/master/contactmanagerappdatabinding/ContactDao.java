package com.master.contactmanagerappdatabinding;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ContactDao {

    @Insert
    void insert(Contact contact);

    @Query("SELECT *FROM contact_table")
    List<Contact> getAllContatcts();

    @Delete
    void delete(Contact contact);


}
