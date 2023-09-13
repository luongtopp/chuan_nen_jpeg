package nenanhjpeg;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Home extends javax.swing.JFrame {

    private String outputFilePath;
    private int desiredWidth = 345;
    private DecimalFormat decimalFormat = new DecimalFormat("#,###");

    private int desiredHeight = 200;
    private JFileChooser browseImageFile = new JFileChooser("//Users//luongtopp//Desktop//");
    private FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg", "bmp");

    public Home() {
        initComponents();
        btnNen.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        imgAnhGoc = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        imgAnhNen = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        imgAnhGiaiNen = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblDoPhanGiai = new javax.swing.JLabel();
        lblDungLuong = new javax.swing.JLabel();
        lblDinhDang = new javax.swing.JLabel();
        lblBitsMau = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblDoPhanGiai2 = new javax.swing.JLabel();
        lblDungLuong2 = new javax.swing.JLabel();
        lblDinhDang2 = new javax.swing.JLabel();
        lblBitsMau2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblDoPhanGiai3 = new javax.swing.JLabel();
        lblDungLuong3 = new javax.swing.JLabel();
        lblDinhDang3 = new javax.swing.JLabel();
        lblBitsMau3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnChonAnh = new javax.swing.JButton();
        btnNen = new javax.swing.JButton();
        btnGiaiNen = new javax.swing.JButton();
        sldHeSoNen = new javax.swing.JSlider();
        lblHeSoNen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Ảnh gốc"));
        jPanel5.setLayout(new java.awt.BorderLayout());
        jPanel5.add(imgAnhGoc, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Ảnh nén"));
        jPanel6.setLayout(new java.awt.BorderLayout());
        jPanel6.add(imgAnhNen, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Ảnh giải nén"));
        jPanel10.setLayout(new java.awt.BorderLayout());
        jPanel10.add(imgAnhGiaiNen, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin ảnh gốc"));

        lblDoPhanGiai.setText("Độ phân giải:");

        lblDungLuong.setText("Dung lượng:");

        lblDinhDang.setText("Định dạng:");

        lblBitsMau.setText("Bits màu:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoPhanGiai)
                    .addComponent(lblDungLuong)
                    .addComponent(lblDinhDang)
                    .addComponent(lblBitsMau))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblDoPhanGiai)
                .addGap(18, 18, 18)
                .addComponent(lblDungLuong)
                .addGap(18, 18, 18)
                .addComponent(lblDinhDang)
                .addGap(18, 18, 18)
                .addComponent(lblBitsMau)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin ảnh nén"));

        lblDoPhanGiai2.setText("Độ phân giải:");

        lblDungLuong2.setText("Dung lượng:");

        lblDinhDang2.setText("Định dạng:");

        lblBitsMau2.setText("Bits màu:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoPhanGiai2)
                    .addComponent(lblDungLuong2)
                    .addComponent(lblDinhDang2)
                    .addComponent(lblBitsMau2))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblDoPhanGiai2)
                .addGap(18, 18, 18)
                .addComponent(lblDungLuong2)
                .addGap(18, 18, 18)
                .addComponent(lblDinhDang2)
                .addGap(18, 18, 18)
                .addComponent(lblBitsMau2)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel9);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin ảnh giải nén"));

        lblDoPhanGiai3.setText("Độ phân giải:");

        lblDungLuong3.setText("Dung lượng:");

        lblDinhDang3.setText("Định dạng:");

        lblBitsMau3.setText("Bits màu:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoPhanGiai3)
                    .addComponent(lblDungLuong3)
                    .addComponent(lblDinhDang3)
                    .addComponent(lblBitsMau3))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblDoPhanGiai3)
                .addGap(18, 18, 18)
                .addComponent(lblDungLuong3)
                .addGap(18, 18, 18)
                .addComponent(lblDinhDang3)
                .addGap(18, 18, 18)
                .addComponent(lblBitsMau3)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel11);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnChonAnh.setText("Chọn ảnh");
        btnChonAnh.setPreferredSize(new java.awt.Dimension(104, 29));
        btnChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnhActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jPanel2.add(btnChonAnh, gridBagConstraints);

        btnNen.setText("Nén");
        btnNen.setMaximumSize(new java.awt.Dimension(104, 29));
        btnNen.setMinimumSize(new java.awt.Dimension(104, 29));
        btnNen.setPreferredSize(new java.awt.Dimension(104, 29));
        btnNen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jPanel2.add(btnNen, gridBagConstraints);

        btnGiaiNen.setText("Giải nén");
        btnGiaiNen.setMaximumSize(new java.awt.Dimension(104, 29));
        btnGiaiNen.setMinimumSize(new java.awt.Dimension(104, 29));
        btnGiaiNen.setPreferredSize(new java.awt.Dimension(104, 29));
        btnGiaiNen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiNenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jPanel2.add(btnGiaiNen, gridBagConstraints);

        sldHeSoNen.setValue(0);
        sldHeSoNen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldHeSoNenStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jPanel2.add(sldHeSoNen, gridBagConstraints);

        lblHeSoNen.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jPanel2.add(lblHeSoNen, gridBagConstraints);

        jLabel2.setText("Hệ số nén:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jPanel2.add(jLabel2, gridBagConstraints);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 541, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(119, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnhActionPerformed
        chooseImage();
    }//GEN-LAST:event_btnChonAnhActionPerformed

    private void btnNenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNenActionPerformed
        compressImage();
    }//GEN-LAST:event_btnNenActionPerformed

    private void btnGiaiNenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaiNenActionPerformed
        decompressionImage();
    }//GEN-LAST:event_btnGiaiNenActionPerformed

    private void sldHeSoNenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldHeSoNenStateChanged
        lblHeSoNen.setText("" + sldHeSoNen.getValue());
    }//GEN-LAST:event_sldHeSoNenStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnGiaiNen;
    private javax.swing.JButton btnNen;
    private javax.swing.JLabel imgAnhGiaiNen;
    private javax.swing.JLabel imgAnhGoc;
    private javax.swing.JLabel imgAnhNen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblBitsMau;
    private javax.swing.JLabel lblBitsMau2;
    private javax.swing.JLabel lblBitsMau3;
    private javax.swing.JLabel lblDinhDang;
    private javax.swing.JLabel lblDinhDang2;
    private javax.swing.JLabel lblDinhDang3;
    private javax.swing.JLabel lblDoPhanGiai;
    private javax.swing.JLabel lblDoPhanGiai2;
    private javax.swing.JLabel lblDoPhanGiai3;
    private javax.swing.JLabel lblDungLuong;
    private javax.swing.JLabel lblDungLuong2;
    private javax.swing.JLabel lblDungLuong3;
    private javax.swing.JLabel lblHeSoNen;
    private javax.swing.JSlider sldHeSoNen;
    // End of variables declaration//GEN-END:variables

    // Chọn ảnh
    private void chooseImage() {
        //Filter image extensions
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(this);
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();

            System.out.println("path ảnh gốc: " + selectedImagePath);
            try {
                BufferedImage bitmapImage = ImageIO.read(new File(selectedImagePath));
                ImageIcon imageIcon = new ImageIcon(bitmapImage);

                // Lấy kích thước hiện thời của ảnh
                int imageWidth = imageIcon.getIconWidth();
                int imageHeight = imageIcon.getIconHeight();
                
                // Hiển thị các giá trị thuộc tính ảnh lên lable
                lblDoPhanGiai.setText("Độ phân giải: " + imageWidth + " x " + imageHeight);
                String formattedNumber = decimalFormat.format(selectedImageFile.length());
                lblDungLuong.setText("Dung lượng: " + formattedNumber + " Bytes");
                String formatName = ImageIO.getImageReadersByFormatName(getFileExtension(selectedImageFile)).next().getFormatName();
                lblDinhDang.setText("Định dạng: " + formatName);
                lblBitsMau.setText("Bit màu: " + bitmapImage.getColorModel().getPixelSize());

                // Đặt kích thước muốn hiển thị của ảnh
                // Đọc tấm ảnh bitmap vào BufferedImage
                // Tính toán tỷ lệ để thay đổi kích thước của ảnh
                double widthRatio = (double) desiredWidth / imageWidth;
                double heightRatio = (double) desiredHeight / imageHeight;
                double scaleFactor = Math.min(widthRatio, heightRatio);

                // Thay đổi kích thước ảnh theo tỷ lệ
                int scaledWidth = (int) (imageWidth * scaleFactor);
                int scaledHeight = (int) (imageHeight * scaleFactor);
                Image scaledImage = imageIcon.getImage().getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

                // Tạo một ImageIcon mới từ ảnh đã thay đổi kích thước
                ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

                // Đặt ảnh vào label
                imgAnhGoc.setIcon(scaledImageIcon);
//
//                // Đặt kích thước cho label
//                imgAnhGoc.setPreferredSize(new Dimension(desiredWidth, desiredHeight));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    // Nén ảnh
    private void compressImage() {
        // Chọn tệp ảnh BMP để nén
        DecimalFormat decimalFormat = new DecimalFormat("#,###");

        int result = browseImageFile.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File inputFile = browseImageFile.getSelectedFile();

            try {
                BufferedImage bitmapImage = bitmapImage = ImageIO.read(new File(selectedImagePath));

                // Tạo tệp ảnh đầu ra với định dạng JPG
                outputFilePath = inputFile.getAbsolutePath().replace(".bmp", ".jpg");
                File outputFile = new File(outputFilePath);
                ImageIO.write(bitmapImage, "jpg", outputFile);
                System.out.println("path nén ảnh: " + outputFilePath);

                ImageIcon imageIcon = new ImageIcon(outputFilePath);
                int imageWidth = imageIcon.getIconWidth();
                int imageHeight = imageIcon.getIconHeight();

                // Tính toán tỷ lệ để thay đổi kích thước của ảnh
                double widthRatio = (double) desiredWidth / imageWidth;
                double heightRatio = (double) desiredHeight / imageHeight;
                double scaleFactor = Math.min(widthRatio, heightRatio);

                // Thay đổi kích thước ảnh theo tỷ lệ
                int scaledWidth = (int) (imageWidth * scaleFactor);
                int scaledHeight = (int) (imageHeight * scaleFactor);
                Image scaledImage = imageIcon.getImage().getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

                // Tạo một ImageIcon mới từ ảnh đã được chỉnh kích thước
                ImageIcon resizedIcon = new ImageIcon(scaledImage);
                imgAnhNen.setIcon(resizedIcon);
                // Hiển thị thông tin về ảnh đã nén
                int compressedWidth = bitmapImage.getWidth();
                int compressedHeight = bitmapImage.getHeight();
                long compressedFileSize = outputFile.length();

                lblDoPhanGiai2.setText("Độ phân giải: " + compressedWidth + " x " + compressedHeight);
                String formatName;
                try {
                    formatName = ImageIO.getImageReadersByFormatName(getFileExtension(outputFile)).next().getFormatName();
                    lblDinhDang2.setText("Định dạng: " + formatName);
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
                String formattedNumber = decimalFormat.format(compressedFileSize);
                lblDungLuong2.setText("Dung lượng: " + formattedNumber + " Bytes");
                lblBitsMau2.setText("Bit màu: " + bitmapImage.getColorModel().getPixelSize());
                btnNen.setEnabled(false);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Giải nén
    private void decompressionImage() {
        JFileChooser browseImageFile = new JFileChooser("//Users//luongtopp//Desktop//");
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg", "bmp");
        browseImageFile.addChoosableFileFilter(fnef);

        int result = browseImageFile.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            outputFilePath = selectedImageFile.getAbsolutePath();
            System.out.println(outputFilePath);
            File inputFile = new File(outputFilePath);
            try {
                // Specify the path to the JPEG image file
                // Read the JPEG image
                BufferedImage bufferedImageImage = ImageIO.read(inputFile);

                // Specify the path to the output BMP file
                outputFilePath = outputFilePath.replace(".jpg", ".bmp");
                File outputFile = new File(outputFilePath);

                // Write the image as BMP to the output file
                ImageIO.write(bufferedImageImage, "bmp", outputFile);

                // Hiển thị thông tin lên màn hình
//                File selectedImageFile = new File(outputFilePath);
                selectedImagePath = selectedImageFile.getAbsolutePath();
                System.out.println("path giải nén: " + selectedImagePath);
                try {
                    BufferedImage bitmapImage2 = ImageIO.read(new File(selectedImagePath));
                    ImageIcon ii = new ImageIcon(bitmapImage2);

                    // Lấy kích thước hiện thời của ảnh
                    int imageWidth = ii.getIconWidth();
                    int imageHeight = ii.getIconHeight();

                    lblDoPhanGiai3.setText("Độ phân giải: " + imageWidth + " x " + imageHeight);
                    String formatName;
                    try {
                        formatName = ImageIO.getImageReadersByFormatName(getFileExtension(selectedImageFile)).next().getFormatName();
                        lblDinhDang3.setText("Định dạng: " + formatName);
                    } catch (IOException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String formattedNumber = decimalFormat.format(selectedImageFile.length());
                    lblDungLuong3.setText("Dung lượng: " + formattedNumber + " Bytes");
                    lblBitsMau3.setText("Bit màu: " + bitmapImage2.getColorModel().getPixelSize());

                    // Tính toán tỷ lệ để thay đổi kích thước của ảnh
                    double widthRatio = (double) desiredWidth / imageWidth;
                    double heightRatio = (double) desiredHeight / imageHeight;
                    double scaleFactor = Math.min(widthRatio, heightRatio);

                    // Thay đổi kích thước ảnh theo tỷ lệ
                    int scaledWidth = (int) (imageWidth * scaleFactor);
                    int scaledHeight = (int) (imageHeight * scaleFactor);
                    Image scaledImage = ii.getImage().getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

                    // Tạo một ImageIcon mới từ ảnh đã thay đổi kích thước
                    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

                    // Đặt ảnh vào label
                    imgAnhGiaiNen.setIcon(scaledImageIcon);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Tách ký tự
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf(".");
        if (dotIndex != -1 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1);
        }
        return "";
    }
}
