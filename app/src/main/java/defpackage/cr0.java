package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes3.dex */
public final class cr0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;

    public cr0(Context context) {
        TypedValue typedValueA = w92.a(context, R.attr.elevationOverlayEnabled);
        this.a = (typedValueA == null || typedValueA.type != 18 || typedValueA.data == 0) ? false : true;
        TypedValue typedValueA2 = w92.a(context, R.attr.elevationOverlayColor);
        this.b = typedValueA2 != null ? typedValueA2.data : 0;
        TypedValue typedValueA3 = w92.a(context, R.attr.colorSurface);
        this.c = typedValueA3 != null ? typedValueA3.data : 0;
        this.d = context.getResources().getDisplayMetrics().density;
    }
}
