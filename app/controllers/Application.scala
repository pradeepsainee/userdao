package controllers

import play.api._
import play.api.mvc._
import models.UserDao

import demo.Tables._
import demo.Tables

object Application extends Controller {





val userr = UsersRow(userid = 5, password="pradeeo is 5", isencrypted="Y", lastaccessdate=None, forcepasswordchange="N", logineffectivedate=None, loginexpirydate=None, securityprofileid=6, isloggedin="N", passwordmodifieddate=None, islocked="N", lockdate=None, passwordattempts = 0, timezoneid=None, languageid=None, lastfailedlogindate=None, status="i", createdby=None, createddate=None, lastupdatedby=None, lastupdateddate=None)


  def index = play.api.mvc.Action {

  	//UserDao.create
    //Ok(UserDao.updateUsersById(userr).toString)
    Ok(UserDao.getUsersList.toString)
  }

}