# Apache SOLR testing


These projects are basicly "private" testing projects so that I can have reminders 
how to implement stuff when I need them. 

These projects are not meant to be "brilliant" - they work for me as reminders.
Hopefully someone may also find them useful.


======================================================================
			 USE AT YOUR OWN RISK
======================================================================


Simple java bean POJO indexing test with out of the box SOLR and SOLR Java API using dynamic fields.

1. Download SOLR, http://lucene.apache.org/solr/downloads.html
2. Extract it
3. Start it
   apache-solr-4.0.0/example $ java -jar start.jar 
4. Check the SOLR web console
   http://localhost:8983/solr/#/
5. Run the example app
   App.java
6. Run query from webapp to see results that were indexed
