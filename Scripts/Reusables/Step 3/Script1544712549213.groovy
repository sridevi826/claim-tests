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

WebUI.click(findTestObject('Page_GW_ClaimCenter/lnk_Close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_GW_ClaimCenter/dd_Loss Cause'))

WebUI.click(findTestObject('Page_GW_ClaimCenter/li_Cancellation'))

WebUI.click(findTestObject('Page_GW_ClaimCenter/dd_Reason'))

WebUI.click(findTestObject('Page_GW_ClaimCenter/li_Illness'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_GW_ClaimCenter/lnk_Add Trip'))

WebUI.click(findTestObject('Page_GW_ClaimCenter/dd_Where'))

WebUI.click(findTestObject('Page_GW_ClaimCenter/li_United States'))

WebUI.click(findTestObject('Page_GW_ClaimCenter/dd_Journey Date'))

WebUI.click(findTestObject('Page_GW_ClaimCenter/lnk_Book day'))

WebUI.click(findTestObject('Page_GW_ClaimCenter/bt_OK'))

WebUI.click(findTestObject('Page_GW_ClaimCenter/dd_Who became ill'))

WebUI.click(findTestObject('Page_GW_ClaimCenter/li_Test Name'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_GW_ClaimCenter/dd_Relation'))

WebUI.click(findTestObject('Page_GW_ClaimCenter/li_SelfInsured'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_GW_ClaimCenter/radio_Yes'))

WebUI.delay(1)

