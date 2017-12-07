package plugin;

import pluginInterface.myplugin;

public class Plugin1 extends myplugin {
	
	@Override
	public void whoSaysHello(){
		System.out.println("I say hello!");
	}
	@Override
	public void whoSaysBye(){
		System.out.println("You say bye!");
	}

}
