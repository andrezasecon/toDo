//Tasks Telefones

//Na classe ListaTelefonica

//Criar um atributo HashMap que contenha nome das pessoas como chave 
//e seus telefones do tipo ArrayList<Telefone> como valor


    private HashMap<String, ArrayList<Telefone>> hashMapTelefone = new new HashMap<>();

//Criar um construtor para esse atributo

//No método adicionar telefone:
//Vc deve criar uma Lista de telefone e nessa lista pegar o nome na hashMap

   ArrayList<Telefone> telefones = hashMapTelefone.get(nome);// isso
   
   ArrayList<Telefone> telefones = new ArrayList<>();// éa mesma coisa de fazer isso ;)
        telefones = hashMapTelefone.get(nome);
   
   
 //  E ai fazer uma condição de que se o telefone for nulo(quer dizer q ele não existe)
 //  então ele deve ser adicionardo na lista telefones e adicionar o nome e a lista telefones na hashMap
   
   
   telefones.add(telefone); // adiciona o telefone na nossa lista
   hashMapTelefone.put(nome, telefones); // adicionar o nome e a lista de telefones com o telefone q adicionamos anteriormente
   
