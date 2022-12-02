package terminalenv;

public class Command {
	String commandName;
	String commandArgument;
	String commandKeys;
	
	public Command(String commandName, String commandArgument, String commandKeys) {
		this.commandName = commandName;
		this.commandArgument = commandArgument;
		
		this.commandKeys = commandKeys;
	}
	
	public String getCommandName() {
		return this.commandName;
	}
}
