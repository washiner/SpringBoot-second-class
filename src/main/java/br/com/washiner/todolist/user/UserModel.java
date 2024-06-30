package br.com.washiner.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

//@Data //define os getters e setters do lombok
//@Getter -> define somente os getter
//@Setter -> define somente os setter
// se vc colocar em cima da anotaçao ele vai pegar somente aquele atributo


@Data
@Entity(name = "tb_users")
public class UserModel {
  
  @Id
  @GeneratedValue(generator = "UUID") //vai ser o SERIAL do postgre ou seja id automatico
  private UUID id;         //id padronizado blocos caracter para nao ficar sequencial

  //@Column(name = "nome_usuario") // se eu fizer isso to mudando o nome do atributo la no banco de dados
  @Column(unique = true)  //coloca como unico igual no postgre
  private String username;
  private String name;
  private String password;

  @CreationTimestamp // quando for criado o banco vai ter data hora e local que foi criado
  private LocalDateTime createdAt;
  //obs: se nao mexer nos outros atributos ele vai entender que sera colunas pois o @entity ta inferindo a criaçao da tabela


 //getters e setters = buscar as informaçoes que tem dentro dele e atualizar inserir um valor para atributo privado de uma classe

}
