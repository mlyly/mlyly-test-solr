package fi.zcode.solr_test01;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Logger;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;

/**
 * Simple SOLR testing.
 */
public class App {

    private static final Logger log = Logger.getAnonymousLogger();

    public static void main(String[] args) throws SolrServerException, IOException, ParseException {
        log.info("Hello World!");

        log.info("connect...");
        SolrServer server = new HttpSolrServer("http://localhost:8983/solr/");

        // NOTE THIS! DELETING ALL DATA!

        log.info("delete all data...");
        server.deleteByQuery("*:*");
        log.info("commit...");
        server.commit();

        Collection<Person> docs = new ArrayList<Person>();

        docs.add(new Person(1L, "Johann Christian", "Bach", 1982 - 1935, date("05.09.1735")));
        docs.add(new Person(2L, "Frank", "Zappa", 1993 - 1940, date("21.12.1940")));
        docs.add(new Person(3L, "François", "Couperin", 1733 - 1668, date("10.10.1668")));
        docs.add(new Person(4L, "George Jacob", "Gershwin", 1937 - 1898, date("26.09.1898")));

        log.info("add...");
        server.addBeans(docs);

        log.info("commit...");
        server.commit();
        log.info("end");
    }

    private static Date date(String s) throws ParseException {
        return new SimpleDateFormat("dd.MM.yyyy").parse(s);
    }
}
