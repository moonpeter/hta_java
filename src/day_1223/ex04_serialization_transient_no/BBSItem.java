package day_1223.ex04_serialization_transient_no;

import java.io.Serializable;

public class BBSItem implements Serializable {
    private static int ItemNum = 0;
    private String writer;
    private transient String password;
    private String title;
    private String content;
    private GoodsStock g;

    BBSItem(String writer, String password, String title, String content, GoodsStock g){
        this.writer = writer;
        this.password = password;
        this.title = title;
        this.content = content;
        this.g = g;
        ItemNum++;
    }

    void modifyContent(String content, String password){
        if(!this.password.equals(password)) {
            return;
        } else {
            this.content = content;
        }
    }

    public String toString() {
        return "전체게시물의 수 : " + ItemNum + "\n"
        + "글쓴이 : " + writer + "\n"
        + "패스워드 : " + password + "\n"
        + "제목 : " + title + "\n"
        + "내용 : " + content + "\n"
        + g;
    }
}
