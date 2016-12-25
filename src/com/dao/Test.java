package com.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;

import com.dao.impl.HBaseDAOImp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HBaseDAO dao = new HBaseDAOImp();
		List<Put> list = new ArrayList<Put>();
		System.out.println(new Date());
		for (int i = 0; i < 20000; i++) {
			Put put = new Put(("r234"+i).getBytes());
			put.add("cf".getBytes(), "name".getBytes(), ("zhangsna"+i).getBytes()) ;
			put.setWriteToWAL(false);
		list.add(put) ;
//			dao.save(put, "test") ;

		}
	dao.save(list, "test");
//		System.out.println(new Date());
//		put.add("cf".getBytes(), "addr".getBytes(), "shanghai1".getBytes()) ;
//		list.add(put) ;
//		put.add("cf".getBytes(), "age".getBytes(), "30".getBytes()) ;
//		list.add(put) ;
//		put.add("cf".getBytes(), "tel".getBytes(), "13567882341".getBytes()) ;
//		list.add(put) ;
//		
//		dao.save(list, "test");
//		dao.save(put, "test") ;
//		dao.insert("test", "testrow", "cf", "age", "35") ;
//		dao.insert("test", "testrow", "cf", "cardid", "12312312335") ;
//		dao.insert("test", "testrow", "cf", "tel", "13512312345") ;
//		List<Result> list = dao.getRows("test", "r23419",new String[]{"name"}) ;

/*		List<Result> list = dao.getRows("test", "r234198","r2341996") ;
		for(Result rs : list)
		{
			for(KeyValue keyValue : rs.raw())
			{
				System.out.println("rowkey:"+ new String(keyValue.getRow()));
				System.out.println("Qualifier:"+ new String(keyValue.getQualifier()));
				System.out.println("Value:"+ new String(keyValue.getValue()));
				System.out.println("----------------");
			}
		}
		Result rs = dao.getOneRow("test", "testrow");
		
		*/
	}
	
	
}
