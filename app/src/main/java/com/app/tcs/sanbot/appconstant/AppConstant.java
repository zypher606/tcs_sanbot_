package com.app.tcs.sanbot.appconstant;

public class AppConstant {
    //URL
    public static final String BASE_URL = "https://directline.botframework.com/v3/directline/";
    public static final String GENERATE_TOKEN = "tokens/generate";
    public static final String START_CONVERSATION = "conversations";
    public static final String CONVERSATION = "conversations/{conversation_id}/activities";

    //public static final String BOT_SECRET_KEY = "Bearer 0eM5DHesPHs.cwA.ybE.R7sOjwA2CE06wa5YHSrJNim9ax8e1m5WaP4-aHHHTlg";
    public static final String BOT_SECRET_KEY = "Bearer V9Qet8Vo_BU.cwA.C2I.nMw2sXsuii-0dHkCCR9pMYOGnr7korlwUmMled_JWY4";
    public static final int TIMEOUT = 25;

    public static final String ROBOT_STATEMENT = "";
    public static final String SPEECH_LISTENER_FLAG = "sanbot_speech_listener_flag";


    public static final String INET_URL_ON = "http://192.168.1.81:8181/device.cgi?dev=16&cmd=135";
    public static final String INET_URL_OFF = "http://192.168.1.81:8181/device.cgi?dev=16&cmd=134";

}
