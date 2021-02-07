package app.agroup.fragment

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import app.agroup.activity.R

class SettingFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }
}