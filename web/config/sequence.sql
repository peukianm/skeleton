/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  user
 * Created: Nov 11, 2018
 */
DROP SEQUENCE SKELETON.ACTIONSCATEGORY_SEQ;

CREATE SEQUENCE SKELETON.ACTIONSCATEGORY_SEQ
  START WITH 0
  MAXVALUE 9999999999999999999999999999
  MINVALUE 0
  NOCYCLE
  NOCACHE
  NOORDER;


DROP SEQUENCE SKELETON.AUDITING_SEQ;

CREATE SEQUENCE SKELETON.AUDITING_SEQ
  START WITH 0
  MAXVALUE 9999999999999999999999999999
  MINVALUE 0
  NOCYCLE
  NOCACHE
  NOORDER;


DROP SEQUENCE SKELETON.ROLE_SEQ;

CREATE SEQUENCE SKELETON.ROLE_SEQ
  START WITH 0
  MAXVALUE 9999999999999999999999999999
  MINVALUE 0
  NOCYCLE
  NOCACHE
  NOORDER;


DROP SEQUENCE SKELETON.USERROLES_SEQ;

CREATE SEQUENCE SKELETON.USERROLES_SEQ
  START WITH 0
  MAXVALUE 9999999999999999999999999999
  MINVALUE 0
  NOCYCLE
  NOCACHE
  NOORDER;


DROP SEQUENCE SKELETON.USERS_SEQ;

CREATE SEQUENCE SKELETON.USERS_SEQ
  START WITH 1
  MAXVALUE 9999999999999999999999999999
  MINVALUE 0
  NOCYCLE
  NOCACHE
  NOORDER;