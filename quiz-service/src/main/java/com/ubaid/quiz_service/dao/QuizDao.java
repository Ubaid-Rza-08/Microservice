package com.ubaid.quiz_service.dao;

//import com.ubaid.quizApp.model.Quiz;
import com.ubaid.quiz_service.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
