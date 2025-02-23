package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {
    @Override
    public void copiar() {
        System.out.println("Copiando em um Equipamento Multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando em um Equipamento Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo em um Equipamento Multifuncional");
    }
}
