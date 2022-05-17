package com.example.startkodetileksamen.configuration;

import com.example.startkodetileksamen.Entities.TestEntity;
import com.example.startkodetileksamen.Repositories.TestRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;


@Profile("!test")
@Controller
public class MakeTestData implements ApplicationRunner {

    private TestRepository testRepository;

    TestEntity t1;

    public MakeTestData(TestRepository testRepository){
        this.testRepository = testRepository;
    }
    public void CreatEntity(){
        t1 = new TestEntity("Thony","Dyreborg");
        testRepository.save(t1);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        CreatEntity();

    }
}
