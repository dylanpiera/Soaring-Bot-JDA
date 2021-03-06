package io.soaringdylan.discordbot.commands;

import io.soaringdylan.discordbot.Command;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

/**
 * Created by dylan on 10-9-2016.
 */
public class PingCommand implements Command {

    private final String HELP = "Usage: !ping";

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        event.getChannel().sendMessage(event.getAuthor().getAsMention() + " " + "Pong!");
    }

    @Override
    public String help() {
        return HELP;
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {
        return;
    }
}
