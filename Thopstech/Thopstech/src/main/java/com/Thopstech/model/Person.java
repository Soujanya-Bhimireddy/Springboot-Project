
package com.Thopstech.model;

import jakarta.persistence.*;
@Entity
//defining class name as Table name
@Table
public class Person
{
//Defining book id as primary key
@Id
@Column
private int Personid;
@Column
private String name;
@Column
private int nameid;
@Column
private int subjectid;
public int getPersonid() 
{
return Personid;
}
public void setThopstechid(int Thopstechid) 
{
this.Personid = Thopstechid;
}
public String getname()
{
return name;
}
public void setname(String name) 
{
this.name =name;
}
public int getnameid() 
{
return nameid;
}
public void setnameid(int nameid) 
{
this.nameid = nameid;
}
public int subjectid() 
{
return subjectid;
}
public void setsubjectid(int subjectid) 
{
this.subjectid = subjectid;
}
public void setdobid(int dobid) 
{
}
}