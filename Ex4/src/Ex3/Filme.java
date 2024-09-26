package Ex3;

public class Filme {       //Classe 'Filme'
    // Atributos da classe 'Filme'
	private String título;  // Armazena o título do filme
	private int duraçãoMin; // Armazena quantidade de minutos do filme
	private String gênero;  // Armazena o gênero do filme
	private String result;  // Armazena as informações do filme
	
public Filme(String titulo, int duração, String genero ) { // Construtor 'Filme' com os parâmetros declarados
	setTítulo(titulo);                                     // Setter chama a informação do 'titulo'
	setDuraçãoMin(duração);                                // Setter chama o valor de  'duração'
	setGênero(genero);                                     // Setter chama a informação do 'genero'
	
	this.result = info();                                  // Declara as informações de info ao atributo 'result' 
}

public void setTítulo(String titulo) {               // Setter para definir o valor de 'titulo' e verificar se não vai estar vazio 
	if(titulo == null || titulo.trim().isEmpty()) {  // Verifica com 'null' se não tem nenhum texto no 'título'; '.trim' remove todos os espaços em branco da String; '.isEmpty' retorna true se a String estiver vazia
		throw new IllegalArgumentException("O título não pode estar vazio."); // Se a informação for verdadeira retorna o 'IllegalArgumentException'
	
	}
	this.título = titulo;                            // Declara o pârametro 'titulo' ao atributo 'título'
}

public void setDuraçãoMin(int duração) { // Setter para definir o valor de 'duração' e verificar se não vai ser igual a zero
	if(duração <= 0) {                   // Verifica se duração é <= a 0
		throw new IllegalArgumentException("A duração do filme tem que ser maior que zero."); // Se a informação for verdadeira retorna o 'IllegalArgumentException'
	}
	this.duraçãoMin = duração;           // Declara o pârametro 'duração' ao atributo 'duração' 
}

public void setGênero(String genero) {
	// Verificar se o genero é igual a "Romance, terror, comédia"; '!' é utilizado para dizer que se a informação de 'genero' for diferente de "Romance, terror, comédia" ela está errada; 'EqualIgnoreCase' compara a String genero com a String fornecida sem levar em conta a forma que é escrita
	if(!genero.equalsIgnoreCase("Romance") && 
	   !genero.equalsIgnoreCase("Terror") && 
	   !genero.equalsIgnoreCase("Comédia")) {
		throw new IllegalArgumentException("O gênero de ser Romance, Terror ou Comédia."); // Se a informação for verdadeira retorna 'IllegalArgumentException'
	}
	this.gênero = genero;
}

public String getTítulo() {  // Getter para acessar o título de forma segura
	return título;
}

public int getDuraçãoMin() { // Getter para acessar a duração do filme de forma segura
	return duraçãoMin;
}

public String getGênero() {  // Getter para acessar o gênero do filme de forma segura
	return gênero;
}

public String info(){        // String que fornece as informações do filme após as alteções de valores pelos setters
	return "Título: " + título + "\n" + "Duração: " + duraçãoMin + " minutos." + "\n" + "Gênero: " + gênero + "\n";
}

public String getResult() {  // Getter para acessar o as informações do filme de forma segura
	return result;
}

public static void main(String[]args) {  // Método main do projeto
	try {                                                            // try-catch para verificar se existe uma exceção
        Filme f1 = new Filme("Invocação do Mal", 112, "Comédia");    // Instância f1 como os valores de 'título, duração e genero' 
        System.out.println(f1.getResult());                          // Acessa a informação pelo 'getResult()'

        
    } catch (IllegalArgumentException e) {                           // Se algum dos parâmetros está incorreto; 'IllegalArgumentException e' para o getMessage acessar o 'IllegalArgumentException' referente ao parâmetro incorreto
        System.out.println("Ocorreu o seguinte erro: " + e.getMessage()); // Se tiver incorreto retorna o 'IllegalArgumentException' referente ao parâmetro incorreto
    }
}
}
