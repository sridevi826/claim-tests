import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.DK_URL)

WebUI.maximizeWindow()

WebUI.comment('Logging into GW')

WebUI.callTestCase(findTestCase('Reusables/Login GW'), [('user') : userName, ('pwd') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Searching For a Policy')

WebUI.callTestCase(findTestCase('Reusables/Step 1'), [('polNum') : GlobalVariable.polNumber], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_GW_ClaimCenter/bt_Next'))

WebUI.callTestCase(findTestCase('Reusables/Step 2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_GW_ClaimCenter/bt_Next'))

WebUI.callTestCase(findTestCase('Reusables/Step 3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_GW_ClaimCenter/bt_Next'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_GW_ClaimCenter/bt_Next'))

WebUI.delay(1)

WebUI.comment('Clicking on Finish button to create a claim')

WebUI.click(findTestObject('Page_GW_ClaimCenter/dd_Claimant'))

WebUI.click(findTestObject('Page_GW_ClaimCenter/li_Test Name'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_GW_ClaimCenter/bt_Finish'))

WebUI.getText(findTestObject('Page_GW_ClaimCenter/label_Claim Created'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

