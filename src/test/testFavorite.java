package test;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Griaffe.pojo.Favorite;
import com.Griaffe.service.FavoriteService;

public class testFavorite {

	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		FavoriteService favoriteService = (FavoriteService) applicationContext.getBean("favoriteService");
		Favorite favorite = new Favorite();
		for (int i = 0; i < 100; i++) {
			favorite.setFavorite_id(i+1);
			favoriteService.deleteFavorite(favorite);
		}
		ArrayList<Favorite> favorites = favoriteService.selectFavorite(null);
		for (Favorite favorite2 : favorites) {
			System.out.println(favorite2.toString());
		}
		
		
		
		
		
	}
}
