package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifincional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifincional em = new EquipamentoMultifincional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }
}
