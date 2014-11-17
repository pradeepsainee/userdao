

import play.api.test._
import play.api.test.Helpers._
import play.api.Play.current

import play.api.db.slick.DB
//import scala.slick.jdbc.JdbcBackend.Session 

import org.scalatest._
import play.api.test._
import play.api.test.Helpers._
import collection.mutable.Stack
import org.scalatestplus.play._ 

import models.UserDao
import demo.Tables._

class userDaoTest extends PlaySpec with OneAppPerSuite {


	"object UserDao" must {


		"create a new user" in {

				val userrow = UsersRow(userid = 5, password="saini", isencrypted="Y", lastaccessdate=None, forcepasswordchange="N", logineffectivedate=None, loginexpirydate=None, securityprofileid=6, isloggedin="N", passwordmodifieddate=None, islocked="N", lockdate=None, passwordattempts = 0, timezoneid=None, languageid=None, lastfailedlogindate=None, status="i", createdby=None, createddate=None, lastupdatedby=None, lastupdateddate=None)
				UserDao.create(userrow)
		}

	 }

	 
	 "get a single user by id" in {


	 	val singleUser = UserDao.getUsersById(5)

	 	singleUser.head.userid mustBe (5)
	 	singleUser.head.password mustBe ("saini") 


	 }


	 "get all usersrow as list" in {

	 	UserDao.getUsersList.length mustBe (1)

	 }


	"update a single user by his is userid" in{


		val newuserinfo =  UsersRow(userid = 5, password="punjab", isencrypted="Y", lastaccessdate=None, forcepasswordchange="N", logineffectivedate=None, loginexpirydate=None, securityprofileid=136, isloggedin="N", passwordmodifieddate=None, islocked="N", lockdate=None, passwordattempts = 0, timezoneid=None, languageid=None, lastfailedlogindate=None, status="i", createdby=None, createddate=None, lastupdatedby=None, lastupdateddate=None)

		UserDao.updateUsersById(newuserinfo)


		val singleUser = UserDao.getUsersById(5)

	 	singleUser.head.password mustBe ("punjab") 
	 	singleUser.head.securityprofileid mustBe (136)


	}


	"update a list of users" in {

		UserDao.updateUsersByList(List(UsersRow(userid = 5, password="haryana", isencrypted="Y", lastaccessdate=None, forcepasswordchange="N", logineffectivedate=None, loginexpirydate=None, securityprofileid=136, isloggedin="N", passwordmodifieddate=None, islocked="N", lockdate=None, passwordattempts = 0, timezoneid=None, languageid=None, lastfailedlogindate=None, status="i", createdby=None, createddate=None, lastupdatedby=None, lastupdateddate=None)))

		val singleUser = UserDao.getUsersById(5)

	 	singleUser.head.password mustBe ("haryana")


	}

}