/*package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class PublicBlog extends Controller
{
	public static void visit(Long id)
	{
		User user = User.findById(id);
		Logger.info("just visting the page for " + user.firstName + ' ' + user.lastName);
		render(user);
	}

public static void newComment(String title, String body, Long id)
{
	  User from = Accounts.getLoggedInUser();
	  if(from != null)
	  {
		  User to = User.findById(id);
		  Logger.info("comment from user " +
		  from.firstName + ' ' + from.lastName +" to " +
		  to.firstName +": "+
		  comment);
		  
	  }
		  
	  }
	  	
	
}*/