import javax.swing.*;

/**
 * Shows an error message if the mod jar is opened directly instead of in forge.
 */
public class OpenErrorMessage {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Abrir este arquivo diretmente não ira fazer nada, é necessário que você instale o forge e coloque este arquivo na pasta \".minecraft/mods\". " +
                        System.lineSeparator() + "Se você não sabe como, pesquise por \"Forge Installation Tutorials\" em seu navegador.",
                "Você está instalando isto incorretamente!",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
