package info.natehuff.demo.dto;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
public class Pick {
    @Id
    @GeneratedValue
    private Long id;
    String name;
    float line;

    public Pick(String name, float line) {
        this.name = name;
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Pick{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", line=" + line +
                '}';
    }
}
