package app.lawnchair.qsb.providers

import app.lawnchair.qsb.ThemingMethod
import com.android.launcher3.R

data object KagiWeb : QsbSearchProvider(
    id = "kagi_web",
    name = R.string.search_provider_kagi_web,
    icon = R.drawable.ic_kagi,
    themedIcon = R.drawable.ic_kagi_tinted,
    themingMethod = ThemingMethod.TINT,
    packageName = "",
    website = "https://kagi.com",
    type = QsbSearchProviderType.LOCAL,
    sponsored = false,
)

data object KagiApp : QsbSearchProvider(
    id = "kagi_app",
    name = R.string.search_provider_kagi_app,
    icon = R.drawable.ic_kagi,
    themedIcon = R.drawable.ic_kagi_tinted,
    themingMethod = ThemingMethod.TINT,
    packageName = "com.kagi.search",
    website = "https://kagi.com",
    type = QsbSearchProviderType.APP,
    sponsored = false,
)
