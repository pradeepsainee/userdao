package demo
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = scala.slick.driver.MySQLDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: scala.slick.driver.JdbcProfile
  import profile.simple._
  import scala.slick.model.ForeignKeyAction
  import scala.slick.collection.heterogenous._
  import scala.slick.collection.heterogenous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import scala.slick.jdbc.{GetResult => GR}
  
  /** DDL for all tables. Call .create to execute. */
  lazy val ddl = Action.ddl ++ Address.ddl ++ Apps.ddl ++ Auditusertracker.ddl ++ Auditusertrackerpath.ddl ++ Company.ddl ++ Companygroup.ddl ++ Contact.ddl ++ Modules.ddl ++ Param.ddl ++ Passworddictionary.ddl ++ Passwordhistory.ddl ++ Permission.ddl ++ Portrait.ddl ++ Resource.ddl ++ Role.ddl ++ Securityprofiles.ddl ++ Sequence.ddl ++ Submodules.ddl ++ Usergroup.ddl ++ Userroamprofile.ddl ++ Userrole.ddl ++ Users.ddl ++ Userusergroup.ddl
  
  /** Entity class storing rows of table Action
   *  @param actionid Database column actionId PrimaryKey
   *  @param actiondesc Database column actionDesc 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class ActionRow(actionid: Int, actiondesc: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching ActionRow objects using plain SQL queries */
  implicit def GetResultActionRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[ActionRow] = GR{
    prs => import prs._
    ActionRow.tupled((<<[Int], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table action. Objects of this class serve as prototypes for rows in queries. */
  class Action(tag: Tag) extends Table[ActionRow](tag, "action") {
    def * = (actionid, actiondesc, createdby, createddate, lastupdatedby, lastupdateddate) <> (ActionRow.tupled, ActionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (actionid.?, actiondesc.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> ActionRow.tupled((_1.get, _2.get, _3, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column actionId PrimaryKey */
    val actionid: Column[Int] = column[Int]("actionId", O.PrimaryKey)
    /** Database column actionDesc  */
    val actiondesc: Column[String] = column[String]("actionDesc")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Action */
  lazy val Action = new TableQuery(tag => new Action(tag))
  
  /** Entity class storing rows of table Address
   *  @param addressid Database column addressId Default(0), PrimaryKey
   *  @param addressline1 Database column addressLine1 
   *  @param addressline2 Database column addressLine2 
   *  @param addressline3 Database column addressLine3 
   *  @param landmark Database column landmark 
   *  @param addresstype Database column addressType 
   *  @param zip Database column zip 
   *  @param city Database column city 
   *  @param region Database column region 
   *  @param country Database column country Default(None)
   *  @param isprimary Database column isPrimary 
   *  @param status Database column status 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class AddressRow(addressid: Int = 0, addressline1: String, addressline2: Option[String], addressline3: Option[String], landmark: Option[String], addresstype: String, zip: Option[String], city: Option[String], region: Option[String], country: Option[String] = None, isprimary: String, status: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching AddressRow objects using plain SQL queries */
  implicit def GetResultAddressRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[AddressRow] = GR{
    prs => import prs._
    AddressRow.tupled((<<[Int], <<[String], <<?[String], <<?[String], <<?[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table address. Objects of this class serve as prototypes for rows in queries. */
  class Address(tag: Tag) extends Table[AddressRow](tag, "address") {
    def * = (addressid, addressline1, addressline2, addressline3, landmark, addresstype, zip, city, region, country, isprimary, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (AddressRow.tupled, AddressRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (addressid.?, addressline1.?, addressline2, addressline3, landmark, addresstype.?, zip, city, region, country, isprimary.?, status.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> AddressRow.tupled((_1.get, _2.get, _3, _4, _5, _6.get, _7, _8, _9, _10, _11.get, _12.get, _13, _14, _15, _16)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column addressId Default(0), PrimaryKey */
    val addressid: Column[Int] = column[Int]("addressId", O.Default(0), O.PrimaryKey)
    /** Database column addressLine1  */
    val addressline1: Column[String] = column[String]("addressLine1")
    /** Database column addressLine2  */
    val addressline2: Column[Option[String]] = column[Option[String]]("addressLine2")
    /** Database column addressLine3  */
    val addressline3: Column[Option[String]] = column[Option[String]]("addressLine3")
    /** Database column landmark  */
    val landmark: Column[Option[String]] = column[Option[String]]("landmark")
    /** Database column addressType  */
    val addresstype: Column[String] = column[String]("addressType")
    /** Database column zip  */
    val zip: Column[Option[String]] = column[Option[String]]("zip")
    /** Database column city  */
    val city: Column[Option[String]] = column[Option[String]]("city")
    /** Database column region  */
    val region: Column[Option[String]] = column[Option[String]]("region")
    /** Database column country Default(None) */
    val country: Column[Option[String]] = column[Option[String]]("country", O.Default(None))
    /** Database column isPrimary  */
    val isprimary: Column[String] = column[String]("isPrimary")
    /** Database column status  */
    val status: Column[String] = column[String]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Address */
  lazy val Address = new TableQuery(tag => new Address(tag))
  
  /** Entity class storing rows of table Apps
   *  @param appid Database column appId Default(0), PrimaryKey
   *  @param shortname Database column shortName 
   *  @param longname Database column longName 
   *  @param alias Database column alias 
   *  @param compid Database column compId 
   *  @param status Database column status 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class AppsRow(appid: Int = 0, shortname: Option[String], longname: Option[String], alias: String, compid: Int, status: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching AppsRow objects using plain SQL queries */
  implicit def GetResultAppsRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[java.sql.Timestamp]]): GR[AppsRow] = GR{
    prs => import prs._
    AppsRow.tupled((<<[Int], <<?[String], <<?[String], <<[String], <<[Int], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table apps. Objects of this class serve as prototypes for rows in queries. */
  class Apps(tag: Tag) extends Table[AppsRow](tag, "apps") {
    def * = (appid, shortname, longname, alias, compid, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (AppsRow.tupled, AppsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (appid.?, shortname, longname, alias.?, compid.?, status.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> AppsRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6.get, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column appId Default(0), PrimaryKey */
    val appid: Column[Int] = column[Int]("appId", O.Default(0), O.PrimaryKey)
    /** Database column shortName  */
    val shortname: Column[Option[String]] = column[Option[String]]("shortName")
    /** Database column longName  */
    val longname: Column[Option[String]] = column[Option[String]]("longName")
    /** Database column alias  */
    val alias: Column[String] = column[String]("alias")
    /** Database column compId  */
    val compid: Column[Int] = column[Int]("compId")
    /** Database column status  */
    val status: Column[String] = column[String]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
    
    /** Index over (compid) (database name companyId_idx) */
    val index1 = index("companyId_idx", compid)
  }
  /** Collection-like TableQuery object for table Apps */
  lazy val Apps = new TableQuery(tag => new Apps(tag))
  
  /** Entity class storing rows of table Auditusertracker
   *  @param auditusertrackerid Database column auditUserTrackerId PrimaryKey
   *  @param companyid Database column companyId 
   *  @param userid Database column userId 
   *  @param sessionid Database column sessionId 
   *  @param remoteaddr Database column remoteAddr 
   *  @param remoteip Database column remoteIp 
   *  @param useragent Database column userAgent 
   *  @param date Database column date 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class AuditusertrackerRow(auditusertrackerid: Int, companyid: Int, userid: Int, sessionid: String, remoteaddr: String, remoteip: String, useragent: String, date: java.sql.Timestamp, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching AuditusertrackerRow objects using plain SQL queries */
  implicit def GetResultAuditusertrackerRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[String]], e4: GR[Option[java.sql.Timestamp]]): GR[AuditusertrackerRow] = GR{
    prs => import prs._
    AuditusertrackerRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table auditUserTracker. Objects of this class serve as prototypes for rows in queries. */
  class Auditusertracker(tag: Tag) extends Table[AuditusertrackerRow](tag, "auditUserTracker") {
    def * = (auditusertrackerid, companyid, userid, sessionid, remoteaddr, remoteip, useragent, date, createdby, createddate, lastupdatedby, lastupdateddate) <> (AuditusertrackerRow.tupled, AuditusertrackerRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (auditusertrackerid.?, companyid.?, userid.?, sessionid.?, remoteaddr.?, remoteip.?, useragent.?, date.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> AuditusertrackerRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column auditUserTrackerId PrimaryKey */
    val auditusertrackerid: Column[Int] = column[Int]("auditUserTrackerId", O.PrimaryKey)
    /** Database column companyId  */
    val companyid: Column[Int] = column[Int]("companyId")
    /** Database column userId  */
    val userid: Column[Int] = column[Int]("userId")
    /** Database column sessionId  */
    val sessionid: Column[String] = column[String]("sessionId")
    /** Database column remoteAddr  */
    val remoteaddr: Column[String] = column[String]("remoteAddr")
    /** Database column remoteIp  */
    val remoteip: Column[String] = column[String]("remoteIp")
    /** Database column userAgent  */
    val useragent: Column[String] = column[String]("userAgent")
    /** Database column date  */
    val date: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("date")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
    
    /** Index over (companyid) (database name companyId_idx) */
    val index1 = index("companyId_idx", companyid)
    /** Index over (userid) (database name userId_idx) */
    val index2 = index("userId_idx", userid)
  }
  /** Collection-like TableQuery object for table Auditusertracker */
  lazy val Auditusertracker = new TableQuery(tag => new Auditusertracker(tag))
  
  /** Entity class storing rows of table Auditusertrackerpath
   *  @param auditusertrackerpathid Database column auditUserTrackerPathId Default(0), PrimaryKey
   *  @param usertrackerid Database column userTrackerId 
   *  @param path Database column path_ 
   *  @param pathdate Database column pathDate 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class AuditusertrackerpathRow(auditusertrackerpathid: Int = 0, usertrackerid: Int, path: Option[String], pathdate: Option[java.sql.Timestamp], createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching AuditusertrackerpathRow objects using plain SQL queries */
  implicit def GetResultAuditusertrackerpathRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]]): GR[AuditusertrackerpathRow] = GR{
    prs => import prs._
    AuditusertrackerpathRow.tupled((<<[Int], <<[Int], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table auditUserTrackerPath. Objects of this class serve as prototypes for rows in queries. */
  class Auditusertrackerpath(tag: Tag) extends Table[AuditusertrackerpathRow](tag, "auditUserTrackerPath") {
    def * = (auditusertrackerpathid, usertrackerid, path, pathdate, createdby, createddate, lastupdatedby, lastupdateddate) <> (AuditusertrackerpathRow.tupled, AuditusertrackerpathRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (auditusertrackerpathid.?, usertrackerid.?, path, pathdate, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> AuditusertrackerpathRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column auditUserTrackerPathId Default(0), PrimaryKey */
    val auditusertrackerpathid: Column[Int] = column[Int]("auditUserTrackerPathId", O.Default(0), O.PrimaryKey)
    /** Database column userTrackerId  */
    val usertrackerid: Column[Int] = column[Int]("userTrackerId")
    /** Database column path_  */
    val path: Column[Option[String]] = column[Option[String]]("path_")
    /** Database column pathDate  */
    val pathdate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("pathDate")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Auditusertrackerpath */
  lazy val Auditusertrackerpath = new TableQuery(tag => new Auditusertrackerpath(tag))
  
  /** Entity class storing rows of table Company
   *  @param companyid Database column companyId Default(0), PrimaryKey
   *  @param shortname Database column shortName 
   *  @param longname Database column longName 
   *  @param alias Database column alias 
   *  @param compgroupid Database column compGroupId 
   *  @param status Database column status 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class CompanyRow(companyid: Int = 0, shortname: String, longname: Option[String], alias: Option[String], compgroupid: Int, status: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching CompanyRow objects using plain SQL queries */
  implicit def GetResultCompanyRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[CompanyRow] = GR{
    prs => import prs._
    CompanyRow.tupled((<<[Int], <<[String], <<?[String], <<?[String], <<[Int], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table company. Objects of this class serve as prototypes for rows in queries. */
  class Company(tag: Tag) extends Table[CompanyRow](tag, "company") {
    def * = (companyid, shortname, longname, alias, compgroupid, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (CompanyRow.tupled, CompanyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (companyid.?, shortname.?, longname, alias, compgroupid.?, status.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> CompanyRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6.get, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column companyId Default(0), PrimaryKey */
    val companyid: Column[Int] = column[Int]("companyId", O.Default(0), O.PrimaryKey)
    /** Database column shortName  */
    val shortname: Column[String] = column[String]("shortName")
    /** Database column longName  */
    val longname: Column[Option[String]] = column[Option[String]]("longName")
    /** Database column alias  */
    val alias: Column[Option[String]] = column[Option[String]]("alias")
    /** Database column compGroupId  */
    val compgroupid: Column[Int] = column[Int]("compGroupId")
    /** Database column status  */
    val status: Column[String] = column[String]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
    
    /** Index over (compgroupid) (database name id_idx) */
    val index1 = index("id_idx", compgroupid)
  }
  /** Collection-like TableQuery object for table Company */
  lazy val Company = new TableQuery(tag => new Company(tag))
  
  /** Entity class storing rows of table Companygroup
   *  @param companygroupid Database column companyGroupId Default(0), PrimaryKey
   *  @param shortname Database column shortName 
   *  @param longname Database column longName 
   *  @param alias Database column alias 
   *  @param status Database column status 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class CompanygroupRow(companygroupid: Int = 0, shortname: String, longname: Option[String], alias: Option[String], status: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching CompanygroupRow objects using plain SQL queries */
  implicit def GetResultCompanygroupRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[CompanygroupRow] = GR{
    prs => import prs._
    CompanygroupRow.tupled((<<[Int], <<[String], <<?[String], <<?[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table companyGroup. Objects of this class serve as prototypes for rows in queries. */
  class Companygroup(tag: Tag) extends Table[CompanygroupRow](tag, "companyGroup") {
    def * = (companygroupid, shortname, longname, alias, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (CompanygroupRow.tupled, CompanygroupRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (companygroupid.?, shortname.?, longname, alias, status.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> CompanygroupRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column companyGroupId Default(0), PrimaryKey */
    val companygroupid: Column[Int] = column[Int]("companyGroupId", O.Default(0), O.PrimaryKey)
    /** Database column shortName  */
    val shortname: Column[String] = column[String]("shortName")
    /** Database column longName  */
    val longname: Column[Option[String]] = column[Option[String]]("longName")
    /** Database column alias  */
    val alias: Column[Option[String]] = column[Option[String]]("alias")
    /** Database column status  */
    val status: Column[String] = column[String]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Companygroup */
  lazy val Companygroup = new TableQuery(tag => new Companygroup(tag))
  
  /** Entity class storing rows of table Contact
   *  @param contactid Database column contactId Default(0), PrimaryKey
   *  @param value Database column value 
   *  @param `type` Database column type 
   *  @param isprimary Database column isPrimary 
   *  @param contactof Database column contactOf 
   *  @param status Database column status 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class ContactRow(contactid: Int = 0, value: String, `type`: String, isprimary: String, contactof: String, status: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching ContactRow objects using plain SQL queries */
  implicit def GetResultContactRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[ContactRow] = GR{
    prs => import prs._
    ContactRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table contact. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class Contact(tag: Tag) extends Table[ContactRow](tag, "contact") {
    def * = (contactid, value, `type`, isprimary, contactof, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (ContactRow.tupled, ContactRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (contactid.?, value.?, `type`.?, isprimary.?, contactof.?, status.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> ContactRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column contactId Default(0), PrimaryKey */
    val contactid: Column[Int] = column[Int]("contactId", O.Default(0), O.PrimaryKey)
    /** Database column value  */
    val value: Column[String] = column[String]("value")
    /** Database column type 
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Column[String] = column[String]("type")
    /** Database column isPrimary  */
    val isprimary: Column[String] = column[String]("isPrimary")
    /** Database column contactOf  */
    val contactof: Column[String] = column[String]("contactOf")
    /** Database column status  */
    val status: Column[String] = column[String]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Contact */
  lazy val Contact = new TableQuery(tag => new Contact(tag))
  
  /** Entity class storing rows of table Modules
   *  @param moduleid Database column moduleId PrimaryKey
   *  @param shortdesc Database column shortDesc 
   *  @param longdesc Database column longDesc 
   *  @param appid Database column appId 
   *  @param status Database column status Default(None)
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class ModulesRow(moduleid: Int, shortdesc: String, longdesc: Option[String], appid: Int, status: Option[String] = None, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching ModulesRow objects using plain SQL queries */
  implicit def GetResultModulesRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[ModulesRow] = GR{
    prs => import prs._
    ModulesRow.tupled((<<[Int], <<[String], <<?[String], <<[Int], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table modules. Objects of this class serve as prototypes for rows in queries. */
  class Modules(tag: Tag) extends Table[ModulesRow](tag, "modules") {
    def * = (moduleid, shortdesc, longdesc, appid, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (ModulesRow.tupled, ModulesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (moduleid.?, shortdesc.?, longdesc, appid.?, status, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> ModulesRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column moduleId PrimaryKey */
    val moduleid: Column[Int] = column[Int]("moduleId", O.PrimaryKey)
    /** Database column shortDesc  */
    val shortdesc: Column[String] = column[String]("shortDesc")
    /** Database column longDesc  */
    val longdesc: Column[Option[String]] = column[Option[String]]("longDesc")
    /** Database column appId  */
    val appid: Column[Int] = column[Int]("appId")
    /** Database column status Default(None) */
    val status: Column[Option[String]] = column[Option[String]]("status", O.Default(None))
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Modules */
  lazy val Modules = new TableQuery(tag => new Modules(tag))
  
  /** Entity class storing rows of table Param
   *  @param paramid Database column paramId Default(0), PrimaryKey
   *  @param `type` Database column type 
   *  @param value Database column value 
   *  @param status Database column status  */
  case class ParamRow(paramid: Int = 0, `type`: Option[String], value: Option[String], status: Option[String])
  /** GetResult implicit for fetching ParamRow objects using plain SQL queries */
  implicit def GetResultParamRow(implicit e0: GR[Int], e1: GR[Option[String]]): GR[ParamRow] = GR{
    prs => import prs._
    ParamRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table param. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class Param(tag: Tag) extends Table[ParamRow](tag, "param") {
    def * = (paramid, `type`, value, status) <> (ParamRow.tupled, ParamRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (paramid.?, `type`, value, status).shaped.<>({r=>import r._; _1.map(_=> ParamRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column paramId Default(0), PrimaryKey */
    val paramid: Column[Int] = column[Int]("paramId", O.Default(0), O.PrimaryKey)
    /** Database column type 
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Column[Option[String]] = column[Option[String]]("type")
    /** Database column value  */
    val value: Column[Option[String]] = column[Option[String]]("value")
    /** Database column status  */
    val status: Column[Option[String]] = column[Option[String]]("status")
  }
  /** Collection-like TableQuery object for table Param */
  lazy val Param = new TableQuery(tag => new Param(tag))
  
  /** Entity class storing rows of table Passworddictionary
   *  @param passworddictionaryid Database column passwordDictionaryId PrimaryKey
   *  @param password Database column password 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class PassworddictionaryRow(passworddictionaryid: Short, password: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching PassworddictionaryRow objects using plain SQL queries */
  implicit def GetResultPassworddictionaryRow(implicit e0: GR[Short], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[PassworddictionaryRow] = GR{
    prs => import prs._
    PassworddictionaryRow.tupled((<<[Short], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table passwordDictionary. Objects of this class serve as prototypes for rows in queries. */
  class Passworddictionary(tag: Tag) extends Table[PassworddictionaryRow](tag, "passwordDictionary") {
    def * = (passworddictionaryid, password, createdby, createddate, lastupdatedby, lastupdateddate) <> (PassworddictionaryRow.tupled, PassworddictionaryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (passworddictionaryid.?, password.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> PassworddictionaryRow.tupled((_1.get, _2.get, _3, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column passwordDictionaryId PrimaryKey */
    val passworddictionaryid: Column[Short] = column[Short]("passwordDictionaryId", O.PrimaryKey)
    /** Database column password  */
    val password: Column[String] = column[String]("password")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Passworddictionary */
  lazy val Passworddictionary = new TableQuery(tag => new Passworddictionary(tag))
  
  /** Entity class storing rows of table Passwordhistory
   *  @param userid Database column userId PrimaryKey
   *  @param password Database column password 
   *  @param status Database column status Default(None)
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class PasswordhistoryRow(userid: Int, password: String, status: Option[String] = None, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching PasswordhistoryRow objects using plain SQL queries */
  implicit def GetResultPasswordhistoryRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[PasswordhistoryRow] = GR{
    prs => import prs._
    PasswordhistoryRow.tupled((<<[Int], <<[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table passwordHistory. Objects of this class serve as prototypes for rows in queries. */
  class Passwordhistory(tag: Tag) extends Table[PasswordhistoryRow](tag, "passwordHistory") {
    def * = (userid, password, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (PasswordhistoryRow.tupled, PasswordhistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (userid.?, password.?, status, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> PasswordhistoryRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column userId PrimaryKey */
    val userid: Column[Int] = column[Int]("userId", O.PrimaryKey)
    /** Database column password  */
    val password: Column[String] = column[String]("password")
    /** Database column status Default(None) */
    val status: Column[Option[String]] = column[Option[String]]("status", O.Default(None))
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Passwordhistory */
  lazy val Passwordhistory = new TableQuery(tag => new Passwordhistory(tag))
  
  /** Entity class storing rows of table Permission
   *  @param permissionid Database column permissionId PrimaryKey
   *  @param actionid Database column actionId 
   *  @param resourceid Database column resourceId 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class PermissionRow(permissionid: Int, actionid: Int, resourceid: Int, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching PermissionRow objects using plain SQL queries */
  implicit def GetResultPermissionRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]]): GR[PermissionRow] = GR{
    prs => import prs._
    PermissionRow.tupled((<<[Int], <<[Int], <<[Int], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table permission. Objects of this class serve as prototypes for rows in queries. */
  class Permission(tag: Tag) extends Table[PermissionRow](tag, "permission") {
    def * = (permissionid, actionid, resourceid, createdby, createddate, lastupdatedby, lastupdateddate) <> (PermissionRow.tupled, PermissionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (permissionid.?, actionid.?, resourceid.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> PermissionRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column permissionId PrimaryKey */
    val permissionid: Column[Int] = column[Int]("permissionId", O.PrimaryKey)
    /** Database column actionId  */
    val actionid: Column[Int] = column[Int]("actionId")
    /** Database column resourceId  */
    val resourceid: Column[Int] = column[Int]("resourceId")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
    
    /** Index over (resourceid) (database name resourceId_idx) */
    val index1 = index("resourceId_idx", resourceid)
  }
  /** Collection-like TableQuery object for table Permission */
  lazy val Permission = new TableQuery(tag => new Permission(tag))
  
  /** Entity class storing rows of table Portrait
   *  @param portraitid Database column portraitId Default(0), PrimaryKey
   *  @param url Database column url 
   *  @param description Database column description 
   *  @param uploadedon Database column uploadedOn 
   *  @param status Database column status 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class PortraitRow(portraitid: Int = 0, url: Option[String], description: Option[String], uploadedon: Option[java.sql.Timestamp], status: Option[String], createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching PortraitRow objects using plain SQL queries */
  implicit def GetResultPortraitRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]]): GR[PortraitRow] = GR{
    prs => import prs._
    PortraitRow.tupled((<<[Int], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table portrait. Objects of this class serve as prototypes for rows in queries. */
  class Portrait(tag: Tag) extends Table[PortraitRow](tag, "portrait") {
    def * = (portraitid, url, description, uploadedon, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (PortraitRow.tupled, PortraitRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (portraitid.?, url, description, uploadedon, status, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> PortraitRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column portraitId Default(0), PrimaryKey */
    val portraitid: Column[Int] = column[Int]("portraitId", O.Default(0), O.PrimaryKey)
    /** Database column url  */
    val url: Column[Option[String]] = column[Option[String]]("url")
    /** Database column description  */
    val description: Column[Option[String]] = column[Option[String]]("description")
    /** Database column uploadedOn  */
    val uploadedon: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("uploadedOn")
    /** Database column status  */
    val status: Column[Option[String]] = column[Option[String]]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Portrait */
  lazy val Portrait = new TableQuery(tag => new Portrait(tag))
  
  /** Entity class storing rows of table Resource
   *  @param resourceid Database column resourceId PrimaryKey
   *  @param shortdesc Database column shortDesc 
   *  @param longdesc Database column longDesc 
   *  @param submoduleid Database column subModuleId 
   *  @param status Database column status Default(None)
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class ResourceRow(resourceid: Int, shortdesc: String, longdesc: Option[String], submoduleid: Option[String], status: Option[String] = None, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching ResourceRow objects using plain SQL queries */
  implicit def GetResultResourceRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[ResourceRow] = GR{
    prs => import prs._
    ResourceRow.tupled((<<[Int], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table resource. Objects of this class serve as prototypes for rows in queries. */
  class Resource(tag: Tag) extends Table[ResourceRow](tag, "resource") {
    def * = (resourceid, shortdesc, longdesc, submoduleid, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (ResourceRow.tupled, ResourceRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (resourceid.?, shortdesc.?, longdesc, submoduleid, status, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> ResourceRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column resourceId PrimaryKey */
    val resourceid: Column[Int] = column[Int]("resourceId", O.PrimaryKey)
    /** Database column shortDesc  */
    val shortdesc: Column[String] = column[String]("shortDesc")
    /** Database column longDesc  */
    val longdesc: Column[Option[String]] = column[Option[String]]("longDesc")
    /** Database column subModuleId  */
    val submoduleid: Column[Option[String]] = column[Option[String]]("subModuleId")
    /** Database column status Default(None) */
    val status: Column[Option[String]] = column[Option[String]]("status", O.Default(None))
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Resource */
  lazy val Resource = new TableQuery(tag => new Resource(tag))
  
  /** Entity class storing rows of table Role
   *  @param roleid Database column roleId Default(0), PrimaryKey
   *  @param shortname Database column shortName 
   *  @param longname Database column longName 
   *  @param activationstartdate Database column activationStartDate 
   *  @param activationenddate Database column activationEndDate 
   *  @param appid Database column appId 
   *  @param status Database column status 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class RoleRow(roleid: Int = 0, shortname: Option[String], longname: String, activationstartdate: Option[java.sql.Date], activationenddate: Option[java.sql.Date], appid: Int, status: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching RoleRow objects using plain SQL queries */
  implicit def GetResultRoleRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[java.sql.Date]], e4: GR[Option[java.sql.Timestamp]]): GR[RoleRow] = GR{
    prs => import prs._
    RoleRow.tupled((<<[Int], <<?[String], <<[String], <<?[java.sql.Date], <<?[java.sql.Date], <<[Int], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table role. Objects of this class serve as prototypes for rows in queries. */
  class Role(tag: Tag) extends Table[RoleRow](tag, "role") {
    def * = (roleid, shortname, longname, activationstartdate, activationenddate, appid, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (RoleRow.tupled, RoleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (roleid.?, shortname, longname.?, activationstartdate, activationenddate, appid.?, status.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> RoleRow.tupled((_1.get, _2, _3.get, _4, _5, _6.get, _7.get, _8, _9, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column roleId Default(0), PrimaryKey */
    val roleid: Column[Int] = column[Int]("roleId", O.Default(0), O.PrimaryKey)
    /** Database column shortName  */
    val shortname: Column[Option[String]] = column[Option[String]]("shortName")
    /** Database column longName  */
    val longname: Column[String] = column[String]("longName")
    /** Database column activationStartDate  */
    val activationstartdate: Column[Option[java.sql.Date]] = column[Option[java.sql.Date]]("activationStartDate")
    /** Database column activationEndDate  */
    val activationenddate: Column[Option[java.sql.Date]] = column[Option[java.sql.Date]]("activationEndDate")
    /** Database column appId  */
    val appid: Column[Int] = column[Int]("appId")
    /** Database column status  */
    val status: Column[String] = column[String]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
    
    /** Index over (appid) (database name appId_idx) */
    val index1 = index("appId_idx", appid)
  }
  /** Collection-like TableQuery object for table Role */
  lazy val Role = new TableQuery(tag => new Role(tag))
  
  /** Row type of table Securityprofiles */
  type SecurityprofilesRow = HCons[Int,HCons[Option[String],HCons[String,HCons[String,HCons[Option[java.sql.Timestamp],HCons[Option[java.sql.Timestamp],HCons[String,HCons[Int,HCons[String,HCons[Int,HCons[String,HCons[Option[Int],HCons[String,HCons[Option[String],HCons[Option[Int],HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Option[Int],HCons[String,HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[java.sql.Timestamp],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for SecurityprofilesRow providing default values if available in the database schema. */
  def SecurityprofilesRow(securityprofilesid: Int = 0, shortdesc: Option[String], longdesc: String, logindurationrestriction: String, loginstarttime: Option[java.sql.Timestamp], loginendtime: Option[java.sql.Timestamp], pwdneverexpires: String, pwdexpirydays: Int = 0, maintenanceflag: String, gracelogincount: Int = 5, enforcehistory: String, historycount: Option[Int], changeable: String, checksyntax: Option[String], minalphanumeric: Option[Int], minlength: Int = 8, minlowercase: Int = 0, minnumbers: Int = 0, minsymbols: Int = 0, minuppercase: Int = 0, warningdays: Option[Int] = Some(3), status: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp]): SecurityprofilesRow = {
    securityprofilesid :: shortdesc :: longdesc :: logindurationrestriction :: loginstarttime :: loginendtime :: pwdneverexpires :: pwdexpirydays :: maintenanceflag :: gracelogincount :: enforcehistory :: historycount :: changeable :: checksyntax :: minalphanumeric :: minlength :: minlowercase :: minnumbers :: minsymbols :: minuppercase :: warningdays :: status :: createdby :: createddate :: lastupdatedby :: lastupdateddate :: HNil
  }
  /** GetResult implicit for fetching SecurityprofilesRow objects using plain SQL queries */
  implicit def GetResultSecurityprofilesRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Int]]): GR[SecurityprofilesRow] = GR{
    prs => import prs._
    <<[Int] :: <<?[String] :: <<[String] :: <<[String] :: <<?[java.sql.Timestamp] :: <<?[java.sql.Timestamp] :: <<[String] :: <<[Int] :: <<[String] :: <<[Int] :: <<[String] :: <<?[Int] :: <<[String] :: <<?[String] :: <<?[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<?[Int] :: <<[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[java.sql.Timestamp] :: HNil
  }
  /** Table description of table securityProfiles. Objects of this class serve as prototypes for rows in queries. */
  class Securityprofiles(tag: Tag) extends Table[SecurityprofilesRow](tag, "securityProfiles") {
    def * = securityprofilesid :: shortdesc :: longdesc :: logindurationrestriction :: loginstarttime :: loginendtime :: pwdneverexpires :: pwdexpirydays :: maintenanceflag :: gracelogincount :: enforcehistory :: historycount :: changeable :: checksyntax :: minalphanumeric :: minlength :: minlowercase :: minnumbers :: minsymbols :: minuppercase :: warningdays :: status :: createdby :: createddate :: lastupdatedby :: lastupdateddate :: HNil
    
    /** Database column securityProfilesId Default(0), PrimaryKey */
    val securityprofilesid: Column[Int] = column[Int]("securityProfilesId", O.Default(0), O.PrimaryKey)
    /** Database column shortDesc  */
    val shortdesc: Column[Option[String]] = column[Option[String]]("shortDesc")
    /** Database column longDesc  */
    val longdesc: Column[String] = column[String]("longDesc")
    /** Database column loginDurationRestriction  */
    val logindurationrestriction: Column[String] = column[String]("loginDurationRestriction")
    /** Database column loginStartTime  */
    val loginstarttime: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("loginStartTime")
    /** Database column loginEndTime  */
    val loginendtime: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("loginEndTime")
    /** Database column pwdNeverExpires  */
    val pwdneverexpires: Column[String] = column[String]("pwdNeverExpires")
    /** Database column pwdExpiryDays Default(0) */
    val pwdexpirydays: Column[Int] = column[Int]("pwdExpiryDays", O.Default(0))
    /** Database column maintenanceFlag  */
    val maintenanceflag: Column[String] = column[String]("maintenanceFlag")
    /** Database column graceLoginCount Default(5) */
    val gracelogincount: Column[Int] = column[Int]("graceLoginCount", O.Default(5))
    /** Database column enforceHistory  */
    val enforcehistory: Column[String] = column[String]("enforceHistory")
    /** Database column historyCount  */
    val historycount: Column[Option[Int]] = column[Option[Int]]("historyCount")
    /** Database column changeable  */
    val changeable: Column[String] = column[String]("changeable")
    /** Database column checkSyntax  */
    val checksyntax: Column[Option[String]] = column[Option[String]]("checkSyntax")
    /** Database column minAlphanumeric  */
    val minalphanumeric: Column[Option[Int]] = column[Option[Int]]("minAlphanumeric")
    /** Database column minLength Default(8) */
    val minlength: Column[Int] = column[Int]("minLength", O.Default(8))
    /** Database column minLowercase Default(0) */
    val minlowercase: Column[Int] = column[Int]("minLowercase", O.Default(0))
    /** Database column minNumbers Default(0) */
    val minnumbers: Column[Int] = column[Int]("minNumbers", O.Default(0))
    /** Database column minSymbols Default(0) */
    val minsymbols: Column[Int] = column[Int]("minSymbols", O.Default(0))
    /** Database column minUppercase Default(0) */
    val minuppercase: Column[Int] = column[Int]("minUppercase", O.Default(0))
    /** Database column warningDays Default(Some(3)) */
    val warningdays: Column[Option[Int]] = column[Option[Int]]("warningDays", O.Default(Some(3)))
    /** Database column status  */
    val status: Column[String] = column[String]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Securityprofiles */
  lazy val Securityprofiles = new TableQuery(tag => new Securityprofiles(tag))
  
  /** Entity class storing rows of table Sequence
   *  @param appid Database column appId 
   *  @param sequenceid Database column sequenceId 
   *  @param sequencename Database column sequenceName 
   *  @param sequenceincrement Database column sequenceIncrement 
   *  @param sequenceminvalue Database column sequenceMinValue 
   *  @param sequencemaxvalue Database column sequenceMaxValue 
   *  @param sequencecurrentvalue Database column sequenceCurrentValue 
   *  @param sequencecycle Database column sequenceCycle 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastaccessdate Database column lastAccessDate  */
  case class SequenceRow(appid: Int, sequenceid: Int, sequencename: String, sequenceincrement: Int, sequenceminvalue: Int, sequencemaxvalue: Option[Int], sequencecurrentvalue: Int, sequencecycle: Option[Int], createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastaccessdate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching SequenceRow objects using plain SQL queries */
  implicit def GetResultSequenceRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[Int]], e3: GR[Option[String]], e4: GR[Option[java.sql.Timestamp]]): GR[SequenceRow] = GR{
    prs => import prs._
    SequenceRow.tupled((<<[Int], <<[Int], <<[String], <<[Int], <<[Int], <<?[Int], <<[Int], <<?[Int], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table sequence. Objects of this class serve as prototypes for rows in queries. */
  class Sequence(tag: Tag) extends Table[SequenceRow](tag, "sequence") {
    def * = (appid, sequenceid, sequencename, sequenceincrement, sequenceminvalue, sequencemaxvalue, sequencecurrentvalue, sequencecycle, createdby, createddate, lastupdatedby, lastaccessdate) <> (SequenceRow.tupled, SequenceRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (appid.?, sequenceid.?, sequencename.?, sequenceincrement.?, sequenceminvalue.?, sequencemaxvalue, sequencecurrentvalue.?, sequencecycle, createdby, createddate, lastupdatedby, lastaccessdate).shaped.<>({r=>import r._; _1.map(_=> SequenceRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column appId  */
    val appid: Column[Int] = column[Int]("appId")
    /** Database column sequenceId  */
    val sequenceid: Column[Int] = column[Int]("sequenceId")
    /** Database column sequenceName  */
    val sequencename: Column[String] = column[String]("sequenceName")
    /** Database column sequenceIncrement  */
    val sequenceincrement: Column[Int] = column[Int]("sequenceIncrement")
    /** Database column sequenceMinValue  */
    val sequenceminvalue: Column[Int] = column[Int]("sequenceMinValue")
    /** Database column sequenceMaxValue  */
    val sequencemaxvalue: Column[Option[Int]] = column[Option[Int]]("sequenceMaxValue")
    /** Database column sequenceCurrentValue  */
    val sequencecurrentvalue: Column[Int] = column[Int]("sequenceCurrentValue")
    /** Database column sequenceCycle  */
    val sequencecycle: Column[Option[Int]] = column[Option[Int]]("sequenceCycle")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastAccessDate  */
    val lastaccessdate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastAccessDate")
    
    /** Primary key of Sequence (database name sequence_PK) */
    val pk = primaryKey("sequence_PK", (appid, sequenceid))
  }
  /** Collection-like TableQuery object for table Sequence */
  lazy val Sequence = new TableQuery(tag => new Sequence(tag))
  
  /** Entity class storing rows of table Submodules
   *  @param submodulesid Database column submodulesId PrimaryKey
   *  @param shortdesc Database column shortDesc 
   *  @param longdesc Database column longDesc 
   *  @param moduleid Database column moduleId 
   *  @param status Database column status Default(None)
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class SubmodulesRow(submodulesid: Int, shortdesc: String, longdesc: Option[String], moduleid: Int, status: Option[String] = None, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching SubmodulesRow objects using plain SQL queries */
  implicit def GetResultSubmodulesRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[SubmodulesRow] = GR{
    prs => import prs._
    SubmodulesRow.tupled((<<[Int], <<[String], <<?[String], <<[Int], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table submodules. Objects of this class serve as prototypes for rows in queries. */
  class Submodules(tag: Tag) extends Table[SubmodulesRow](tag, "submodules") {
    def * = (submodulesid, shortdesc, longdesc, moduleid, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (SubmodulesRow.tupled, SubmodulesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (submodulesid.?, shortdesc.?, longdesc, moduleid.?, status, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> SubmodulesRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column submodulesId PrimaryKey */
    val submodulesid: Column[Int] = column[Int]("submodulesId", O.PrimaryKey)
    /** Database column shortDesc  */
    val shortdesc: Column[String] = column[String]("shortDesc")
    /** Database column longDesc  */
    val longdesc: Column[Option[String]] = column[Option[String]]("longDesc")
    /** Database column moduleId  */
    val moduleid: Column[Int] = column[Int]("moduleId")
    /** Database column status Default(None) */
    val status: Column[Option[String]] = column[Option[String]]("status", O.Default(None))
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
    
    /** Index over (moduleid) (database name moduleId_idx) */
    val index1 = index("moduleId_idx", moduleid)
  }
  /** Collection-like TableQuery object for table Submodules */
  lazy val Submodules = new TableQuery(tag => new Submodules(tag))
  
  /** Entity class storing rows of table Usergroup
   *  @param usergroupid Database column userGroupId Default(0), PrimaryKey
   *  @param shortname Database column shortName 
   *  @param longname Database column longName 
   *  @param status Database column status 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class UsergroupRow(usergroupid: Int = 0, shortname: String, longname: Option[String], status: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching UsergroupRow objects using plain SQL queries */
  implicit def GetResultUsergroupRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[UsergroupRow] = GR{
    prs => import prs._
    UsergroupRow.tupled((<<[Int], <<[String], <<?[String], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table userGroup. Objects of this class serve as prototypes for rows in queries. */
  class Usergroup(tag: Tag) extends Table[UsergroupRow](tag, "userGroup") {
    def * = (usergroupid, shortname, longname, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (UsergroupRow.tupled, UsergroupRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (usergroupid.?, shortname.?, longname, status.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> UsergroupRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column userGroupId Default(0), PrimaryKey */
    val usergroupid: Column[Int] = column[Int]("userGroupId", O.Default(0), O.PrimaryKey)
    /** Database column shortName  */
    val shortname: Column[String] = column[String]("shortName")
    /** Database column longName  */
    val longname: Column[Option[String]] = column[Option[String]]("longName")
    /** Database column status  */
    val status: Column[String] = column[String]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Usergroup */
  lazy val Usergroup = new TableQuery(tag => new Usergroup(tag))
  
  /** Entity class storing rows of table Userroamprofile
   *  @param userid Database column userId Default(0), PrimaryKey
   *  @param loginid Database column loginId 
   *  @param primaryemail Database column primaryEmail 
   *  @param salutation Database column salutation 
   *  @param firstname Database column firstName 
   *  @param middlename Database column middleName 
   *  @param lastname Database column lastName 
   *  @param displayname Database column displayName 
   *  @param primarymobile Database column primaryMobile 
   *  @param portraitid Database column portraitId 
   *  @param primaryaddressid Database column primaryAddressId 
   *  @param status Database column status 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class UserroamprofileRow(userid: Int = 0, loginid: String, primaryemail: String, salutation: Int, firstname: String, middlename: Option[String], lastname: String, displayname: String, primarymobile: Option[String], portraitid: Option[Int], primaryaddressid: Option[Int], status: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching UserroamprofileRow objects using plain SQL queries */
  implicit def GetResultUserroamprofileRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Int]], e4: GR[Option[java.sql.Timestamp]]): GR[UserroamprofileRow] = GR{
    prs => import prs._
    UserroamprofileRow.tupled((<<[Int], <<[String], <<[String], <<[Int], <<[String], <<?[String], <<[String], <<[String], <<?[String], <<?[Int], <<?[Int], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table userRoamProfile. Objects of this class serve as prototypes for rows in queries. */
  class Userroamprofile(tag: Tag) extends Table[UserroamprofileRow](tag, "userRoamProfile") {
    def * = (userid, loginid, primaryemail, salutation, firstname, middlename, lastname, displayname, primarymobile, portraitid, primaryaddressid, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (UserroamprofileRow.tupled, UserroamprofileRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (userid.?, loginid.?, primaryemail.?, salutation.?, firstname.?, middlename, lastname.?, displayname.?, primarymobile, portraitid, primaryaddressid, status.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> UserroamprofileRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9, _10, _11, _12.get, _13, _14, _15, _16)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column userId Default(0), PrimaryKey */
    val userid: Column[Int] = column[Int]("userId", O.Default(0), O.PrimaryKey)
    /** Database column loginId  */
    val loginid: Column[String] = column[String]("loginId")
    /** Database column primaryEmail  */
    val primaryemail: Column[String] = column[String]("primaryEmail")
    /** Database column salutation  */
    val salutation: Column[Int] = column[Int]("salutation")
    /** Database column firstName  */
    val firstname: Column[String] = column[String]("firstName")
    /** Database column middleName  */
    val middlename: Column[Option[String]] = column[Option[String]]("middleName")
    /** Database column lastName  */
    val lastname: Column[String] = column[String]("lastName")
    /** Database column displayName  */
    val displayname: Column[String] = column[String]("displayName")
    /** Database column primaryMobile  */
    val primarymobile: Column[Option[String]] = column[Option[String]]("primaryMobile")
    /** Database column portraitId  */
    val portraitid: Column[Option[Int]] = column[Option[Int]]("portraitId")
    /** Database column primaryAddressId  */
    val primaryaddressid: Column[Option[Int]] = column[Option[Int]]("primaryAddressId")
    /** Database column status  */
    val status: Column[String] = column[String]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Userroamprofile */
  lazy val Userroamprofile = new TableQuery(tag => new Userroamprofile(tag))
  
  /** Entity class storing rows of table Userrole
   *  @param userroleid Database column userRoleId Default(0), PrimaryKey
   *  @param roleid Database column roleId 
   *  @param userid Database column userId 
   *  @param status Database column status 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class UserroleRow(userroleid: Int = 0, roleid: Int, userid: Int, status: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching UserroleRow objects using plain SQL queries */
  implicit def GetResultUserroleRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[UserroleRow] = GR{
    prs => import prs._
    UserroleRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table userRole. Objects of this class serve as prototypes for rows in queries. */
  class Userrole(tag: Tag) extends Table[UserroleRow](tag, "userRole") {
    def * = (userroleid, roleid, userid, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (UserroleRow.tupled, UserroleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (userroleid.?, roleid.?, userid.?, status.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> UserroleRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column userRoleId Default(0), PrimaryKey */
    val userroleid: Column[Int] = column[Int]("userRoleId", O.Default(0), O.PrimaryKey)
    /** Database column roleId  */
    val roleid: Column[Int] = column[Int]("roleId")
    /** Database column userId  */
    val userid: Column[Int] = column[Int]("userId")
    /** Database column status  */
    val status: Column[String] = column[String]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
    
    /** Index over (roleid) (database name roleId_idx) */
    val index1 = index("roleId_idx", roleid)
    /** Index over (userid) (database name userRoleId_idx) */
    val index2 = index("userRoleId_idx", userid)
  }
  /** Collection-like TableQuery object for table Userrole */
  lazy val Userrole = new TableQuery(tag => new Userrole(tag))
  
  /** Entity class storing rows of table Users
   *  @param userid Database column userId Default(0), PrimaryKey
   *  @param password Database column password 
   *  @param isencrypted Database column isEncrypted 
   *  @param lastaccessdate Database column lastAccessDate 
   *  @param forcepasswordchange Database column forcePasswordChange 
   *  @param logineffectivedate Database column loginEffectiveDate 
   *  @param loginexpirydate Database column loginExpiryDate 
   *  @param securityprofileid Database column securityProfileId 
   *  @param isloggedin Database column isLoggedIn 
   *  @param passwordmodifieddate Database column passwordModifiedDate 
   *  @param islocked Database column isLocked 
   *  @param lockdate Database column lockDate 
   *  @param passwordattempts Database column passwordAttempts Default(0)
   *  @param timezoneid Database column timeZoneId 
   *  @param languageid Database column languageId 
   *  @param lastfailedlogindate Database column lastFailedLoginDate 
   *  @param status Database column status 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class UsersRow(userid: Int = 0, password: String, isencrypted: String, lastaccessdate: Option[java.sql.Timestamp], forcepasswordchange: String, logineffectivedate: Option[java.sql.Date], loginexpirydate: Option[java.sql.Date], securityprofileid: Int, isloggedin: String, passwordmodifieddate: Option[java.sql.Timestamp], islocked: String, lockdate: Option[java.sql.Timestamp], passwordattempts: Int = 0, timezoneid: Option[Int], languageid: Option[Int], lastfailedlogindate: Option[java.sql.Timestamp], status: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching UsersRow objects using plain SQL queries */
  implicit def GetResultUsersRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[java.sql.Date]], e4: GR[Option[Int]], e5: GR[Option[String]]): GR[UsersRow] = GR{
    prs => import prs._
    UsersRow.tupled((<<[Int], <<[String], <<[String], <<?[java.sql.Timestamp], <<[String], <<?[java.sql.Date], <<?[java.sql.Date], <<[Int], <<[String], <<?[java.sql.Timestamp], <<[String], <<?[java.sql.Timestamp], <<[Int], <<?[Int], <<?[Int], <<?[java.sql.Timestamp], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table users. Objects of this class serve as prototypes for rows in queries. */
  class Users(tag: Tag) extends Table[UsersRow](tag, "users") {
    def * = (userid, password, isencrypted, lastaccessdate, forcepasswordchange, logineffectivedate, loginexpirydate, securityprofileid, isloggedin, passwordmodifieddate, islocked, lockdate, passwordattempts, timezoneid, languageid, lastfailedlogindate, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (UsersRow.tupled, UsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (userid.?, password.?, isencrypted.?, lastaccessdate, forcepasswordchange.?, logineffectivedate, loginexpirydate, securityprofileid.?, isloggedin.?, passwordmodifieddate, islocked.?, lockdate, passwordattempts.?, timezoneid, languageid, lastfailedlogindate, status.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> UsersRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6, _7, _8.get, _9.get, _10, _11.get, _12, _13.get, _14, _15, _16, _17.get, _18, _19, _20, _21)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column userId Default(0), PrimaryKey */
    val userid: Column[Int] = column[Int]("userId", O.Default(0), O.PrimaryKey)
    /** Database column password  */
    val password: Column[String] = column[String]("password")
    /** Database column isEncrypted  */
    val isencrypted: Column[String] = column[String]("isEncrypted")
    /** Database column lastAccessDate  */
    val lastaccessdate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastAccessDate")
    /** Database column forcePasswordChange  */
    val forcepasswordchange: Column[String] = column[String]("forcePasswordChange")
    /** Database column loginEffectiveDate  */
    val logineffectivedate: Column[Option[java.sql.Date]] = column[Option[java.sql.Date]]("loginEffectiveDate")
    /** Database column loginExpiryDate  */
    val loginexpirydate: Column[Option[java.sql.Date]] = column[Option[java.sql.Date]]("loginExpiryDate")
    /** Database column securityProfileId  */
    val securityprofileid: Column[Int] = column[Int]("securityProfileId")
    /** Database column isLoggedIn  */
    val isloggedin: Column[String] = column[String]("isLoggedIn")
    /** Database column passwordModifiedDate  */
    val passwordmodifieddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("passwordModifiedDate")
    /** Database column isLocked  */
    val islocked: Column[String] = column[String]("isLocked")
    /** Database column lockDate  */
    val lockdate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lockDate")
    /** Database column passwordAttempts Default(0) */
    val passwordattempts: Column[Int] = column[Int]("passwordAttempts", O.Default(0))
    /** Database column timeZoneId  */
    val timezoneid: Column[Option[Int]] = column[Option[Int]]("timeZoneId")
    /** Database column languageId  */
    val languageid: Column[Option[Int]] = column[Option[Int]]("languageId")
    /** Database column lastFailedLoginDate  */
    val lastfailedlogindate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastFailedLoginDate")
    /** Database column status  */
    val status: Column[String] = column[String]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Users */
  lazy val Users = new TableQuery(tag => new Users(tag))
  
  /** Entity class storing rows of table Userusergroup
   *  @param userusergroupid Database column userUserGroupId Default(0), PrimaryKey
   *  @param usergroupid Database column userGroupId 
   *  @param userid Database column userId 
   *  @param status Database column status 
   *  @param createdby Database column createdBy 
   *  @param createddate Database column createdDate 
   *  @param lastupdatedby Database column lastUpdatedBy 
   *  @param lastupdateddate Database column lastUpdatedDate  */
  case class UserusergroupRow(userusergroupid: Int = 0, usergroupid: Int, userid: Int, status: String, createdby: Option[String], createddate: Option[java.sql.Timestamp], lastupdatedby: Option[String], lastupdateddate: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching UserusergroupRow objects using plain SQL queries */
  implicit def GetResultUserusergroupRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[UserusergroupRow] = GR{
    prs => import prs._
    UserusergroupRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table userUserGroup. Objects of this class serve as prototypes for rows in queries. */
  class Userusergroup(tag: Tag) extends Table[UserusergroupRow](tag, "userUserGroup") {
    def * = (userusergroupid, usergroupid, userid, status, createdby, createddate, lastupdatedby, lastupdateddate) <> (UserusergroupRow.tupled, UserusergroupRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (userusergroupid.?, usergroupid.?, userid.?, status.?, createdby, createddate, lastupdatedby, lastupdateddate).shaped.<>({r=>import r._; _1.map(_=> UserusergroupRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column userUserGroupId Default(0), PrimaryKey */
    val userusergroupid: Column[Int] = column[Int]("userUserGroupId", O.Default(0), O.PrimaryKey)
    /** Database column userGroupId  */
    val usergroupid: Column[Int] = column[Int]("userGroupId")
    /** Database column userId  */
    val userid: Column[Int] = column[Int]("userId")
    /** Database column status  */
    val status: Column[String] = column[String]("status")
    /** Database column createdBy  */
    val createdby: Column[Option[String]] = column[Option[String]]("createdBy")
    /** Database column createdDate  */
    val createddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("createdDate")
    /** Database column lastUpdatedBy  */
    val lastupdatedby: Column[Option[String]] = column[Option[String]]("lastUpdatedBy")
    /** Database column lastUpdatedDate  */
    val lastupdateddate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("lastUpdatedDate")
  }
  /** Collection-like TableQuery object for table Userusergroup */
  lazy val Userusergroup = new TableQuery(tag => new Userusergroup(tag))
}