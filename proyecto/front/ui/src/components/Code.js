import React, { useEffect} from "react";
import "../Styles/Code.css"


const Code = (props) => {

    useEffect(() => {
        let script = document.createElement('script');
        script.type = 'text/javascript';
        script.async = true;

        script.src = 'https://cdn.rawgit.com/google/code-prettify/master/loader/run_prettify.js';
        (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(script);

    });


    const codeFromServer = `<code>
# This function adds two numbers
def add(x, y):
   return x + y
# This function subtracts two numbers
def subtract(x, y):
   return x - y
# This function multiplies two numbers
def multiply(x, y):
   return x * y
# This function divides two numbers
def divide(x, y):
   return x / y
print("Select operation.")
print("1.Add")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")
# Take input from the user
choice = input("Enter choice(1/2/3/4): ")
num1 = float(input("Enter first number: "))
num2 = float(input("Enter second number: "))
if choice == '1':
   print(num1,"+",num2,"=", add(num1,num2))
elif choice == '2':
   print(num1,"-",num2,"=", subtract(num1,num2))
elif choice == '3':
   print(num1,"*",num2,"=", multiply(num1,num2))
elif choice == '4':
   print(num1,"/",num2,"=", divide(num1,num2))
else:
   print("Invalid input")
        </code>
    `;


    return (
        <div className="code-container">
            <p id="example1-description">
                This is the descriptive text before the code example:
            </p>
            <figure>
                <figcaption id="example1-caption">
                    This is the caption
                </figcaption>
                <pre className="prettyprint"
                     dangerouslySetInnerHTML={{
                    __html: codeFromServer
                }}>
                    {/*<code className="python" contenteditable="true" tabindex="0" spellcheck="false">*/}
                    {/*    # Program make a simple calculator*/}

                    {/*</code>*/}
                </pre>
            </figure>
        </div>
    )
}

export default Code;