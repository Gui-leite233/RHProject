    package Funcionario;

    public enum TipoFunc {
        GERENTE(1),
        COORDENADOR(2),
        ANALISTA(3),
        ASSISTENTE(4),
        ESTAGIARIO(5);

        private final int codigo;

        TipoFunc(int codigo) {
            this.codigo = codigo;
        }

        public int getCodigo() {
            return codigo;
        }

        public static TipoFunc deCodigo(int codigo) {
            for (TipoFunc t : values()) {
                if (t.codigo == codigo) return t;
            }
            throw new IllegalArgumentException("Código inválido: " + codigo);
        }
    }