/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import models.Game;
import models.Card;

import ninja.Context;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;
import ninja.params.PathParam;

@Singleton
public class ApplicationController {

    public Result index() {
        return Results.html().template("views/AcesUp/AcesUp.flt.html");
    }

    public Result gameGet(){
        Game g = new Game();
      //  g.buildDeck();
        return Results.json().render(g);
    }

    public Result dealPost(Context context, Game g) {
        if(context.getRequestPath().contains("deal")){
            g.dealFour();
        }
        return Results.json().render(g);
    }

    public Result removeCard(Context context, @PathParam("column") int colNumber, Game g){
        int correct = 0;
        Card cur_card = g.p.getTopCard(colNumber);
        for(int i = 0; i < 4; i++){
            if(g.p.cols.get(i).isEmpty() == false){
                Card temp_card = g.p.getTopCard(i);
                if (temp_card.value > cur_card.value && temp_card.suit == cur_card.suit) {
                    correct = 1;
                }
            }
        }
        if(correct == 1) {
            g.p.remove(colNumber);
        }
        return Results.json().render(g);
    }

    public Result moveCard(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, Game g){
        Card from_card = g.p.getTopCard(colFrom);
        if(g.p.cols.get(colTo).isEmpty() && from_card.getValue() == 14){
            g.p.move(colFrom,colTo);
        }
        return Results.json().render(g);
    }

    public Result chooseDeck(Context context, @PathParam("choice") int selectedDeck, Game g) {
        if (g.initialized == 0) {
            g.createDeck(selectedDeck);
            g.d.shuffle();
            g.dealFour();
        }
        return Results.json().render(g);
    }
}
