package com.mkyong.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.TriggerListener;
//private static final Log LOGGER = LogFactory.getLog(GlobalTriggerListener.class);

public class GlobalTriggerListener implements TriggerListener {
	
	 private static final Log LOGGER = LogFactory.getLog(GlobalTriggerListener.class);

	private String triggerName="DEFAULT-GLOBAL-TRIIGER-LISTENER";
	
	private static final boolean isDebug=false;
	
	
	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}
  public GlobalTriggerListener() {
	 
}
	 /**
    * <p>
    * Get the name of the <code>TriggerListener</code>.
    * </p>
    */
	
	@Override
	public String getName() {
		return triggerName;
	}
	
	 /**
    * <p>
    * Called by the <code>{@link Scheduler}</code> when a <code>{@link Trigger}</code>
    * has fired, it's associated <code>{@link org.quartz.JobDetail}</code>
    * has been executed, and it's <code>triggered(xx)</code> method has been
    * called.
    * </p>
    * 
    * @param trigger
    *          The <code>Trigger</code> that was fired.
    * @param context
    *          The <code>JobExecutionContext</code> that was passed to the
    *          <code>Job</code>'s<code>execute(xx)</code> method.
    * @param triggerInstructionCode
    *          the result of the call on the <code>Trigger</code>'s<code>triggered(xx)</code>
    *          method.
    */

	@Override
	public void triggerComplete(Trigger trigger, JobExecutionContext ctx, int triggerInstructionCode) {
		if(isDebug){	
			LOGGER.info("triggerComplete method For Trigger Group : "+ trigger.getGroup() +" & Job Name : " + trigger.getJobName() + " Starts @ : " +trigger.getStartTime() +" & Ends @ : "+trigger.getEndTime() + " triggerInstructionCode "+triggerInstructionCode);
			LOGGER.info("Jobs Next Fire Time : "+ctx.getNextFireTime());
		}
		
		
	}

	 /**
    * <p>
    * Called by the <code>{@link Scheduler}</code> when a <code>{@link Trigger}</code>
    * has fired, and it's associated <code>{@link org.quartz.JobDetail}</code>
    * is about to be executed.
    * </p>
    * 
    * <p>
    * It is called before the <code>vetoJobExecution(..)</code> method of this
    * interface.
    * </p>
    * 
    * @param trigger
    *          The <code>Trigger</code> that has fired.
    * @param context
    *          The <code>JobExecutionContext</code> that will be passed to
    *          the <code>Job</code>'s<code>execute(xx)</code> method.
    */
	@Override
	public void triggerFired(Trigger trigger, JobExecutionContext ctx) {
		if(isDebug){	
			LOGGER.info(" triggerFired method For Trigger Group : "+ trigger.getGroup() +" & Job Name : " + trigger.getJobName() + "  & Starte Time " +trigger.getStartTime());
		}
		
	}

	 /**
    * <p>
    * Called by the <code>{@link Scheduler}</code> when a <code>{@link Trigger}</code>
    * has misfired.
    * </p>
    * 
    * <p>
    * Consideration should be given to how much time is spent in this method,
    * as it will affect all triggers that are misfiring.  If you have lots
    * of triggers misfiring at once, it could be an issue it this method
    * does a lot.
    * </p>
    * 
    * @param trigger
    *          The <code>Trigger</code> that has misfired.
    */
	@Override
	public void triggerMisfired(Trigger trigger) {
		if(isDebug){	
			LOGGER.info("triggerMisfired method For Trigger Group : "+ trigger.getGroup() +" & Job Name : " + trigger.getJobName() + "  & Starte Time " +trigger.getStartTime());
		}
		
	}

	/**
    * <p>
    * Called by the <code>{@link Scheduler}</code> when a <code>{@link Trigger}</code>
    * has fired, and it's associated <code>{@link org.quartz.JobDetail}</code>
    * is about to be executed.
    * </p>
    * 
    * <p>
    * It is called after the <code>triggerFired(..)</code> method of this
    * interface.
    * </p>
    * 
    * @param trigger
    *          The <code>Trigger</code> that has fired.
    * @param context
    *          The <code>JobExecutionContext</code> that will be passed to
    *          the <code>Job</code>'s<code>execute(xx)</code> method.
    */
	@Override
	public boolean vetoJobExecution(Trigger trigger, JobExecutionContext ctx) {
		if(!isDebug){	
			LOGGER.info("vetoJobExecution method For Trigger Group : "+ trigger.getGroup() +" & Job Name : " + trigger.getJobName() + "  & Starte Time " +trigger.getStartTime());
		}
		return false;
	}

}
