package com.manju.thread.cp;

public class ProducerConsumerTest implements Runnable{

	
	boolean isConsumer;
	ProduceConsumer pc;
	
	
	public ProducerConsumerTest(boolean isCon,ProduceConsumer cp) {
		this.isConsumer=isCon;
		this.pc=cp;
	}
	
	public static void main(String[] args) {
		ProduceConsumer cp=new ProduceConsumer();
		Thread producer=new Thread(new ProducerConsumerTest(false,cp),"Producer ");
		Thread consumer=new Thread(new ProducerConsumerTest(true,cp),"Consumer ");
		producer.start();
		try {
			producer.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		consumer.start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			if(!isConsumer)
			{
				this.pc.produce();
				try {
					Thread.sleep(1800);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else
				this.pc.consume();
		}
		
		
		
	}

}
