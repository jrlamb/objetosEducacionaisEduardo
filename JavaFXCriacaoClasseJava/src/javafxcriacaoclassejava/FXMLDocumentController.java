/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxcriacaoclassejava;


import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Eduardo
 */
public class FXMLDocumentController implements Initializable {

    private Integer passo=0;
    
    private Mensagem msg = new Mensagem();
    
    @FXML
    private Polygon diamanteDireito1;
    
    @FXML
    private Polygon diamanteDireito2;
    
    @FXML
    private Polygon diamanteEsquerdo1;
    
    @FXML
    private Polygon diamanteEsquerdo2;
    
    @FXML
    private CheckBox checkSuperClassEsq;
    
    @FXML
    private CheckBox checkSuperClassDir;
    
    @FXML
    private CheckBox checkClassDir;
    
    @FXML
    private CheckBox checkClassEsq;
    
    @FXML
    private Label tabDirInter;
    
    @FXML
    private Label tabEsqInter;
    
    @FXML
    private ComboBox dirMetodoVisibilidade;
    
    @FXML
    private ComboBox dirAtributoVisibilidade;
    
    @FXML
    private ComboBox esqMetodoVisibilidade;
    
    @FXML
    private ComboBox esqAtributoVisibilidade;
    
    @FXML
    private TitledPane gerenciarAtributoEsq;    
    
    @FXML
    private TitledPane gerenciarAtributoDir;    
    
    @FXML
    private Rectangle retanguloEsq;
    
    @FXML
    private Line retanguloEsqLinha1;
    
    @FXML
    private Line retanguloEsqLinha2;
    
    @FXML
    private Line retanguloDirLinha1;
    
    @FXML
    private Line retanguloDirLinha2;
    
    @FXML
    private Rectangle retanguloDir;
    
    @FXML
    private Label linhaDependencia;
    
    @FXML
    private Line linhaDirCima;
    
    @FXML
    private Line linhaDirBaixo;
    
    @FXML
    private Line linhaEsqCima;
    
    @FXML
    private Line linhaEsqBaixo;
    
    @FXML
    private Polygon flechaEsquerda;
    
    @FXML
    private Polygon flechaDireita;
    
    @FXML
    private Line linhaUnica;
    //desenho
    
    @FXML
    private Label tabEsqNome;
    
    @FXML
    private Label tabEsqAtrib1;
    
    @FXML
    private Label tabEsqAtrib2;
    
    @FXML
    private Label tabEsqAtrib3;
    
    @FXML
    private Label tabEsqMet1;
    
    @FXML
    private Label tabEsqMet2;
    
    @FXML
    private Label tabEsqMet3;
    
    @FXML
    private Label tabDirNome;
    
    @FXML
    private Label tabDirAtrib1;
    
    @FXML
    private Label tabDirAtrib2;
    
    @FXML
    private Label tabDirAtrib3;
    
    @FXML
    private Label tabDirMet1;
    
    @FXML
    private Label tabDirMet2;
    
    @FXML
    private Label tabDirMet3;
    
    //Outros
    @FXML
    private TextFlow textFlowEsq;
    
    @FXML
    private TextFlow textFlowDir;
    
    @FXML
    private ComboBox tipoClassificadorCbEsq;
    
    @FXML
    private ComboBox cbTipoAtributoEsq;
    
    @FXML
    private ComboBox cbTipoMetodoEsq;
    
    @FXML
    private TextField txfNomeClasseEsq;
    
    @FXML
    private TextField txfAtributoEsq;
    
    @FXML
    private TextField txfMetodoEsq;
    
    @FXML
    private Label lbAtributoEsq1;
    
    @FXML
    private Label lbAtributoEsq2;
    
    @FXML
    private Label lbAtributoEsq3;
    
    @FXML
    private Label lbMetodoEsq1;
    
    @FXML
    private Label lbMetodoEsq2;
    
    @FXML
    private Label lbMetodoEsq3;

    private Integer contAtributoEsq=1;
    private Integer contMetodoEsq=1;

    @FXML
    private ComboBox cbTipoAtributoDir;
    
    @FXML
    private ComboBox tipoClassificadorCbDir;
    
    @FXML
    private ComboBox cbTipoMetodoDir;
    
    @FXML
    private TextField txfNomeClasseDir;
    
    @FXML
    private TextField txfAtributoDir;
    
    @FXML
    private TextField txfMetodoDir;
    
    @FXML
    private Label lbAtributoDir1;
    
    @FXML
    private Label lbAtributoDir2;
    
    @FXML
    private Label lbAtributoDir3;
    
    @FXML
    private Label lbMetodoDir1;
    
    @FXML
    private Label lbMetodoDir2;
    
    @FXML
    private Label lbMetodoDir3;
    
    @FXML
    private ComboBox cbTipoRelacionamento;
    
    @FXML
    private Button btGerar;
    
    @FXML
    private Button btAdicionaAtributoEsq;
    
    @FXML
    private Button btDeletaAtributoEsq;
    
    @FXML
    private Button btAdicionaMetodoEsq;
    
    @FXML
    private Button btDeletaMetodoEsq;
    
    @FXML
    private Button btAdicionaAtributoDir;
    
    @FXML
    private Button btDeletaAtributoDir;
    
    @FXML
    private Button btAdicionaMetodoDir;
    
    @FXML
    private Button btDeletaMetodoDir;
    
    @FXML
    private ComboBox cbTipoDirecao;
    
    @FXML
    private TableView tabelaClasseDir;
    
    private Integer contAtributoDir=1;
    private Integer contMetodoDir=1;
    
    private Classe classeEsq = new Classe();
    private Classe classeDir = new Classe();
    
    boolean verificador = false;
    
    
    @FXML
    private void limparTela(ActionEvent actionEvent) throws Exception{
    
        start();
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        
    }
    
    public void start() throws Exception {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        
        stage.getIcons().add(new Image("/img/logo.png"));
        
        stage.centerOnScreen();
        stage.resizableProperty().set(false);
        stage.setTitle("UTFPR - Ilustrador de classes na linguagem Java");
        
        stage.show();

    }
    
    public void eventoLoco (WindowEvent evento){}
    
    
    
