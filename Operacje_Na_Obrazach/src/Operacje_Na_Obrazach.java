import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Operacje_Na_Obrazach {
    public static JFrame frame;
    public static Okno pht_base = new Okno();

    public static BufferedImage img1;
    public static BufferedImage img2;
    public static BufferedImage img_copy;

    public static int[] R = new int[256];
    public static int[] G = new int[256];
    public static int[] B = new int[256];
    public static boolean hst = false;
    public static int touched = 0;
    public static int Mr=0,Mg=0,Mb=0;
    public static Color hidden = new Color(238, 238, 238);
    public static String chosen_option = "";
    public static String[] options = {"Wybierz", "Rozjasnianie", "Przyciemnianie", "Transformacja_Potegowa", "Suma", "Odejmowanie", "Roznica", "Mnozenie", "MnozenieOdwrotne", "Negacja", "Ciemniejsze", "Jasniejsze", "Wylaczenie",
            "Nakladka", "Ostre_swiatlo", "Lagodne_Swiatlo", "Rozcienczenie", "Wypalanie", "Reflect_mode", "Opacity", "Kontrast", "Histogram", "Wyrównanie_histogramu", "Filtr Robertsa POZIOM", "Filtr Prewitta POZIOM", "Filtr Sobela POZIOM"
            , "Filtr Robertsa PION", "Filtr Prewitta PION", "Filtr Sobela PION", "Filtr Laplacea 1", "Filtr Laplacea 2"
            , "Filtr Laplacea 3", "Filtr Min", "Filtr Max", "Filtr Medianowy"};



    public static void main(String[] args) {
        try {
            img1 = ImageIO.read(new File("Kot.jpg"));
            img2 = ImageIO.read(new File("pies.jpg"));
        } catch (IOException e) {
        }
        frame = new JFrame("");
        frame.setSize(1600, 1600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JComboBox<String> jComboBox = new JComboBox<>(options);
        jComboBox.setBounds(700, 50, 200, 20);
        JLabel Txt_area_1 = new JLabel();
        JLabel Txt_area_2 = new JLabel();
        JTextArea Data_slot_1 = new JTextArea();
        JTextArea Data_slot_2 = new JTextArea();
        Txt_area_1.setBounds(700, 100, 250, 20);
        Txt_area_2.setBounds(700, 140, 250, 20);
        Data_slot_1.setBounds(700, 120, 200, 20);
        Data_slot_2.setBounds(700, 160, 200, 20);
        Data_slot_1.setBackground(hidden);
        Data_slot_2.setBackground(hidden);
        frame.add(Txt_area_1);
        frame.add(Txt_area_2);
        frame.add(Data_slot_1);
        frame.add(Data_slot_2);

        jComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                chosen_option = (String) jComboBox.getSelectedItem();

                if (chosen_option == null) return;
                switch (chosen_option) {

                    case "Suma" -> {
                        Txt_area_1.setText("Sumowany obraz: pies.jpg");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Odejmowanie" -> {
                        Txt_area_1.setText("Odejmowanie");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Roznica" -> {
                        Txt_area_1.setText("Roznica");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Mnozenie" -> {
                        Txt_area_1.setText("Mnozenie");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "MnozenieOdwrotne" -> {
                        Txt_area_1.setText("MnozenieOdwrotne");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Negacja" -> {
                        Txt_area_1.setText("Negacja");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Ciemniejsze" -> {
                        Txt_area_1.setText("Ciemniejsze");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Jasniejsze" -> {
                        Txt_area_1.setText("Jasniejsze");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Wylaczenie" -> {
                        Txt_area_1.setText("Wylaczenie");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Nakladka" -> {
                        Txt_area_1.setText("Nakladka");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Ostre_swiatlo" -> {
                        Txt_area_1.setText("Ostre_swiatlo");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Lagodne_Swiatlo" -> {
                        Txt_area_1.setText("Lagodne_Swiatlo");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Rozcienczenie" -> {
                        Txt_area_1.setText("Rozcienczenie");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Wypalanie" -> {
                        Txt_area_1.setText("Wypalanie");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Reflect_mode" -> {
                        Txt_area_1.setText("Reflect_mode");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Opacity" -> {
                        Txt_area_1.setText("Opacity");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("0.5");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Transformacja_Potegowa" -> {
                        Txt_area_1.setText("Transformacja_Potegowa");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("0.1");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(Color.white);
                        Data_slot_2.setText("1.7");
                    }
                    case "Rozjasnianie" -> {
                        Txt_area_1.setText("Rozjasnianie");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("50");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(Color.white);
                        Data_slot_2.setText("1.0");
                    }
                    case "Przyciemnianie" -> {
                        Txt_area_1.setText("Przyciemnianie");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("50");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(Color.white);
                        Data_slot_2.setText("1.0");
                    }
                    case "Kontrast" -> {
                        Txt_area_1.setText("Kontrast[-128,127]:");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("40");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Histogram" -> {
                        Txt_area_1.setText("Histogram obrazu");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Wyrównanie_histogramu" -> {
                        Txt_area_1.setText("");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Filtr Robertsa POZIOM" -> {
                        Txt_area_1.setText("Filtr Robertsa POZIOM");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("0;0;0/0;1;-1/0;0;0");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Filtr Prewitta POZIOM" -> {
                        Txt_area_1.setText("Filtr Prewitta POZIOM");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("1;1;1/0;0;0/-1;-1;-1");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Filtr Sobela POZIOM" -> {
                        Txt_area_1.setText("Filtr Sobela POZIOM");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("1;2;1/0;0;0/-1;-2;-1");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Filtr Robertsa PION" -> {
                        Txt_area_1.setText("Filtr Robertsa PION");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("0;0;0/0;1;0/0;-1;0");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Filtr Prewitta PION" -> {
                        Txt_area_1.setText("Filtr Prewitta PION");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("1;0;-1/1;0;-1/1;0;-1");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Filtr Sobela PION" -> {
                        Txt_area_1.setText("Filtr Sobela PION");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("1;0;-1/2;0;-2/1;0;-1");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Filtr Laplacea 1" -> {
                        Txt_area_1.setText("Filtr Laplacea 1");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("0;-1;0/-1;4;-1/0;-1;0");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Filtr Laplacea 2" -> {
                        Txt_area_1.setText("Filtr Laplacea 2");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("-1;-1;-1/-1;8;-1/-1;-1;-1");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Filtr Laplacea 3" -> {
                        Txt_area_1.setText("Filtr Laplacea 3");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("-2;1;-2/1;4;1/-2;1;-2");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Filtr Min" -> {
                        Txt_area_1.setText("Filtr Min");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("1");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Filtr Max" -> {
                        Txt_area_1.setText("Filtr Max");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("1");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Filtr Medianowy" -> {
                        Txt_area_1.setText("Filtr Medianowy");
                        Data_slot_1.setBackground(Color.white);
                        Data_slot_1.setText("1");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                    case "Wybierz" -> {
                        Txt_area_1.setText("");
                        Data_slot_1.setBackground(hidden);
                        Data_slot_1.setText("");
                        Txt_area_2.setText("");
                        Data_slot_2.setBackground(hidden);
                        Data_slot_2.setText("");
                    }
                }
            }
        });
        frame.add(jComboBox);

        JButton Refresh_button = new JButton();
        Refresh_button.setText("Refresh_option");
        Refresh_button.setBounds(700, 10, 200, 30);
        Refresh_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String info = Data_slot_1.getText();
                String[] datainfo = info.split("/");
                if(chosen_option.equals("Filtr Robertsa POZIOM")  || chosen_option.equals("Filtr Prewitta POZIOM") || chosen_option.equals("Filtr Sobela POZIOM") || chosen_option.equals("Filtr Robertsa PION") ||
                        chosen_option.equals("Filtr Prewitta PION") || chosen_option.equals("Filtr Sobela PION") || chosen_option.equals("Filtr Laplacea 1") || chosen_option.equals("Filtr Laplacea 2") || chosen_option.equals("Filtr Laplacea 3")){
                    int[][] Maska = new int[3][3];
                    int id = 0;
                    for (int i = 0; i < datainfo.length; i++) {
                        String[] data = datainfo[i].split(";");
                        for (int j = 0; j < data.length; j++) {
                            Maska[id][j] = Integer.parseInt(data[j]);
                        }
                        id++;
                    }
                    mask(Maska);
                }
                switch (chosen_option) {
                    case "Suma" -> {
                        try {
                            Txt_area_1.setText("Sumowany obraz: pies.jpg");
                            Suma();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Odejmowanie" -> {
                        try {
                            Txt_area_1.setText("Odejmowanie");
                            Odejmowanie();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Roznica" -> {
                        try {
                            Txt_area_1.setText("Roznica");
                            Roznica();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "MnozenieOdwrotne" -> {
                        try {
                            Txt_area_1.setText("MnozenieOdwrotne");
                            MnozenieOdwrotne();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Mnozenie" -> {
                        try {
                            Txt_area_1.setText("Mnozenie");
                            Mnozenie();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Negacja" -> {
                        try {
                            Txt_area_1.setText("Negacja");
                            Negacja();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Ciemniejsze" -> {
                        try {
                            Txt_area_1.setText("Ciemniejsze");
                            Ciemniejsze();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Jasniejsze" -> {
                        try {
                            Txt_area_1.setText("Jasniejsze");
                            Jasniejsze();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Wylaczenie" -> {
                        try {
                            Txt_area_1.setText("Wylaczenie");
                            Wylaczenie();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Nakladka" -> {
                        try {
                            Txt_area_1.setText("Nakladka");
                            Nakladka();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Ostre_swiatlo" -> {
                        try {
                            Txt_area_1.setText("Ostre_swiatlo");
                            Ostre_swiatlo();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Lagodne_Swiatlo" -> {
                        try {
                            Txt_area_1.setText("Lagodne_Swiatlo");
                            Lagodne_Swiatlo();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Rozcienczenie" -> {
                        try {
                            Txt_area_1.setText("Rozcienczenie");
                            Rozcienczenie();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Wypalanie" -> {
                        try {
                            Txt_area_1.setText("Wypalanie");
                            Wypalanie();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Reflect_mode" -> {
                        try {
                            Txt_area_1.setText("Reflect_mode");
                            Reflect_mode();
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Opacity" -> {
                        double c = 1.0;
                        try {
                            c = Double.parseDouble(Data_slot_1.getText());
                            Txt_area_1.setText("Opacity");
                            Opacity(c);
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Kontrast" -> {
                        double c = 1.0;
                        try {
                            c = Double.parseDouble(Data_slot_1.getText());
                            Txt_area_1.setText("Kontrast[-128,127]:");
                            if (c > 127)
                                c = 127;
                            else if (c < -128)
                                c = -128;
                        } catch (Exception expt) {
                            Txt_area_1.setText("Kontrast[-128,127]:    ZŁA WARTOŚĆ!");
                        }
                        hst = false;
                        kontrast(c);
                    }
                    case "Transformacja_Potegowa" -> {
                        double c = 1.0;
                        double d = 1.0;
                        try {
                            c = Double.parseDouble(Data_slot_1.getText());
                            d = Double.parseDouble(Data_slot_2.getText());
                            Txt_area_1.setText("Transformacja_Potegowa");
                            Transformacja_Potegowa(c, d);
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }

                    case "Rozjasnianie" -> {
                        int c = Integer.parseInt(Data_slot_1.getText());
                        double d = Double.parseDouble(Data_slot_2.getText());
                        try {
                            Txt_area_1.setText("Rozjasnianie");
                            Rozjasnianie(d, c);
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Przyciemnianie" -> {
                        int c = Integer.parseInt(Data_slot_1.getText());
                        double d = Double.parseDouble(Data_slot_2.getText());
                        try {
                            Txt_area_1.setText("Przyciemnianie");
                            Przyciemnianie(d, c);
                        } catch (Exception expt) {
                            Txt_area_1.setText("Nie ma takiego obrazu");
                        }
                        hst = false;
                    }
                    case "Histogram" -> {
                        histogram();
                        hst = true;
                        touched = 1;
                    }
                    case "Filtr Min" ->{
                        int x;
                        x = Integer.parseInt(Data_slot_1.getText());
                        Filtr_po_Max(x);
                    }
                    case "Filtr Max" -> {
                        int x;
                        x = Integer.parseInt(Data_slot_1.getText());
                        Filtr_po_Min(x);
                    }
                    case "Filtr Medianowy"-> {
                        int x;
                        x = Integer.parseInt(Data_slot_1.getText());
                        Filtr_medianowy(x);
                    }
                    case "Wyrównanie_histogramu" -> {
                        hst = false;
                        BufferedImage Gray_s_img = Grayscale(img1);
                        img_copy = wyrownaj(Gray_s_img);
                        pht_base.repaint();
                    }

                }
            }
        });
        frame.add(Refresh_button);
        frame.add(pht_base);
        frame.setVisible(true);
    }
    public static BufferedImage copy_img(BufferedImage buff_img) {
        ColorModel cm = buff_img.getColorModel();
        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
        WritableRaster raster = buff_img.copyData(null);
        return new BufferedImage(cm, raster, isAlphaPremultiplied, null);
    }
    public static void kontrast(double kontrast) {
        img_copy = copy_img(img1);

        for (int i = 0; i < img_copy.getWidth(); i++) {
            for (int j = 0; j < img_copy.getHeight(); j++) {
                Color color = new Color(img_copy.getRGB(i, j));

                if (kontrast >= 0) {
                    int red = (int) ((127 / (127 - kontrast)) * (color.getRed() - kontrast));
                    if (red > 255) red = 255;
                    else if (red < 0) red = 0;
                    int green = (int) ((127 / (127 - kontrast)) * (color.getGreen() - kontrast));
                    if (green > 255) green = 255;
                    else if (green < 0) green = 0;
                    int blue = (int) ((127 / (127 - kontrast)) * (color.getBlue() - kontrast));
                    if (blue > 255) blue = 255;
                    else if (blue < 0) blue = 0;

                    Color fin_col = new Color(red, green, blue);
                    img_copy.setRGB(i, j, fin_col.getRGB());
                } else {
                    int red = (int) (((127 + kontrast) / 127) * color.getRed() - kontrast);
                    if (red > 255) red = 255;
                    else if (red < 0) red = 0;
                    int green = (int) (((127 + kontrast) / 127) * color.getGreen() - kontrast);
                    if (green > 255) green = 255;
                    else if (green < 0) green = 0;
                    int blue = (int) (((127 + kontrast) / 127) * color.getBlue() - kontrast);
                    if (blue > 255) blue = 255;
                    else if (blue < 0) blue = 0;

                    Color fin_col = new Color(red, green, blue);
                    img_copy.setRGB(i, j, fin_col.getRGB());
                }
            }
        }
        pht_base.repaint();
    }
    public static void Suma() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = color1.getRed() + color2.getRed();
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = color1.getGreen() + color2.getGreen();
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = color1.getBlue() + color2.getBlue();
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Odejmowanie() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = color1.getRed() + color2.getRed() - 1;
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = color1.getGreen() + color2.getGreen() - 1;
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = color1.getBlue() + color2.getBlue() - 1;
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Roznica() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = Math.abs(color1.getRed() - color2.getRed());
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = Math.abs(color1.getGreen() + color2.getGreen());
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = Math.abs(color1.getBlue() + color2.getBlue());
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Mnozenie() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = color1.getRed() * color2.getRed();
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = color1.getGreen() * color2.getGreen();
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = color1.getBlue() * color2.getBlue();
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void MnozenieOdwrotne() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = (1 - (1 - color1.getRed()) * (1 - color2.getRed()));
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = (1 - (1 - color1.getGreen()) * (1 - color2.getGreen()));
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = (1 - (1 - color1.getBlue()) * (1 - color2.getBlue()));
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Negacja() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = 1 - Math.abs(1 - color1.getRed() - color2.getRed());
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = 1 - Math.abs(1 - color1.getGreen() - color2.getGreen());
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = 1 - Math.abs(1 - color1.getBlue() - color2.getBlue());
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Ciemniejsze() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = color2.getRed();
                if (color1.getRed() < color2.getRed()) {
                    Red = color1.getRed();
                }
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = color2.getGreen();
                if (color1.getGreen() < color2.getGreen()) {
                    Green = color1.getGreen();
                }
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = color2.getRed();
                if (color1.getBlue() < color2.getBlue()) {
                    Blue = color1.getBlue();
                }
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Jasniejsze() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = color2.getRed();
                if (color1.getRed() > color2.getRed()) {
                    Red = color1.getRed();
                } else if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = color2.getGreen();
                if (color1.getGreen() > color2.getGreen()) {
                    Green = color1.getGreen();
                } else if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = color2.getBlue();
                if (color1.getBlue() > color2.getBlue()) {
                    Blue = color1.getBlue();
                } else if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Wylaczenie() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = color1.getRed() + color2.getRed() - (2 * color1.getRed() * color2.getRed());
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = color1.getGreen() + color2.getGreen() - (2 * color1.getGreen() * color2.getGreen());
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = color1.getBlue() + color2.getBlue() - (2 * color1.getBlue() * color2.getBlue());
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Nakladka() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = 1 - (2 * (1 - color1.getRed()) * (1 - color1.getRed()));
                if (color1.getRed() < 255 * 0.5) {
                    Red = 2 * color1.getRed() * color2.getRed();
                }
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = 1 - (2 * (1 - color1.getGreen()) * (1 - color1.getGreen()));
                if (color1.getGreen() < 255 * 0.5) {
                    Green = 2 * color1.getGreen() * color2.getGreen();
                }
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = 1 - (2 * (1 - color1.getBlue()) * (1 - color1.getBlue()));
                if (color1.getBlue() < 255 * 0.5) {
                    Blue = 2 * color1.getBlue() * color2.getBlue();
                }
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Ostre_swiatlo() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = 1 - (2 * (1 - color1.getRed()) * (1 - color2.getRed()));
                if (color2.getRed() < 255 * 0.5) {
                    Red = 2 * color1.getRed() * color2.getRed();
                }
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = 1 - (2 * (1 - color1.getGreen()) * (1 - color2.getGreen()));
                if (color2.getGreen() < 255 * 0.5) {
                    Green = 2 * color1.getGreen() * color2.getGreen();
                }
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = 1 - (2 * (1 - color1.getBlue()) * (1 - color2.getBlue()));
                if (color2.getRed() < 255 * 0.5) {
                    Blue = 2 * color1.getBlue() * color2.getBlue();
                }
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Lagodne_Swiatlo() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = (int) (Math.sqrt(color1.getRed()) * (2 * color2.getRed() - 1) + (2 * color1.getRed()) * (1 - color2.getRed()));
                if (color2.getRed() < 255 * 0.5) {
                    Red = (int) (2 * color1.getRed() * color2.getRed() + Math.pow(color1.getRed(), 2) * (1 - 2 * color2.getRed()));
                }
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = (int) (Math.sqrt(color1.getGreen()) * (2 * color2.getGreen() - 1) + (2 * color1.getGreen()) * (1 - color2.getGreen()));
                if (color2.getGreen() < 255 * 0.5) {
                    Green = (int) (2 * color1.getGreen() * color2.getGreen() + Math.pow(color1.getGreen(), 2) * (1 - 2 * color2.getGreen()));
                }
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = (int) (Math.sqrt(color1.getBlue()) * (2 * color2.getBlue() - 1) + (2 * color1.getBlue()) * (1 - color2.getBlue()));
                if (color2.getBlue() < 255 * 0.5) {
                    Blue = (int) (2 * color1.getBlue() * color2.getBlue() + Math.pow(color1.getBlue(), 2) * (1 - 2 * color2.getBlue()));
                }
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Rozcienczenie() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int temp = 1 - color2.getRed();
                if (temp == 0) {
                    temp = 1;
                }
                int Red = color1.getRed() / (temp);
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                temp = 1 - color2.getGreen();
                if (temp == 0) {
                    temp = 1;
                }
                int Green = color1.getGreen() / (temp);
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                temp = 1 - color2.getBlue();
                if (temp == 0) {
                    temp = 1;
                }
                int Blue = color1.getBlue() / (temp);
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Wypalanie() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = 1 - (1 - color1.getRed()) / (color2.getRed() + 1);
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = 1 - (1 - color1.getGreen()) / (color2.getGreen() + 1);
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = 1 - (1 - color1.getBlue()) / (color2.getBlue() + 1);
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Reflect_mode() throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = (int) (Math.pow(color1.getRed(), 2) / (1 - color2.getRed()));
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = (int) (Math.pow(color1.getGreen(), 2) / (1 - color2.getGreen()));
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = (int) (Math.pow(color1.getBlue(), 2) / (1 - color2.getBlue()));
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Opacity(double alf) throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));
                Color color2 = new Color(img2.getRGB(x, y));

                int Red = (int) ((1 - alf) * color2.getRed() + alf * color1.getRed());
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = (int) ((1 - alf) * color2.getGreen() + alf * color1.getGreen());
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = (int) ((1 - alf) * color2.getBlue() + alf * color1.getBlue());
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Transformacja_Potegowa(double a, double b) throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));

                int Red = (int) Math.pow((color1.getRed() * a), b);
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = (int) Math.pow((color1.getGreen() * a), b);
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = (int) Math.pow((color1.getBlue() * a), b);
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Rozjasnianie(double a, int b) throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));

                int Red = (int) (color1.getRed() * a) + b;
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = (int) (color1.getGreen() * a) + b;
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = (int) (color1.getBlue() * a) + b;
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Przyciemnianie(double a, int b) throws IOException {
        img_copy = copy_img(img1);
        for (int x = 0; x < img_copy.getWidth(); x++) {
            for (int y = 0; y < img_copy.getHeight(); y++) {
                Color color1 = new Color(img_copy.getRGB(x, y));

                int Red = (int) (color1.getRed() * a) - b;
                if (Red > 255) {
                    Red = 255;
                } else if (Red < 0) {
                    Red = 0;
                }
                int Green = (int) (color1.getGreen() * a) - b;
                if (Green > 255) {
                    Green = 255;
                } else if (Green < 0) {
                    Green = 0;
                }
                int Blue = (int) (color1.getBlue() * a) - b;
                if (Blue > 255) {
                    Blue = 255;
                } else if (Blue < 0) {
                    Blue = 0;
                }

                Color col = new Color(Red, Green, Blue);
                img_copy.setRGB(x, y, col.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void histogram() {
        if (touched == 0) {

            for (int i = 0; i < img1.getWidth(); i++) {
                for (int j = 0; j < img1.getHeight(); j++) {
                    Color color = new Color(img1.getRGB(i, j));
                    int r = color.getRed();
                    int g = color.getGreen();
                    int b = color.getBlue();
                    R[r]++;
                    G[g]++;
                    B[b]++;
                }
            }
            for (int i = 0; i < 256; i++) {
                if (R[i] > Mr)
                    Mr = R[i];
                if (G[i] > Mg)
                    Mg = G[i];
                if (B[i] > Mb)
                    Mb = B[i];
            }
        }
        pht_base.repaint();
    }
    public static BufferedImage Grayscale(BufferedImage src) {
        BufferedImage gImg = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        WritableRaster wr = src.getRaster();
        WritableRaster gr = gImg.getRaster();
        for (int i = 0; i < wr.getWidth(); i++) {
            for (int j = 0; j < wr.getHeight(); j++) {
                gr.setSample(i, j, 0, wr.getSample(i, j, 0));
            }
        }
        gImg.setData(gr);
        return gImg;
    }
    public static BufferedImage wyrownaj(BufferedImage src) {
        BufferedImage nImg = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        WritableRaster wr = src.getRaster();
        WritableRaster er = nImg.getRaster();
        int totpix = wr.getWidth() * wr.getHeight();
        int[] histogram = new int[256];

        for (int x = 1; x < wr.getWidth(); x++) {
            for (int y = 1; y < wr.getHeight(); y++) {
                histogram[wr.getSample(x, y, 0)]++;
            }
        }

        int[] chistogram = new int[256];
        chistogram[0] = histogram[0];
        for (int i = 1; i < 256; i++) {
            chistogram[i] = chistogram[i - 1] + histogram[i];
        }

        float[] arr = new float[256];
        for (int i = 0; i < 256; i++) {
            arr[i] = (float) ((chistogram[i] * 255.0) / (float) totpix);
        }

        for (int x = 0; x < wr.getWidth(); x++) {
            for (int y = 0; y < wr.getHeight(); y++) {
                int nVal = (int) arr[wr.getSample(x, y, 0)];
                er.setSample(x, y, 0, nVal);
            }
        }
        nImg.setData(er);
        return nImg;
    }
    public static void mask(int[][] mask) {
        img_copy = copy_img(img1);

        for (int x = 1; x < img_copy.getWidth() - 1; x++) {
            for (int y = 1; y < img_copy.getHeight() - 1; y++) {
                Color c = new Color(img1.getRGB(x, y));
                int re = 0;
                int gr = 0;
                int bl = 0;

                for (int ix = -1; ix <= 1; ix++) {
                    for (int iy = -1; iy <= 1; iy++) {
                        Color c2 = new Color(img1.getRGB(x + ix, y + iy));

                        re += c2.getRed() * mask[ix + 1][iy + 1];
                        gr += c2.getGreen() * mask[ix + 1][iy + 1];
                        bl += c2.getBlue() * mask[ix + 1][iy + 1];
                    }
                }
                if (re > 255) re = 0;
                else if (re < 0) re = 0;
                if (gr > 255) gr = 0;
                else if (gr < 0) gr = 0;
                if (bl > 255) bl = 0;
                else if (bl < 0) bl = 0;

                Color c2 = new Color(re, gr, bl);
                img_copy.setRGB(x, y, c2.getRGB());
            }
        }
        pht_base.repaint();
    }
    public static void Filtr_po_Max(int size) {
        img_copy = copy_img(img1);

        for (int x = size; x < img_copy.getWidth() - size; x++) {
            for (int y = size; y < img_copy.getHeight() - size; y++) {
                int re = 255;
                int gr = 255;
                int bl = 255;

                for (int ix = -size; ix <= size; ix++) {
                    for (int iy = -size; iy <= size; iy++) {
                        Color c2 = new Color(img1.getRGB(x + ix, y + iy));

                        if (re > c2.getRed()) {
                            re = c2.getRed();
                        }
                        if (gr > c2.getGreen()) {
                            gr = c2.getGreen();
                        }
                        if (bl > c2.getBlue()) {
                            bl = c2.getBlue();
                        }
                    }
                }

                if (re > 255) re = 255;
                else if (re < 0) re = 0;
                if (gr > 255) gr = 255;
                else if (gr < 0) gr = 0;
                if (bl > 255) bl = 255;
                else if (bl < 0) bl = 0;


                Color c2 = new Color(re, gr, bl);
                img_copy.setRGB(x, y, c2.getRGB());
            }
        }

        pht_base.repaint();
    }
    public static void Filtr_po_Min(int size) {
        img_copy = copy_img(img1);

        for (int x = size; x < img_copy.getWidth() - size; x++) {
            for (int y = size; y < img_copy.getHeight() - size; y++) {
                int re = 0;
                int gr = 0;
                int bl = 0;

                for (int ix = -size; ix <= size; ix++) {
                    for (int iy = -size; iy <= size; iy++) {
                        Color c2 = new Color(img1.getRGB(x + ix, y + iy));

                        if (re < c2.getRed()) {
                            re = c2.getRed();
                        }
                        if (gr < c2.getGreen()) {
                            gr = c2.getGreen();
                        }
                        if (bl < c2.getBlue()) {
                            bl = c2.getBlue();
                        }
                    }
                }

                if (re > 255) re = 255;
                else if (re < 0) re = 0;
                if (gr > 255) gr = 255;
                else if (gr < 0) gr = 0;
                if (bl > 255) bl = 255;
                else if (bl < 0) bl = 0;


                Color c2 = new Color(re, gr, bl);
                img_copy.setRGB(x, y, c2.getRGB());
            }
        }

        pht_base.repaint();
    }
    public static void Filtr_medianowy(int size) {
        img_copy = copy_img(img1);

        for (int x = size; x < img_copy.getWidth() - size; x++) {
            for (int y = size; y < img_copy.getHeight() - size; y++) {
                int re = 0;
                int gr = 0;
                int bl = 0;

                ArrayList<Integer> reds = new ArrayList<>();
                ArrayList<Integer> greens = new ArrayList<>();
                ArrayList<Integer> blues = new ArrayList<>();

                for (int ix = -size; ix <= size; ix++) {
                    for (int iy = -size; iy <= size; iy++) {
                        Color c2 = new Color(img1.getRGB(x + ix, y + iy));

                        reds.add(c2.getRed());
                        greens.add(c2.getGreen());
                        blues.add(c2.getBlue());

                    }
                }


                Collections.sort(reds);
                if (reds.size() % 2 == 0) {
                    re = reds.get(reds.size() / 2) + reds.get(reds.size() / 2 - 1) / 2;
                } else {
                    re = reds.get(reds.size() / 2);
                }
                Collections.sort(greens);
                if (greens.size() % 2 == 0) {
                    gr = greens.get(greens.size() / 2) + greens.get(greens.size() / 2 - 1) / 2;
                } else {
                    gr = greens.get(greens.size() / 2);
                }
                Collections.sort(blues);
                if (blues.size() % 2 == 0) {
                    bl = blues.get(blues.size() / 2) + blues.get(blues.size() / 2 - 1) / 2;
                } else {
                    bl = blues.get(blues.size() / 2);
                }


                if (re > 255) re = 255;
                else if (re < 0) re = 0;
                if (gr > 255) gr = 255;
                else if (gr < 0) gr = 0;
                if (bl > 255) bl = 255;
                else if (bl < 0) bl = 0;


                Color c2 = new Color(re, gr, bl);
                img_copy.setRGB(x, y, c2.getRGB());
            }
        }

        pht_base.repaint();
    }
}



class Okno extends Canvas {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(Operacje_Na_Obrazach.img1, 300, 200, null);
        if (Operacje_Na_Obrazach.img_copy != null)
            g2d.drawImage(Operacje_Na_Obrazach.img_copy, 800, 200, null);
        if (Operacje_Na_Obrazach.hst) {
            int tmp_y = 1;
            double mn;
            tmp_y *= (200-(200 * Operacje_Na_Obrazach.R[0]))/ Operacje_Na_Obrazach.Mr;
            for (int i = 0; i < 256; i++) {
                int y = 200 - 200 * Operacje_Na_Obrazach.R[i] / Operacje_Na_Obrazach.Mr;
                g2d.setColor(Color.red);
                mn = (double) Operacje_Na_Obrazach.Mr /200;
                g2d.fillRect(i, 200+y, 1, (int) (Operacje_Na_Obrazach.R[i]/mn));
                tmp_y = y;
            }
            tmp_y *= (200-(200 * Operacje_Na_Obrazach.G[0]))/ Operacje_Na_Obrazach.Mr;
            for (int i = 0; i < 256; i++) {
                int y = 200 - 200 * Operacje_Na_Obrazach.G[i] / Operacje_Na_Obrazach.Mg;
                g2d.setColor(Color.green);
                mn = (double) Operacje_Na_Obrazach.Mg /200;
                g2d.fillRect(i, 450+y, 1, (int) (Operacje_Na_Obrazach.G[i]/mn));
                tmp_y = y;
            }
            tmp_y *= (200-(200 * Operacje_Na_Obrazach.B[0]))/ Operacje_Na_Obrazach.Mr;
            for (int i = 0; i < 256; i++) {
                int y = 200 - 200 * Operacje_Na_Obrazach.B[i] / Operacje_Na_Obrazach.Mb;
                g2d.setColor(Color.blue);
                mn = (double) Operacje_Na_Obrazach.Mb /200;
                g2d.fillRect(i, 700+y, 1, (int) (Operacje_Na_Obrazach.B[i]/mn));
                tmp_y = y;
            }
        }
    }
}