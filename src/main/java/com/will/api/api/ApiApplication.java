package com.will.api.api;

import com.will.api.api.Entity.Filmes;
import com.will.api.api.Repositories.AnimesRepository;
import com.will.api.api.Repositories.FilmesRepository;
import com.will.api.api.Repositories.SerieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingTest(FilmesRepository filmesRepository, SerieRepository serieRepository, AnimesRepository animesRepository){
		return args -> {
			Filmes equals = new Filmes();
			equals.setTitle("Equals");
			equals.setDescription("No futuro, existe uma nova raça de seres humanos - os Equals, indivíduos pacíficos, justos e que não possuem mais emoções. Até que uma doença passa a ameaçar todos, ativando sentimentos em suas vítimas, que são excluídas do resto da sociedade. Silas é infectado, mas percebe que Nia também possui sentimentos, sendo capaz de escondê-los. Ao sentirem pela primeira vez algum tipo de intimidade em suas vidas, eles decidem fugir.");
			equals.setImage("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQYNKlcspogyoDb7dVQ1Cn-_I3VRsvi0NS9CicBWnih3SMlnmTb");
			equals.setUrl("https://mega.nz/file/PM8VFTwJ#9MB9Un5OcwKKMyAUtQD1k4jAS0GNn3dovTmFdK3y2QQ");

			Filmes her = new Filmes();
			her.setTitle("Her");
			her.setDescription("O solitário escritor Theodore desenvolve uma relação de amor especial com o novo sistema operacional do seu computador. Surpreendentemente, ele acaba se apaixonando pela voz deste programa, uma entidade intuitiva e sensível chamada Samantha.");
			her.setImage("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSsSpHm_I6psn52k0pOtr7NcrWPA9GCw4kf7dgJdIyNUhG_TFLC");
			her.setUrl("https://mega.nz/file/ictwwaTK#wp5Z_YRyASqo4Dp4QzC-iLOkkOp92ZgTcT-Ejit0Of4");

			Filmes mario = new Filmes();
			mario.setTitle("Super Mario Bros o filme");
			mario.setDescription("Mario é um encanador junto com seu irmão Luigi. Um dia, eles vão parar no reino dos cogumelos, governado pela Princesa Peach, mas ameaçado pelo rei dos Koopas, que faz de tudo para conseguir reinar em todos os lugares.");
			mario.setImage("https://www.ucicinemas.com.br/Content/Upload/Filmes/Posters/10812/filme_10812.jpg");
			mario.setUrl("https://mega.nz/file/7LYUAIgL#upVl3Cy8Qby5VmWBnz0JZtD4uJne5oK376rAp79XBz8");

			Filmes equilibrium = new Filmes();
			equilibrium.setTitle("Equilibrium");
			equilibrium.setDescription("Em um futuro incerto, a raça humana foi quase totalmente devastada. Para salvar o mundo, os governantes decidiram criar uma droga capaz de inibir o sentimento humano e garantir a paz para sempre. Em nome dessa sociedade perfeita, tudo o que pudesse provocar qualquer sentimento foi destruído: livros, arte, música. Mas um grupo se nega a tomar a droga, e agora a cidade está cercada de sacerdotes da lei, que vieram para exterminar esses rebeldes.");
			equilibrium.setImage("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTtCExNjVDgMQ9EbCWVERCeBAwA-ohQZarC2mER1I484zlavXYn");
			equilibrium.setUrl("https://mega.nz/file/aZ1QhADJ#NsaUNpDuXBA-6OAyCDjMnDlzEJiXWJU3Z-JknvgVqvU");

			filmesRepository.saveAll(Arrays.asList(equals,her,mario,equilibrium));
		};
	}


}