    @FXML
    private void encherTextFlow(){
        
        if(txfNomeClasseEsq.getText().equals("")){
            alertaErro("Você deverá colocar um nome para a classe!");
            txfNomeClasseEsq.requestFocus();
        }
        
        else if(txfNomeClasseDir.getText().equals("")){
            alertaErro("Você deverá colocar um nome para a classe!");
            txfNomeClasseDir.requestFocus();
        }
        
        else if(cbTipoDirecao.getSelectionModel().isEmpty() && (cbTipoRelacionamento.getSelectionModel().isEmpty())==false){
            alertaErro("Você deverá selecionar uma direção para o relacionamento!");
            cbTipoDirecao.requestFocus();
        }
        
        else if(txfNomeClasseDir.getText().equals(txfNomeClasseEsq.getText())){
            alertaErro("Você deverá colocar um nome diferente entre as classes!");
        }
        
        else if(cbTipoRelacionamento.getSelectionModel().isEmpty()){
            alertaErro("Você deverá selecionar um tipo de relacionamento!");
            cbTipoRelacionamento.requestFocus();
        }
        
        else{
            
            btAdicionaAtributoEsq.setDisable(true);
            btDeletaAtributoEsq.setDisable(true);
            btAdicionaMetodoEsq.setDisable(true);
            btDeletaMetodoEsq.setDisable(true);
            
            btAdicionaAtributoDir.setDisable(true);
            btDeletaAtributoDir.setDisable(true);
            btAdicionaMetodoDir.setDisable(true);
            btDeletaMetodoDir.setDisable(true);
            
            textFlowEsq.getChildren().clear();
            textFlowDir.getChildren().clear();

            classeEsq.setNome(txfNomeClasseEsq.getText());
            classeEsq.setTipo((String) tipoClassificadorCbEsq.getSelectionModel().getSelectedItem());

            classeDir.setNome(txfNomeClasseDir.getText());
            classeDir.setTipo((String) tipoClassificadorCbDir.getSelectionModel().getSelectedItem());

            String classe1= "";
            String atributosEsq = "";
            String metodosEsq = "";

            classe1 = "public ";
            if(checkClassEsq.isSelected() == true){
                classe1 = classe1 + "abstract ";
            }

            classe1 = classe1 + classeEsq.getTipo() + " " + classeEsq.getNome() + " ";

            if(checkSuperClassDir.isSelected() == true){
                classe1 = classe1 + "extends " + classeDir.getNome();
            }

            if((cbTipoDirecao.getSelectionModel().getSelectedItem().equals("Flecha apontada para direita")) && 
                    cbTipoRelacionamento.getSelectionModel().getSelectedItem().equals("Generalização") &&
                    //classeEsq.getTipo().equals("class")&&
                    classeDir.getTipo().equals("interface")){

                classe1 = classe1 + "implements " +classeDir.getNome();

            }

            classe1 = classe1 + " { \n";
            atributosEsq = setarAtributosEsq(atributosEsq);
            classe1 = classe1 + atributosEsq;
            classe1 = classe1 + "\n";
            metodosEsq = setarMetodosEsq(metodosEsq);
            classe1 = classe1 + metodosEsq;
            classe1 = classe1 + "}\n\n";

            Text text = new Text("");
            text.setText(classe1);

            String classe2= "";
            classe2 = "public ";

            if(checkClassDir.isSelected() == true){
                classe2 = classe2 + "abstract ";
            }

            String atributosDir = "";
            String metodosDir = "";

            classe2 = classe2 + classeDir.getTipo() + " " + classeDir.getNome() + " ";

            if(checkSuperClassEsq.isSelected() == true){
                classe2 = classe2 + "extends " + classeEsq.getNome();
            }

            if((cbTipoDirecao.getSelectionModel().getSelectedItem().equals("Flecha apontada para esquerda")) && 
                    cbTipoRelacionamento.getSelectionModel().getSelectedItem().equals("Generalização") &&
                    //classeDir.getTipo().equals("class")&&
                    classeEsq.getTipo().equals("interface")){

                classe2 = classe2 + "implements " +classeEsq.getNome();

            }

            classe2 = classe2 + " { \n";

            atributosDir = setarAtributosDir(atributosDir);
            classe2 = classe2 + atributosDir;
            classe2 = classe2 + "\n";
            metodosDir = setarMetodosDir(metodosDir);
            classe2 = classe2 + metodosDir;
            classe2 = classe2 + "}\n\n";

            Text text2 = new Text("");
            text2.setText(classe2);

            text.setFill(Color.RED);
            text2.setFill(Color.BLUE);

            textFlowEsq.getChildren().addAll(text);
            textFlowDir.getChildren().addAll(text2);
            text.setFont(Font.font("Courier New"));
            text2.setFont(Font.font("Courier New"));

            String bgBrancoTxFlow = "-fx-background-color: white";

            textFlowEsq.setStyle(bgBrancoTxFlow);
            textFlowDir.setStyle(bgBrancoTxFlow);


            preencherTabEsq();
            preencherTabDir();

            if(tipoClassificadorCbEsq.getSelectionModel().getSelectedItem().equals("interface")){
                tabEsqInter.setVisible(true);
            } else {
                tabEsqInter.setVisible(false);
            }

            if(tipoClassificadorCbDir.getSelectionModel().getSelectedItem().equals("interface")){
                tabDirInter.setVisible(true);
            } else {
                tabDirInter.setVisible(false);
            }

            if(checkClassEsq.isSelected() == true){
                tabEsqNome.setFont(Font.font("System",FontPosture.ITALIC,12));
            }else{
                tabEsqNome.setFont(Font.font("System",FontPosture.REGULAR,12));
            }

            if(checkClassDir.isSelected() == true){
                tabDirNome.setFont(Font.font("System",FontPosture.ITALIC,12));
            }else{
                tabDirNome.setFont(Font.font("System",FontPosture.REGULAR,12));
            }
            System.out.println(cbTipoDirecao.getSelectionModel().getSelectedItem());
            System.out.println(cbTipoRelacionamento.getSelectionModel().getSelectedItem());
            setarVisivelTab();
            setarTipoRelacionamento();

            btGerar.setDisable(true);
            cbTipoRelacionamento.setDisable(true);
            cbTipoDirecao.setDisable(true);
        }
        
    }
    
    private String setarAtributosEsq(String classe1){
    
        if(classeEsq.getTipoAtributo1().equals("Classe2")){
            classeEsq.setTipoAtributo1(classeDir.getNome());
        }
        if(classeEsq.getTipoAtributo2().equals("Classe2")){
            classeEsq.setTipoAtributo2(classeDir.getNome());
        }
        if(classeEsq.getTipoAtributo3().equals("Classe2")){
            classeEsq.setTipoAtributo3(classeDir.getNome());
        }
        
        if(classeEsq.getAtributo1().equals("")){
        }else if(!classeEsq.getAtributo1().equals(null)){
            classe1 = classe1 + "     "+ classeEsq.getVisibilidadeAtributo1() +" " + classeEsq.getTipoAtributo1()+ " " + classeEsq.getAtributo1()+ ";\n";
        }
        
        if(classeEsq.getAtributo2().equals("")){
        }else if(!classeEsq.getAtributo2().equals(null)){
            classe1 = classe1 + "     "+ classeEsq.getVisibilidadeAtributo2() +" " + classeEsq.getTipoAtributo2()+ " " + classeEsq.getAtributo2()+ ";\n";
        }
        
        if(classeEsq.getAtributo3().equals("")){
        }else if(!classeEsq.getAtributo3().equals(null)){
            classe1 = classe1 + "     "+ classeEsq.getVisibilidadeAtributo3() +" " + classeEsq.getTipoAtributo3()+ " " + classeEsq.getAtributo3()+ ";\n";
        }
        
        return classe1;
    }
    
    private String setarMetodosEsq(String classe1){
    
        if(classeEsq.getTipoMetodo1().equals("Classe2")){
            classeEsq.setTipoMetodo1(classeDir.getNome());
        }
        if(classeEsq.getTipoMetodo2().equals("Classe2")){
            classeEsq.setTipoMetodo2(classeDir.getNome());
        }
        if(classeEsq.getTipoMetodo3().equals("Classe2")){
            classeEsq.setTipoMetodo3(classeDir.getNome());
        }
        
        if(classeEsq.getMetodo1().equals("")){
        }else if(!classeEsq.getMetodo1().equals(null)){
            classe1 = classe1 + "     "+ classeEsq.getVisibilidadeMetodo1() +" " + classeEsq.getTipoMetodo1()+ " " + classeEsq.getMetodo1()+ "(){}\n";
        }                
        
        if(classeEsq.getMetodo2().equals("")){
        }else if(!classeEsq.getMetodo2().equals(null)){
            classe1 = classe1 + "     "+ classeEsq.getVisibilidadeMetodo2() +" " + classeEsq.getTipoMetodo2()+ " " + classeEsq.getMetodo2()+ "(){}\n";
        }
        
        if(classeEsq.getMetodo3().equals("")){
        }else if(!classeEsq.getMetodo3().equals(null)){
            classe1 = classe1 + "     "+ classeEsq.getVisibilidadeMetodo3() +" " + classeEsq.getTipoMetodo3()+ " " + classeEsq.getMetodo3()+ "(){}\n";
        }                
        
        return classe1;
    }
    
    private String setarAtributosDir(String classe2){
    
        if(classeDir.getTipoAtributo1().equals("Classe1")){
            classeDir.setTipoAtributo1(classeEsq.getNome());
        }
        if(classeDir.getTipoAtributo2().equals("Classe1")){
            classeDir.setTipoAtributo2(classeEsq.getNome());
        }
        if(classeDir.getTipoAtributo3().equals("Classe1")){
            classeDir.setTipoAtributo3(classeEsq.getNome());
        }
        
        if(classeDir.getAtributo1().equals("")){
        }else if(!classeDir.getAtributo1().equals(null)){
            classe2 = classe2 + "     "+ classeDir.getVisibilidadeAtributo1() +" " + classeDir.getTipoAtributo1()+ " " + classeDir.getAtributo1()+ ";\n";
        }
        
        if(classeDir.getAtributo2().equals("")){
        }else if(!classeDir.getAtributo2().equals(null)){
            classe2 = classe2 + "     "+ classeDir.getVisibilidadeAtributo2() +" " + classeDir.getTipoAtributo2()+ " " + classeDir.getAtributo2()+ ";\n";
        }
        
        if(classeDir.getAtributo3().equals("")){
        }else if(!classeDir.getAtributo3().equals(null)){
            classe2 = classe2 + "     "+ classeDir.getVisibilidadeAtributo3() +" " + classeDir.getTipoAtributo3()+ " " + classeDir.getAtributo3()+ ";\n";
        }
        
        return classe2;
    }
    
