package novoexemplo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
public class NovoExemplo {

    public static void main(String[] args) {

   JFrame frame = new JFrame("Exemplo JComboBox");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,150);

frame.setLocationRelativeTo(null);

JPanel panel = new JPanel();
frame.add(panel);

JLabel label = new JLabel("Selecione uma cor:");
panel.add(label);

String [] cores = {"Vermelho", "Azul", "Verde"};

JComboBox<String> comboBox = new JComboBox<>(cores);
panel.add(comboBox);

JButton button = new JButton("Alterar Cor de Fundo");
panel.add(button);

frame.setLayout(new FlowLayout());
final JPanel contentPanel = (JPanel)frame.getContentPane();

button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String corSelecionada = (String) comboBox.getSelectedItem();

        switch (corSelecionada){
            case "Vermelho":
                contentPanel.setBackground(Color.RED);
                break;
            case "Azul":
                contentPanel.setBackground(Color.BLUE);
                break;
            case "Verde":
                contentPanel.setBackground(Color.GREEN);
        }


    }
});


frame.setVisible(true);
    }
}
