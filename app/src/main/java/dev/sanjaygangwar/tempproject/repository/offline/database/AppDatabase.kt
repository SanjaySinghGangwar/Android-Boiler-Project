package dev.sanjaygangwar.tempproject.repository.offline.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import dev.sanjaygangwar.tempproject.models.entity.Characters
import dev.sanjaygangwar.tempproject.models.entity.userData
import dev.sanjaygangwar.tempproject.repository.offline.dao.mainDao
import dev.sanjaygangwar.tempproject.utils.converters.Converters

@Database(entities = [userData::class, Characters::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun mainDao(): mainDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase =
            instance ?: synchronized(this) { instance ?: buildDatabase(context).also { instance = it } }

        private fun buildDatabase(appContext: Context) =
            Room.databaseBuilder(appContext, AppDatabase::class.java, appContext.applicationInfo.name)
                .fallbackToDestructiveMigration()
                .build()
    }

}