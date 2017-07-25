# Enum Months Project
List months after a given month

For this project you will be

Showing a list of months and asking the user to choose one
Creating a list of months from the given month to the end of the year
Displaying the months
Note: it will take you at least 12 months to complete this project.

# Getting Started  

Open up a new project in IntelliJ.

If you don't have a Main.java in the src directory create one and give it a public static void main(String[] args) method.

# packaging  

In the project window right click on src in the project window and then click New and then click package. Enter "com.example" (without the double quotes).

Notice that under src you now see com.example which is the package.

Notice also that Main does not have a package statement as the first line.

Now refactor Main to move it to the package

Right click on Main
Click Refactor and then Move...
In the pop-up dialog window enter com.example in the To package field and click Refactor
Notice that Main now has a package statement as the first line and that it has moved under the package in the project window.

Packaging is a way to group Java classes.

Right click on the com.example package and create a new package named "common".

# Assignment  

We are going to put the Java enumeration is the common package.

Right click on the common package and then click New and then click Java Class.
Change the Kind to Enum and enter Month for the name and then click OK.
Enums in Java are typically singular (Month, not Months).

In the Month enum add the constants JANUARY through DECEMBER.

Also add a private variable englishName which should be set to January through December and a getter.

In Main ask the user (using Scanner) to choose one of the months (show the month using the English name)

In an ArrayList add all the months for the given month and all the following months. This can be done many ways but an elegant solution can be coded using a switch statement.

Show the list to the user.

# Extras  

Write out Month.May as json.

Import the jackson library in IntelliJ which converts JSON to/from Java objects.

File -> Project Structure... -> Libraries
Click + and choose From Maven
Type "jackson-databind" in the top text field can hit enter
Wait for a list to show up.
Choose the latest version of com.fasterxml.jackson.core:jackson-databind (probably will be com.fasterxml.jackson.core:jackson-databind:2.8.9)
Click the Sources and JavaDocs checkboxes and then click OK.
Click OK two or three times to get rid of the dialog windows.
# First write the list as you've done before  

In main write convert Month.May to json and write it out (see the telematics project if you need a reminder how to do this).

Notice that the enum name in the file are the uppercase constant.

# Now write the list using the English name  

To use the English name add the following annotation in the line before the getEnglishName() method.

@JsonValue
Now run main again and view the file. Now the name is the English name.