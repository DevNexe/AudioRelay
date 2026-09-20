package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.azefsw.audioconnect.R;
import com.google.android.material.datepicker.F1;

/* JADX INFO: loaded from: classes.dex */
public final class n83 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public /* synthetic */ n83(dn1.CQf cQf, dn1.F1 f1, dn1.LPt8Fixed lPt8, dn1.NUlFixed nUl, dn1.YKK ykk, dn1.auxFixed auxVar, dn1.T23 t23, dn1.byN byn) {
        this.a = cQf;
        this.e = f1;
        this.b = lPt8;
        this.g = nUl;
        this.c = ykk;
        this.f = auxVar;
        this.h = t23;
        this.d = byn;
    }

    public /* synthetic */ n83(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(w92.b(context, F1.class.getCanonicalName(), R.attr.materialCalendarStyle), Th.J);
        this.a = gl.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.g = gl.a(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.b = gl.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.c = gl.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListB = ja2.b(context, typedArrayObtainStyledAttributes, 6);
        this.d = gl.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.e = gl.a(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.f = gl.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListB.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
