package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.azefsw.audioconnect.R;
import defpackage.OW8;
import defpackage.zb5;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OW8.H, R.attr.switchPreferenceCompatStyle, 0);
        zb5.g(typedArrayObtainStyledAttributes, 7, 0);
        zb5.g(typedArrayObtainStyledAttributes, 6, 1);
        zb5.g(typedArrayObtainStyledAttributes, 9, 3);
        zb5.g(typedArrayObtainStyledAttributes, 8, 4);
        typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
