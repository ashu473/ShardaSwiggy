package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SwiggySharda {
        void parseDishData() throws IOException{
                BufferedReader dishReader= Files.newBufferedReader(Paths.get("D:\\7th Semester\\FullStackBootcamp\\ShardaSwiggy\\data\\dishData.csv"));
                String line;
                Dish[] dishList=new Dish[50];
                for(int dishCntr=0;(line= dishReader.readLine())!=null;dishCntr++){
                        String dishData[]=line.split(",");
                        dishList[dishCntr]=new Dish(Integer.valueOf(dishData[0]),dishData[1],Integer.valueOf(dishData[2]));
                }
                for(Dish d:dishList){
                    if(d==null)break;
                    System.out.println(d);
                }
        }
        void parseRestroData() throws IOException{
                BufferedReader restroReader= Files.newBufferedReader(Paths.get("D:\\7th Semester\\FullStackBootcamp\\ShardaSwiggy\\data\\restroData.csv"));
                String line;
                Restro[] restroList=new Restro[50];
                for(int restroCntr=0;(line= restroReader.readLine())!=null;restroCntr++){
                        String restroData[]=line.split(",");
                        restroList[restroCntr]=new Restro(Integer.valueOf(restroData[0]),restroData[1]);
                }
                for(Restro r:restroList){
                        if(r==null)break;
                        System.out.println(r);
                }
        }
        public static void main(String[] args) throws IOException {
                System.out.println("Welcome to SwiggySharda Ashutosh");
                SwiggySharda ss=new SwiggySharda();
                ss.parseDishData();
                ss.parseRestroData();

        }
}

