package org.aldoian.pooclasesabstractas.form.elementos;

public class InputForm extends ElementoForm {

    private String type = "Text";

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String type) {
        super(nombre);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String dibujarHtml() {
        return "<input type=\"" + this.type
                + "\" name=\"" + this.nombre
                + "\" value=\"" + this.valor + "\">";
    }
}
