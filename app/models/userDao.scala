
package models

import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import play.api.Play.current



//importing autogenerated slick code

import demo.Tables._
import demo.Tables

object UserDao {

	  var Users = new TableQuery(tag => new Users(tag))

	  
	  //create a new user

	  def create(userrow : UsersRow) = {

	 	DB.withSession{ implicit session => 

	 	Users += userrow
	 	
	 	}
	  }
 


	 //get a user by primary key

	 def getUsersById(id:Int):List[UsersRow] =  {


	 	DB.withSession{ implicit session =>

	 		Users filter( _.userid === id) list
	   }
	 } 


 	//get all rows from user table

	 def getUsersList = {

	 	DB.withSession{ 

	 		implicit session => Users.list

		}
	  }


	 //update a userrow by userid

	 def updateUsersById(userrow:UsersRow) = {

	 	DB.withSession{ implicit session => 

	 		Users.where( _.userid === userrow.userid).update(userrow) 

	 	}
	  }


	 
	 def updateUsersByList(userlist : List[UsersRow]) = {

	 	DB.withSession {

	 		implicit session => userlist.foreach{ userrow => 

	 			Users.where( _.userid === userrow.userid).update(userrow) 
  		 }
	   }



 }

}

