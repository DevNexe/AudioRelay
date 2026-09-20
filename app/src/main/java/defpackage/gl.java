package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class gl {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final ej4 f;

    public gl(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ej4 ej4Var, Rect rect) {
        C0239D.k(rect.left);
        C0239D.k(rect.top);
        C0239D.k(rect.right);
        C0239D.k(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = ej4Var;
    }

    public static gl a(Context context, int i) {
        C0239D.j("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, Th.K);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListB = ja2.b(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListB2 = ja2.b(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListB3 = ja2.b(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        ej4 ej4Var = new ej4(ej4.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new F1(0)));
        typedArrayObtainStyledAttributes.recycle();
        return new gl(colorStateListB, colorStateListB2, colorStateListB3, dimensionPixelSize, ej4Var, rect);
    }

    public final void b(TextView textView) {
        la2 la2Var = new la2();
        la2 la2Var2 = new la2();
        ej4 ej4Var = this.f;
        la2Var.setShapeAppearanceModel(ej4Var);
        la2Var2.setShapeAppearanceModel(ej4Var);
        la2Var.j(this.c);
        la2Var.w.k = this.e;
        la2Var.invalidateSelf();
        la2.CQf cQf = la2Var.w;
        ColorStateList colorStateList = cQf.d;
        ColorStateList colorStateList2 = this.d;
        if (colorStateList != colorStateList2) {
            cQf.d = colorStateList2;
            la2Var.onStateChange(la2Var.getState());
        }
        ColorStateList colorStateList3 = this.b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), la2Var, la2Var2);
        Rect rect = this.a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        Field field = bi5.a;
        bi5.LPt8Fixed.q(textView, insetDrawable);
    }
}
