package test;

import backEnd.Comment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Test;

public class CommentTest extends Comment {
    @Test
    public void testConstructorWithNoArguments() {
        Comment comment = new Comment();
        Assert.assertEquals(Comment.NIL_UUID, comment.getId());
        Assert.assertEquals(LocalDate.now(), comment.getDate());
        Assert.assertEquals("none", comment.getContent());
        Assert.assertEquals(new ArrayList<Comment>(), comment.getReplys());
    }
    
    @Test
    public void testConstructorWithAllArguments() {
        // User user = new Student("John", "Doe", "johndoe@example.com", "password");
        LocalDate date = LocalDate.of(2022, 1, 1);
        String content = "This is a comment.";
        ArrayList<Comment> replys = new ArrayList<Comment>();
        Comment reply1 = new Comment();
        Comment reply2 = new Comment();
        replys.add(reply1);
        replys.add(reply2);
        
        Comment comment = new Comment(user, date, content, replys);
        
        Assert.assertNotEquals(Comment.NIL_UUID, comment.getId());
        Assert.assertEquals(user, comment.getUser());
        Assert.assertEquals(date, comment.getDate());
        Assert.assertEquals(content, comment.getContent());
        Assert.assertEquals(replys, comment.getReplys());
    }
    
    @Test
    public void testConstructorWithID() {
        UUID id = UUID.randomUUID();
        // User user = new Teacher("Jane", "Smith", "janesmith@example.com", "password", "Computer Science");
        LocalDate date = LocalDate.of(2022, 1, 1);
        String content = "This is a comment.";
        ArrayList<Comment> replys = new ArrayList<Comment>();
        Comment reply1 = new Comment();
        Comment reply2 = new Comment();
        replys.add(reply1);
        replys.add(reply2);
        
        Comment comment = new Comment(id, user, date, content, replys);
        
        Assert.assertEquals(id, comment.getId());
        Assert.assertEquals(user, comment.getUser());
        Assert.assertEquals(date, comment.getDate());
        Assert.assertEquals(content, comment.getContent());
        Assert.assertEquals(replys, comment.getReplys());
    }
    
    @Test
    public void testGetReplyByUUID() {
        Comment reply1 = new Comment();
        Comment reply2 = new Comment();
        UUID id1 = reply1.getId();
        UUID id2 = reply2.getId();
        
        ArrayList<Comment> replys = new ArrayList<Comment>();
        replys.add(reply1);
        replys.add(reply2);
        
        // Comment comment = new Comment(new Teacher(), LocalDate.now(), "This is a comment.", replys);
        
        Assert.assertEquals(reply1, comment.getReplyByUUID(id1));
        Assert.assertEquals(reply2, comment.getReplyByUUID(id2));
    }
}
