# Flutter-Toolkit

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://opensource.org/licenses/MIT)
![Build](https://github.com/nEdAy/Flutter-Toolkit/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/14442-flutter-toolkit.svg)](https://plugins.jetbrains.com/plugin/14442-flutter-toolkit)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/14442-flutter-toolkit.svg)](https://plugins.jetbrains.com/plugin/14442-flutter-toolkit)

## [English Document](https://github.com/nEdAy/Flutter-Toolkit/blob/main/README.md)

一个Android Studio的插件(IntelliJ IDEA)，加速你的日常Flutter开发。 Flutter build_runner 助手，使执行build_runner命令更简单。

> **如果你觉得这个工具对你有用，随手给个 Star，让我知道它是对你有帮助的，我会继续更新和维护它。**

## 功能

Adds the following build_runner commands to Android Studio:

- Kill Gradle: Kill Gradle if a current task is running
- Kill Flutter: Kill Flutter if a current task is running

- Build: flutter packages pub run build_runner build
- Rebuild: flutter packages pub run build_runner build --delete-conflicting-outputs
- Watch: flutter packages pub run build_runner watch
- Clean: flutter packages pub run build_runner clean

There are two basic ways to invoke a command:

- Click the action button in the Toolbar.
- Use the shortcut key.

## 安装

- Using IDE built-in plugin system:

  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "
  Flutter-Toolkit"</kbd> >
  <kbd>Install Plugin</kbd>

- Manually:

  Download the [latest release](https://github.com/nEdAy/Flutter-Toolkit/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

## MIT License

Copyright (c) 2022 苏晟

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.