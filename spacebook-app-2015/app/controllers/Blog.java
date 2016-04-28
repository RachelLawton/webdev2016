package controllers;

import java.util.List;

import models.Message;
import models.Post;
import models.User;
//import models.Comment;
import play.Logger;
import play.mvc.Controller;



public class Blog  extends Controller
{
  public static void index()
  {
    User user = Accounts.getLoggedInUser();
    render(user);
  }
  
  public static void newPost(String title, String content)
  {
    User user = Accounts.getLoggedInUser();
    
    Post post = new Post (title, content);
    post.save();
    user.posts.add(post);
    user.save();
    
    Logger.info ("title:" + title + " content:" + content);
    index();
  }
  
  /*public static void newComment(String body)//, Long id)
  {
	  User user = Accounts.getLoggedInUser();
	  
	  Comment comment = new Comment  (body);//,id);
	  comment.save();
	  user.comment.add(comment);
	  user.save();
	  
	  Logger.info ("body:" + body); //+ "id" + id +);
	  index();
	  }*/


}