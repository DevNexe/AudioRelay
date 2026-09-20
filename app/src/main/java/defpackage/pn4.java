package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.MZ;

/* JADX INFO: loaded from: classes3.dex */
public final class pn4 extends MZ {
    public pn4(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.MZ
    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
