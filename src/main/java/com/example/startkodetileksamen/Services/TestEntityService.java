package com.example.startkodetileksamen.Services;

import com.example.startkodetileksamen.Repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestEntityService {

    //Autowired laver contrcutor for os eller kan man lave den manuelt.
    @Autowired
    TestRepository testRepository;

    public void TestEntityService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    //fx. Get a List of something

    //fx. Convert Entity til DTO fx TestEntityResponse

    //fx Add something

    //fx. Edit something

    //fx Delete something
}
