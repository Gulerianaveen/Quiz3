package com.example.quiz3

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val question1 = Question(
            1,
            "Number of primitive data types in Java are ?",
            "7",
            "6",
            "8",
            "9",
            3
        )
        questionsList.add(question1)

        val question2 = Question(
            1,
            "Which of the following languages is used as a scripting language in the Unity 3D game engine?",
            "Java",
            "C#",
            "C++",
            "Objective-C",
            3
        )
        questionsList.add(question2)

        val question3 = Question(
            1,
            "Automatic type conversion is possible in which of the possible cases?",
            "Byte to Int",
            "int to long",
            "long to int",
            "short to int",
            2
        )
        questionsList.add(question3)

        val question4 = Question(
            1,
            "What does the term GPU stand for?",
            "Graphite Producing Unit",
            "Gaming Processor Unit",
            "Graphical Proprietary Unit",
            "Graphics Processing Unit",
            4
        )
        questionsList.add(question4)

        val question5 = Question(
            1,
            "Find the output of the following program.\n" +
                    "\n" +
                    "public class Solution{\n" +
                    "       public static void main(String[] args){\n" +
                    "                     short x = 10;\n" +
                    "                     x =  x * 5;\n" +
                    "                     System.out.print(x);\n" +
                    "       }\n" +
                    "}",
            "50",
            "10",
            "Compilation error",
            "Exception",
            3
        )
        questionsList.add(question5)

        val question6 = Question(
            1,
            " \n" +
                    "Find the output of the following program.\n" +
                    "\n" +
                    "public class Solution{\n" +
                    "       public static void main(String[] args){\n" +
                    "                     byte x = 127;\n" +
                    "                     x++;\n" +
                    "                     x++;\n" +
                    "                     System.out.print(x);\n" +
                    "       }\n" +
                    "}",
            "-127",
            "127",
            "129",
            "2",
            1
        )
        questionsList.add(question6)

        val question7 = Question(
            1,
            "In programming, the ternary operator is mostly defined with what symbol(s)?",
            "??",
            "if then",
            "?:",
            "?",
            3
        )
        questionsList.add(question7)

        val question8 = Question(
            1,
            "On which computer hardware device is the BIOS chip located?",
            "Motherboard",
            "Hard Disk Drive",
            "Central Processing Unit",
            "Graphics Processing Unit",
            1
        )
        questionsList.add(question8)

        val question9 = Question(
            1,
            "\n" +
                    "Select the valid statement.",
            "char[] ch = new char(5)",
            "char[] ch = new char[5]",
            "char[] ch = new char()",
            "char[] ch = new char[]",
            2
        )
        questionsList.add(question9)

        val question10 = Question(
            1,
            "What was the first Android version specifically optimized for tablets?",
            "Eclair",
            "Honeycomb",
            "Marshmellow",
            "Froyo",
            2
        )
        questionsList.add(question10)
        return questionsList
    }
}