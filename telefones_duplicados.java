// Task Telefones_duplicados

// Fazer a cópia do exercício anterior

// mudar o atributo colocando HashSet no lugar de ArrayList


	private HashMap<String, HashSet<Telefone>> listaTelefones;
	
// Criar o construtor inicializando a lista

	public ListaTelefonica() {
			this.hashMapTelefone = new HashMap<>();
		}
		
// Podemos utilizar o primeiro if aqui, ainda temos que verificar se é nulo, criar a instancia e adicionar
// Porém a segunda condição, teremos que pegar o nome novamente da nossa lista 
	HashSet<Telefone> telefonesExistentes = listaTelefones.get(nome);
	
// e verificar se esse nome existe na nossa instancia com o telefone que veio de parametro, podemos 
// usar aqui o contains, se nossa lista conter este telefone, então lança a exception 

    throw new IllegalArgumentException("Telefone jah existente para essa pessoa");

// Ainda detro dessa condição, temos que percorrer nossa listaTelefones para verificar se 
// a lista contém esse telefone e se o nome não é o mesmo que estamos querendo adicionar, se for true
// lança a próxima exception

	throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
	
// Depois disso, ainda nessa mesma verificação, criamos uma nova instancia da lista e adicionamos o telefone

	HashSet<Telefone> listaSemDuplicados = new HashSet<>(telefones);
    listaSemDuplicados.add(telefone);
	
// ai basta dar um replace na nossa listaTelefones substituindo pelo nome que veio de parâmetro e a lista acima

