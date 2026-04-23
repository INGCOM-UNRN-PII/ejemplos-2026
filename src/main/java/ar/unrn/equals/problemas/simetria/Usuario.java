package ar.unrn.equals.problemas.simetria;

class Usuario {
    private String login;

    public Usuario(String login) { this.login = login; }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Usuario u) return login.equals(u.login);
        if (o instanceof String s) return login.equals(s); 
        return false;
    }

    @Override
    public int hashCode() { return login.hashCode(); }
}
