public enum TipoAtividade {
    CULTURA("Atividades culturais"),
    COMPRAS("Compras e comércio"),
    GASTRONOMIA("Gastronomia e culinária"),
    AVENTURA("Aventuras e esportes");

    private final String descricao;

    TipoAtividade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}