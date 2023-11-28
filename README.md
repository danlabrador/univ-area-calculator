# Area Calculator Application

This Java application, titled "Area Calculator," is developed in NetBeans and designed to calculate the areas of various shapes. It incorporates a user-friendly graphical interface, enabling users to interact with the application seamlessly. The current version supports area calculations for rectangles and triangles.

## Table of Contents
1. [Files Description](#files-description)
2. [How to Run in NetBeans](#how-to-run-in-netbeans)
3. [Contributing](#contributing)
4. [License](#license)

### Files Description
- **Main.form & Main.java**: These files constitute the backbone of the application, defining the GUI components and the main entry point. They are primarily used for setting up the user interface and integrating the functionality of different shapes.
- **Shape.java**: This abstract class serves as a template for various shapes, encapsulating common attributes and methods.
- **Rectangle.java**: Derived from `Shape`, this class is tailored for handling rectangles. It includes methods for calculating the area and managing rectangle-specific properties.
- **Triangle.java**: Analogous to `Rectangle.java`, this class is dedicated to triangles, equipped with methods for area calculation and triangle-specific property management.

### How to Run in NetBeans
1. Open NetBeans and import the project.
2. Ensure Java SDK is properly set up in your NetBeans environment.
3. Navigate to the project directory and compile the Java files. In NetBeans, this can usually be done via the 'Build' option.
4. Run the application by selecting 'Run Main.java' from the context menu or the Run menu in NetBeans.

### Contributing
We encourage contributions to enhance and expand the functionality of this project. Adhere to standard Java development practices, including clear coding standards and comprehensive documentation for any modifications or additions.

### License
MIT License

Copyright (c) 2023 Thony Danielle Labrador

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
