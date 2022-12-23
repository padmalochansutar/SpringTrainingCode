package com.csmtech.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csmtech.model.Answer;
import com.csmtech.model.Question;
import com.csmtech.repository.AnswerRepository;
import com.csmtech.repository.QuestionRepository;

@Controller
public class MyController {
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private AnswerRepository answerRepository;
	
	@RequestMapping("/test")
	public void fetchData() {
		List<Question> que=new ArrayList<Question>();
		List<Answer> ans=new ArrayList<Answer>();
    	 Question question=new Question();
    	 
    	 question.setQuestionId(1002);
    	 question.setQuestionName("what is java");
    	 Question question1=new Question();
    	 question1.setQuestionId(1003);
    	 question1.setQuestionName("what is spring boot");
    	 
    	 Answer answer=new Answer();
    	 
    	 answer.setAnswerId(101);
    	 answer.setAnswerName("java is programming language");
    	 answer.setQuestion(question);
    	 Answer answer1=new Answer();
    	 answer1.setAnswerId(102);
    	 answer1.setAnswerName("framework");
    	 answer1.setQuestion(question1);
    	 que.add(question);
    	 que.add(question1);
    	 ans.add(answer);
    	 ans.add(answer1);
    	 
    	 questionRepository.saveAll(que);
    	 answerRepository.saveAll(ans);
    	 System.out.println("work is done...");
//    	Optional<Answer> findById = answerRepository.findById(101);
//    	//System.out.println(findById);
//    	Answer ans1=findById.get();
//    	System.out.println(ans1);
//    	ans1.getQuestion().getQuestionName();
//    	
//    	 Optional<Answer> findById2 = answerRepository.findById(102);
//    	 //System.out.println(findById2);
//    	 Answer ans2 = findById2.get();
//    	 //System.out.println(ans2);
//    	 String questionName = ans2.getQuestion().getQuestionName();
//    	// System.out.println(questionName);
//    	 String answerName1 = ans2.getAnswerName();
//    	// System.out.println(answerName1);
    	 
    	 List<Question> findAll = questionRepository.findAll();
    	 System.out.println(findAll);
    	 
      }
}
