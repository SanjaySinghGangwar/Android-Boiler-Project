package dev.sanjaygangwar.tempproject.models.data


import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable


data class EmployeeModel(
    val data: List<EmployeeData>,
    val message: String,
    val status: String
)


@Serializable
@Entity(tableName = "employee")
data class EmployeeData(
    val employee_age: Int?=null,
    val employee_name: String,
    val employee_salary: Int,
    @PrimaryKey
    val id: Int,
    val profile_image: String
)