    private String setarMetodosDir(String classe2){
        
        if(classeDir.getTipoMetodo1().equals("Classe1")){
            classeDir.setTipoMetodo1(classeEsq.getNome());
        }
        if(classeDir.getTipoMetodo2().equals("Classe1")){
            classeDir.setTipoMetodo2(classeEsq.getNome());
        }
        if(classeDir.getTipoMetodo3().equals("Classe1")){
            classeDir.setTipoMetodo3(classeEsq.getNome());
        }
        
        if(classeDir.getMetodo1().equals("")){
        }else if(!classeDir.getMetodo1().equals(null)){
            classe2 = classe2 + "     "+ classeDir.getVisibilidadeMetodo1() +" " + classeDir.getTipoMetodo1()+ " " + classeDir.getMetodo1()+ "(){}\n";
        }                
        
        if(classeDir.getMetodo2().equals("")){
        }else if(!classeDir.getMetodo2().equals(null)){
            classe2 = classe2 + "     "+ classeDir.getVisibilidadeMetodo2() +" " + classeDir.getTipoMetodo2()+ " " + classeDir.getMetodo2()+ "(){}\n";
        }
        
        if(classeDir.getMetodo3().equals("")){
        }else if(!classeDir.getMetodo3().equals(null)){
            classe2 = classe2 + "     "+ classeDir.getVisibilidadeMetodo3() +" " + classeDir.getTipoMetodo3()+ " " + classeDir.getMetodo3()+ "(){}\n";
        }                
        
        return classe2;
    }
    
    private void preencherTabEsq(){
    
        tabEsqNome.setText(classeEsq.getNome());
        
        if(classeEsq.getAtributo1().equals("")){
            tabEsqAtrib1.setText("");
        }else if(!classeEsq.getAtributo1().equals(null)){
        tabEsqAtrib1.setText(classeEsq.getVisibilidadeSimboloAtributo1() +" " + classeEsq.getAtributo1() + " : " + classeEsq.getTipoAtributo1());}
       
        if(classeEsq.getAtributo2().equals("")){
            tabEsqAtrib2.setText("");
        }else if(!classeEsq.getAtributo2().equals(null)){
            tabEsqAtrib2.setText(classeEsq.getVisibilidadeSimboloAtributo2() +" " + classeEsq.getAtributo2() + " : " + classeEsq.getTipoAtributo2());}
        
        if(classeEsq.getAtributo3().equals("")){
            tabEsqAtrib3.setText("");
        }else if(!classeEsq.getAtributo3().equals(null)){
        tabEsqAtrib3.setText(classeEsq.getVisibilidadeSimboloAtributo3() +" " + classeEsq.getAtributo3() + " : " + classeEsq.getTipoAtributo3());}
        
        if(classeEsq.getMetodo1().equals("")){
            tabEsqMet1.setText("");
        }else if(!classeEsq.getMetodo1().equals(null)){
        tabEsqMet1.setText(classeEsq.getVisibilidadeSimboloMetodo1() +" " + classeEsq.getMetodo1()+"() : " + classeEsq.getTipoMetodo1());}
        
        if(classeEsq.getMetodo2().equals("")){
            tabEsqMet2.setText("");
        }else if(!classeEsq.getMetodo2().equals(null)){
        tabEsqMet2.setText(classeEsq.getVisibilidadeSimboloMetodo2() +" " + classeEsq.getMetodo2()+"() : " + classeEsq.getTipoMetodo2());}
        
        if(classeEsq.getMetodo3().equals("")){
            tabEsqMet3.setText("");
        }else if(!classeEsq.getMetodo3().equals(null)){
        tabEsqMet3.setText(classeEsq.getVisibilidadeSimboloMetodo3() +" " + classeEsq.getMetodo3()+"() : " + classeEsq.getTipoMetodo3());}
        
    }
    private void preencherTabDir(){
        
        tabDirNome.setText(classeDir.getNome());
        
        if(classeDir.getAtributo1().equals("")){
            tabDirAtrib1.setText("");
        }else if(!classeDir.getAtributo1().equals(null)){
        tabDirAtrib1.setText(classeDir.getVisibilidadeSimboloAtributo1()+ " " + classeDir.getAtributo1() + " : " + classeDir.getTipoAtributo1());}
       
        if(classeDir.getAtributo2().equals("")){
            tabDirAtrib2.setText("");
        }else if(!classeDir.getAtributo2().equals(null)){
            tabDirAtrib2.setText(classeDir.getVisibilidadeSimboloAtributo2()+ " " + classeDir.getAtributo2() + " : " + classeDir.getTipoAtributo2());}
        
        if(classeDir.getAtributo3().equals("")){
            tabDirAtrib3.setText("");
        }else if(!classeDir.getAtributo3().equals(null)){
        tabDirAtrib3.setText(classeDir.getVisibilidadeSimboloAtributo3()+ " " + classeDir.getAtributo3() + " : " + classeDir.getTipoAtributo3());}
        
        if(classeDir.getMetodo1().equals("")){
            tabDirMet1.setText("");
        }else if(!classeDir.getMetodo1().equals(null)){
        tabDirMet1.setText(classeDir.getVisibilidadeSimboloMetodo1()+ " " + classeDir.getMetodo1()+"() : " + classeDir.getTipoMetodo1());}
        
        if(classeDir.getMetodo2().equals("")){
            tabDirMet2.setText("");
        }else if(!classeDir.getMetodo2().equals(null)){
        tabDirMet2.setText(classeDir.getVisibilidadeSimboloMetodo2()+ " " + classeDir.getMetodo2()+"() : " + classeDir.getTipoMetodo2());}
        
        if(classeDir.getMetodo3().equals("")){
            tabDirMet3.setText("");
        }else if(!classeDir.getMetodo3().equals(null)){
        tabDirMet3.setText(classeDir.getVisibilidadeSimboloMetodo3()+ " " + classeDir.getMetodo3()+"() : " + classeDir.getTipoMetodo3());}
        
    }
    
