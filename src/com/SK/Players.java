package com.SK;

import java.util.ArrayList;

public class Players<P> extends ArrayList{
    int cursor =0;
    public Players() {
        super();
    }

    public Player getNextPlayer() {
        if(cursor == size()-1){
            cursor=0;
            return (Player)this.get(size()-1);
        }else{
            cursor++;
            return (Player)get(cursor-1);
        }
    }
}
