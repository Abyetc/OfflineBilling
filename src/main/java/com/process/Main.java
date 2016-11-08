package com.process;

import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.charging.TariffPackage;
import com.data.UserData;
import com.util.GenerateInstance;
import com.util.XlsUtils;

public class Main {
	public static final void main(String[] args) {
        try {
        	// load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	List<List<Integer>> data = XlsUtils.getUserData();
        	List<List<String>> info = XlsUtils.getUserInfo();
        	
        	int len = data.size();
        	for(int i = 0; i < len; i++){
        		List<String> infoList = info.get(i); 
        		List<Integer> dataList = data.get(i);
        		UserData userData = GenerateInstance.generateUserDataInstance(infoList, dataList);
        		TariffPackage tariffPackage = new TariffPackage("lexiang4G59");				// 设置套餐
        		userData.setTariffPackage(tariffPackage);
        		kSession.insert(userData);
                kSession.fireAllRules();
                
                int call = userData.getTariffPackage().getCALLING_AMT().getVOICE_AMT();
                int addition = userData.getTariffPackage().getADDITION_AMT().getVALUE_ADDED_AMT();
                int datatraffic = userData.getTariffPackage().getDATATRAFFIC_AMT().getINTERNET_AMT();
                int message = userData.getTariffPackage().getMESSAGE_AMT().getINNER_SEND_SMS_AMT();
                int messageInter = userData.getTariffPackage().getMESSAGE_AMT().getINTER_SEND_SMS_AMT();
                
                System.out.println(i);
                System.out.println(userData.getInfo().getUSER_ID());
                System.out.println("Call: " + call);
                System.out.println("addition: " + addition);
                System.out.println("datatraffic: " + datatraffic);
                System.out.println("message: " + message);
                System.out.println("messageInter: " + messageInter);
                System.out.println();
        	}
        	
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
