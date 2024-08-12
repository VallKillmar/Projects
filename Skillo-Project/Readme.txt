Skillo Project exercise specifications:
1. Да се разработи Java Maven test automation проект на база на следните технологии: TestNG и Selenium WebDriver
2. За организация на проекта да се следва Page Object Model design pattern и PageFactory
3. Да се автоматизират не по-малко от 5 различни тестови сценария срещу следния уебсайт:
   http://training.skillo-bg.com:4200/posts/all
4. Проектът да съдържа testng.xml файл
5. Всички тестове да могат да се изпълнят с командата 'mvn clean test' срещу Chrome browser
6. При test failure, да се запазва screenshot в избрана директория от проекта
7. Да бъде създадено публично github repo, в което да се съхранява кода на проекта
8. Проектът да съдържа README файл, който да описва какво представлява проекта и какви тестове съдържа

Project Explanation:
1.In the <test> package are separated in three packages: main, negative, positive
main - all <BaseTests> that are usually part of the testing process
negative - all test to fail tests
positive - all test to pass tests
2.In the <main> package we have the java classes distributed by Pages and Utils
Pages: a package which contains all the components like: pages, header, navigation and so on...
 - includes <Header> class with methods which will be in use around the site header
 - includes <SignIn> class with methods related to the Login/Logout
Utils: package which contains all auxiliary classes like default <Browser> methods or <Base actions> related to the project
3.For running the tests we are using <testing.xml> file and maven commands - the file is located in <resources> package

