package racinggame.domain.model;

public class Name {
    
    private String name;
    
    public Name(String name) {
        validate(name);
        this.name = name;
    }
    
    private void validate(String name) {
        if(name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없다.");
        }
    }
    
    public String getName() {
        return name;
    }
}
