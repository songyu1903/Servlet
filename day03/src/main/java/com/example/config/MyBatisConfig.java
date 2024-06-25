package com.example.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
//	우리는 sqlSession을 통해 SQL명령어를 실행시킬 수 있다.
//	sqlSession을 만들어주는 객체가 SqlSessionFactory이다.
	
	private static SqlSessionFactory sqlSessionFactory;
	
//	팩토리는 딱 한번만 프로그램이 시작될 때 만들면 된다. 그러므로 static 초기화 블록으로 생성한다
	static {
		
//		설정파일의 경로를 저장한다.
		try {
			String resource = "./com/example/config/config.xml";
			
//			Resources 클래스를 이용하여 리소스를 읽어오고 Reader객체로 반환한다
			Reader reader = Resources.getResourceAsReader(resource);
			
//			SQL 세션 팩토리 빌더에게 팩토리를 지어달라고 한다. bulid()
//			공장을 짖기 위해서 설계도가 필요하다.
//			설계도는 설정값을 저장하고 있는 reader이다.
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			System.out.println("MyBatisConfig.java 초기화 문제 발생!!");
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
}
