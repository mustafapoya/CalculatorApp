import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class CalculatorViewController implements Initializable {
    @FXML
    private BorderPane root;
    @FXML
    private VBox header;
    @FXML
    public ToggleButton toggleTheme;

    @FXML
    private Label lblText;

    @FXML private Button btnMod, btnOneDivX, btnC, btnBack, btnRoot, btnPower,
    btnLog, btnDivision, btnMultiply, btnSubtract, btnAdd, btnEqual, btnPoint, btnSign,
    btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    private char operator = ' '; // Save the operator
    private boolean go = true; // For calculate with Opt != (=)
    private boolean addWrite = true; // Connect numbers in display
    private double val = 0; // Save the value typed for calculation

    public static final String NUMBER_REGEX = "([-]?\\d+[.]\\d*)|(\\d+)";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblText.setText("0");

        btnC.setOnAction(event-> {
            System.out.println("BTN C");

            lblText.setText("0");
            operator = ' ';
            val = 0;
        });

        btnBack.setOnAction(event -> {
            String str = lblText.getText();

            StringBuilder str2 = new StringBuilder();
            for(int i = 0; i < str.length() - 1; i++) {
                str2.append(str.charAt(i));
            }

            if(str2.toString().equals("")) {
                lblText.setText("0");
            } else {
                lblText.setText(str2.toString());
            }
        });

        btnMod.setOnAction(event -> {
            if(Pattern.matches(NUMBER_REGEX, lblText.getText())) {
                if(go) {
                    val = calc(val, lblText.getText(), operator);
                    if (Pattern.matches("", String.valueOf(val))) {
                        lblText.setText(String.valueOf((int) val));
                    } else {
                        lblText.setText(String.valueOf(val));
                    }

                    operator = '%';
                    go = false;
                    addWrite = false;
                }
            }
        });

        btnDivision.setOnAction(event -> {
            if(Pattern.matches(NUMBER_REGEX, lblText.getText())) {
                if(go) {
                    val = calc(val, lblText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        lblText.setText(String.valueOf((int) val));
                    } else {
                        lblText.setText(String.valueOf(val));
                    }

                    operator = '/';
                    go = false;
                    addWrite = false;
                } else {
                    operator = '/';
                }
            }
        });

        btn7.setOnAction(event -> {
            if(addWrite) {
                if(Pattern.matches("[0]*", lblText.getText())) {
                    lblText.setText("7");
                } else {
                    lblText.setText(lblText.getText() + "7");
                }
            } else {
                lblText.setText("7");
                addWrite = true;
            }
            go = true;
        });

        btn8.setOnAction(event -> {
            if(addWrite) {
                if(Pattern.matches("[0]*", lblText.getText())) {
                    lblText.setText("8");
                } else {
                    lblText.setText(lblText.getText() + "8");
                }
            } else {
                lblText.setText("8");
                addWrite = true;
            }
            go = true;
        });

        btn9.setOnAction(event -> {
            if(addWrite) {
                if(Pattern.matches("[0]*", lblText.getText())) {
                    lblText.setText("9");
                } else {
                    lblText.setText(lblText.getText() + "9");
                }
            } else {
                lblText.setText("9");
                addWrite = true;
            }
            go = true;
        });

        btnMultiply.setOnAction(event -> {
            if (Pattern.matches(NUMBER_REGEX, lblText.getText())) {
                if(go) {
                    val = calc(val, lblText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        lblText.setText(String.valueOf((int) val));
                    } else {
                        lblText.setText(String.valueOf(val));
                    }
                    operator = '*';
                    go = false;
                    addWrite = false;
                } else {
                    operator = '*';
                }
            }
        });

        btn4.setOnAction(event -> {
            if(addWrite) {
                if(Pattern.matches("[0]*", lblText.getText())) {
                    lblText.setText("4");
                } else {
                    lblText.setText(lblText.getText() + "4");
                }
            } else {
                lblText.setText("4");
                addWrite = true;
            }
            go = true;
        });

        btn5.setOnAction(event -> {
            if(addWrite) {
                if(Pattern.matches("[0]*", lblText.getText())) {
                    lblText.setText("5");
                } else {
                    lblText.setText(lblText.getText() + "5");
                }
            } else {
                lblText.setText("5");
                addWrite = true;
            }
            go = true;
        });

        btn6.setOnAction(event -> {
            if(addWrite) {
                if(Pattern.matches("[0]*", lblText.getText())) {
                    lblText.setText("6");
                } else {
                    lblText.setText(lblText.getText() + "6");
                }
            } else {
                lblText.setText("6");
                addWrite = true;
            }
            go = true;
        });

        btnSubtract.setOnAction(event -> {
            if (Pattern.matches(NUMBER_REGEX, lblText.getText())) {
                if(go) {
                    val = calc(val, lblText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        lblText.setText(String.valueOf((int) val));
                    } else {
                        lblText.setText(String.valueOf(val));
                    }
                } else {
                    operator = '-';
                }
            }
        });

        btn1.setOnAction(event -> {
            if(addWrite) {
                if(Pattern.matches("[0]*", lblText.getText())) {
                    lblText.setText("1");
                } else {
                    lblText.setText(lblText.getText() + "1");
                }
            } else {
                lblText.setText("1");
                addWrite = true;
            }
            go = true;
        });

        btn2.setOnAction(event -> {
            if(addWrite) {
                if(Pattern.matches("[0]*", lblText.getText())) {
                    lblText.setText("2");
                } else {
                    lblText.setText(lblText.getText() + "2");
                }
            } else {
                lblText.setText("2");
                addWrite = true;
            }
            go = true;
        });

        btn3.setOnAction(event -> {
            if(addWrite) {
                if(Pattern.matches("[0]*", lblText.getText())) {
                    lblText.setText("3");
                } else {
                    lblText.setText(lblText.getText() + "3");
                }
            } else {
                lblText.setText("3");
                addWrite = true;
            }
            go = true;
        });

        btnAdd.setOnAction(event -> {
            if (Pattern.matches(NUMBER_REGEX, lblText.getText())) {
                if (go) {
                    val = calc(val, lblText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        lblText.setText(String.valueOf((int) val));
                    } else {
                        lblText.setText(String.valueOf(val));
                    }
                    operator = '+';
                    go = false;
                    addWrite = false;
                } else {
                    operator = '+';
                }
            }
        });

        btnPoint.setOnAction(event -> {
            if (addWrite) {
                if (!lblText.getText().contains(".")) {
                    lblText.setText(lblText.getText() + ".");
                }
            } else {
                lblText.setText("0.");
                addWrite = true;
            }
            go = true;
        });

        btnSign.setOnAction(event -> {
            if(addWrite) {
                if(!lblText.getText().startsWith("-")) {
                    lblText.setText("-" + lblText.getText());
                } else {
                    lblText.setText(lblText.getText().substring(1));
                }
            }
        });

        btn0.setOnAction(event -> {
            if (addWrite) {
                if (Pattern.matches("[0]*", lblText.getText())) {
                    lblText.setText("0");
                } else {
                    lblText.setText(lblText.getText() + "0");
                }
            } else {
                lblText.setText("0");
                addWrite = true;
            }
            go = true;
        });

        btnEqual.setOnAction(event -> {
            if (Pattern.matches(NUMBER_REGEX, lblText.getText())) {
                if (go) {
                    val = calc(val, lblText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        lblText.setText(String.valueOf((int) val));
                    } else {
                        lblText.setText(String.valueOf(val));
                    }

                    operator = '=';
                    addWrite = false;
                }
            }
        });

        btnRoot.setOnAction(event -> {
            if (Pattern.matches(NUMBER_REGEX, lblText.getText())) {
                if (go) {
                    val = Math.sqrt(Double.parseDouble(lblText.getText()));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        lblText.setText(String.valueOf((int) val));
                    } else {
                        lblText.setText(String.valueOf(val));
                    }
                    operator = '√';
                    addWrite = false;
                }
            }
        });

        btnPower.setOnAction(event -> {
            if (Pattern.matches(NUMBER_REGEX, lblText.getText())) {
                if (go) {
                    val = calc(val, lblText.getText(), operator);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        lblText.setText(String.valueOf((int) val));
                    } else {
                        lblText.setText(String.valueOf(val));
                    }
                    operator = '^';
                    go = false;
                    addWrite = false;
                } else {
                    operator = '^';
                }
            }
        });

        btnLog.setOnAction(event -> {
            if (Pattern.matches(NUMBER_REGEX, lblText.getText())) {
                if (go) {
                    val = Math.log(Double.parseDouble(lblText.getText()));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        lblText.setText(String.valueOf((int) val));
                    } else {
                        lblText.setText(String.valueOf(val));
                    }
                    operator = 'l';
                    addWrite = false;
                }
            }
        });
        
    }

    public double calc(double x, String input, char opt) {
        double y = Double.parseDouble(input);

        switch (opt) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            case '%':
                return x % y;
            case '^':
                return Math.pow(x, y);
            default:
                return y;
        }
    }

    public void setRootTheme(boolean isLight) {
        if (isLight) {
            root.setStyle("-fx-background-color:#f4f4f4");
        } else {
            root.setStyle("-fx-background-color:#282525");
        }

    }


}
