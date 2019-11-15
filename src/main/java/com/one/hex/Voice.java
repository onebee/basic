package com.one.hex;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Voice {

    @SerializedName("k1")
    public String k1;

    @SerializedName("k2")
    public String k2;

    @SerializedName("word")
    public String word;

    @SerializedName("userid")
    public String usrid;

    @SerializedName("value")
    public String value;



    @Override
    public String toString() {
        return "VoiceCommandJson{" +
                "k1='" + k1 + '\'' +
                ", k2='" + k2 + '\'' +
                ", word='" + word + '\'' +
                ", usrid='" + usrid + '\'' +
                ", value=" + value +
                '}';
    }
}
