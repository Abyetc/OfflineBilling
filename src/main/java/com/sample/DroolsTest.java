package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
        	DroolsTest droolsTest = new DroolsTest();
            Message message = droolsTest.new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            kSession.insert(message);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public class Message {

        public static final  int HELLO = 0;
        public static final int GOODBYE = 1;
        public   int age = 0;
        public int time = 100;
        public Test test = new Test(10);
        public int hehe = 10;
        
        
        
        public int getHehe() {
			return hehe;
		}

		public void setHehe(int hehe) {
			this.hehe = hehe;
		}

		public Test getTest() {
			return test;
		}

		public void setTest(Test test) {
			this.test = test;
		}

		public Message() {
			
		}
        
        private String message;

        private int status;

        
        
        public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		public  int getAge() {
			return age;
		}

        public  void setAge(int a){
        	age= a;
        }
        
		public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
