/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/4/30 ÐÇÆÚËÄ 18:40:11                       */
/*==============================================================*/


drop table if exists t_barn;

drop table if exists t_card;

drop table if exists t_cc;

drop table if exists t_charges;

drop table if exists t_garage;

drop table if exists t_icord;

drop table if exists t_invest;

drop table if exists t_limit;

drop table if exists t_master;

drop table if exists t_park;

drop table if exists t_record;

drop table if exists t_rount;

drop table if exists t_second;

drop table if exists t_user;

/*==============================================================*/
/* Table: t_barn                                                */
/*==============================================================*/
create table t_barn
(
   bid                  int not null auto_increment,
   gname                char(8) not null,
   btotal               int not null,
   boccupy              int not null,
   bappoint             int not null,
   bsurplus             int not null,
   baddress             char(16) not null,
   bprice               int not null,
   primary key (bid)
);

/*==============================================================*/
/* Table: t_card                                                */
/*==============================================================*/
create table t_card
(
   cid                  int not null auto_increment,
   cbalance             int not null,
   cnumber              char(8) not null,
   crecord              int,
   uname                char(10) not null,
   primary key (cid)
);

/*==============================================================*/
/* Table: t_cc                                                  */
/*==============================================================*/
create table t_cc
(
   ccid                 int not null auto_increment,
   uname                char(10) not null,
   cctime               date not null,
   chstanard            int not null,
   primary key (ccid)
);

/*==============================================================*/
/* Table: t_charges                                             */
/*==============================================================*/
create table t_charges
(
   chId                 int not null auto_increment,
   chstanard            int not null,
   llimit               int,
   primary key (chId)
);

/*==============================================================*/
/* Table: t_garage                                              */
/*==============================================================*/
create table t_garage
(
   gid                  int not null auto_increment,
   gname                char(8) not null,
   gremark              char(8),
   primary key (gid)
);

/*==============================================================*/
/* Table: t_icord                                               */
/*==============================================================*/
create table t_icord
(
   irid                 int not null auto_increment,
   uname                char(10) not null,
   cnumber              char(8) not null,
   imoney               int not null,
   primary key (irid)
);

/*==============================================================*/
/* Table: t_invest                                              */
/*==============================================================*/
create table t_invest
(
   iid                  int not null auto_increment,
   uname                char(10) not null,
   cnumber              char(8) not null,
   imoney               int not null,
   primary key (iid)
);

/*==============================================================*/
/* Table: t_limit                                               */
/*==============================================================*/
create table t_limit
(
   lid                  int not null auto_increment,
   llimit               int,
   primary key (lid)
);

/*==============================================================*/
/* Table: t_master                                              */
/*==============================================================*/
create table t_master
(
   mid                  int not null auto_increment,
   mname                char(8) not null,
   mpwd                 char(8) not null,
   primary key (mid)
);

/*==============================================================*/
/* Table: t_park                                                */
/*==============================================================*/
create table t_park
(
   pid                  int not null auto_increment,
   pname                int not null,
   gname                char(8) not null,
   pstate               int not null,
   primary key (pid)
);

/*==============================================================*/
/* Table: t_record                                              */
/*==============================================================*/
create table t_record
(
   reid                 int not null auto_increment,
   gname                char(8) not null,
   pname                int not null,
   uname                char(10) not null,
   canumber             char(8) not null,
   sstime               date not null,
   setime               date,
   stime                date,
   smoney               int,
   spay                 char(8),
   sstate               bool not null,
   primary key (reid)
);

/*==============================================================*/
/* Table: t_rount                                               */
/*==============================================================*/
create table t_rount
(
   tid                  int not null auto_increment,
   tname                char(8) not null,
   tremark              char(16),
   primary key (tid)
);

/*==============================================================*/
/* Table: t_second                                              */
/*==============================================================*/
create table t_second
(
   sd                   int not null auto_increment,
   gname                char(8) not null,
   pname                int not null,
   uname                char(10) not null,
   sstime               date not null,
   setime               date not null,
   stime                date not null,
   smoney               int not null,
   sstate               bool not null,
   spay                 char(8) not null,
   primary key (sd)
);

/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
create table t_user
(
   uid                  int not null auto_increment,
   uname                char(10) not null,
   upwd                 char(64) not null,
   cnumber              char(8),
   ucall                int,
   primary key (uid)
);

