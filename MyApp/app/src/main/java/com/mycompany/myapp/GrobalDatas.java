package com.mycompany.myapp;

import android.app.Application;
import java.lang.annotation.*;

public class GrobalDatas extends Application
{
	//global datas
	private int p_num;
	private int j_num;
	private boolean boo_init = false;
	
	//define number
	public static final int maxplayer  = 100;
	
	//kouzoutai
	private class PlayerDatas{
		public String name;
	}
	PlayerDatas[] playerDatas = new PlayerDatas[maxplayer];
	
	//setter and getter
	public int getP_num(){
		return this.p_num;
	}
	public void setP_num(int inputdata){
		this.p_num = inputdata;
	}
	
	public int getJ_num(){
		return this.j_num;
	}
	public void setJ_num(int inputdata){
		this.j_num = inputdata;
	}
	public boolean getBoo_init(){
		return this.boo_init;
	}
	
	//initialization method
	public void initialization(){
		this.p_num=1;
		this.j_num=1;
		
		for(int i=0; i<maxplayer; i++){
			playerDatas[i] = new PlayerDatas();
			playerDatas[i].name = "murabito"+String.valueOf(i+1);
			
			this.boo_init = true;
		}
	}
}
