package plugin;

import pluginInterface.myplugin;

public class Plugin2 extends myplugin {
	
	@Override
	public void whoSaysHello(){
		System.out.println("You say hello!");
	}
	@Override
	public void whoSaysBye(){
		System.out.println("I say bye!");
	}
}
