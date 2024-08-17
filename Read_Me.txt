Appium İnspector Bilgileri
{
  "platformName": "Android",
  "appium:udid": "emulator-5554",
  "appium:automationName": "UIAutomator2",
  "appium:noReset": false,
  "appium:fullReset": false,
  "appPackage": "com.pordiva.nesine.android",
  "appActivity": "com.nesine.ui.taboutside.splash.MainActivityDefault"
}

Kullanıcı Bilgileri Cucumber senaryolarında yer almaktadır. "your informations" yazan alanlara username ve pass girilmesi gerekmektedir.

testRunners/runner.java dosyasında "tags" alanına çalışmasını istediğimiz senaryoları yazabiliriz.

HTML ve Json Raporlama Cucumber Report tarafından yapılmaktadır ve Reports Klasörünün altında yer almaktadır.

mvn clean test
mvn allure:report
Allure report json çıktıları allure-results klasöründe yer almaktadır.