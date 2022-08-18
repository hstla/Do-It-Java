package schedular;

import java.io.IOException;
import java.sql.Connection;

public class SchedularTest {
  public static void main(String[] args) throws IOException {
    // R, L, P, A
    System.out.println("전화 상담 배분상식을 선택하세요.");
    int ch=System.in.read();
    Scheduler shedular=null;

    if(ch=='R' || ch=='r'){
      shedular=new RoundRobin();
    }else if(ch=='L' || ch=='l'){
      shedular=new LeastJob();
    }else if(ch=='P' || ch=='p'){
      shedular=new PriorityAllocation();
    }else if(ch=='A' || ch=='a'){
      shedular=new AgentGetCall();
    }else {
      System.out.println("지원하지 않는 기능입니다.");
      return;
    }
    shedular.getNextCall();
    shedular.sendCallToAgent();
  }
}


