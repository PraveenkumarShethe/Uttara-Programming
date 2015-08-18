////////////////////////////////////////////////////////////////////////////////
// TestTimer: $Source$
// TODO Class summary goes here
//
// Created : 31 oct. 2005 by jfsmart
// Last modified $Date$ by $Author$
// Revision: $Revision$
// Version : $ID$
// Copyright (c) 2005
////////////////////////////////////////////////////////////////////////////////

package com.wakaleo.articles;

import org.hibernate.SessionFactory;
import org.hibernate.stat.Statistics;

import com.wakaleo.articles.caching.dao.SessionManager;

/**
 * Simple utilities class for benchmarking unit tests. Use is a follows:
 *     TestTimer t = new TestTimer("My task");
 * 	   // Do something
 *     t.done();

 * @author jfsmart
 */
public class TestTimer {

	private long startTime;
	private String message; 

	/**
	 * Initiate a timer
	 */
	public TestTimer(String message) {
		startTime = System.currentTimeMillis();
		this.message = message;
	}
	
	/**
	 * Reset the timer for another timing session.
	 *
	 */
	public void reset() {
		startTime = System.currentTimeMillis();		
	}
	
	/**
	 * End the timing session and output the results.
	 */
	public void done() {
		
		SessionFactory sessionFactory = SessionManager.getSessionFactory();
		Statistics stats = sessionFactory.getStatistics();
		stats.setStatisticsEnabled(true);


	//	The tricky part (or at least the part that requires the most attention) is figuring out what statistics are available, and what they really mean. There are a billion methods available on the top level, but here is a glimpse (note, all of these values are based off of when statistics were enabled): 


		// Number of connection requests. Note that this number represents 
		// the number of times Hibernate asked for a connection, and 
		// NOT the number of connections (which is determined by your 
		// pooling mechanism).
		
		System.out.println(" ************************** Normal   Cache Statastics *****************************************************************************************************");
		System.out.println(" stats.getConnectCount()  "+stats.getConnectCount() 
				+"\n stats.getFlushCount() "+stats.getFlushCount()
				+"\n stats.getTransactionCount() "+stats.getTransactionCount()
				+"\n stats.getSuccessfulTransactionCount() "+stats.getSuccessfulTransactionCount()
				+"\n stats.getSessionOpenCount() "+stats.getSessionOpenCount()
				+"\n stats.getSessionCloseCount() "+stats.getSessionCloseCount()
				
				+"\n stats.getQueryExecutionCount() "+stats.getQueryExecutionCount()
				+"\n stats.getQueryExecutionMaxTime() "+stats.getQueryExecutionMaxTime()
				+"\n stats.getCollectionFetchCount(); "+stats.getCollectionFetchCount()
				+"\n stats.getCollectionRecreateCount(); "+stats.getCollectionRecreateCount()
				+"\n stats.getCollectionRemoveCount() "+stats.getCollectionRemoveCount()
				+"\n stats.getCollectionUpdateCount() "+stats.getCollectionUpdateCount()
				+"\n stats.getEntityDeleteCount() "+stats.getEntityDeleteCount()
				+"\n stats.getEntityFetchCount() "+stats.getEntityFetchCount()
				+"\n stats.getEntityLoadCount() "+stats.getEntityLoadCount()
				+"\n stats.getEntityInsertCount() "+stats.getEntityInsertCount()
				+"\n stats.getEntityUpdateCount() "+stats.getEntityUpdateCount()); 
		
	 for(String s:stats.getQueries()){
		 	System.out.print("\n stats.getQueries()" +s);
		}
		System.out.println();
		
		System.out.println(" ************************** END Normal  Cache Statastics *****************************************************************************************************");
		
		
		// Number of flushes done on the session (either by client code or 
		// by hibernate).
		//stats.getFlushCount();
		// The number of completed transactions (failed and successful).
		//stats.getTransactionCount();
		// The number of transactions completed without failure
		//stats.getSuccessfulTransactionCount();
		// The number of sessions your code has opened.
		//stats.getSessionOpenCount();
		// The number of sessions your code has closed.
		//stats.getSessionCloseCount();
		// All of the queries that have executed.
		//stats.getQueries();
		// Total number of queries executed.
		//stats.getQueryExecutionCount();
		// Time of the slowest query executed.
		//stats.getQueryExecutionMaxTime();


	//	There are also a lot of values related to the retrieval of your objects and collections of objects (directly or via association): 


		// the number of collections fetched from the DB.
		//stats.getCollectionFetchCount();
		// The number of collections loaded from the DB.
	//	stats.getCollectionLoadCount();
		// The number of collections that were rebuilt
	//	stats.getCollectionRecreateCount();
		// The number of collections that were 'deleted' batch.
	//	stats.getCollectionRemoveCount();
		// The number of collections that were updated batch.
	//	stats.getCollectionUpdateCount();
		 
		// The number of your objects deleted.
	//	stats.getEntityDeleteCount();
		// The number of your objects fetched.
		//stats.getEntityFetchCount();
		// The number of your objects actually loaded (fully populated).
	//	stats.getEntityLoadCount();
		// The number of your objects inserted.
	//	stats.getEntityInsertCount();
		// The number of your object updated.
		//stats.getEntityUpdateCount();


	//	In addition to all of this, there is information about cache performance (stolen from Hibernate documentation): 


		double queryCacheHitCount  = stats.getQueryCacheHitCount();
		double queryCacheMissCount = stats.getQueryCacheMissCount();
		double queryCacheHitRatio =
		  queryCacheHitCount / (queryCacheHitCount + queryCacheMissCount);


	System.out.println(" **************************   Cache Statastics *****************************************************************************************************");	
		System.out.println(" stats.getQueryCacheHitCount()  "+stats.getQueryCacheHitCount() 
				+"\n stats.getQueryCacheMissCount() "+stats.getQueryCacheMissCount()
				+"\n stats.getTransactionCount() "+stats.getTransactionCount()
				+"\n queryCacheHitRatio "+queryCacheHitRatio); 
		
		
		System.out.println(" **************************  End Cache Statastics *****************************************************************************************************");
		System.out.println(message 
						+ " : "
				   		+ (System.currentTimeMillis() - startTime) 
				   		+ " ms.");		
	}
}
