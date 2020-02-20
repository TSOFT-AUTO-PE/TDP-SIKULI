package com.tsoft.bot.frontend.steps.crmMasSimple;

import com.sun.prism.shader.Texture_ImagePattern_AlphaTest_Loader;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.ExtentReportUtil;
import com.tsoft.bot.frontend.utility.GenerateWord;
import com.tsoft.bot.frontend.utility.Sleeper;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.*;
import com.tsoft.bot.frontend.utility.*;


import javax.imageio.ImageIO;
import java.io.File;
import java.util.HashMap;
import java.util.List;

import static com.tsoft.bot.frontend.pageobject.crmMasSimple.PageObject_Login.*;
import static com.tsoft.bot.frontend.pageobject.crmMasSimple.PageObject_CrearCliente.*;

public class CRM_Registros {

    private static final String EXCEL_WEB = "excel/CRM_Login.xlsx";
    private static final String LOGIN_WEB = "Login";
    private static final String COLUMNA_AMBIENTE = "AMBIENTE";
    private static final String COLUMNA_USUARIO = "USUARIO";
    private static final String COLUMNA_PASSWORD = "PASSWORD";
    private static final String COLUMNA_DOCUMENTO = "NUM_DOC";
    private static final String COLUMNA_RUC = "NUM_RUC";
    private static GenerateWord generateWord = new GenerateWord();
    private WebDriver driver;

    public CRM_Registros() {
        this.driver = Hook.getDriver();
    }

    Screen screen = new Screen();

