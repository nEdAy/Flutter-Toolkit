package cn.neday.excavator.setting;

import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class Setting implements Configurable {
    public static final String FLUTTER_PATH_KEY = "flutter_path";
    private JPanel mMainPanel;
    private JLabel mTitle;
    private TextFieldWithBrowseButton mButton;
    private JLabel mHint;
    private String _lastValue;

    /**
     * 在settings中显示的名称
     *
     * @return 名称
     */
    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "Flutter ToolKit";
    }

    @Override
    public String getHelpTopic() {
        return null;
    }

    /**
     * 初始化控件
     *
     * @return mMainPanel
     */
    @Override
    public @Nullable JComponent createComponent() {
        mTitle.setText("Flutter Path");
        boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
        String flutterName = isWindows ? "flutter.bat" : "flutter";
        String hintWord = "Please choose your flutter, maybe it path is '../../flutter/bin/" + flutterName + "'.";
        mHint.setText(hintWord);
        PropertiesComponent propertiesComponent = PropertiesComponent.getInstance();
        String flutterPath = propertiesComponent.getValue(FLUTTER_PATH_KEY);
        mButton.setText(flutterPath);
        _lastValue = flutterPath;
        mButton.addBrowseFolderListener("Choose Your Flutter", hintWord, null,
                FileChooserDescriptorFactory.createSingleFileDescriptor().withFileFilter(virtualFile -> {
                    String name = virtualFile.getName().toLowerCase();
                    return name.equals(flutterName);
                }));
        return mMainPanel;
    }

    @Override
    public boolean isModified() {
        if (_lastValue == null) {
            return false;
        }
        return !_lastValue.equals(mButton.getText());
    }


    /**
     * 点击【apply】、【OK】时，调用
     */
    @Override
    public void apply() {
        String newValue = mButton.getText();
        PropertiesComponent propertiesComponent = PropertiesComponent.getInstance();
        propertiesComponent.setValue(FLUTTER_PATH_KEY, newValue);
    }

    /**
     * 点击【Reset】时，调用
     */
    @Override
    public void reset() {
        // 重置数据
        mButton.setText(_lastValue);
    }
}
