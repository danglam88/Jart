# Java Image Creation Project

## Table of Contents

- [Description](#description)
- [Installation](#installation)
- [Usage](#usage)
- [License](#license)
- [Contributing](#contributing)
- [Authors](#authors)

## Description

This project is designed to create, customize, and save images consisting of random shapes and colors. Using Java's AWT library, we have developed a series of classes that represent different shapes and images, and a main class that brings it all together to create a PNG image.

The project includes the following classes:

- `Point.java`: Represents a point in a 2D space, primarily used for creating shapes.
- `Rectangle.java`, `Circle.java`, `Line.java`: Represent different shapes. Each shape can draw itself on a Displayable object (like an image).
- `Image.java`: Represents an image with a specified width and height. Enables drawing shapes on the image and saving it as a PNG file.
- `Main.java`: The entry point of the application. It generates an image, draws shapes on it, and saves the image as a PNG file.

Each shape class implements the `Drawable` interface, which ensures that a shape can draw itself. The `Displayable` interface is also used, which includes methods for displaying and saving Image objects.

## Installation

To install the project, clone the repository to your local machine. Make sure you have Java installed and configured properly on your machine.

```bash
git clone https://github.com/danglam88/Jart.git
```

## Usage

To run the project, navigate to the directory containing the `Main.java` file and compile and run the file using the Java compiler.

```bash
javac -d build Main.java
```

```bash
java -cp build Main
```

This will generate a PNG image named "image.png" in the same directory.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Contributing

Contributions are welcome. Please open an issue or submit a pull request if you would like to help improve the project.

## Authors

- [Danglam](https://github.com/danglam88)
- [Sagar](https://github.com/sagarishere)
