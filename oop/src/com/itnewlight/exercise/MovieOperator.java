package com.itnewlight.exercise;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator() {
    }

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void showALlMovies(){
        System.out.println("-----展示全部电影信息如下-----");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("电影id："+m.getId());
            System.out.println("电影名称："+m.getName());
            System.out.println("电影价格："+m.getPrice());
            System.out.println("电影评分："+m.getScore());
            System.out.println("------------------");
        }

    }

    public void searchMovieId(int id){
        boolean findMovie = false;
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id){
                System.out.println("-----查询到信息如下-----");
                System.out.println("电影id："+m.getId());
                System.out.println("电影名称："+m.getName());
                System.out.println("电影价格："+m.getPrice());
                System.out.println("电影评分："+m.getScore());
                System.out.println("电影导演："+m.getDirector());
                System.out.println("电影主演："+m.getActor());
                System.out.println("电影信息："+m.getInfo());
                System.out.println("-----------");
                findMovie = true;
            }
        }
        if (!findMovie){
            System.out.println("*****无对应id*****");
        }
    }
}
