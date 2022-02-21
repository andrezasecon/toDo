
// Task Blog

// Na classe Blog criar um atributo lista do tipo Post
// criar o construtor vazio e inicializar nossa lista
// novamente, por que na Program ele cria o objeto sem nada dentro, com construtor vazio

    private List<Post> posts;

    public Blog() {

        posts = new ArrayList<>();
    }
	
// o Método adicionar não retorna nada, então ele é void, recebe um Post
	public void adicionarPostagem(Post postagem) {
	}
		
// ai basta pegar nossa lista de posts e dar um add na postagem

// O método para obter todos os autores retorna um Set de String

	public Set<String> obterTodosAutores(){
	}

// sempre pense assim, se ele retorna 
// um set de String, o primeiro passo é criar esse set q será retornado 
// ele pede para ser ordenado pelo nome, basta usar o 
// TreeSeet aqui que ele já faz essa ordenação

	Set<String> autores = new TreeSet<>();
	
// então percorremos nossa lista de posts adicionando na nossa lista de autores o autor
// no final retornar nosso set de autores depois do for
	
	