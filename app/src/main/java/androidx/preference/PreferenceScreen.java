package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.azefsw.audioconnect.R;
import defpackage.zb5;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, zb5.a(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
    }
}
