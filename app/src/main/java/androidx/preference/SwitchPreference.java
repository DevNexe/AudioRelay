package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.azefsw.audioconnect.R;
import defpackage.OW8;
import defpackage.zb5;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iA = zb5.a(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iA);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OW8.G, iA, 0);
        zb5.g(typedArrayObtainStyledAttributes, 7, 0);
        zb5.g(typedArrayObtainStyledAttributes, 6, 1);
        zb5.g(typedArrayObtainStyledAttributes, 9, 3);
        zb5.g(typedArrayObtainStyledAttributes, 8, 4);
        typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
