package com.tyman.KryptoMod.utils;

import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class FetchPlayerDataThread implements Runnable {
	static ICommandSender iCommandSender = null;
	static String[] strings;
	public void run() {
		iCommandSender.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "[KryptoMod] Fetching data for user " + strings[0] + "..."));
		String response = HttpRequest.get("https://api.hypixel.net/guild?key=0263b520-7895-4f37-84c1-033d04bde642&id=5ef336138ea8c950b6cb73f2").body();
	}
	public static void main(ICommandSender iiCommandSender, String[] stringss) {
		iCommandSender = iiCommandSender;
		strings = stringss;
		FetchPlayerDataThread obj = new FetchPlayerDataThread();
		Thread tobj = new Thread(obj);
		tobj.start();
	}
}
class Api {
  private boolean success;
  private Guild guild;
  
  public getSuccess() {
    return success;
  }
  class Guild {
    private Member[] members;

    public getMembers() {
      return members;
    }
    class Member {
      private String uuid;
      private String rank;
      // Insert gexp here (use map?)
    }
  }
}
