package fi.zcode.solr_test01;

import java.util.Date;
import org.apache.solr.client.solrj.beans.Field;

/**
 * Simple "person" bean, testing SOLR.
 *
 * Note the "_X" field names - they are dynamic fields, no schema required.
 *
 * @author mlyly
 */
public class Person {

    @Field("id")
    private Long _id;
    @Field("lastname_s")
    private String _lastname;
    @Field("firstname_s")
    private String _firstname;
    @Field("age_i")
    private int _age;
    @Field("birthdate_dt")
    private Date _birthDate;

    public Person() {
    }

    public Person(Long id, String lastname, String firstname, int age, Date birthdate) {
        this._id = id;
        this._lastname = lastname;
        this._firstname = firstname;
        this._age = age;
        this._birthDate = birthdate;
    }

    public Long getId() {
        return _id;
    }

    public void setId(Long id) {
        this._id = id;
    }

    public String getLastname() {
        return _lastname;
    }

    public void setLastname(String lastname) {
        this._lastname = lastname;
    }

    public String getFirstname() {
        return _firstname;
    }

    public void setFirstname(String firstname) {
        this._firstname = firstname;
    }

    public int getAge() {
        return _age;
    }

    public void setAge(int age) {
        this._age = age;
    }

    public Date getBirthDate() {
        return _birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this._birthDate = birthDate;
    }
}
