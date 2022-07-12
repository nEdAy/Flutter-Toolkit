package cn.neday.excavator.checker

import java.io.File
import java.util.*

class ProjectChecker : ICheck {

    private var checkFiles: ArrayList<String> =
        arrayListOf("lib", "pubspec.yaml")
    override fun check(path: String?): ICheck.CheckResult {
        val result = ICheck.CheckResult()
        if (path == null || path.isEmpty()) {
            return result
        }
        val dir = File(path)
        if (!dir.exists() || !dir.isDirectory) {
            return result
        }
        val files = Objects.requireNonNull(dir.list())
        var count = 0
        val missingFiles = ArrayList(checkFiles)
        for (file in files) {
            if (checkFiles.contains(file)) {
                count++
                missingFiles.remove(file)
            }
        }

        result.isOk = count == checkFiles.size
        result.missingFiles.addAll(missingFiles)
        return result
    }
}