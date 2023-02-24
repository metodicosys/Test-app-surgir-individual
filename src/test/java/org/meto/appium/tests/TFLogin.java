package org.meto.appium.tests;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProspect;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFLogin extends TestBase {

	@Test
	public void FillForm() throws InterruptedException{
		
		//FormPage formPage = new FormPage(driver);
	//	ExtentTest test = extent.createTest("Initial Test");
		formPage.setNameUser("asesorqa");
		formPage.setNamePass("Surgir.2026");
		formPage.setSubmitLogin();
		formPage.setAgencySelection("Agencia");
		formPage.setRolSelection("Rol");
		formPage.setSubmitRol();
		formPage.setClaveLocal1("Prueba1234");
		formPage.setClaveConfLocal("Prueba1234");
		
		FormProspect formProspect = formPage.localButton();
		
		formProspect.PropuestaButton();
		formProspect.ReturnButton();
		formProspect.PropuestaHome();
		formProspect.setNumDoc("09921741");
		formProspect.Verificando();
		formProspect.setFecCaducidad("01/01/2030");
		formProspect.setFirstName("TestFisrtname");
		formProspect.setSecondName("TestSecondName");
		formProspect.setSurName("Testlastname");
		formProspect.avance();
		formProspect.setSecondSureName("OtherLastName");
		formProspect.setFecNa("01/03/1991");
		formProspect.avance();
		formProspect.setnMobile("990493838");
		formProspect.setnMail("metodicosys@gmail.com");
		formProspect.continuarProspect();
		formProspect.scrollData();
		formProspect.continuarData();
	//	formProspect.bcontinuarValid();
	
		FormCustomer formCustomer = formProspect.bcontinuarValid();
							//	formCustomer.bcontinuarValid();
		formCustomer.Customer();
		formCustomer.fotoExperian();
		formCustomer.fotofrenteDni();
		formCustomer.fotoreversoDni();
		formCustomer.fotoCliente();
		//	formCustomer.nextone(); avance con scroll
		formCustomer.swipeScreenOneCustomer();
		formCustomer.gradoInstruccion();
		formCustomer.profesionN();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.prePago();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.codigoArea();
		//	formCustomer.telefonoFijo("3827271");
		formCustomer.operadorTelef();

		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.nexttwoCustomer();
		formCustomer.tipodeComprobante();
		formCustomer.fotoComprobanteDomicilio();
		formCustomer.casaqueHabita();
		formCustomer.otrotipoDomicilio("choza");
		formCustomer.personaenDomicilio();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.departamentos();
		formCustomer.provincias();
		formCustomer.distritos();
		formCustomer.urbanizacion("2");
		
		
	}

/*
	@Test
	public void FillCustomer(){
		//FormCustomer formCustomer = formProspect.bcontinuarValid();
		//	formCustomer.bcontinuarValid();
		formCustomer.Customer();
		formCustomer.fotoExperian();
		formCustomer.fotofrenteDni();
		
	}*/
	
	
	@BeforeMethod(alwaysRun=true)
	public void preSetup()
		{
			//TFLogin.setActivity();
		
	}
	
	
}
