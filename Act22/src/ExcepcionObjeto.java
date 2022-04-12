
public class ExcepcionObjeto extends RuntimeException {

    ExcepcionObjeto(Object o) {
        super("TipoDeObjetoInvalido");
        System.out.println("El objeto no es valido\nTipo de objeto requerido: ColorRGB\nTipo de objeto dado: "+o.getClass().getSimpleName());
    }

}