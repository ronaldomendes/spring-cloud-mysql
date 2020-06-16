package br.com.springproject.springcloudmysql;

import br.com.springproject.springcloudmysql.model.Contact;
import br.com.springproject.springcloudmysql.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringCloudMysqlApplication implements CommandLineRunner {

    @Autowired
    private ContactRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Contact c1 = new Contact(null, "Benedita Carla Nicole Freitas", "beneditacnfreitas-78@sanidet.com.br", "81983499067");
        Contact c2 = new Contact(null, "Tânia Nair Márcia Nascimento", "tanianmnascimento@msaengenharia.com.br", "27995377006");
        Contact c3 = new Contact(null, "Manuel Murilo Moreira", "manuelmumoreira@oas.com", "45989399582");
        Contact c4 = new Contact(null, "Rodrigo Tiago Vitor Farias", "rodrigotvfarias@tricoproducts.com.br", "84983350244");
        Contact c5 = new Contact(null, "Elza Alícia Fogaça", "elzaafogaca@santosferreira.abv.br", "81995125917");
        Contact c6 = new Contact(null, "Cauã Heitor Dias", "cauahdias@likaleal.com.br", "82996593746");
        Contact c7 = new Contact(null, "Francisca Rebeca Pereira", "franciscarpereira@mirabeau.art.br", "12984339841");
        Contact c8 = new Contact(null, "Miguel Marcos Vinicius Geraldo Bernardes", "miguelmvgbernardes@vivo.com.br", "84991718614");
        Contact c9 = new Contact(null, "Helena Hadassa Cecília Lopes", "helenahclopes@sabereler.com.br", "81983413117");
        Contact c10 = new Contact(null, "Marina Emily Carvalho", "marinaecarvalho@alvesbarcelos.com.br", "63999477967");

        repository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10)).forEach(System.out::println);
    }
}