    private void setarTipoRelacionamento(){
    
        if(cbTipoRelacionamento.getSelectionModel().getSelectedItem().equals("Dependência")){
            linhaDependencia.setVisible(true);
            linhaUnica.setVisible(false);
            
            if(cbTipoDirecao.getSelectionModel().getSelectedItem().equals("Flecha apontada para direita")){
                linhaDirBaixo.setVisible(true);
                linhaDirCima.setVisible(true);
                linhaEsqBaixo.setVisible(false);
                linhaEsqCima.setVisible(false);
                flechaDireita.setVisible(false);
                flechaEsquerda.setVisible(false);
            }else if(cbTipoDirecao.getSelectionModel().getSelectedItem().equals("Flecha apontada para esquerda")){
                linhaDirBaixo.setVisible(false);
                linhaDirCima.setVisible(false);
                linhaEsqBaixo.setVisible(true);
                linhaEsqCima.setVisible(true);
                flechaDireita.setVisible(false);
                flechaEsquerda.setVisible(false);
            }
            
        }else if(cbTipoRelacionamento.getSelectionModel().getSelectedItem().equals("Generalização")){
            linhaDependencia.setVisible(false);
            linhaUnica.setVisible(true);
            
            if(cbTipoDirecao.getSelectionModel().getSelectedItem().equals("Flecha apontada para direita")){
                linhaDirBaixo.setVisible(false);
                linhaDirCima.setVisible(false);
                linhaEsqBaixo.setVisible(false);
                linhaEsqCima.setVisible(false);
                flechaDireita.setVisible(true);
                flechaEsquerda.setVisible(false);
            }else if(cbTipoDirecao.getSelectionModel().getSelectedItem().equals("Flecha apontada para esquerda")){
                linhaDirBaixo.setVisible(false);
                linhaDirCima.setVisible(false);
                linhaEsqBaixo.setVisible(false);
                linhaEsqCima.setVisible(false);
                flechaDireita.setVisible(false);
                flechaEsquerda.setVisible(true);
            }
            
        }else if(cbTipoRelacionamento.getSelectionModel().getSelectedItem().equals("Associação")){
            linhaDependencia.setVisible(false);
            linhaUnica.setVisible(true);
            
            
            linhaDirBaixo.setVisible(false);
            linhaDirCima.setVisible(false);
            linhaEsqBaixo.setVisible(false);
            linhaEsqCima.setVisible(false);
            flechaDireita.setVisible(false);
            flechaEsquerda.setVisible(false);
            
        }else if(cbTipoRelacionamento.getSelectionModel().getSelectedItem().equals("Agregação")){
        
            if(cbTipoDirecao.getSelectionModel().getSelectedItem().equals("Flecha apontada para direita")){
                linhaUnica.setVisible(true);
                
                diamanteDireito1.setVisible(true);
                diamanteDireito2.setVisible(true);
                diamanteDireito1.setFill(Paint.valueOf("WHITE"));
                diamanteDireito1.setStroke(Paint.valueOf("WHITE"));
                diamanteDireito2.setFill(Paint.valueOf("WHITE"));
                diamanteDireito2.setStroke(Paint.valueOf("WHITE"));
                
                
            }else if(cbTipoDirecao.getSelectionModel().getSelectedItem().equals("Flecha apontada para esquerda")){
                linhaUnica.setVisible(true);
                
                diamanteEsquerdo1.setVisible(true);
                diamanteEsquerdo2.setVisible(true);
                diamanteEsquerdo1.setFill(Paint.valueOf("WHITE"));
                diamanteEsquerdo1.setStroke(Paint.valueOf("WHITE"));
                diamanteEsquerdo2.setFill(Paint.valueOf("WHITE"));
                diamanteEsquerdo2.setStroke(Paint.valueOf("WHITE"));
                
            }
            
        }else if(cbTipoRelacionamento.getSelectionModel().getSelectedItem().equals("Composição")){
        
            if(cbTipoDirecao.getSelectionModel().getSelectedItem().equals("Flecha apontada para direita")){
                
                linhaUnica.setVisible(true);
                
                diamanteDireito1.setVisible(true);
                diamanteDireito2.setVisible(true);
                diamanteDireito1.setFill(Paint.valueOf("BLACK"));
                diamanteDireito1.setStroke(Paint.valueOf("BLACK"));
                diamanteDireito2.setFill(Paint.valueOf("BLACK"));
                diamanteDireito2.setStroke(Paint.valueOf("BLACK"));
                
                
            }else if(cbTipoDirecao.getSelectionModel().getSelectedItem().equals("Flecha apontada para esquerda")){
                
                linhaUnica.setVisible(true);
                
                diamanteEsquerdo1.setVisible(true);
                diamanteEsquerdo2.setVisible(true);
                diamanteEsquerdo1.setFill(Paint.valueOf("BLACK"));
                diamanteEsquerdo1.setStroke(Paint.valueOf("BLACK"));
                diamanteEsquerdo2.setFill(Paint.valueOf("BLACK"));
                diamanteEsquerdo2.setStroke(Paint.valueOf("BLACK"));
                
            }
            
        }
        
        
    }
    
    @FXML
    private void setarRelacionamento(){
        
            if(cbTipoRelacionamento.getSelectionModel().getSelectedItem().equals("Associação")){
              cbTipoDirecao.getSelectionModel().select("Sem flecha");
              cbTipoDirecao.setDisable(true);
            } else {
               cbTipoDirecao.getSelectionModel().clearSelection();
               cbTipoDirecao.setDisable(false);
            }
            if(cbTipoRelacionamento.getSelectionModel().getSelectedItem().equals("Generalização")){
                if((tipoClassificadorCbEsq.getSelectionModel().getSelectedItem().equals("interface")) && (tipoClassificadorCbDir.getSelectionModel().getSelectedItem().equals("class"))){
                    cbTipoDirecao.setDisable(true);
                    cbTipoDirecao.getSelectionModel().select("Flecha apontada para esquerda");
                }

                if((tipoClassificadorCbEsq.getSelectionModel().getSelectedItem().equals("class")) && (tipoClassificadorCbDir.getSelectionModel().getSelectedItem().equals("interface"))){
                    cbTipoDirecao.setDisable(true);
                    cbTipoDirecao.getSelectionModel().select("Flecha apontada para direita");
                }
            }
        
    }
    
    private void setarVisivelTab(){
        
        
        retanguloEsq.setVisible(true);
        retanguloEsqLinha1.setVisible(true);
        retanguloEsqLinha2.setVisible(true);
        tabEsqAtrib1.setVisible(true);
        tabEsqAtrib2.setVisible(true);
        tabEsqAtrib3.setVisible(true);
        tabEsqMet1.setVisible(true);
        tabEsqMet2.setVisible(true);
        tabEsqMet3.setVisible(true);
        tabEsqNome.setVisible(true);
        
        
        retanguloDir.setVisible(true);
        retanguloDirLinha1.setVisible(true);
        retanguloDirLinha2.setVisible(true);
        tabDirAtrib1.setVisible(true);
        tabDirAtrib2.setVisible(true);
        tabDirAtrib3.setVisible(true);
        tabDirMet1.setVisible(true);
        tabDirMet2.setVisible(true);
        tabDirMet3.setVisible(true);
        tabDirNome.setVisible(true);
    
    }
    
    private String setarSimboloVisibilidade(String visibilidade){
        String simbolo = "";
        if(visibilidade.equals("public")){
            simbolo = "+";
        }else if(visibilidade.equals("private")){
            simbolo = "-";
        }else if(visibilidade.equals("protected")){
            simbolo = "#";
        }
        
        return simbolo;
    }
    
    @FXML
    private void adicionaAtributoEsq(){
        boolean verif = verificadorAdicionarAtrib(contAtributoEsq);
        
        if(verif==true){
            
            switch(contAtributoEsq){

                case 1:
                    classeEsq.setAtributo1(txfAtributoEsq.getText());
                    classeEsq.setVisibilidadeAtributo1((String) esqAtributoVisibilidade.getSelectionModel().getSelectedItem());
                    classeEsq.setVisibilidadeSimboloAtributo1(setarSimboloVisibilidade(classeEsq.getVisibilidadeAtributo1()));
                    classeEsq.setTipoAtributo1((String) cbTipoAtributoEsq.getSelectionModel().getSelectedItem());
                    lbAtributoEsq1.setText(classeEsq.getTipoAtributo1()+ " " + classeEsq.getAtributo1());
                break;

                case 2:
                    classeEsq.setAtributo2(txfAtributoEsq.getText());
                    classeEsq.setVisibilidadeAtributo2((String) esqAtributoVisibilidade.getSelectionModel().getSelectedItem());
                    classeEsq.setVisibilidadeSimboloAtributo2(setarSimboloVisibilidade(classeEsq.getVisibilidadeAtributo2()));
                    classeEsq.setTipoAtributo2((String) cbTipoAtributoEsq.getSelectionModel().getSelectedItem());
                    lbAtributoEsq2.setText(classeEsq.getTipoAtributo2()+ " " + classeEsq.getAtributo2());
                break;

                case 3:
                    classeEsq.setAtributo3(txfAtributoEsq.getText());
                    classeEsq.setVisibilidadeAtributo3((String) esqAtributoVisibilidade.getSelectionModel().getSelectedItem());
                    classeEsq.setVisibilidadeSimboloAtributo3(setarSimboloVisibilidade(classeEsq.getVisibilidadeAtributo3()));
                    classeEsq.setTipoAtributo3((String) cbTipoAtributoEsq.getSelectionModel().getSelectedItem());
                    lbAtributoEsq3.setText(classeEsq.getTipoAtributo3()+ " " + classeEsq.getAtributo3());
                break;
            }
            contAtributoEsq++;
        }
        
        if(cbTipoAtributoEsq.getSelectionModel().getSelectedItem().equals("Classe2")){
            cbTipoRelacionamento.getSelectionModel().select("Associação - Agregação");
            cbTipoRelacionamento.setDisable(true);
            cbTipoDirecao.getSelectionModel().select("Sem flecha");
            cbTipoDirecao.setDisable(true);
        }
        
        cbTipoAtributoEsq.getSelectionModel().clearSelection();
        esqAtributoVisibilidade.getSelectionModel().clearSelection();
        txfAtributoEsq.setText(null);
        
        
    }
    
