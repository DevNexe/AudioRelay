package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.azefsw.audioconnect.R;
import defpackage.zb5;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, zb5.a(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }
}
