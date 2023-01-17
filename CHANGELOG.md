<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# Flutter-Toolkit Changelog

## [Unreleased]

- Add a new switch to control whether run 'watch' with '--delete-conflicting-outputs' option.
- Add a new switch to control whether run 'flutter analyze' automatically after build-runner is done.
- Try to support use the build runner with "--build-filter="path/to/output" to rebuild a single file.

## [2.4.3]

### Changed

- Template synchronization: intellij-platform-plugin-template.
- Compatibility Range changed from 212~222.* to 213.223.*.

## [2.4.1]

### Changed

- Adjust the order of Actions in GenerateGroup', 'EditMenu', 'EditorPopupMenu'.

## [2.4.0]

### Changed

- Provide a new action called 'Flutter Pub Get', click it to execute 'flutter pub get'.

## [2.3.0]

### Changed

- Compatibility Range is 212(2021.2) - 213.*

## [2.2.2]

### Changed

- Try use 'org.jetbrains.plugins.terminal'.
- Supported 'Android Studio Dolphin | 2021.3.1'.
- Remove steps that require manual selection of the Flutter SDK path.

## [2.2.1]

### Added

- Add AnalyzeAction and RebuildAction to 'GenerateGroup', 'EditMenu', 'EditorPopupMenu'.

## [2.2.0]

### Changed

- Modify the toolWindow icon. (support dark mode)
- Show files not found in the list when the current directory does not seem to have a valid Flutter project directory.
- Provide a new action called 'Flutter Analyze', click it to execute 'flutter analyze'.

## [2.1.0]

### Changed

- Modify plugin name
- Modify the action icon
- Use notification instead of dialog

## [2.0.0]

### Added

- Initial scaffold created
  from [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template)
