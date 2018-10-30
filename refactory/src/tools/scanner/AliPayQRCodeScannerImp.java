package tools.scanner;

/**
 * @author Hou Xianda
 */
public class AliPayQRCodeScannerImp extends AliPayQRCodeScanner {
    /**
     * 
     * @param scanObject 传入扫描对象
     */
    public void scanAliPayQRCode(Object scanObject) {
        System.out.println("--------------------------------------------");
        System.out.println("Scan Succeeded!");
        System.out.println("Scan Object Type : AliPay QR Code");
        System.out.println("The Content of the scanObject: " + scanObject.toString());
        System.out.println("--------------------------------------------\n");
    }

    public void scanWeChatQRCode(Object scanObject) {
        //Do nothing.
    }
}