    @FXML
    private void deletaAtributoEsq(){
        
        boolean verif = verificadorDeletarAtrib(contAtributoEsq, classeEsq);
        if(verif==true){
            contAtributoEsq--;
        
            switch(contAtributoEsq){

                case 1:
                    classeEsq.setAtributo1("");
                    classeEsq.setTipoAtributo1("");
                    lbAtributoEsq1.setText("");
                    classeEsq.setVisibilidadeAtributo1("");
                    classeEsq.setVisibilidadeSimboloAtributo1("");
                break;

                case 2:
                    classeEsq.setAtributo2("");
                    classeEsq.setTipoAtributo2("");
                    lbAtributoEsq2.setText("");
                    classeEsq.setVisibilidadeAtributo2("");
                    classeEsq.setVisibilidadeSimboloAtributo2("");
                break;

                case 3:
                    classeEsq.setAtributo3("");
                    classeEsq.setTipoAtributo3("");
                    lbAtributoEsq3.setText("");
                    classeEsq.setVisibilidadeAtributo3("");
                    classeEsq.setVisibilidadeSimboloAtributo3("");
                break;
            }
        }
        
        if(!(classeEsq.getTipoAtributo1().equals("Classe2"))  &&
           !(classeEsq.getTipoAtributo2().equals("Classe2")) &&
           !(classeEsq.getTipoAtributo3().equals("Classe2"))){
            cbTipoRelacionamento.getSelectionModel().clearSelection();
            cbTipoRelacionamento.setDisable(false);
            cbTipoDirecao.getSelectionModel().clearSelection();
            cbTipoDirecao.setDisable(false);
        }
        
    }
//    ------------------------------------------    
    @FXML
    private void adicionaMetodoEsq(){
    
    boolean verif = verificadorAdicionarMetodo(contMetodoEsq);
    if(verif==true){    
        
        switch(contMetodoEsq){
        
            case 1:
                classeEsq.setMetodo1(txfMetodoEsq.getText());
                classeEsq.setVisibilidadeMetodo1((String) esqMetodoVisibilidade.getSelectionModel().getSelectedItem());
                classeEsq.setVisibilidadeSimboloMetodo1(setarSimboloVisibilidade(classeEsq.getVisibilidadeMetodo1()));
                classeEsq.setTipoMetodo1((String) cbTipoMetodoEsq.getSelectionModel().getSelectedItem());
                lbMetodoEsq1.setText(classeEsq.getTipoMetodo1()+ " " + classeEsq.getMetodo1());
            break;
                
            case 2:
                classeEsq.setMetodo2(txfMetodoEsq.getText());
                classeEsq.setVisibilidadeMetodo2((String) esqMetodoVisibilidade.getSelectionModel().getSelectedItem());
                classeEsq.setVisibilidadeSimboloMetodo2(setarSimboloVisibilidade(classeEsq.getVisibilidadeMetodo2()));
                classeEsq.setTipoMetodo2((String) cbTipoMetodoEsq.getSelectionModel().getSelectedItem());
                lbMetodoEsq2.setText(classeEsq.getTipoMetodo2()+ " " + classeEsq.getMetodo2());
            break;
            
            case 3:
                classeEsq.setMetodo3(txfMetodoEsq.getText());
                classeEsq.setVisibilidadeMetodo3((String) esqMetodoVisibilidade.getSelectionModel().getSelectedItem());
                classeEsq.setVisibilidadeSimboloMetodo3(setarSimboloVisibilidade(classeEsq.getVisibilidadeMetodo3()));
                classeEsq.setTipoMetodo3((String) cbTipoMetodoEsq.getSelectionModel().getSelectedItem());
                lbMetodoEsq3.setText(classeEsq.getTipoMetodo3()+ " " + classeEsq.getMetodo3());
            break;
        }
        contMetodoEsq++;
    }    
        cbTipoMetodoEsq.getSelectionModel().clearSelection();
        esqMetodoVisibilidade.getSelectionModel().clearSelection();
        txfMetodoEsq.setText(null);
        
        
    }
    
    @FXML
    private void deletaMetodoEsq(){
        
        boolean verif = verificadorDeletarMetodo(contMetodoEsq, classeEsq);
        if(verif==true){
            contMetodoEsq--;
            switch(contMetodoEsq){

                case 1:
                    classeEsq.setMetodo1("");
                    classeEsq.setTipoMetodo1("");
                    lbMetodoEsq1.setText("");
                    classeEsq.setVisibilidadeMetodo1("");
                    classeEsq.setVisibilidadeSimboloMetodo1("");
                break;

                case 2:
                    classeEsq.setMetodo2("");
                    classeEsq.setTipoMetodo2("");
                    lbMetodoEsq2.setText("");
                    classeEsq.setVisibilidadeMetodo2("");
                    classeEsq.setVisibilidadeSimboloMetodo2("");
                break;

                case 3:
                    classeEsq.setMetodo3("");
                    classeEsq.setTipoMetodo3("");
                    lbMetodoEsq3.setText("");
                    classeEsq.setVisibilidadeMetodo3("");
                    classeEsq.setVisibilidadeSimboloMetodo3("");
                break;
            }
            }
        
    }
    
    
    @FXML
    private void adicionaAtributoDir(){
    
        boolean verif = verificadorAdicionarAtrib(contAtributoDir);
        if(verif==true){
        
            switch(contAtributoDir){

                case 1:
                    classeDir.setAtributo1(txfAtributoDir.getText()); 
                    classeDir.setVisibilidadeAtributo1((String) dirAtributoVisibilidade.getSelectionModel().getSelectedItem());
                    classeDir.setVisibilidadeSimboloAtributo1(setarSimboloVisibilidade(classeDir.getVisibilidadeAtributo1()));
                    classeDir.setTipoAtributo1((String) cbTipoAtributoDir.getSelectionModel().getSelectedItem());
                    lbAtributoDir1.setText(classeDir.getTipoAtributo1()+ " " + classeDir.getAtributo1());
                break;

                case 2:
                    classeDir.setAtributo2(txfAtributoDir.getText());
                    classeDir.setVisibilidadeAtributo2((String) dirAtributoVisibilidade.getSelectionModel().getSelectedItem());
                    classeDir.setVisibilidadeSimboloAtributo2(setarSimboloVisibilidade(classeDir.getVisibilidadeAtributo2()));
                    classeDir.setTipoAtributo2((String) cbTipoAtributoDir.getSelectionModel().getSelectedItem());
                    lbAtributoDir2.setText(classeDir.getTipoAtributo2()+ " " + classeDir.getAtributo2());
                break;

                case 3:
                    classeDir.setAtributo3(txfAtributoDir.getText());
                    classeDir.setVisibilidadeAtributo3((String) dirAtributoVisibilidade.getSelectionModel().getSelectedItem());
                    classeDir.setVisibilidadeSimboloAtributo3(setarSimboloVisibilidade(classeDir.getVisibilidadeAtributo3()));
                    classeDir.setTipoAtributo3((String) cbTipoAtributoDir.getSelectionModel().getSelectedItem());
                    lbAtributoDir3.setText(classeDir.getTipoAtributo3()+ " " + classeDir.getAtributo3());
                break;
            }
            contAtributoDir++;
        }
        
         if(cbTipoAtributoDir.getSelectionModel().getSelectedItem().equals("Classe1")){
            cbTipoRelacionamento.getSelectionModel().select("Associação - Agregação");
            cbTipoRelacionamento.setDisable(true);
            cbTipoDirecao.getSelectionModel().select("Sem flecha");
            cbTipoDirecao.setDisable(true);
        }
    
        cbTipoAtributoDir.getSelectionModel().clearSelection();
        dirAtributoVisibilidade.getSelectionModel().clearSelection();
        txfAtributoDir.setText(null);
        
        
    }
    