    private List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(EXCEL_WEB, LOGIN_WEB);
    }

    @Given("^Se ingresa a la aplicacion CRM \\+Simple en el ambiente \"([^\"]*)\"$")
    public void seIngresaALaAplicacionCRMSimpleEnElAmbiente(String casoDePrueba) throws Throwable {
        try {
            int crm = Integer.parseInt(casoDePrueba) - 1;
            String url = getData().get(crm).get(COLUMNA_AMBIENTE);
            driver.get(url);
            Sleeper.Sleep(2000);
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
        }
    }

    @When("^Se ingresa el usuario \"([^\"]*)\"$")
    public void seIngresaElUsuario(String casoDePrueba) throws Throwable {
        try {
            int crm = Integer.parseInt(casoDePrueba) - 1;
            String usuario = getData().get(crm).get(COLUMNA_USUARIO);
            Region CoorX = screen.find(BTN_X).highlight(1, "green");
            screen.click(BTN_X);
            screen.wait(TXT_USUARIO, 40000);
            Region CoorUser = screen.find(TXT_USUARIO).highlight(1, "green");
            screen.click(TXT_USUARIO);
            screen.type(usuario);
            //Region appRegion = App.focusedWindow();
            ImageIO.write(screen.capture().getImage(), "jpg", new File("C:\\Users\\admin\\Desktop\\SIKULI\\sikuli-automation-framework\\img\\evidence\\" + "1.Input_User.jpg"));

//            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página CRM");
//            generateWord.sendText("Se inició correctamente la página CRM");
//            generateWord.addImageToWord(driver);

        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }


    @And("^Se ingresa La contraseña \"([^\"]*)\"$")
    public void seIngresaLaContraseña(String casoDePrueba) throws Throwable {
        try {
            int crm = Integer.parseInt(casoDePrueba) - 1;
            String password = getData().get(crm).get(COLUMNA_PASSWORD);
            screen.wait(TXT_PASSWORD, 5000);
            Region CoorPass = screen.find(TXT_PASSWORD).highlight(1, "green");
            screen.click(TXT_PASSWORD);
            screen.type(password);
            //Region appRegion = App.focusedWindow();
            ImageIO.write(screen.capture().getImage(), "jpg", new File("C:\\Users\\admin\\Desktop\\SIKULI\\sikuli-automation-framework\\img\\evidence\\" + "2.Input_password.jpg"));
//            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página CRM");
//            generateWord.sendText("Se inició correctamente la página CRM");
//            generateWord.addImageToWord(driver);

        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }

    @Then("^se da click en el boton Iniciar Session$")
    public void seDaClicEnElBotonIniciarSession() {
        try {
            screen.wait(BTN_INICIAR, 5000);
            Region Coorbtn_iniciar = screen.find(BTN_INICIAR).highlight(1, "green");
            screen.click(BTN_INICIAR);
            //Region appRegion = App.focusedWindow();
            ImageIO.write(screen.capture().getImage(), "jpg", new File("C:\\Users\\admin\\Desktop\\SIKULI\\sikuli-automation-framework\\img\\evidence\\" + "3.Iniciar.jpg"));
//            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página CRM");
//            generateWord.sendText("Se inició correctamente la página CRM");
//            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }

    @And("^se espera la carga correcta del login CRM \\+Simple$")
    public void seEsperaLaCargaCorrectaDelLoginCRMSimple() {
        try {
            screen.wait(BTN_ENDLOAD, 40000);
            //Region appRegion = App.focusedWindow();
            ImageIO.write(screen.capture().getImage(), "jpg", new File("C:\\Users\\admin\\Desktop\\SIKULI\\sikuli-automation-framework\\img\\evidence\\" + "4.CargaLoginCorrecta.jpg"));
//            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página CRM");
//            generateWord.sendText("Se inició correctamente la página CRM");
//            generateWord.addImageToWord(driver);

        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }

    @When("^se ingresa a crear cliente$")
    public void seIngresaACrearCliente() {
        try {
            screen.wait(BTN_CREAR, 5000);
            Region Coorbtn_crear = screen.find(BTN_CREAR).highlight(1, "green");
            screen.click(BTN_CREAR);
            screen.wait(BTN_CLIENTE, 5000);
            screen.click(BTN_CLIENTE);
            screen.wait(LBL_DCONTACTO, 5000);
            //Region appRegion = App.focusedWindow();
            ImageIO.write(screen.capture().getImage(), "jpg", new File("C:\\Users\\admin\\Desktop\\SIKULI\\sikuli-automation-framework\\img\\evidence\\" + "5.IngresoCrearCliente.jpg"));
//            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página CRM");
//            generateWord.sendText("Se inició correctamente la página CRM");
//            generateWord.addImageToWord(driver);

        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }

    @And("^se selecciona cliente residencial$")
    public void seSelecionaClienteResidencial() {
        try {
            screen.wait(BTN_COPORATIVO, 5000);
            Region Coorrad_corp = screen.find(BTN_COPORATIVO).highlight(1, "green");
            screen.click(BTN_COPORATIVO);
            Thread.sleep(3000);

            screen.wait(BTN_RESIDENCIAL, 5000);
            Region Coorrad_resi = screen.find(BTN_RESIDENCIAL).highlight(1, "green");
            screen.click(BTN_RESIDENCIAL);
            //Region appRegion = App.focusedWindow();
//            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página CRM");
//            generateWord.sendText("Se inició correctamente la página CRM");
//            generateWord.addImageToWord(driver);

        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }

    @And("^se ingresa el DNI del cliente \"([^\"]*)\" y se valida$")
    public void seIngresaElDNIDelClienteYSeValida(String casoDePrueba) throws Throwable {
        try {
            int crm = Integer.parseInt(casoDePrueba) - 1;
            String dni = getData().get(crm).get(COLUMNA_DOCUMENTO);
            screen.wait(LIST_TIPODOC);
            Region Coorrad_doc = screen.find(LIST_TIPODOC).highlight(1, "green");
            screen.click(LIST_TIPODOC);
            screen.wait(SELECT_DNI);
            screen.click(SELECT_DNI);
            screen.wait(TXT_NUMDOC);
            Region Coorrad_numdoc = screen.find(TXT_NUMDOC).highlight(1, "green");
            screen.click(TXT_NUMDOC);
            screen.type(dni);
            screen.wait(BTN_VALIDAR1);
            Region Coorrad_btnvaldiar1 = screen.find(BTN_VALIDAR1).highlight(1, "green");
            screen.click(BTN_VALIDAR1);
            Thread.sleep(2000);
            screen.wait(LBL_ESTADOCIVIL);
            screen.mouseMove(LBL_ESTADOCIVIL);
            Thread.sleep(3000);
            if (screen.exists(MSJ_VAL1) != null) {
                screen.wait(MSJ_VAL1, 5000);
                Region Coorrad_msjval1 = screen.find(MSJ_VAL1).highlight(1, "red");
                screen.wait(BTN_MSJ_VAL1_OK, 5000);
                Region Coorrad_btnok = screen.find(BTN_MSJ_VAL1_OK).highlight(1, "red");
                ImageIO.write(screen.capture().getImage(), "jpg", new File("C:\\Users\\admin\\Desktop\\SIKULI\\sikuli-automation-framework\\img\\evidence\\" + "6.ValidaContactoExistente.jpg"));
                screen.click(BTN_MSJ_VAL1_OK);
                screen.wait(BTN_CERRAR);
                Region Coorrad_cerrar = screen.find(BTN_CERRAR).highlight(1, "red");
                screen.click(BTN_CERRAR);
                screen.wait(BTN_DESCARTAR);
                Region Coorrad_descartar = screen.find(BTN_DESCARTAR).highlight(1, "red");
                screen.click(BTN_DESCARTAR);
            } else {
                screen.wait(BTN_VAL1_CHECK);
                ImageIO.write(screen.capture().getImage(), "jpg", new File("C:\\Users\\admin\\Desktop\\SIKULI\\sikuli-automation-framework\\img\\evidence\\" + "6.ValidaDNICorrecto.jpg"));
            }
//            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página CRM");
//            generateWord.sendText("Se inició correctamente la página CRM");
//            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }

    @And("^se verifica la direccion para dar de alta$")
    public void seVerificaLaDireccion() {
        try {
            screen.wait(BTN_VALIDAR2, 5000);
            Region Coorrad_btn_val2 = screen.find(BTN_VALIDAR2).highlight(1, "green");
            screen.click(BTN_VALIDAR2);
            Thread.sleep(2000);
            screen.wait(LBL_BLQOUE);
            screen.mouseMove(LBL_BLQOUE);
            screen.wait(BTN_VAL2_CHECK);
            Thread.sleep(2000);
            screen.wait(BTN_VALIDAR3, 10000);
            Region Coorrad_btn_val3 = screen.find(BTN_VALIDAR3).highlight(1, "green");
            screen.click(BTN_VALIDAR3);
            Thread.sleep(5000);
            screen.wait(LBL_BLQOUE);
            screen.mouseMove(LBL_BLQOUE);
            screen.wait(BTN_VAL3_CHECK);
            Thread.sleep(2000);
            screen.wait(BTN_VALIDAR4);
            Region Coorrad_btn_val4 = screen.find(BTN_VALIDAR4).highlight(1, "green");
            screen.click(BTN_VALIDAR4);
            screen.mouseMove(LBL_BLQOUE);
            Thread.sleep(5000);
            if (screen.exists(RDN_DIRECC) != null) {
                screen.wait(RDN_DIRECC);
                Region Coorrad_rdndirecc = screen.find(RDN_DIRECC).highlight(1, "green");
                screen.click(RDN_DIRECC);
                screen.wait(BTN_SELECCIONAR);
                Region Coorrad_btnselecc = screen.find(BTN_SELECCIONAR).highlight(1, "green");
                screen.click(BTN_SELECCIONAR);
            }

            if (screen.exists(MSJ_VAL2) != null) {
                screen.wait(MSJ_VAL2, 10000);
                Region Coorrad_msjval1 = screen.find(MSJ_VAL2).highlight(1, "red");
                screen.wait(BTN_MSJ_VAL1_OK, 5000);
                Region Coorrad_btnok = screen.find(BTN_MSJ_VAL1_OK).highlight(1, "red");
                screen.click(BTN_MSJ_VAL1_OK);
                Thread.sleep(2000);
                if (screen.exists(TXT_NOMVIA) != null) {
                    screen.wait(TXT_NOMVIA);
                    Region Coorrad_nomvia = screen.find(TXT_NOMVIA).highlight(1, "green");
                    screen.click(TXT_NOMVIA);
                    screen.type("LIMA");
                }
                screen.wait(TXT_NUMERO);
                Region Coorrad_num = screen.find(TXT_NUMERO).highlight(1, "green");
                screen.click(TXT_NUMERO);
                screen.type("1");
                screen.wait(TXT_PISO);
                Region Coorrad_piso = screen.find(TXT_PISO).highlight(1, "green");
                screen.click(TXT_PISO);
                screen.type("1");
                screen.wait(TXT_INTERIOR);
                Region Coorrad_interior = screen.find(TXT_INTERIOR).highlight(1, "green");
                screen.click(TXT_INTERIOR);
                screen.type("1");
                screen.wait(TXT_COMPLEJO);
                Region Coorrad_complejo = screen.find(TXT_COMPLEJO).highlight(1, "green");
                screen.click(TXT_COMPLEJO);
                screen.type("1");
                screen.wait(TXT_BLOQUE);
                Region Coorrad_bloque = screen.find(TXT_BLOQUE).highlight(1, "green");
                screen.click(TXT_BLOQUE);
                screen.type("1");
                screen.wait(TXT_LOTE);
                Region Coorrad_lote = screen.find(TXT_LOTE).highlight(1, "green");
                screen.click(TXT_LOTE);
                screen.type("1");
                screen.wait(TXT_CODIGO);
                Region Coorrad_codigo = screen.find(TXT_CODIGO).highlight(1, "green");
                screen.click(TXT_CODIGO);
                screen.type("1");
                Thread.sleep(2000);
                screen.wait(BTN_VALIDAR4);
                Region Coorrad_btnval4 = screen.find(BTN_VALIDAR4).highlight(1, "green");
                screen.click(BTN_VALIDAR4);
                screen.mouseMove(LBL_BLQOUE);
                Thread.sleep(8000);
                if (screen.exists(RDN_DIRECC) != null) {
                    screen.wait(RDN_DIRECC);
                    Region Coorrad_rdndirecc = screen.find(RDN_DIRECC).highlight(1, "green");
                    screen.click(RDN_DIRECC);
                    screen.wait(BTN_SELECCIONAR);
                    Region Coorrad_btnselecc = screen.find(BTN_SELECCIONAR).highlight(1, "green");
                    screen.click(BTN_SELECCIONAR);
                }
            } else {
                screen.wait(BTN_VAL4_CHECK);
                ImageIO.write(screen.capture().getImage(), "jpg", new File("C:\\Users\\admin\\Desktop\\SIKULI\\sikuli-automation-framework\\img\\evidence\\" + "7.ValidaDireccion.jpg"));
            }
            screen.wait(BTN_VAL4_CHECK);
            ImageIO.write(screen.capture().getImage(), "jpg", new File("C:\\Users\\admin\\Desktop\\SIKULI\\sikuli-automation-framework\\img\\evidence\\" + "7.ValidaDireccion.jpg"));
            //Region appRegion = App.focusedWindow();
//            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página CRM");
//            generateWord.sendText("Se inició correctamente la página CRM");
//            generateWord.addImageToWord(driver);

        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }

    @Then("^se da click en guardar para finalizar el registro del cliente residencial$")
    public void seDaClickEnGuardarParaFinalizarElRegistroDelCliente() {
        try {
            screen.type(Key.PAGE_DOWN);
            screen.wait(BTN_GUARDAR);
            Region Coorrad_btnguardar = screen.find(BTN_GUARDAR).highlight(1, "green");
            screen.click(BTN_GUARDAR);
            ImageIO.write(screen.capture().getImage(), "jpg", new File("C:\\Users\\admin\\Desktop\\SIKULI\\sikuli-automation-framework\\img\\evidence\\" + "8.ValidaFlujoCorrecto.jpg"));
            screen.wait(LBL_BUSQUEDA);


        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }

    @And("^se selecciona cliente corporativo$")
    public void seSeleccionaClienteCorporativo() {
        try {
            screen.wait(BTN_COPORATIVO, 5000);
            Region Coorrad_corp = screen.find(BTN_COPORATIVO).highlight(1, "green");
            screen.click(BTN_COPORATIVO);
            Thread.sleep(3000);
            //Region appRegion = App.focusedWindow();
//            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página CRM");
//            generateWord.sendText("Se inició correctamente la página CRM");
//            generateWord.addImageToWord(driver);

        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }

    @And("^se ingresa el RUC del cliente \"([^\"]*)\" y se valida$")
    public void seIngresaElRUCDelClienteYSeValida(String casoDePrueba) throws Throwable {
        try {
            int crm = Integer.parseInt(casoDePrueba) - 1;
            String ruc = getData().get(crm).get(COLUMNA_RUC);
            screen.wait(LIST_TIPOCOMP);
            Region Coorrad_doc = screen.find(LIST_TIPOCOMP).highlight(1, "green");
            screen.click(LIST_TIPOCOMP);
            screen.wait(SELECT_RUC);
            screen.click(SELECT_RUC);
            screen.wait(TXT_NUMRUC);
            Region Coorrad_numdoc = screen.find(TXT_NUMRUC).highlight(1, "green");
            screen.click(TXT_NUMRUC);
            screen.type(ruc);
            screen.wait(BTN_VALIDAR5);
            Region Coorrad_btnvaldiar1 = screen.find(BTN_VALIDAR5).highlight(1, "green");
            screen.click(BTN_VALIDAR5);
            Thread.sleep(2000);
            screen.wait(LBL_ESTADOCIVIL);
            screen.mouseMove(LBL_ESTADOCIVIL);
            Thread.sleep(2000);
        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }

    @Then("^se cambia el subtipo de cliente a empresas oro permitiendo acuerdo comercial$")
    public void seCambiaElSubtipoDeClienteAEmpresasOro() {
        try {
            screen.type(Key.PAGE_DOWN);
            screen.wait(LIST_SUBCLIENTE);
            Region Coorrad_doc = screen.find(LIST_SUBCLIENTE).highlight(1, "green");
            screen.click(LIST_SUBCLIENTE);
            screen.wait(SELECT_EMPORO);
            screen.click(SELECT_EMPORO);
            screen.wait(BOX_ACOMERCIAL);
            Region Coorrad_box = screen.find(BOX_ACOMERCIAL).highlight(1, "green");
            screen.click(BOX_ACOMERCIAL);

        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }

    @And("^se da click en guardar para finalizar el registro del cliente corporativo$")
    public void seDaClickEnGuardarParaFinalizarElRegistroDelClienteCorporativo() {
        try {
            screen.wait(BTN_GUARDAR);
            Region Coorrad_btnguardar = screen.find(BTN_GUARDAR).highlight(1, "green");
            screen.click(BTN_GUARDAR);
            ImageIO.write(screen.capture().getImage(), "jpg", new File("C:\\Users\\admin\\Desktop\\SIKULI\\sikuli-automation-framework\\img\\evidence\\" + "8.ValidaFlujoCorrecto.jpg"));
            screen.wait(LBL_BUSQUEDA);


        } catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 19, "FAIL");
//            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
//            generateWord.sendText("Tiempo de espera ha excedido");
//            generateWord.addImageToWord(driver);
        }
    }
}
