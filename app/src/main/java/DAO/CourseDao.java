package DAO;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import Models.Course;

@Dao
public interface CourseDao {
    @Insert
    void insert(Course course);
    @Update
    void update(Course course);
    @Delete
    void delete(Course course);
    @Query("SELECT * FROM courses")
    List<Course> getAllCourses();
    @Query("SELECT * FROM courses WHERE id = :id")
    Course getCourseById(String id);
}