    @FXML
    private void deletaAtributoDir(){
    
        boolean verif = verificadorDeletarAtrib(contAtributoDir, classeDir);
        if(verif==true){
            contAtributoDir--;
            switch(contAtributoDir){

                case 1:
                    classeDir.setAtributo1("");
                    classeDir.setTipoAtributo1("");
                    classeDir.setVisibilidadeAtributo1("");
                    classeDir.setVisibilidadeSimboloAtributo1("");
                    lbAtributoDir1.setText("");
                break;

                case 2:
                    classeDir.setAtributo2("");
                    classeDir.setTipoAtributo2("");
                    classeDir.setVisibilidadeAtributo2("");
                    classeDir.setVisibilidadeSimboloAtributo2("");
                    lbAtributoDir2.setText("");
                break;

                case 3:
                    classeDir.setAtributo3("");
                    classeDir.setTipoAtributo3("");
                    classeDir.setVisibilidadeAtributo3("");
                    classeDir.setVisibilidadeSimboloAtributo3("");
                    lbAtributoDir3.setText("");
                break;
            }
        }
        
        if(!(classeDir.getTipoAtributo1().equals("Classe1"))  &&
           !(classeDir.getTipoAtributo2().equals("Classe1")) &&
           !(classeDir.getTipoAtributo3().equals("Classe1"))){
            cbTipoRelacionamento.getSelectionModel().clearSelection();
            cbTipoRelacionamento.setDisable(false);
            cbTipoDirecao.getSelectionModel().clearSelection();
            cbTipoDirecao.setDisable(false);
        }
        
        
    }
//    ------------------------------------------    
    @FXML
    private void adicionaMetodoDir(){
    
    boolean verif = verificadorAdicionarMetodo(contMetodoDir);
    if(verif==true){
        
        switch(contMetodoDir){
        
            case 1:
                classeDir.setMetodo1(txfMetodoDir.getText());
                classeDir.setVisibilidadeMetodo1((String) dirMetodoVisibilidade.getSelectionModel().getSelectedItem());
                classeDir.setVisibilidadeSimboloMetodo1(setarSimboloVisibilidade(classeDir.getVisibilidadeMetodo1()));
                classeDir.setTipoMetodo1((String) cbTipoMetodoDir.getSelectionModel().getSelectedItem());
                lbMetodoDir1.setText(classeDir.getTipoMetodo1()+ " " + classeDir.getMetodo1());
            break;
                
            case 2:
                classeDir.setMetodo2(txfMetodoDir.getText());
                classeDir.setVisibilidadeMetodo2((String) dirMetodoVisibilidade.getSelectionModel().getSelectedItem());
                classeDir.setVisibilidadeSimboloMetodo2(setarSimboloVisibilidade(classeDir.getVisibilidadeMetodo2()));
                classeDir.setTipoMetodo2((String) cbTipoMetodoDir.getSelectionModel().getSelectedItem());
                lbMetodoDir2.setText(classeDir.getTipoMetodo2()+ " " + classeDir.getMetodo2());
            break;
            
            case 3:
                classeDir.setMetodo3(txfMetodoDir.getText());
                classeDir.setVisibilidadeMetodo3((String) dirMetodoVisibilidade.getSelectionModel().getSelectedItem());
                classeDir.setVisibilidadeSimboloMetodo3(setarSimboloVisibilidade(classeDir.getVisibilidadeMetodo3()));
                classeDir.setTipoMetodo3((String) cbTipoMetodoDir.getSelectionModel().getSelectedItem());
                lbMetodoDir3.setText(classeDir.getTipoMetodo3()+ " " + classeDir.getMetodo3());
            break;
        }
        contMetodoDir++;
    }
    
       
        cbTipoMetodoDir.getSelectionModel().clearSelection();
        dirMetodoVisibilidade.getSelectionModel().clearSelection();
        txfMetodoDir.setText(null);
        
        
    }
    
    @FXML
    private void deletaMetodoDir(){
        
        boolean verif = verificadorDeletarMetodo(contMetodoDir, classeDir);
        if(verif==true){
            contMetodoDir--;
            switch(contMetodoDir){

                case 1:
                    classeDir.setMetodo1("");
                    classeDir.setTipoMetodo1("");
                    classeDir.setVisibilidadeMetodo1("");
                    classeDir.setVisibilidadeSimboloMetodo1("");
                    lbMetodoDir1.setText("");
                break;

                case 2:
                    classeDir.setMetodo2("");
                    classeDir.setTipoMetodo2("");
                    classeDir.setVisibilidadeMetodo2("");
                    classeDir.setVisibilidadeSimboloMetodo2("");
                    lbMetodoDir2.setText("");
                break;

                case 3:
                    classeDir.setMetodo3("");
                    classeDir.setTipoMetodo3("");
                    classeDir.setVisibilidadeMetodo3("");
                    classeDir.setVisibilidadeSimboloMetodo3("");
                    lbMetodoDir3.setText("");
                break;
            }
        }
            
    }
    
    @FXML
    private void configurarParteDir(){
        if(tipoClassificadorCbDir.getSelectionModel().getSelectedItem().equals("interface")){
            gerenciarAtributoDir.setVisible(false);
            checkClassDir.setDisable(true);
            checkClassDir.setSelected(false);
            checkSuperClassDir.setDisable(true);
            checkSuperClassDir.setSelected(false);
        }else if(tipoClassificadorCbDir.getSelectionModel().getSelectedItem().equals("class")){
            gerenciarAtributoDir.setVisible(true);
            checkClassDir.setDisable(false);
            checkSuperClassDir.setDisable(false);
        }
    }
    
    @FXML
    private void configurarParteEsq(){
        
        if(tipoClassificadorCbEsq.getSelectionModel().getSelectedItem().equals("interface")){
            gerenciarAtributoEsq.setVisible(false);
            checkClassEsq.setDisable(true);
            checkClassEsq.setSelected(false);
            checkSuperClassEsq.setDisable(true);
            checkSuperClassEsq.setSelected(false);
        }else if(tipoClassificadorCbEsq.getSelectionModel().getSelectedItem().equals("class")){
            gerenciarAtributoEsq.setVisible(true);
            checkClassEsq.setDisable(false);
            checkSuperClassEsq.setDisable(false);
        }
        
    }
    
    
    private ObservableList<String> tipoClassificador(){
        
        ObservableList<String> tipoClassificador = observableArrayList(
            "class",
            "interface"
        );
        
        return tipoClassificador;
    }
    
    private ObservableList<String> tipoMetodo(){
        
        ObservableList<String> tipoMetodo = observableArrayList(
            "Integer",
            "String",
            "void"
        );
        
        return tipoMetodo;
    }
    
    private ObservableList<String> tipoAtributo(){
        
        ObservableList<String> tipoAtributo = observableArrayList(
            "String",
            "Integer",
            "Float"
        );
        
        return tipoAtributo;
    }
    
    private void tipoAtributoAdicionarExtra(String lado, ObservableList<String> tipoAtributo){
    
        if(lado.equals("Direita")){
            tipoAtributo.add("Classe1");
        }else if(lado.equals("Esquerda")){
            tipoAtributo.add("Classe2");
        }
    
    }
    
    private void tipoMetodoAdicionarExtra(String lado, ObservableList<String> tipoMetodo){
    
        if(lado.equals("Direita")){
            tipoMetodo.add("Classe1");
        }else if(lado.equals("Esquerda")){
            tipoMetodo.add("Classe2");
        }
    
    }
    
    private ObservableList<String> tipoRelacionamento(){
        
        ObservableList<String> tipoRelacionamento = observableArrayList(
            "Dependência",
            "Generalização",
            "Agregação",
            "Composição",
            "Associação"
        );
        
        return tipoRelacionamento;
    }
    
    private ObservableList<String> tipoVisibilidade(){
        
        ObservableList<String> tipoVisibilidade = observableArrayList(
            "protected",
            "private",
            "public"
        );
        
        return tipoVisibilidade;
    }
    
