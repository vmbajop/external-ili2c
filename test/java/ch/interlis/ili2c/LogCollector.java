package ch.interlis.ili2c;

import java.util.ArrayList;
import ch.ehi.basics.logging.LogEvent;


public class LogCollector implements  ch.ehi.basics.logging.LogListener {
	private ArrayList<LogEvent> errors=new ArrayList<LogEvent>();

	public ArrayList<LogEvent> getErrs() {
		return errors;
	}

	public void logEvent(LogEvent event) {
	    final int eventKind = event.getEventKind();
        if(eventKind==LogEvent.ERROR) {
            errors.add(event);
	    }
	}
	
}
