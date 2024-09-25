# Atividade_POO
## Atividade que consiste em criar várias classes, segue esboço abaixo:
### 1 - Classe Midia (abstrata):
	° Atributos:
		a) titulo (String)
		b) anoDeLancamento (int)
		c) disponivel (boolean)
	° Métodos:
		d) Construtor que inicializa os atributos, com disponivel começando como true.
		e) Métodos abstratos:
		f) reproduzir(): Exibe uma mensagem simulando a reprodução da mídia.
		g) Implementar métodos getters e setters necessários.

### 2 - Classe Filme (subclasse de Midia):
	°Atributos:
		a) duracao (int) (duração do filme em minutos)
		b) diretor (String)
	°Métodos:
		c) Construtor que inicializa todos os atributos, incluindo os da classe mãe.
		d) Implementar o método reproduzir() com uma mensagem apropriada, como "Reproduzindo o filme X dirigido por Y"

### 3 - Classe Serie (subclasse de Midia):
	°Atributos:
		a) numeroDeTemporadas (int)
		b) numeroDeEpisodios (int)
	°Métodos:
		c) Construtor que inicializa todos os atributos, incluindo os da classe mãe.
		d) Implementar o método reproduzir(), exibindo uma mensagem como "Reproduzindo a série X com Y temporadas e Z episódios".

### 4 - Classe Musica (subclasse de Midia):
	°Atributos:
		a )artista (String)
		b) duracao (int) (duração da música em segundos)
	°Métodos:
		c) Construtor que inicializa todos os atributos, incluindo os da classe mãe.
		d) Implementar o método reproduzir(), exibindo uma mensagem como "Tocando a música X de Y".

### 5 - Classe Usuario:
	°Atributos:
		a) nome (String)
		b) id (int)
		c) assinaturaAtiva (boolean)
		d) midiasFavoritas (ArrayList<Midia>)
	°Métodos:
		e) Construtor que inicializa nome, id e assinaturaAtiva.
		f) Método adicionarMidiaFavorita(Midia midia): Adiciona uma mídia à lista de midiasFavoritas.
		g) Método removerMidiaFavorita(Midia midia): Remove uma mídia da lista de favoritos.
		h) Método reproduzirMidia(Midia midia): Verifica se a assinatura está ativa. Se estiver, chama o método reproduzir() da mídia; caso contrário, exibe uma mensagem indicando que o usuário precisa de uma assinatura ativa.
		i) Implementar os getters e setters necessários.

### 6 - Classe PlataformaStreaming:
	°Atributos:
		a) catalogo (ArrayList<Midia>)
		b) usuarios (ArrayList<Usuario>)
	°Métodos:
		c) Método adicionarMidia(Midia midia): Adiciona uma mídia ao catálogo.
		d) Método registrarUsuario(Usuario usuario): Adiciona um usuário à plataforma.
		e) Método ativarAssinatura(Usuario usuario): Ativa a assinatura de um usuário.
		f) Método listarCatalogoDisponivel(): Exibe todas as mídias disponíveis no catálogo.
		g) Método reproduzirMidiaParaUsuario(Usuario usuario, Midia midia): Reproduz uma mídia para o usuário se ele tiver assinatura ativa.

### 7 - Classe Principal
	°Solicitar dados do usuário
	°Exibir um menu de opções 