    private ObservableList<String> tipoDirecao(){
        
        ObservableList<String> tipoDirecao = observableArrayList(
            "Flecha apontada para direita",
            "Flecha apontada para esquerda",
            "Sem flecha",
            "Flecha para ambos os lados"
        );
        
        return tipoDirecao;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<String> tipoClassificador = tipoClassificador();
        
        tipoClassificadorCbEsq.getItems().addAll(tipoClassificador);
        tipoClassificadorCbDir.getItems().addAll(tipoClassificador);
        
        
        ObservableList<String> tipoAtributoEsq = tipoAtributo();
        ObservableList<String> tipoAtributoDir = tipoAtributo();
        
        tipoAtributoAdicionarExtra("Esquerda", tipoAtributoEsq);
        cbTipoAtributoEsq.getItems().addAll(tipoAtributoEsq);
        
        tipoAtributoAdicionarExtra("Direita", tipoAtributoDir);
        cbTipoAtributoDir.getItems().addAll(tipoAtributoDir);
        
        
        ObservableList<String> tipoMetodoEsq = tipoMetodo();
        ObservableList<String> tipoMetodoDir = tipoMetodo();
        
        tipoMetodoAdicionarExtra("Esquerda", tipoMetodoEsq);
        cbTipoMetodoEsq.getItems().addAll(tipoMetodoEsq);
        tipoMetodoAdicionarExtra("Direita", tipoMetodoDir);
        cbTipoMetodoDir.getItems().addAll(tipoMetodoDir);
        
        ObservableList<String> tipoRelacionamento = tipoRelacionamento();
        
        cbTipoRelacionamento.getItems().addAll(tipoRelacionamento);
        
        ObservableList<String> tipoDirecao = tipoDirecao();
        
        cbTipoDirecao.getItems().addAll(tipoDirecao);
        
        ObservableList<String> tipoVisibilidade = tipoVisibilidade();
        
        dirAtributoVisibilidade.getItems().addAll(tipoVisibilidade);
        esqAtributoVisibilidade.getItems().addAll(tipoVisibilidade);
        dirMetodoVisibilidade.getItems().addAll(tipoVisibilidade);
        esqMetodoVisibilidade.getItems().addAll(tipoVisibilidade);
        
        
        classeEsq.setNome("");
        classeEsq.setTipo("");
        classeEsq.setAtributo1("");
        classeEsq.setAtributo2("");
        classeEsq.setAtributo3("");
        classeEsq.setTipoAtributo1("");
        classeEsq.setTipoAtributo2("");
        classeEsq.setTipoAtributo3("");
        classeEsq.setVisibilidadeAtributo1("");
        classeEsq.setVisibilidadeAtributo2("");
        classeEsq.setVisibilidadeAtributo3("");
        classeEsq.setVisibilidadeSimboloAtributo1("");
        classeEsq.setVisibilidadeSimboloAtributo2("");
        classeEsq.setVisibilidadeSimboloAtributo3("");
        classeEsq.setMetodo1("");
        classeEsq.setMetodo2("");
        classeEsq.setMetodo3("");
        classeEsq.setTipoMetodo1("");
        classeEsq.setTipoMetodo2("");
        classeEsq.setTipoMetodo3("");
        classeEsq.setVisibilidadeMetodo1("");
        classeEsq.setVisibilidadeMetodo2("");
        classeEsq.setVisibilidadeMetodo3("");
        classeEsq.setVisibilidadeSimboloMetodo1("");
        classeEsq.setVisibilidadeSimboloMetodo2("");
        classeEsq.setVisibilidadeSimboloMetodo3("");
         
        classeDir.setTipo("");
        classeDir.setAtributo1("");
        classeDir.setAtributo2("");
        classeDir.setAtributo3("");
        classeDir.setTipoAtributo1("");
        classeDir.setTipoAtributo2("");
        classeDir.setTipoAtributo3("");
        classeDir.setVisibilidadeAtributo1("");
        classeDir.setVisibilidadeAtributo2("");
        classeDir.setVisibilidadeAtributo3("");
        classeDir.setVisibilidadeSimboloAtributo1("");
        classeDir.setVisibilidadeSimboloAtributo2("");
        classeDir.setVisibilidadeSimboloAtributo3("");
        classeDir.setMetodo1("");
        classeDir.setMetodo2("");
        classeDir.setMetodo3("");
        classeDir.setTipoMetodo1("");
        classeDir.setTipoMetodo2("");
        classeDir.setTipoMetodo3("");
        classeDir.setVisibilidadeMetodo1("");
        classeDir.setVisibilidadeMetodo2("");
        classeDir.setVisibilidadeMetodo3("");
        classeDir.setVisibilidadeSimboloMetodo1("");
        classeDir.setVisibilidadeSimboloMetodo2("");
        classeDir.setVisibilidadeSimboloMetodo3("");
        
        
        tipoClassificadorCbDir.setValue("class");
        tipoClassificadorCbEsq.setValue("class");
        
    }    
    
    public boolean verificadorAdicionarAtrib(Integer posicao){
            
        System.out.println(posicao);
        if(posicao>0 && posicao <4){
            verificador = true;
            System.out.println("Voce pode adicionar mais atributos");
        }else{
            verificador = false;
            
            alertaErro("Capacidade máxima de atributos excedida.");
            
        }
        
        return verificador;
    }
    
    public boolean verificadorAdicionarMetodo(Integer posicao){
        
        System.out.println(posicao);
        if(posicao>0 && posicao <4){
            verificador = true;
            System.out.println("Voce pode adicionar mais metodos");
        }else{
            verificador = false;
            
            alertaErro("Capacidade máxima de métodos excedida.");
            
        }
        
        return verificador;
    }
    
    public boolean verificadorDeletarAtrib(Integer posicao, Classe c){
            
        System.out.println(posicao);
        if(posicao>0 && !c.getAtributo1().isEmpty()){
            verificador = true;
            System.out.println("Voce pode deletar mais atributos");
        }else{
            verificador = false;
            System.out.println("Voce nao pode deletar mais atributos");
            
            alertaErro("Você não pode deletar atributos inexistentes.");
            
        }
        
        return verificador;
    }
    
    public boolean verificadorDeletarMetodo(Integer posicao, Classe c){
            
        System.out.println(posicao);
        if(posicao>0 && !c.getMetodo1().isEmpty()){
            verificador = true;
            System.out.println("Voce pode deletar mais metodos");
        }else{
            verificador = false;
            System.out.println("Voce nao pode deletar mais metodos");
            
            alertaErro("Você não pode deletar métodos inexistentes.");
            
        }
        
        return verificador;
    }
    @FXML
    public void verificadorNomeClasseEsq(){
    
        if(txfNomeClasseEsq.getText().length() == 1){
            boolean v = verificaMaiusculaClasse(txfNomeClasseEsq.getText());

            if(v == true){
                System.out.println("ta certo");
            } else {
                alertaErro("A primeira letra do nome designado a classe deve ser em letra maiúscula.");
                txfNomeClasseEsq.deletePreviousChar();
                txfNomeClasseEsq.requestFocus();
            }
        }
        
        if(txfNomeClasseEsq.getText().length() > 0){
            boolean verChar = verificaCaracterValido(txfNomeClasseEsq.getText());
            if(verChar == true){
                System.out.println("char correto");
                } else {
                System.out.println("char incorreto");
                alertaErro("Caractere incorreto.");
                txfNomeClasseEsq.deletePreviousChar();
                txfNomeClasseEsq.requestFocus();
            }
        }
        
    }
    
    @FXML
    public void verificadorNomeClasseDir(){
    
        if(txfNomeClasseDir.getText().length() == 1){
            boolean v = verificaMaiusculaClasse(txfNomeClasseDir.getText());

            if(v == true){
                System.out.println("ta certo");
            } else {
                alertaErro("A primeira letra do nome designado a classe deve ser em letra maiúscula.");
                txfNomeClasseDir.deletePreviousChar();
                txfNomeClasseDir.requestFocus();
            }
        }
        
        if(txfNomeClasseDir.getText().length() > 0){
            boolean verChar = verificaCaracterValido(txfNomeClasseDir.getText());
            if(verChar == true){
                System.out.println("char correto");
                } else {
                System.out.println("char incorreto");
                alertaErro("Caractere incorreto.");
                txfNomeClasseDir.deletePreviousChar();
                txfNomeClasseDir.requestFocus();
            }
        }
        
        
    }
    
