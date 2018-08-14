package mypackage.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	
	//setup logger
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	//setup pointcut declarations
	@Pointcut("execution(* mypackage.controller.*.*(..))")
	private void forControllerPackage() { }
	@Pointcut("execution(* mypackage.service.*.*(..))")
	private void forServicePackage() { }
	@Pointcut("execution(* mypackage.dao.*.*(..))")
	private void forDaoPackage() { }
	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	private void forAppFlow() { }
	
	
	
	
	
	//add @Before advice
	
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint) {
		
		//display method we are calling
		String theMethod = theJoinPoint.getSignature().toString();
		myLogger.info("==> @Before : calling method : "+theMethod);
		//display the arguments to the method
		
	}
	
	//add @After advice
	
}
