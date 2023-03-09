package entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String password;
    
    public User() {}
    
    public User(Long id, String nome, String email, String telefone, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.password = password;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, telefone, password);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(id, user.id) &&
                Objects.equals(nome, user.nome) &&
                Objects.equals(email, user.email) &&
                Objects.equals(telefone, user.telefone) &&
                Objects.equals(password, user.password);
    }
}