    @FXML
    public void verificadorNomeAtributoEsq(){
        
        if(txfAtributoEsq.getText().length() == 1){
            boolean v = verificaMinusculaClasse(txfAtributoEsq.getText());

            if(v == true){
                System.out.println("ta certo");
            } else {
                alertaErro("A primeira letra do nome designado a um atributo deve ser em letra minúscula.");
                txfAtributoEsq.deletePreviousChar();
                txfAtributoEsq.requestFocus();
            }
        }
        
        if(txfAtributoEsq.getText().length() > 0){
            boolean verChar = verificaCaracterValido(txfAtributoEsq.getText());
            if(verChar == true){
                System.out.println("char correto");
                } else {
                System.out.println("char incorreto");
                alertaErro("Caractere incorreto.");
                txfAtributoEsq.deletePreviousChar();
                txfAtributoEsq.requestFocus();
            }
        }
        
        
    }
    
    @FXML
    public void verificadorNomeMetodoEsq(){
    
        if(txfMetodoEsq.getText().length() == 1){
            boolean v = verificaMinusculaClasse(txfMetodoEsq.getText());

            if(v == true){
                System.out.println("ta certo");
            } else {
                alertaErro("A primeira letra do nome designado a um método deve ser em letra minúscula.");
                txfMetodoEsq.deletePreviousChar();
                txfMetodoEsq.requestFocus();
            }
        }
        
        if(txfMetodoEsq.getText().length() > 0){
            boolean verChar = verificaCaracterValido(txfMetodoEsq.getText());
            if(verChar == true){
                System.out.println("char correto");
                } else {
                System.out.println("char incorreto");
                alertaErro("Caractere incorreto.");
                txfMetodoEsq.deletePreviousChar();
                txfMetodoEsq.requestFocus();
            }
        }
        
        
    }
    
    @FXML
    public void verificadorNomeAtributoDir(){
    
        if(txfAtributoDir.getText().length() == 1){
            boolean v = verificaMinusculaClasse(txfAtributoDir.getText());

            if(v == true){
                System.out.println("ta certo");
            } else {
                alertaErro("A primeira letra do nome designado a um atributo deve ser em letra minúscula.");
                txfAtributoDir.deletePreviousChar();
                txfAtributoDir.requestFocus();
            }
        }
        
        if(txfAtributoDir.getText().length() > 0){
            boolean verChar = verificaCaracterValido(txfAtributoDir.getText());
            if(verChar == true){
                System.out.println("char correto");
                } else {
                System.out.println("char incorreto");
                alertaErro("Caractere incorreto.");
                txfAtributoDir.deletePreviousChar();
                txfAtributoDir.requestFocus();
            }
        }
        
        
    }
    
    @FXML
    public void verificadorNomeMetodoDir(){
    
        if(txfMetodoDir.getText().length() == 1){
            boolean v = verificaMinusculaClasse(txfMetodoDir.getText());

            if(v == true){
                System.out.println("ta certo");
            } else {
                alertaErro("A primeira letra do nome designado a um método deve ser em letra minúscula.");
                txfMetodoDir.deletePreviousChar();
                txfMetodoDir.requestFocus();
            }
        }
        
        if(txfMetodoDir.getText().length() > 0){
            boolean verChar = verificaCaracterValido(txfMetodoDir.getText());
            if(verChar == true){
                System.out.println("char correto");
                } else {
                System.out.println("char incorreto");
                alertaErro("Caractere incorreto.");
                txfMetodoDir.deletePreviousChar();
                txfMetodoDir.requestFocus();
            }
        }
        
        
    }
    
    
    public boolean verificaMaiusculaClasse(String nomeClasse){
        
        char original = nomeClasse.charAt(0);
        String charToString = "" + original;
        String verificador = charToString.toUpperCase();
        
        if(verificador.equals(charToString)){
            return true;
        } else { return false; }
        
    }
    
    public boolean verificaMinusculaClasse(String nomeClasse){
        
        char original = nomeClasse.charAt(0);
        String charToString = "" + original;
        String verificador = charToString.toLowerCase();
        
        if(verificador.equals(charToString)){
            return true;
        } else { return false; }
        
    }
    
    
    public boolean verificaCaracterValido(String verificaCaracter){
        
        
        String letra = "" + verificaCaracter.charAt(verificaCaracter.length()-1);
        if(!letra.matches("[a-zA-Z0-9_]")){
            return false;
        } else{ 
            return true; 
        }
    }

    public void alertaErro(String mensagem){
    
        Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
        dialogoErro.setTitle("Mensagem de erro");
        dialogoErro.setHeaderText("Error");
        dialogoErro.setContentText(mensagem);
        dialogoErro.showAndWait();
    
    }
    
    @FXML
    public void verificaSuperClasseAtivaEsq(){
        
        if((checkSuperClassDir.isSelected() == true) || (checkSuperClassEsq.isSelected() == true)){
            cbTipoRelacionamento.setDisable(true);
            cbTipoDirecao.getSelectionModel().select("Flecha apontada para esquerda");
            cbTipoRelacionamento.getSelectionModel().select("Generalização");
            cbTipoDirecao.setDisable(true);
        } else{
            cbTipoRelacionamento.setDisable(false);
            cbTipoRelacionamento.getSelectionModel().clearSelection();
            cbTipoDirecao.getSelectionModel().clearSelection();
            cbTipoDirecao.setDisable(true);
        }
        
        if(checkSuperClassDir.isSelected() == true){
            checkSuperClassEsq.setSelected(false);
            
        }
        
    }
    
    @FXML
    public void verificaSuperClasseAtivaDir(){
    
        if((checkSuperClassDir.isSelected() == true) || (checkSuperClassEsq.isSelected() == true)){
            cbTipoRelacionamento.setDisable(true);
            cbTipoDirecao.getSelectionModel().select("Flecha apontada para direita");
            cbTipoRelacionamento.getSelectionModel().select("Generalização");
            cbTipoDirecao.setDisable(true);
        } else{
            cbTipoRelacionamento.setDisable(false);
            cbTipoRelacionamento.getSelectionModel().clearSelection();
            cbTipoDirecao.getSelectionModel().clearSelection();
            cbTipoDirecao.setDisable(true);
        }
        
        if(checkSuperClassEsq.isSelected() == true){
            checkSuperClassDir.setSelected(false);
        }
    }
    
    @FXML
    public void proximoPasso(){
        
        if(passo==4){
            msg.alertaErro("Muito obrigado(a)!", "O aplicativo tem como objetivo auxiliar o aprendizado da criação de classes na linguagem Java, ilustrando o código e também o diagrama para facilitar a compreensão do todo.");
        }
        
        if(passo==3){
            msg.alertaErro("Continuando...", "Ao terminar o processo, você deverá clicar no botão 'Gerar', qual gerará o código da classe e também, o diagrama em questão. "
                            + "Caso desejar refazer o processo desde o início, você poderá clicar no botão 'Limpar'.");
            passo++;
        }
        
        if(passo==2){
            msg.alertaErro("Continuando...", "Dependendo das escolhas anteriores, o relacionamento, assim como a direção do relacionamento, já estarão apontados. "
                    + "Assim, existem certas particularidades neste processo. Caso ainda não estiver selecionadas, você poderá selecionar algum dos relacionamentos, assim como sua direção.");
            passo++;
        }
        
        if(passo==1){
            msg.alertaErro("Continuando...", "Ao informar os nomes das classes, você poderá selecionar características especiais"
                    + " como setar uma classe como SuperClasse, entre outros.");
            msg.alertaErro("Continuando...", "Você deverá agora, selecionar a aba correspondente ao que você deseja configurar das propriedades da classe, ou seja, dos atributos e métodos. ");
            msg.alertaErro("Continuando...", "Isto é bem simples, você somente deverá selecionar a visibilidade, o nome e então o tipo do atributo/método desejado. Finalize clicando em Adicionar ou exclua clicando em Deletar. ");
            passo++;
        }
        
        if(passo==0){
            msg.alertaErro("Continuando...","Inicialmente, você deverá informar qual o tipo "
                    + "e o nome das classes que serão utilizadas.");
            passo++;
        }
        
        
    }
    
    
}
