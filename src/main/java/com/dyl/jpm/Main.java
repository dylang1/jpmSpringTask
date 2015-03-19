package com.dyl.jpm;
import org.springframework.batch.core.launch.support.CommandLineJobRunner;
public class Main {

	public static void main(String[] args) throws Exception {
		//loads command line runner with parameters launch-context.xml and DoJob ( job) 
        CommandLineJobRunner.main(new String[]{"launch-context.xml", "DoJob"});
    }


}
