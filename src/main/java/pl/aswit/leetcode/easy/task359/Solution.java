package pl.aswit.leetcode.easy.task359;


import java.util.HashMap;
import java.util.Map;

class Logger {

    private Map<String, Integer> map;

    public Logger() {
        map = new HashMap();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        Integer lastTime = map.get(message);
        if(lastTime == null || timestamp - lastTime >= 10 ){
            map.put(message, timestamp);
            return true;
        }
        return false;

    }
}
