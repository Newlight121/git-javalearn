package com.itnewlight.exercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1,"水门桥",38.9,9.8,"徐克","吴京","12万人想看");
        movies[1] = new Movie(2,"出拳吧",38.9,9.8,"徐克","吴京","12万人想看");
        movies[2] = new Movie(3,"月球陨落",38.9,9.8,"徐克","吴京","12万人想看");
        movies[3] = new Movie(4,"一点就到家",38.9,9.8,"徐克","吴京","12万人想看");
        MovieOperator movieOperator = new MovieOperator(movies);
//        movieOperator.showALlMovies();
//        movieOperator.searchMovieId(2);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===电影信息系统===");
            System.out.println("1、全部电影信息");
            System.out.println("2、查询电影id");
//            System.out.println("3、退出");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    movieOperator.showALlMovies();break;
                case 2:
                    System.out.println("输入对应id：");
                    int id = sc.nextInt();
                    movieOperator.searchMovieId(id);
                    break;
                default:
                    System.out.println("指令错误");
            }
        }
    }
}
