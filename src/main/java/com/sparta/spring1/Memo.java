package com.sparta.spring1;

import lombok.*;

//이거 쓰면 코드로 쓰거나 보이지 않아도 getter메소드 ,...이런게 만들어져있다는거임
//build에서 어떤게 만들어져있는지 확인 가능함!
//그래서 밑 메인문에서 저렇게 코드를 써도 오류가 안나는거임
@Getter
@Setter
@AllArgsConstructor //모든 필드가 들어가는 생성자
//@NoArgsConstructor //기본 생성자
@RequiredArgsConstructor //final이 달려있는 필드들을 가지는 생성자
public class Memo {
    private final String username;
    private String contents;
}

class Main{
    public static void main(String[] args) {
        //Memo memo=new Memo();
        Memo memo2=new Memo("kimpangya", "생성자2");
        //memo.setUsername("pangya"); //username = final 변할 수 없는 값을 바꾸려고 해서 오류난거임
        //System.out.println(memo.getUsername());
    }
}