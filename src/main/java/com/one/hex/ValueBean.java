package com.one.hex;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ValueBean {

    @SerializedName("App")
    public String App;
    @SerializedName("Action")
    public String Action;
    @SerializedName("commandValue")
    public List<CommandValueBean> commandValue;

    public static class CommandValueBean {
        @SerializedName("Value")
        public String Value;


        @Override
        public String toString() {
            return "CommandValueBean{" +
                    "Value='" + Value + '\'' +
                    '}';
        }
    }
}
