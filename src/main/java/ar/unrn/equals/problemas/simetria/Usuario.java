package ar.unrn.equals.problemas.simetria;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete concentra un ejemplo minimo donde equals acepta comparar contra tipos ajenos y por eso rompe la simetria del contrato.
 */
class Usuario {
    private String login;

    public Usuario(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Usuario u) {
            return login.equals(u.login);
        }
        if (o instanceof String s) {
            return login.equals(s);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return login.hashCode();
    }
}
