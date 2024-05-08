package cn.neday.excavator.checker

import java.io.File
import java.util.*

class ProjectChecker : ICheck {

    private var normalDartProjectFiles: ArrayList<String> =
        arrayListOf("lib", "pubspec.yaml")
    private var melosDartProjectFiles: ArrayList<String> =
        arrayListOf("packages", "melos.yaml")

    override fun check(path: String?): ICheck.CheckResult {
        val result = ICheck.CheckResult()
        if (path.isNullOrEmpty()) {
            return result
        }
        val dir = File(path)
        if (!dir.exists() || !dir.isDirectory) {
            return result
        }
        val files = Objects.requireNonNull(dir.list()).asList()
        result.isOk = files.containsAll(normalDartProjectFiles) || files.containsAll(melosDartProjectFiles)
        return result
    }
}
